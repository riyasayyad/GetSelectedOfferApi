package com.GetSelectedOffer.Service;

import java.util.List;

import org.apache.catalina.connector.Response;

import com.GetSelectedOffer.Entity.Offer;
import com.GetSelectedOffer.Entity.OffringGuidBody;
import com.GetSelectedOffer.Entity.Reply;

public interface OfferInterface {
public Reply getOffer(String string);
}
