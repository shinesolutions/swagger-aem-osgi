-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties() ::
    #{ 'cq_social_reporting_analytics_polling_importer_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_social_reporting_analytics_polling_importer_pageSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_social_reporting_analytics_polling_importer_interval' := CqSocialReportingAnalyticsPollingImporterInterval,
          'cq_social_reporting_analytics_polling_importer_pageSize' := CqSocialReportingAnalyticsPollingImporterPageSize
        }) ->
    #{ 'cq.social.reporting.analytics.polling.importer.interval' => CqSocialReportingAnalyticsPollingImporterInterval,
       'cq.social.reporting.analytics.polling.importer.pageSize' => CqSocialReportingAnalyticsPollingImporterPageSize
     }.
