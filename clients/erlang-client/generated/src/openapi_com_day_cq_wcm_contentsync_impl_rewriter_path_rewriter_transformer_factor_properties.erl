-module(openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties() ::
    #{ 'cq_contentsync_pathrewritertransformer_mapping_links' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_contentsync_pathrewritertransformer_mapping_clientlibs' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_contentsync_pathrewritertransformer_mapping_images' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_contentsync_pathrewritertransformer_attribute_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_contentsync_pathrewritertransformer_clientlibrary_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_contentsync_pathrewritertransformer_clientlibrary_replace' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_contentsync_pathrewritertransformer_mapping_links' := CqContentsyncPathrewritertransformerMappingLinks,
          'cq_contentsync_pathrewritertransformer_mapping_clientlibs' := CqContentsyncPathrewritertransformerMappingClientlibs,
          'cq_contentsync_pathrewritertransformer_mapping_images' := CqContentsyncPathrewritertransformerMappingImages,
          'cq_contentsync_pathrewritertransformer_attribute_pattern' := CqContentsyncPathrewritertransformerAttributePattern,
          'cq_contentsync_pathrewritertransformer_clientlibrary_pattern' := CqContentsyncPathrewritertransformerClientlibraryPattern,
          'cq_contentsync_pathrewritertransformer_clientlibrary_replace' := CqContentsyncPathrewritertransformerClientlibraryReplace
        }) ->
    #{ 'cq.contentsync.pathrewritertransformer.mapping.links' => CqContentsyncPathrewritertransformerMappingLinks,
       'cq.contentsync.pathrewritertransformer.mapping.clientlibs' => CqContentsyncPathrewritertransformerMappingClientlibs,
       'cq.contentsync.pathrewritertransformer.mapping.images' => CqContentsyncPathrewritertransformerMappingImages,
       'cq.contentsync.pathrewritertransformer.attribute.pattern' => CqContentsyncPathrewritertransformerAttributePattern,
       'cq.contentsync.pathrewritertransformer.clientlibrary.pattern' => CqContentsyncPathrewritertransformerClientlibraryPattern,
       'cq.contentsync.pathrewritertransformer.clientlibrary.replace' => CqContentsyncPathrewritertransformerClientlibraryReplace
     }.
