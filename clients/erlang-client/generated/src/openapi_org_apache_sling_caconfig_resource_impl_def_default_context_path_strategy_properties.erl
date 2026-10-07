-module(openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties/0]).

-type openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'configRefResourceNames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'configRefPropertyNames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'enabled' := Enabled,
          'configRefResourceNames' := ConfigRefResourceNames,
          'configRefPropertyNames' := ConfigRefPropertyNames,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'enabled' => Enabled,
       'configRefResourceNames' => ConfigRefResourceNames,
       'configRefPropertyNames' => ConfigRefPropertyNames,
       'service.ranking' => ServiceRanking
     }.
