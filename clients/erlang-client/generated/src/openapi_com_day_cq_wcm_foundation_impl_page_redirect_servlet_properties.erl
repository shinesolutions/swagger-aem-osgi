-module(openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties() ::
    #{ 'excluded_resource_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'excluded_resource_types' := ExcludedResourceTypes
        }) ->
    #{ 'excluded.resource.types' => ExcludedResourceTypes
     }.
