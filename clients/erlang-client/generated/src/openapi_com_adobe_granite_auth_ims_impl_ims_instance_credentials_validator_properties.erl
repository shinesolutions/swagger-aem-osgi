-module(openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId
     }.
