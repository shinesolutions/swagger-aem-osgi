-module(openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties/0]).

-type openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties() ::
    #{ 'cq_pagesupdatehandler_imageresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_pagesupdatehandler_productresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_pagesupdatehandler_videoresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_pagesupdatehandler_dynamicsequenceresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_pagesupdatehandler_previewmodepaths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_pagesupdatehandler_imageresourcetypes' := CqPagesupdatehandlerImageresourcetypes,
          'cq_pagesupdatehandler_productresourcetypes' := CqPagesupdatehandlerProductresourcetypes,
          'cq_pagesupdatehandler_videoresourcetypes' := CqPagesupdatehandlerVideoresourcetypes,
          'cq_pagesupdatehandler_dynamicsequenceresourcetypes' := CqPagesupdatehandlerDynamicsequenceresourcetypes,
          'cq_pagesupdatehandler_previewmodepaths' := CqPagesupdatehandlerPreviewmodepaths
        }) ->
    #{ 'cq.pagesupdatehandler.imageresourcetypes' => CqPagesupdatehandlerImageresourcetypes,
       'cq.pagesupdatehandler.productresourcetypes' => CqPagesupdatehandlerProductresourcetypes,
       'cq.pagesupdatehandler.videoresourcetypes' => CqPagesupdatehandlerVideoresourcetypes,
       'cq.pagesupdatehandler.dynamicsequenceresourcetypes' => CqPagesupdatehandlerDynamicsequenceresourcetypes,
       'cq.pagesupdatehandler.previewmodepaths' => CqPagesupdatehandlerPreviewmodepaths
     }.
