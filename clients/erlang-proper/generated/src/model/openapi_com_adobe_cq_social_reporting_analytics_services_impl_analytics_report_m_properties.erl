-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties/0]).

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties() ::
  [ {'report_fetch_delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties() ->
    openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties([]).

openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties(Fields) ->
  Default = [ {'report.fetch.delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

