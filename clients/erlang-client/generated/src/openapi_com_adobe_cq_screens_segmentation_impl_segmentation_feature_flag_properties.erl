-module(openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties/0]).

-type openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties() ::
    #{ 'enableDataTriggeredContent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enableDataTriggeredContent' := EnableDataTriggeredContent
        }) ->
    #{ 'enableDataTriggeredContent' => EnableDataTriggeredContent
     }.
