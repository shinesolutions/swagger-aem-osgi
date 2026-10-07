-module(openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties/0]).

-type openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxSavedReports', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'timeDuration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableReportPurge', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties() ->
    openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties([]).

openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxSavedReports', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'timeDuration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableReportPurge', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

