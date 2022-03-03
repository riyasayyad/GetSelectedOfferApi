package com.GetSelectedOffer.Entity;

import java.util.List;


public class Reply {


	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private List<Offer> OfferList;
	public int getStatus() {
		return Status;
	}

	public Reply(int status, int errorCode, String messageType, String message, List<Offer> offerList) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		OfferList = offerList;
	}



	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public List<Offer> getOfferList() {
		return OfferList;
	}
	public void setOfferList(List<Offer> offerList) {
		OfferList = offerList;
	}
	@Override
	public String toString() {
		return "Reply [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType + ", Message="
				+ Message + ", OfferList=" + OfferList + "]";
	}
	
	
}
