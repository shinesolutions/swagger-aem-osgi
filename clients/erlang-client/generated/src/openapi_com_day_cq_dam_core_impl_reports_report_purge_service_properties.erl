-module(openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties/0]).

-type openapi_com_day_cq_dam_core_impl_reports_report_purge_service_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'maxSavedReports' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'timeDuration' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'enableReportPurge' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'maxSavedReports' := MaxSavedReports,
          'timeDuration' := TimeDuration,
          'enableReportPurge' := EnableReportPurge
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'maxSavedReports' => MaxSavedReports,
       'timeDuration' => TimeDuration,
       'enableReportPurge' => EnableReportPurge
     }.
