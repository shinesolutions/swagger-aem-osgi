-module(openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_default_claims' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_token_provider_endpoint' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_access_token_request' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_keypair_alias' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_conn_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'auth_token_provider_so_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'auth_token_provider_client_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_scope' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_provider_reuse_access_token' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'auth_token_provider_relaxed_ssl' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'token_request_customizer_type' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_token_validator_type' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'auth_token_provider_title' := AuthTokenProviderTitle,
          'auth_token_provider_default_claims' := AuthTokenProviderDefaultClaims,
          'auth_token_provider_endpoint' := AuthTokenProviderEndpoint,
          'auth_access_token_request' := AuthAccessTokenRequest,
          'auth_token_provider_keypair_alias' := AuthTokenProviderKeypairAlias,
          'auth_token_provider_conn_timeout' := AuthTokenProviderConnTimeout,
          'auth_token_provider_so_timeout' := AuthTokenProviderSoTimeout,
          'auth_token_provider_client_id' := AuthTokenProviderClientId,
          'auth_token_provider_scope' := AuthTokenProviderScope,
          'auth_token_provider_reuse_access_token' := AuthTokenProviderReuseAccessToken,
          'auth_token_provider_relaxed_ssl' := AuthTokenProviderRelaxedSsl,
          'token_request_customizer_type' := TokenRequestCustomizerType,
          'auth_token_validator_type' := AuthTokenValidatorType
        }) ->
    #{ 'name' => Name,
       'auth.token.provider.title' => AuthTokenProviderTitle,
       'auth.token.provider.default.claims' => AuthTokenProviderDefaultClaims,
       'auth.token.provider.endpoint' => AuthTokenProviderEndpoint,
       'auth.access.token.request' => AuthAccessTokenRequest,
       'auth.token.provider.keypair.alias' => AuthTokenProviderKeypairAlias,
       'auth.token.provider.conn.timeout' => AuthTokenProviderConnTimeout,
       'auth.token.provider.so.timeout' => AuthTokenProviderSoTimeout,
       'auth.token.provider.client.id' => AuthTokenProviderClientId,
       'auth.token.provider.scope' => AuthTokenProviderScope,
       'auth.token.provider.reuse.access.token' => AuthTokenProviderReuseAccessToken,
       'auth.token.provider.relaxed.ssl' => AuthTokenProviderRelaxedSsl,
       'token.request.customizer.type' => TokenRequestCustomizerType,
       'auth.token.validator.type' => AuthTokenValidatorType
     }.
