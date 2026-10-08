-module(openapi_com_day_cq_replication_audit_replication_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_audit_replication_event_listener_properties/0]).

-export([openapi_com_day_cq_replication_audit_replication_event_listener_properties/1]).

-export_type([openapi_com_day_cq_replication_audit_replication_event_listener_properties/0]).

-type openapi_com_day_cq_replication_audit_replication_event_listener_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_replication_audit_replication_event_listener_properties() ->
    openapi_com_day_cq_replication_audit_replication_event_listener_properties([]).

openapi_com_day_cq_replication_audit_replication_event_listener_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

