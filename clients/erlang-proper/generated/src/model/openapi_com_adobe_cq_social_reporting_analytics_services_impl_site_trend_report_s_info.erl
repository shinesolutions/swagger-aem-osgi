-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info/0]).

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties:openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties() }
  ].


openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info() ->
    openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info([]).

openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties:openapi_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

