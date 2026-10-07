-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties/0]).

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties() ::
  [ {'cq_social_console_analytics_sites_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties() ->
    openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties([]).

openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties(Fields) ->
  Default = [ {'cq.social.console.analytics.sites.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

