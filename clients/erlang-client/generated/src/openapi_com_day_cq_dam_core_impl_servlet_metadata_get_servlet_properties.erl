-module(openapi_com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties() ::
    #{ 'sling_servlet_resourceTypes' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_extensions' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_resourceTypes' := SlingServletResourceTypes,
          'sling_servlet_methods' := SlingServletMethods,
          'sling_servlet_extensions' := SlingServletExtensions,
          'sling_servlet_selectors' := SlingServletSelectors
        }) ->
    #{ 'sling.servlet.resourceTypes' => SlingServletResourceTypes,
       'sling.servlet.methods' => SlingServletMethods,
       'sling.servlet.extensions' => SlingServletExtensions,
       'sling.servlet.selectors' => SlingServletSelectors
     }.
