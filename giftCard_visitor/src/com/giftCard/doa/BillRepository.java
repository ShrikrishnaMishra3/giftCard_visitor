  package com.giftCard.doa;
  
  import java.util.List;
  
  import org.springframework.data.repository.CrudRepository; import
  org.springframework.stereotype.Repository;
  
  import com.giftCard.model.BillModel;
  
  
  @Repository public interface BillRepository extends
  CrudRepository<BillModel,Long> {
  

  
  }
 