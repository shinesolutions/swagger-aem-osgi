-module(openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info/0]).

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties:openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties() }
  ].


openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info() ->
    openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info([]).

openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties:openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

