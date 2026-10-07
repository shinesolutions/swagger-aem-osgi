-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties() ::
    #{ 'jaas_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'jaas_controlFlag' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_realmName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'idp_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sync_handlerName' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'jaas_ranking' := JaasRanking,
          'jaas_controlFlag' := JaasControlFlag,
          'jaas_realmName' := JaasRealmName,
          'idp_name' := IdpName,
          'sync_handlerName' := SyncHandlerName
        }) ->
    #{ 'jaas.ranking' => JaasRanking,
       'jaas.controlFlag' => JaasControlFlag,
       'jaas.realmName' => JaasRealmName,
       'idp.name' => IdpName,
       'sync.handlerName' => SyncHandlerName
     }.
