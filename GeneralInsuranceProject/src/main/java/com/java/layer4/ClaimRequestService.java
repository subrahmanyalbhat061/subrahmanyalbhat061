package com.java.layer4;

import java.util.List;

import com.java.layer2.ClaimRequest;

public interface ClaimRequestService {
  void createClaimRequest(ClaimRequest c)throws PolicyNotFoundException,BillNotFoundException,FirNotFoundException,claimRequestAlreadyExistsException;//user
  List<ClaimRequest> getClaimRequestById(int customerId)throws ClaimRequestForParticularCustomerIdNotFoundException2;
  
  ClaimRequest getClaimRequestByToken(int tokenid)throws ClaimRequestForParticularTokenNotFoundException;//admin
  void updateClaimRequest(ClaimRequest c);//admin
  List<ClaimRequest> getClaimRequests();//admin
}
