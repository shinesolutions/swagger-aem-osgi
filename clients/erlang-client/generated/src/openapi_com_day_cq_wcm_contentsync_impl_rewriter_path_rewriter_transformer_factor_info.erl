-module(openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties:openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.