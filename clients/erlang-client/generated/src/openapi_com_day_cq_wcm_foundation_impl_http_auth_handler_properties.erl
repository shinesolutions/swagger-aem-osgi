-module(openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_http_auth_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_http_nologin' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'auth_http_realm' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_default_loginpage' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_cred_form' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_cred_utf8' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'path' := Path,
          'auth_http_nologin' := AuthHttpNologin,
          'auth_http_realm' := AuthHttpRealm,
          'auth_default_loginpage' := AuthDefaultLoginpage,
          'auth_cred_form' := AuthCredForm,
          'auth_cred_utf8' := AuthCredUtf8
        }) ->
    #{ 'path' => Path,
       'auth.http.nologin' => AuthHttpNologin,
       'auth.http.realm' => AuthHttpRealm,
       'auth.default.loginpage' => AuthDefaultLoginpage,
       'auth.cred.form' => AuthCredForm,
       'auth.cred.utf8' => AuthCredUtf8
     }.
