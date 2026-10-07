-module(openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties/0]).

-type openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties() ::
    #{ 'csrf_token_expires_in' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_auth_requirements' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'csrf_token_expires_in' := CsrfTokenExpiresIn,
          'sling_auth_requirements' := SlingAuthRequirements
        }) ->
    #{ 'csrf.token.expires.in' => CsrfTokenExpiresIn,
       'sling.auth.requirements' => SlingAuthRequirements
     }.
