-module(openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties/0]).

-type openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties() ::
    #{ 'servletresolver_servletRoot' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'servletresolver_cacheSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'servletresolver_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'servletresolver_defaultExtensions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'servletresolver_servletRoot' := ServletresolverServletRoot,
          'servletresolver_cacheSize' := ServletresolverCacheSize,
          'servletresolver_paths' := ServletresolverPaths,
          'servletresolver_defaultExtensions' := ServletresolverDefaultExtensions
        }) ->
    #{ 'servletresolver.servletRoot' => ServletresolverServletRoot,
       'servletresolver.cacheSize' => ServletresolverCacheSize,
       'servletresolver.paths' => ServletresolverPaths,
       'servletresolver.defaultExtensions' => ServletresolverDefaultExtensions
     }.
