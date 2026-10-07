-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties()
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
