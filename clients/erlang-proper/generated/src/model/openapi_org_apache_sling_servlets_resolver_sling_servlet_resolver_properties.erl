-module(openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties/0]).

-export([openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties/1]).

-export_type([openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties/0]).

-type openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties() ::
  [ {'servletresolver_servletRoot', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'servletresolver_cacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'servletresolver_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'servletresolver_defaultExtensions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties() ->
    openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties([]).

openapi_org_apache_sling_servlets_resolver_sling_servlet_resolver_properties(Fields) ->
  Default = [ {'servletresolver.servletRoot', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'servletresolver.cacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'servletresolver.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'servletresolver.defaultExtensions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

