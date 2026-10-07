-module(openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info/0]).

-export([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties:openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties() }
  ].


openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info() ->
    openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info([]).

openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties:openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

