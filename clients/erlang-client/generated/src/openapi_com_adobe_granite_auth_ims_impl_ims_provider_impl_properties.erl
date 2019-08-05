-module(openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_authorization_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_token_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_profile_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_extended_details_urls' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'oauth_provider_ims_validate_token_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_session_property' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_service_token_client_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_service_token_client_secret' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_ims_service_token' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ims_org_ref' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ims_group_mapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'oauth_provider_ims_only_license_group' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId,
          'oauth_provider_ims_authorization_url' := OauthProviderImsAuthorizationUrl,
          'oauth_provider_ims_token_url' := OauthProviderImsTokenUrl,
          'oauth_provider_ims_profile_url' := OauthProviderImsProfileUrl,
          'oauth_provider_ims_extended_details_urls' := OauthProviderImsExtendedDetailsUrls,
          'oauth_provider_ims_validate_token_url' := OauthProviderImsValidateTokenUrl,
          'oauth_provider_ims_session_property' := OauthProviderImsSessionProperty,
          'oauth_provider_ims_service_token_client_id' := OauthProviderImsServiceTokenClientId,
          'oauth_provider_ims_service_token_client_secret' := OauthProviderImsServiceTokenClientSecret,
          'oauth_provider_ims_service_token' := OauthProviderImsServiceToken,
          'ims_org_ref' := ImsOrgRef,
          'ims_group_mapping' := ImsGroupMapping,
          'oauth_provider_ims_only_license_group' := OauthProviderImsOnlyLicenseGroup
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId,
       'oauth.provider.ims.authorization.url' => OauthProviderImsAuthorizationUrl,
       'oauth.provider.ims.token.url' => OauthProviderImsTokenUrl,
       'oauth.provider.ims.profile.url' => OauthProviderImsProfileUrl,
       'oauth.provider.ims.extended.details.urls' => OauthProviderImsExtendedDetailsUrls,
       'oauth.provider.ims.validate.token.url' => OauthProviderImsValidateTokenUrl,
       'oauth.provider.ims.session.property' => OauthProviderImsSessionProperty,
       'oauth.provider.ims.service.token.client.id' => OauthProviderImsServiceTokenClientId,
       'oauth.provider.ims.service.token.client.secret' => OauthProviderImsServiceTokenClientSecret,
       'oauth.provider.ims.service.token' => OauthProviderImsServiceToken,
       'ims.org.ref' => ImsOrgRef,
       'ims.group.mapping' => ImsGroupMapping,
       'oauth.provider.ims.only.license.group' => OauthProviderImsOnlyLicenseGroup
     }.
