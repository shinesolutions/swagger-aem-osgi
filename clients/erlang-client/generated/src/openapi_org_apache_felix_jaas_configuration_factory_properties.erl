-module(openapi_org_apache_felix_jaas_configuration_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_jaas_configuration_factory_properties/0]).

-type openapi_org_apache_felix_jaas_configuration_factory_properties() ::
    #{ 'jaas_controlFlag' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'jaas_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'jaas_realmName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_classname' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_options' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'jaas_controlFlag' := JaasControlFlag,
          'jaas_ranking' := JaasRanking,
          'jaas_realmName' := JaasRealmName,
          'jaas_classname' := JaasClassname,
          'jaas_options' := JaasOptions
        }) ->
    #{ 'jaas.controlFlag' => JaasControlFlag,
       'jaas.ranking' => JaasRanking,
       'jaas.realmName' => JaasRealmName,
       'jaas.classname' => JaasClassname,
       'jaas.options' => JaasOptions
     }.
