package com.java.layer3;

import java.util.List;

import com.java.layer2.ClaimRequest;

public interface ClaimRequestDAO {
 List<ClaimRequest> getClaimRequests();
 ClaimRequest getClaimRequest(int customerId);
 void createClaimRequest(ClaimRequest c);
 void updateClaimRequest(ClaimRequest c);
 void removeClaimRequest(int tokenId); 
}
