-module(openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties() ::
    #{ 'cq_pagesupdatehandler_imageresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_pagesupdatehandler_imageresourcetypes' := CqPagesupdatehandlerImageresourcetypes
        }) ->
    #{ 'cq.pagesupdatehandler.imageresourcetypes' => CqPagesupdatehandlerImageresourcetypes
     }.
