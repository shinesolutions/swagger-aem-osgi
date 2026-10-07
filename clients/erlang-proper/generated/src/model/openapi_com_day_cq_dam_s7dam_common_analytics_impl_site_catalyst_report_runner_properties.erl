-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties/0]).

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scheduler_concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties() ->
    openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties([]).

openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scheduler.concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

