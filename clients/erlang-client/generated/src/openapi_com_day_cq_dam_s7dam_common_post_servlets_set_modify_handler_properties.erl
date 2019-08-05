-module(openapi_com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_properties() ::
    #{ 'sling_post_operation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_post_operation' := SlingPostOperation,
          'sling_servlet_methods' := SlingServletMethods
        }) ->
    #{ 'sling.post.operation' => SlingPostOperation,
       'sling.servlet.methods' => SlingServletMethods
     }.
