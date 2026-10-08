-module(openapi_com_day_cq_wcm_core_wcm_request_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_wcm_request_filter_properties/0]).

-export([openapi_com_day_cq_wcm_core_wcm_request_filter_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_wcm_request_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_wcm_request_filter_properties() ::
  [ {'wcmfilter_mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_day_cq_wcm_core_wcm_request_filter_properties() ->
    openapi_com_day_cq_wcm_core_wcm_request_filter_properties([]).

openapi_com_day_cq_wcm_core_wcm_request_filter_properties(Fields) ->
  Default = [ {'wcmfilter.mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

