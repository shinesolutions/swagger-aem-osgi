-module(openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties() ::
    #{ 'scope' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'scope' := Scope
        }) ->
    #{ 'scope' => Scope
     }.
