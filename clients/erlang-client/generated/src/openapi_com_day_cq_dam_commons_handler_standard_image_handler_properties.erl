-module(openapi_com_day_cq_dam_commons_handler_standard_image_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_commons_handler_standard_image_handler_properties/0]).

-type openapi_com_day_cq_dam_commons_handler_standard_image_handler_properties() ::
    #{ 'large_file_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'large_comment_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_enable_ext_meta_extraction' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'large_file_threshold' := LargeFileThreshold,
          'large_comment_threshold' := LargeCommentThreshold,
          'cq_dam_enable_ext_meta_extraction' := CqDamEnableExtMetaExtraction
        }) ->
    #{ 'large_file_threshold' => LargeFileThreshold,
       'large_comment_threshold' => LargeCommentThreshold,
       'cq.dam.enable.ext.meta.extraction' => CqDamEnableExtMetaExtraction
     }.
