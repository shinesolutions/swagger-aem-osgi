-module(openapi_com_day_cq_dam_core_impl_handler_jpeg_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_jpeg_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_handler_jpeg_handler_properties() ::
    #{ 'cq_dam_enable_ext_meta_extraction' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'large_file_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'large_comment_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_enable_ext_meta_extraction' := CqDamEnableExtMetaExtraction,
          'large_file_threshold' := LargeFileThreshold,
          'large_comment_threshold' := LargeCommentThreshold
        }) ->
    #{ 'cq.dam.enable.ext.meta.extraction' => CqDamEnableExtMetaExtraction,
       'large_file_threshold' => LargeFileThreshold,
       'large_comment_threshold' => LargeCommentThreshold
     }.
