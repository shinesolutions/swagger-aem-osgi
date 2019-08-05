-module(openapi_com_day_cq_dam_core_impl_reports_report_export_service_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_reports_report_export_service_info/0]).

-type openapi_com_day_cq_dam_core_impl_reports_report_export_service_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties:openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
