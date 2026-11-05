package com.uthiduck.ecommerce.controller;

import com.uthiduck.ecommerce.modal.VerificationCode;
import com.uthiduck.ecommerce.repository.VerificationCodeRepository;
import com.uthiduck.ecommerce.request.LoginRequest;
import com.uthiduck.ecommerce.response.ApiResponse;
import com.uthiduck.ecommerce.response.AuthResponse;
import com.uthiduck.ecommerce.service.AuthService;
import com.uthiduck.ecommerce.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seller")
public class SellerController {
    private final SellerService sellerService;
    private final VerificationCodeRepository verificationCodeRepository;
    private final AuthService authService;



    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginSeller(
            @RequestBody LoginRequest req
            ) throws Exception {
        String otp = req.getOtp();
        String email = req.getEmail();


        req.setEmail("seller_" + email);
        AuthResponse authResponse = authService.signing(req);

        return ResponseEntity.ok(authResponse);
    }

}
