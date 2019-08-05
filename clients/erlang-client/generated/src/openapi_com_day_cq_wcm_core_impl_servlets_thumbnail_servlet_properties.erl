-module(openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties() ::
    #{ 'workspace' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dimensions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'workspace' := Workspace,
          'dimensions' := Dimensions
        }) ->
    #{ 'workspace' => Workspace,
       'dimensions' => Dimensions
     }.
