-module(openapi_com_day_cq_dam_core_process_metadata_processor_process_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_process_metadata_processor_process_properties/0]).

-export([openapi_com_day_cq_dam_core_process_metadata_processor_process_properties/1]).

-export_type([openapi_com_day_cq_dam_core_process_metadata_processor_process_properties/0]).

-type openapi_com_day_cq_dam_core_process_metadata_processor_process_properties() ::
  [ {'process_label', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_enable_sha1', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_metadata_xssprotected_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_process_metadata_processor_process_properties() ->
    openapi_com_day_cq_dam_core_process_metadata_processor_process_properties([]).

openapi_com_day_cq_dam_core_process_metadata_processor_process_properties(Fields) ->
  Default = [ {'process.label', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.enable.sha1', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.metadata.xssprotected.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

