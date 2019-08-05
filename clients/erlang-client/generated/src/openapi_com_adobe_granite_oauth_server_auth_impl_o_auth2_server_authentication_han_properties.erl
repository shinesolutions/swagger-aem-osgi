-module(openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties/0]).

-type openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_controlFlag' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_realmName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'oauth_offline_validation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'path' := Path,
          'jaas_controlFlag' := JaasControlFlag,
          'jaas_realmName' := JaasRealmName,
          'jaas_ranking' := JaasRanking,
          'oauth_offline_validation' := OauthOfflineValidation
        }) ->
    #{ 'path' => Path,
       'jaas.controlFlag' => JaasControlFlag,
       'jaas.realmName' => JaasRealmName,
       'jaas.ranking' => JaasRanking,
       'oauth.offline.validation' => OauthOfflineValidation
     }.
