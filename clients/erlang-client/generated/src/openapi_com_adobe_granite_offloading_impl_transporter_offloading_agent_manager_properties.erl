-module(openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties() ::
    #{ 'offloading_agentmanager_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'offloading_agentmanager_enabled' := OffloadingAgentmanagerEnabled
        }) ->
    #{ 'offloading.agentmanager.enabled' => OffloadingAgentmanagerEnabled
     }.
