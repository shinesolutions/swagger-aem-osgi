-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties() ::
    #{ 'report_fetch_delay' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'report_fetch_delay' := ReportFetchDelay
        }) ->
    #{ 'report.fetch.delay' => ReportFetchDelay
     }.
