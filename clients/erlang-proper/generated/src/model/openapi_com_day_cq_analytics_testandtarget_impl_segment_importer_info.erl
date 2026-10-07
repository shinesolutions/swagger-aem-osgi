-module(openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info/0]).

-export([openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties:openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties() }
  ].


openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info() ->
    openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info([]).

openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties:openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

