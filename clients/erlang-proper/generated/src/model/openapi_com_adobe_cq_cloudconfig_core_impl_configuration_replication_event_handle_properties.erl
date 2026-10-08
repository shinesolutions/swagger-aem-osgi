-module(openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties/0]).

-export([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties/1]).

-export_type([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties/0]).

-type openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties() ::
  [ {'flush_agents', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties() ->
    openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties([]).

openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties(Fields) ->
  Default = [ {'flush.agents', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

