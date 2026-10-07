-module(openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties/0]).

-type openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties() ::
  [ {'mimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'maxExtract', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties() ->
    openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties([]).

openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties(Fields) ->
  Default = [ {'mimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'maxExtract', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

