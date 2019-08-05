-module(openapi_com_day_commons_httpclient_properties).

-export([encode/1]).

-export_type([openapi_com_day_commons_httpclient_properties/0]).

-type openapi_com_day_commons_httpclient_properties() ::
    #{ 'proxy_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'proxy_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_ntlm_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_ntlm_domain' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'proxy_exceptions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'proxy_enabled' := ProxyEnabled,
          'proxy_host' := ProxyHost,
          'proxy_user' := ProxyUser,
          'proxy_password' := ProxyPassword,
          'proxy_ntlm_host' := ProxyNtlmHost,
          'proxy_ntlm_domain' := ProxyNtlmDomain,
          'proxy_exceptions' := ProxyExceptions
        }) ->
    #{ 'proxy.enabled' => ProxyEnabled,
       'proxy.host' => ProxyHost,
       'proxy.user' => ProxyUser,
       'proxy.password' => ProxyPassword,
       'proxy.ntlm.host' => ProxyNtlmHost,
       'proxy.ntlm.domain' => ProxyNtlmDomain,
       'proxy.exceptions' => ProxyExceptions
     }.
