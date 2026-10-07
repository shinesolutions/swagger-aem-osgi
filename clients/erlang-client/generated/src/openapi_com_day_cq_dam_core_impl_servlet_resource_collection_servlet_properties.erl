-module(openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties() ::
    #{ 'sling_servlet_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_servlet_methods' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'download_config' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'view_selector' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'send_email' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_servlet_resourceTypes' := SlingServletResourceTypes,
          'sling_servlet_methods' := SlingServletMethods,
          'sling_servlet_selectors' := SlingServletSelectors,
          'download_config' := DownloadConfig,
          'view_selector' := ViewSelector,
          'send_email' := SendEmail
        }) ->
    #{ 'sling.servlet.resourceTypes' => SlingServletResourceTypes,
       'sling.servlet.methods' => SlingServletMethods,
       'sling.servlet.selectors' => SlingServletSelectors,
       'download.config' => DownloadConfig,
       'view.selector' => ViewSelector,
       'send_email' => SendEmail
     }.
