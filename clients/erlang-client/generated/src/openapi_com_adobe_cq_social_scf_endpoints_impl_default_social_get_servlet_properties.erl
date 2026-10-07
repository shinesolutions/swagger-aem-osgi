-module(openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties/0]).

-type openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties() ::
    #{ 'sling_servlet_selectors' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_servlet_extensions' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_selectors' := SlingServletSelectors,
          'sling_servlet_extensions' := SlingServletExtensions
        }) ->
    #{ 'sling.servlet.selectors' => SlingServletSelectors,
       'sling.servlet.extensions' => SlingServletExtensions
     }.
