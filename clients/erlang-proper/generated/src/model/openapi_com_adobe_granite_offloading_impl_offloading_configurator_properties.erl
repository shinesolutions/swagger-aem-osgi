-module(openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties/0]).

-export([openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties() ::
  [ {'offloading_transporter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'offloading_cleanup_payload', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties() ->
    openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties([]).

openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties(Fields) ->
  Default = [ {'offloading.transporter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'offloading.cleanup.payload', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

