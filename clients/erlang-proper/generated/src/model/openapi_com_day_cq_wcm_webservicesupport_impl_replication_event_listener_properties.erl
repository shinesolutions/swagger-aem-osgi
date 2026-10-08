-module(openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties/0]).

-export([openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties/1]).

-export_type([openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties/0]).

-type openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties() ::
  [ {'Flush_agents', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties() ->
    openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties([]).

openapi_com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties(Fields) ->
  Default = [ {'Flush agents', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

