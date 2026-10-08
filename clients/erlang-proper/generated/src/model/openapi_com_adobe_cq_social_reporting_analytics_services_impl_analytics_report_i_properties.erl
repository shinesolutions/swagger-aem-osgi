-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties/0]).

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties() ::
  [ {'cq_social_reporting_analytics_polling_importer_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_social_reporting_analytics_polling_importer_pageSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties() ->
    openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties([]).

openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties(Fields) ->
  Default = [ {'cq.social.reporting.analytics.polling.importer.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.social.reporting.analytics.polling.importer.pageSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

