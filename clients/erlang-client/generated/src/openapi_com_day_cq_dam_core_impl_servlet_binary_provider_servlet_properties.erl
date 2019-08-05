-module(openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties() ::
    #{ 'sling_servlet_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_servlet_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_dam_drm_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_servlet_resourceTypes' := SlingServletResourceTypes,
          'sling_servlet_methods' := SlingServletMethods,
          'cq_dam_drm_enable' := CqDamDrmEnable
        }) ->
    #{ 'sling.servlet.resourceTypes' => SlingServletResourceTypes,
       'sling.servlet.methods' => SlingServletMethods,
       'cq.dam.drm.enable' => CqDamDrmEnable
     }.
