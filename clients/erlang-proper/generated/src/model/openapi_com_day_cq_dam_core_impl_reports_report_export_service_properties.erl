-module(openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties/0]).

-type openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties() ::
  [ {'queryBatchSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties() ->
    openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties([]).

openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties(Fields) ->
  Default = [ {'queryBatchSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

