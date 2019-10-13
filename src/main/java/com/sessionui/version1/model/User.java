package com.sessionui.version1.model;

import com.sessionui.version1.model.enums.Role;
import com.sessionui.version1.model.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("user")
public class User implements Serializable {
    @Id
    private Long userId;
    @Indexed
    private String login;
    private String hashPassword;
    private Role role;
    private State state;

}
