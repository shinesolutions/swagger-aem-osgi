-module(openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties/0]).

-type openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties() ::
    #{ 'flush_agents' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'flush_agents' := FlushAgents
        }) ->
    #{ 'flush.agents' => FlushAgents
     }.
