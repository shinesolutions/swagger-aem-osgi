-module(openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties/0]).

-type openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties() ::
    #{ 'osgi_http_whiteboard_context_select' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'osgi_http_whiteboard_listener' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_sudo_cookie' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_sudo_parameter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_annonymous' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'sling_auth_requirements' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_auth_anonymous_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_auth_anonymous_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_http' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'auth_http_realm' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_uri_suffix' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'osgi_http_whiteboard_context_select' := OsgiHttpWhiteboardContextSelect,
          'osgi_http_whiteboard_listener' := OsgiHttpWhiteboardListener,
          'auth_sudo_cookie' := AuthSudoCookie,
          'auth_sudo_parameter' := AuthSudoParameter,
          'auth_annonymous' := AuthAnnonymous,
          'sling_auth_requirements' := SlingAuthRequirements,
          'sling_auth_anonymous_user' := SlingAuthAnonymousUser,
          'sling_auth_anonymous_password' := SlingAuthAnonymousPassword,
          'auth_http' := AuthHttp,
          'auth_http_realm' := AuthHttpRealm,
          'auth_uri_suffix' := AuthUriSuffix
        }) ->
    #{ 'osgi.http.whiteboard.context.select' => OsgiHttpWhiteboardContextSelect,
       'osgi.http.whiteboard.listener' => OsgiHttpWhiteboardListener,
       'auth.sudo.cookie' => AuthSudoCookie,
       'auth.sudo.parameter' => AuthSudoParameter,
       'auth.annonymous' => AuthAnnonymous,
       'sling.auth.requirements' => SlingAuthRequirements,
       'sling.auth.anonymous.user' => SlingAuthAnonymousUser,
       'sling.auth.anonymous.password' => SlingAuthAnonymousPassword,
       'auth.http' => AuthHttp,
       'auth.http.realm' => AuthHttpRealm,
       'auth.uri.suffix' => AuthUriSuffix
     }.
