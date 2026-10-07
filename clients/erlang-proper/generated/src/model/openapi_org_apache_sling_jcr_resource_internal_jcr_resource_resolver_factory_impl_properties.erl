-module(openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties/0]).

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties() ::
  [ {'resource_resolver_searchpath', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_manglenamespaces', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_allowDirect', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_required_providers', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_required_providernames', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_virtual', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_map_location', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'resource_resolver_map_observation', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_default_vanity_redirect_status', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'resource_resolver_enable_vanitypath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_vanitypath_maxEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'resource_resolver_vanitypath_maxEntries_startup', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_vanitypath_bloomfilter_maxBytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'resource_resolver_optimize_alias_resolution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_vanitypath_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_vanitypath_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_resolver_vanity_precedence', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_providerhandling_paranoid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_log_closing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'resource_resolver_log_unclosed', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties() ->
    openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties([]).

openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties(Fields) ->
  Default = [ {'resource.resolver.searchpath', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.manglenamespaces', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.allowDirect', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.required.providers', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.required.providernames', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.virtual', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.map.location', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'resource.resolver.map.observation', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.default.vanity.redirect.status', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'resource.resolver.enable.vanitypath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.vanitypath.maxEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'resource.resolver.vanitypath.maxEntries.startup', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.vanitypath.bloomfilter.maxBytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'resource.resolver.optimize.alias.resolution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.vanitypath.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.vanitypath.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.resolver.vanity.precedence', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.providerhandling.paranoid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.log.closing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'resource.resolver.log.unclosed', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

