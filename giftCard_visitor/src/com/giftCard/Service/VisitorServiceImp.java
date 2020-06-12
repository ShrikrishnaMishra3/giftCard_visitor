package com.giftCard.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giftCard.doa.VisitorRepository;
import com.giftCard.model.VisitorModel;

@Service
@Transactional
public class VisitorServiceImp implements VisitorService {

	@Autowired
	private VisitorRepository visitorDao;

	@Override
	public List<VisitorModel> getAllVisitorModel() {
		// TODO Auto-generated method stub
		return visitorDao.getAllVisitorModels();
	}

	@Override
	public List<VisitorModel> listAll() {
		// TODO Auto-generated method stub
		return visitorDao.getAllVisitorModels();
	}

	@Override
	public void save(VisitorModel visitorNew) {

		visitorDao.saveVisitorModel(visitorNew);
	}

}
