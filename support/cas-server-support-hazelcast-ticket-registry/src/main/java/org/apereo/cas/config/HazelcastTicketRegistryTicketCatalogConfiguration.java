package org.apereo.cas.config;

import org.apereo.cas.configuration.CasConfigurationProperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This is {@link HazelcastTicketRegistryTicketCatalogConfiguration}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
@Configuration("hazelcastTicketRegistryTicketMetadataCatalogConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class HazelcastTicketRegistryTicketCatalogConfiguration extends TicketDefinitionBuilderSupport {

    public HazelcastTicketRegistryTicketCatalogConfiguration(CasConfigurationProperties casProperties) {
        super(casProperties);
    }
}
