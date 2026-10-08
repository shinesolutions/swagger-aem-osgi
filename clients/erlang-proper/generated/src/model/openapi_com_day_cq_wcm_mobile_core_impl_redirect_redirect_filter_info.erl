-module(openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info/0]).

-export([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info/1]).

-export_type([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info/0]).

-type openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties:openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info() ->
    openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info([]).

openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties:openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

