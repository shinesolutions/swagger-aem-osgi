-module(openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info/0]).

-export([openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info/1]).

-export_type([openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info/0]).

-type openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties:openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties() }
  ].


openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info() ->
    openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info([]).

openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties:openapi_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

