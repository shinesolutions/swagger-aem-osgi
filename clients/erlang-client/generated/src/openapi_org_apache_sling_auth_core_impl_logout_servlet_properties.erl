-module(openapi_org_apache_sling_auth_core_impl_logout_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_auth_core_impl_logout_servlet_properties/0]).

-type openapi_org_apache_sling_auth_core_impl_logout_servlet_properties() ::
    #{ 'sling_servlet_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_servlet_paths' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_methods' := SlingServletMethods,
          'sling_servlet_paths' := SlingServletPaths
        }) ->
    #{ 'sling.servlet.methods' => SlingServletMethods,
       'sling.servlet.paths' => SlingServletPaths
     }.
