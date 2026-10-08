-module(openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties/0]).

-export([openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties() ::
  [ {'offloading_agentmanager_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties() ->
    openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties([]).

openapi_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties(Fields) ->
  Default = [ {'offloading.agentmanager.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

