-module(openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties/0]).

-export([openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties() ::
  [ {'default_transport_agent_to_worker_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_transport_agent_to_master_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_transport_input_package', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_transport_output_package', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_transport_replication_synchronous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'default_transport_contentpackage', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'offloading_transporter_default_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties() ->
    openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties([]).

openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties(Fields) ->
  Default = [ {'default.transport.agent-to-worker.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.transport.agent-to-master.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.transport.input.package', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.transport.output.package', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.transport.replication.synchronous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'default.transport.contentpackage', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'offloading.transporter.default.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

