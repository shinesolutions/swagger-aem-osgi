-module(openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties() ::
    #{ 'description' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'overrides' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'description' := Description,
          'overrides' := Overrides,
          'enabled' := Enabled,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'description' => Description,
       'overrides' => Overrides,
       'enabled' => Enabled,
       'service.ranking' => ServiceRanking
     }.
