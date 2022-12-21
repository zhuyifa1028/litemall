package com.github.litemall.common.entity;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 获取当前的审计人
 *
 * @author zhuyifa
 */
@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("1602662442354245632");
    }

}

