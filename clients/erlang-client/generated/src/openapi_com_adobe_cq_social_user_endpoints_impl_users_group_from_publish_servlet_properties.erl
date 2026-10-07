-module(openapi_com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties/0]).

-type openapi_com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties() ::
    #{ 'sling_servlet_extensions' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_paths' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_extensions' := SlingServletExtensions,
          'sling_servlet_paths' := SlingServletPaths,
          'sling_servlet_methods' := SlingServletMethods
        }) ->
    #{ 'sling.servlet.extensions' => SlingServletExtensions,
       'sling.servlet.paths' => SlingServletPaths,
       'sling.servlet.methods' => SlingServletMethods
     }.
