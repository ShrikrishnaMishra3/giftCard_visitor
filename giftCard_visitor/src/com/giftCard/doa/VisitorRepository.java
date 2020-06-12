package com.giftCard.doa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.giftCard.model.VisitorModel;

@Repository
public interface VisitorRepository {

	public List<VisitorModel> getAllVisitorModels();

	public void saveVisitorModel(long id);

	public Object saveVisitorModel(VisitorModel visitorNew);


}