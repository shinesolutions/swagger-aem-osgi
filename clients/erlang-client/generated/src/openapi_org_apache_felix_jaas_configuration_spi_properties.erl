-module(openapi_org_apache_felix_jaas_configuration_spi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_jaas_configuration_spi_properties/0]).

-type openapi_org_apache_felix_jaas_configuration_spi_properties() ::
    #{ 'jaas_defaultRealmName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_configProviderName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jaas_globalConfigPolicy' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'jaas_defaultRealmName' := JaasDefaultRealmName,
          'jaas_configProviderName' := JaasConfigProviderName,
          'jaas_globalConfigPolicy' := JaasGlobalConfigPolicy
        }) ->
    #{ 'jaas.defaultRealmName' => JaasDefaultRealmName,
       'jaas.configProviderName' => JaasConfigProviderName,
       'jaas.globalConfigPolicy' => JaasGlobalConfigPolicy
     }.
