-module(openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties/0]).

-type openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'token_required_attr' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'token_alternate_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'token_encapsulated' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'skip_token_refresh' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'path' := Path,
          'token_required_attr' := TokenRequiredAttr,
          'token_alternate_url' := TokenAlternateUrl,
          'token_encapsulated' := TokenEncapsulated,
          'skip_token_refresh' := SkipTokenRefresh
        }) ->
    #{ 'path' => Path,
       'token.required.attr' => TokenRequiredAttr,
       'token.alternate.url' => TokenAlternateUrl,
       'token.encapsulated' => TokenEncapsulated,
       'skip.token.refresh' => SkipTokenRefresh
     }.
