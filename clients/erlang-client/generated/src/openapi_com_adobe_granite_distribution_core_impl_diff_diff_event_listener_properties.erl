-module(openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties() ::
    #{ 'diffPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceUser_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'diffPath' := DiffPath,
          'serviceName' := ServiceName,
          'serviceUser_target' := ServiceUserTarget
        }) ->
    #{ 'diffPath' => DiffPath,
       'serviceName' => ServiceName,
       'serviceUser.target' => ServiceUserTarget
     }.
