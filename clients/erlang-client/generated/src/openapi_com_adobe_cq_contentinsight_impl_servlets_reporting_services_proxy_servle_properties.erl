-module(openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties() ::
    #{ 'reportingservices_proxy_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'reportingservices_proxy_whitelist' := ReportingservicesProxyWhitelist
        }) ->
    #{ 'reportingservices.proxy.whitelist' => ReportingservicesProxyWhitelist
     }.
