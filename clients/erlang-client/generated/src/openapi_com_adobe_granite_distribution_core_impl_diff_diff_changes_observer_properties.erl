-module(openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'agentName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'diffPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'observedPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'propertyNames' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'distributionDelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'serviceUser_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'enabled' := Enabled,
          'agentName' := AgentName,
          'diffPath' := DiffPath,
          'observedPath' := ObservedPath,
          'serviceName' := ServiceName,
          'propertyNames' := PropertyNames,
          'distributionDelay' := DistributionDelay,
          'serviceUser_target' := ServiceUserTarget
        }) ->
    #{ 'enabled' => Enabled,
       'agentName' => AgentName,
       'diffPath' => DiffPath,
       'observedPath' => ObservedPath,
       'serviceName' => ServiceName,
       'propertyNames' => PropertyNames,
       'distributionDelay' => DistributionDelay,
       'serviceUser.target' => ServiceUserTarget
     }.
