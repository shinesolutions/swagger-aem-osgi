-module(openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties() ::
    #{ 'reportingservices_url' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'reportingservices_url' := ReportingservicesUrl
        }) ->
    #{ 'reportingservices.url' => ReportingservicesUrl
     }.
