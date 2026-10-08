-module(openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info/0]).

-export([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info/0]).

-type openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties:openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties() }
  ].


openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info() ->
    openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info([]).

openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties:openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

