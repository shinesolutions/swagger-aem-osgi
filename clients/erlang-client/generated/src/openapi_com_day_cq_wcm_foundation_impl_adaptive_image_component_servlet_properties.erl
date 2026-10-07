-module(openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties() ::
    #{ 'adapt_supported_widths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'adapt_supported_widths' := AdaptSupportedWidths
        }) ->
    #{ 'adapt.supported.widths' => AdaptSupportedWidths
     }.
