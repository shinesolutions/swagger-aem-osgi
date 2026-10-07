-module(openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info/0]).

-export([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info/1]).

-export_type([openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info/0]).

-type openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties:openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties() }
  ].


openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info() ->
    openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info([]).

openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties:openapi_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

