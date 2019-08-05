-module(openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties() ::
    #{ 'sling_servlet_resourceTypes' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'resource_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_blacklist' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_resourceTypes' := SlingServletResourceTypes,
          'sling_servlet_selectors' := SlingServletSelectors,
          'resource_whitelist' := ResourceWhitelist,
          'resource_blacklist' := ResourceBlacklist
        }) ->
    #{ 'sling.servlet.resourceTypes' => SlingServletResourceTypes,
       'sling.servlet.selectors' => SlingServletSelectors,
       'resource.whitelist' => ResourceWhitelist,
       'resource.blacklist' => ResourceBlacklist
     }.
