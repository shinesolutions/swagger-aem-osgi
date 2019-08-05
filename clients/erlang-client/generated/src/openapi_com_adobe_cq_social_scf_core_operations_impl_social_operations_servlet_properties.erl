-module(openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties/0]).

-type openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties() ::
    #{ 'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_extensions' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_selectors' := SlingServletSelectors,
          'sling_servlet_extensions' := SlingServletExtensions
        }) ->
    #{ 'sling.servlet.selectors' => SlingServletSelectors,
       'sling.servlet.extensions' => SlingServletExtensions
     }.
