-module(openapi_com_day_cq_replication_audit_replication_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_audit_replication_event_listener_properties/0]).

-type openapi_com_day_cq_replication_audit_replication_event_listener_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'service_ranking' := ServiceRanking
        }) ->
    #{ 'service.ranking' => ServiceRanking
     }.
