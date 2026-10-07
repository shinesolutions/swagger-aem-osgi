-module(openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties() ::
    #{ 'sling_servlet_paths' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_paths' := SlingServletPaths,
          'sling_servlet_methods' := SlingServletMethods
        }) ->
    #{ 'sling.servlet.paths' => SlingServletPaths,
       'sling.servlet.methods' => SlingServletMethods
     }.
