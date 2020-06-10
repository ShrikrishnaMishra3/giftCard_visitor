package com.giftCard.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giftCard.model.VisitorModel;
@Repository
public interface VisitorRepository  extends CrudRepository<VisitorModel,Long> {

}
