-module(openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties() ::
    #{ 'filter_order' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'filter_scope' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'filter_order' := FilterOrder,
          'filter_scope' := FilterScope
        }) ->
    #{ 'filter.order' => FilterOrder,
       'filter.scope' => FilterScope
     }.
