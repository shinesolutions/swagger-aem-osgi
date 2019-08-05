-module(openapi_org_apache_http_proxyconfigurator_properties).

-export([encode/1]).

-export_type([openapi_org_apache_http_proxyconfigurator_properties/0]).

-type openapi_org_apache_http_proxyconfigurator_properties() ::
    #{ 'proxy_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'proxy_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_port' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'proxy_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_exceptions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'proxy_enabled' := ProxyEnabled,
          'proxy_host' := ProxyHost,
          'proxy_port' := ProxyPort,
          'proxy_user' := ProxyUser,
          'proxy_password' := ProxyPassword,
          'proxy_exceptions' := ProxyExceptions
        }) ->
    #{ 'proxy.enabled' => ProxyEnabled,
       'proxy.host' => ProxyHost,
       'proxy.port' => ProxyPort,
       'proxy.user' => ProxyUser,
       'proxy.password' => ProxyPassword,
       'proxy.exceptions' => ProxyExceptions
     }.
