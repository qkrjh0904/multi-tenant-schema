package com.complete.multitenantschema.global.config.db;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class MultiTenantIdentifierResolver implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        return null;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return false;
    }
}
