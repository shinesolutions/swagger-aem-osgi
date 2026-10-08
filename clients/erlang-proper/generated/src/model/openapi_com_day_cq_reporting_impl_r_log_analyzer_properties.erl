-module(openapi_com_day_cq_reporting_impl_r_log_analyzer_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_reporting_impl_r_log_analyzer_properties/0]).

-export([openapi_com_day_cq_reporting_impl_r_log_analyzer_properties/1]).

-export_type([openapi_com_day_cq_reporting_impl_r_log_analyzer_properties/0]).

-type openapi_com_day_cq_reporting_impl_r_log_analyzer_properties() ::
  [ {'request_log_output', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_reporting_impl_r_log_analyzer_properties() ->
    openapi_com_day_cq_reporting_impl_r_log_analyzer_properties([]).

openapi_com_day_cq_reporting_impl_r_log_analyzer_properties(Fields) ->
  Default = [ {'request.log.output', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

