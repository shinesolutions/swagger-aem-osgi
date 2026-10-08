-module(openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties/0]).

-export([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties() ::
  [ {'cq_contentsync_pathrewritertransformer_mapping_links', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_contentsync_pathrewritertransformer_mapping_clientlibs', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_contentsync_pathrewritertransformer_mapping_images', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_contentsync_pathrewritertransformer_attribute_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_contentsync_pathrewritertransformer_clientlibrary_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_contentsync_pathrewritertransformer_clientlibrary_replace', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties() ->
    openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties([]).

openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties(Fields) ->
  Default = [ {'cq.contentsync.pathrewritertransformer.mapping.links', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.contentsync.pathrewritertransformer.mapping.clientlibs', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.contentsync.pathrewritertransformer.mapping.images', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.contentsync.pathrewritertransformer.attribute.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.contentsync.pathrewritertransformer.clientlibrary.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.contentsync.pathrewritertransformer.clientlibrary.replace', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

