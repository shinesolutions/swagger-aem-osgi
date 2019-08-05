-module(openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_info/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties:openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties()
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
