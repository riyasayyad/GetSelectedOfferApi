package com.GetSelectedOffer.Entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;



@Entity
@Table
@SqlResultSetMapping(name = "Offer", classes = @ConstructorResult(targetClass = Offer.class, 
                    columns = {@ColumnResult(name = "OfferingGuId", type = String.class), 
                    		@ColumnResult(name = "Offering", type = String.class)}))
public class Offer {
    @Id
	public String OfferingGuId;
	public String Offering;
		
		public Offer() {
			
		}
		
		

		public Offer(String offeringGuId, String offering) {
			super();
			this.OfferingGuId = offeringGuId;
			this.Offering = offering;
		}



		public String getOfferingGuId() {
			return OfferingGuId;
		}

		public void setOfferingGuId(String offeringGuId) {
			OfferingGuId = offeringGuId;
		}

		public String getOffering() {
			return Offering;
		}

		public void setOffering(String offering) {
			Offering = offering;
		}

	@Override
	public String toString() {
			return "Offer [OfferingGuId=" + OfferingGuId + ", Offering=" + Offering + ", getOfferingGuId()="
					+ getOfferingGuId() + ", getOffering()=" + getOffering() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	}
