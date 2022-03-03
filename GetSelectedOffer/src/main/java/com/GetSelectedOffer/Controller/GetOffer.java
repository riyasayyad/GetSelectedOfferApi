package com.GetSelectedOffer.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.GetSelectedOffer.Entity.OffringGuidBody;
import com.GetSelectedOffer.Entity.Reply;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GetSelectedOffer.Service.OfferInterface;

@RestController
public class GetOffer {
	
	@Autowired
	private OfferInterface offerInterface;
	
	// get selected offer
	
		@PostMapping("/GetSelectedOffer")
		public Reply getoffer(@RequestBody OffringGuidBody offring) {
			return offerInterface.getOffer(offring.getOffring());
		//list<Offer>this.offerInterface.getOffer();
  // Response response = new Response(1, 0, "I", "Success", list);
			
		}

}
