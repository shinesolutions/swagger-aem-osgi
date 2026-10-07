-module(openapi_com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties() ::
    #{ 'auth_token_validator_type' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'auth_token_validator_type' := AuthTokenValidatorType
        }) ->
    #{ 'auth.token.validator.type' => AuthTokenValidatorType
     }.
