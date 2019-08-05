-module(openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties/0]).

-type openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties() ::
    #{ 'Flush_agents' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'Flush_agents' := FlushAgents
        }) ->
    #{ 'Flush agents' => FlushAgents
     }.
