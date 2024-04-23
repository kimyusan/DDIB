package com.ddib.payment.user.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
public class User {
    
    @Schema(description = "회원 식별키")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    
    @Schema(description = "이름")
    private String name;
    
    @Schema(description = "이메일")
    private String email;

    @Schema(description = "핸드폰 번호")
    private String phone;

    @Schema(description = "도로명 주소")
    private String roadAddress;

    @Schema(description = "상세 주소")
    private String detailAddress;

    @Schema(description = "우편번호")
    private int zipcode;

    @Schema(description = "구독 여부")
    private boolean isSubscribed;

    @Schema(description = "FCM 토큰")
    private String fcmToken;

}
