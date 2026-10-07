-module(openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties/0]).

-type openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties() ::
    #{ 'size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'size' := Size
        }) ->
    #{ 'size' => Size
     }.
