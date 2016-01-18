/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.social.google;

import org.keycloak.broker.oidc.OIDCIdentityProviderConfig;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.broker.social.SocialIdentityProviderFactory;

/**
 * @author Pedro Igor
 */
public class GoogleIdentityProviderFactory extends AbstractIdentityProviderFactory<GoogleIdentityProvider> implements SocialIdentityProviderFactory<GoogleIdentityProvider> {

    public static final String PROVIDER_ID = "google";

    @Override
    public String getName() {
        return "Google";
    }

    @Override
    public GoogleIdentityProvider create(IdentityProviderModel model) {
        return new GoogleIdentityProvider(new OIDCIdentityProviderConfig(model));
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}
