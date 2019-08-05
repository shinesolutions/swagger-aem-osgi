-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties() ::
    #{ 'guessTotal' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'tagTitleSearch' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'guessTotal' := GuessTotal,
          'tagTitleSearch' := TagTitleSearch
        }) ->
    #{ 'guessTotal' => GuessTotal,
       'tagTitleSearch' => TagTitleSearch
     }.
