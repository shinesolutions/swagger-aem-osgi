-module(openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'enabled' := Enabled,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'enabled' => Enabled,
       'service.ranking' => ServiceRanking
     }.
