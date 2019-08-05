-module(openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties() ::
    #{ 'sling_servlet_paths' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_dam_enable_anonymous' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_servlet_paths' := SlingServletPaths,
          'sling_servlet_methods' := SlingServletMethods,
          'cq_dam_enable_anonymous' := CqDamEnableAnonymous
        }) ->
    #{ 'sling.servlet.paths' => SlingServletPaths,
       'sling.servlet.methods' => SlingServletMethods,
       'cq.dam.enable.anonymous' => CqDamEnableAnonymous
     }.
