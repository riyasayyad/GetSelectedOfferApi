package com.GetSelectedOffer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GetSelectedOffer.Entity.Offer;
import com.GetSelectedOffer.Entity.OffringGuidBody;


@Repository
public class OfferDao {
	
	@Autowired
	private EntityManager Discount;

@SuppressWarnings("unchecked")
public List<Offer> getOffer(String offring){
	
	StoredProcedureQuery query = Discount.createStoredProcedureQuery("GetSelectedOffer", "Offer")
			.registerStoredProcedureParameter("OfferingGuId", String.class, ParameterMode.IN)
			.setParameter("OfferingGuId", offring);
	query.execute();
	return query.getResultList();

}
}
