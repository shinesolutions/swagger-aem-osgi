-module(openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_get_impl_version_version_info_servlet_properties() ::
    #{ 'sling_servlet_selectors' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'ecmaSuport' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_servlet_selectors' := SlingServletSelectors,
          'ecmaSuport' := EcmaSuport
        }) ->
    #{ 'sling.servlet.selectors' => SlingServletSelectors,
       'ecmaSuport' => EcmaSuport
     }.
