-module(openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties/0]).

-export([openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties/1]).

-export_type([openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties/0]).

-type openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties() ::
  [ {'large_file_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties() ->
    openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties([]).

openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties(Fields) ->
  Default = [ {'large_file_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

