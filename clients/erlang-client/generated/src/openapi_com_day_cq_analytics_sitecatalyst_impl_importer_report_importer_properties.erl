-module(openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties() ::
    #{ 'report_fetch_attempts' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'report_fetch_delay' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'report_fetch_attempts' := ReportFetchAttempts,
          'report_fetch_delay' := ReportFetchDelay
        }) ->
    #{ 'report.fetch.attempts' => ReportFetchAttempts,
       'report.fetch.delay' => ReportFetchDelay
     }.
