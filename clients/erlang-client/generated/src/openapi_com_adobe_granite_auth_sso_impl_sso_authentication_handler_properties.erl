-module(openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'jaas_controlFlag' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_realmName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'headers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cookies' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'parameters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'usermap' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'format' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'trustedCredentialsAttribute' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'path' := Path,
          'service_ranking' := ServiceRanking,
          'jaas_controlFlag' := JaasControlFlag,
          'jaas_realmName' := JaasRealmName,
          'jaas_ranking' := JaasRanking,
          'headers' := Headers,
          'cookies' := Cookies,
          'parameters' := Parameters,
          'usermap' := Usermap,
          'format' := Format,
          'trustedCredentialsAttribute' := TrustedCredentialsAttribute
        }) ->
    #{ 'path' => Path,
       'service.ranking' => ServiceRanking,
       'jaas.controlFlag' => JaasControlFlag,
       'jaas.realmName' => JaasRealmName,
       'jaas.ranking' => JaasRanking,
       'headers' => Headers,
       'cookies' => Cookies,
       'parameters' => Parameters,
       'usermap' => Usermap,
       'format' => Format,
       'trustedCredentialsAttribute' => TrustedCredentialsAttribute
     }.
