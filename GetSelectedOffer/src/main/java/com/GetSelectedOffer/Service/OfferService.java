package com.GetSelectedOffer.Service;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GetSelectedOffer.Dao.OfferDao;
import com.GetSelectedOffer.Entity.Offer;
import com.GetSelectedOffer.Entity.OffringGuidBody;
import com.GetSelectedOffer.Entity.Reply;


@Service
public class  OfferService implements OfferInterface {
	
	@Autowired
	private OfferDao offerDao;
	
	public OfferService()
	{
		
	}


	@Override
	public Reply getOffer(String offring) {
		// TODO Auto-generated method stub
					List<Offer> list = offerDao.getOffer (offring);
					Reply response = new Reply(1, 0, "I" ,"Sunlight",list);
					//response = new Response(status, errorCode, messageType, message, list);
					return response; 
					
		
	}

}
