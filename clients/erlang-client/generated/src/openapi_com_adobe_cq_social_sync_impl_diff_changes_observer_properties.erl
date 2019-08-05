-module(openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties/0]).

-type openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'agentName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'diffPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'propertyNames' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'enabled' := Enabled,
          'agentName' := AgentName,
          'diffPath' := DiffPath,
          'propertyNames' := PropertyNames
        }) ->
    #{ 'enabled' => Enabled,
       'agentName' => AgentName,
       'diffPath' => DiffPath,
       'propertyNames' => PropertyNames
     }.
