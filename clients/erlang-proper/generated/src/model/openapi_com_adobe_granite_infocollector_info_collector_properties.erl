-module(openapi_com_adobe_granite_infocollector_info_collector_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_infocollector_info_collector_properties/0]).

-export([openapi_com_adobe_granite_infocollector_info_collector_properties/1]).

-export_type([openapi_com_adobe_granite_infocollector_info_collector_properties/0]).

-type openapi_com_adobe_granite_infocollector_info_collector_properties() ::
  [ {'granite_infocollector_includeThreadDumps', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_infocollector_includeHeapDump', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_infocollector_info_collector_properties() ->
    openapi_com_adobe_granite_infocollector_info_collector_properties([]).

openapi_com_adobe_granite_infocollector_info_collector_properties(Fields) ->
  Default = [ {'granite.infocollector.includeThreadDumps', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.infocollector.includeHeapDump', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

