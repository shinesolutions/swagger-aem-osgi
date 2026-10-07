-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties:openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties()
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
