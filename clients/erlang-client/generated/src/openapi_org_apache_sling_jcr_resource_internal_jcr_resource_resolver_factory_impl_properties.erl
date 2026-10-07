-module(openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties() ::
    #{ 'resource_resolver_searchpath' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_manglenamespaces' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_allowDirect' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_required_providers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_required_providernames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_virtual' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_mapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_map_location' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'resource_resolver_map_observation' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_default_vanity_redirect_status' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'resource_resolver_enable_vanitypath' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_vanitypath_maxEntries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'resource_resolver_vanitypath_maxEntries_startup' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_vanitypath_bloomfilter_maxBytes' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'resource_resolver_optimize_alias_resolution' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_vanitypath_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_vanitypath_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resource_resolver_vanity_precedence' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_providerhandling_paranoid' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_log_closing' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'resource_resolver_log_unclosed' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'resource_resolver_searchpath' := ResourceResolverSearchpath,
          'resource_resolver_manglenamespaces' := ResourceResolverManglenamespaces,
          'resource_resolver_allowDirect' := ResourceResolverAllowDirect,
          'resource_resolver_required_providers' := ResourceResolverRequiredProviders,
          'resource_resolver_required_providernames' := ResourceResolverRequiredProvidernames,
          'resource_resolver_virtual' := ResourceResolverVirtual,
          'resource_resolver_mapping' := ResourceResolverMapping,
          'resource_resolver_map_location' := ResourceResolverMapLocation,
          'resource_resolver_map_observation' := ResourceResolverMapObservation,
          'resource_resolver_default_vanity_redirect_status' := ResourceResolverDefaultVanityRedirectStatus,
          'resource_resolver_enable_vanitypath' := ResourceResolverEnableVanitypath,
          'resource_resolver_vanitypath_maxEntries' := ResourceResolverVanitypathMaxEntries,
          'resource_resolver_vanitypath_maxEntries_startup' := ResourceResolverVanitypathMaxEntriesStartup,
          'resource_resolver_vanitypath_bloomfilter_maxBytes' := ResourceResolverVanitypathBloomfilterMaxBytes,
          'resource_resolver_optimize_alias_resolution' := ResourceResolverOptimizeAliasResolution,
          'resource_resolver_vanitypath_whitelist' := ResourceResolverVanitypathWhitelist,
          'resource_resolver_vanitypath_blacklist' := ResourceResolverVanitypathBlacklist,
          'resource_resolver_vanity_precedence' := ResourceResolverVanityPrecedence,
          'resource_resolver_providerhandling_paranoid' := ResourceResolverProviderhandlingParanoid,
          'resource_resolver_log_closing' := ResourceResolverLogClosing,
          'resource_resolver_log_unclosed' := ResourceResolverLogUnclosed
        }) ->
    #{ 'resource.resolver.searchpath' => ResourceResolverSearchpath,
       'resource.resolver.manglenamespaces' => ResourceResolverManglenamespaces,
       'resource.resolver.allowDirect' => ResourceResolverAllowDirect,
       'resource.resolver.required.providers' => ResourceResolverRequiredProviders,
       'resource.resolver.required.providernames' => ResourceResolverRequiredProvidernames,
       'resource.resolver.virtual' => ResourceResolverVirtual,
       'resource.resolver.mapping' => ResourceResolverMapping,
       'resource.resolver.map.location' => ResourceResolverMapLocation,
       'resource.resolver.map.observation' => ResourceResolverMapObservation,
       'resource.resolver.default.vanity.redirect.status' => ResourceResolverDefaultVanityRedirectStatus,
       'resource.resolver.enable.vanitypath' => ResourceResolverEnableVanitypath,
       'resource.resolver.vanitypath.maxEntries' => ResourceResolverVanitypathMaxEntries,
       'resource.resolver.vanitypath.maxEntries.startup' => ResourceResolverVanitypathMaxEntriesStartup,
       'resource.resolver.vanitypath.bloomfilter.maxBytes' => ResourceResolverVanitypathBloomfilterMaxBytes,
       'resource.resolver.optimize.alias.resolution' => ResourceResolverOptimizeAliasResolution,
       'resource.resolver.vanitypath.whitelist' => ResourceResolverVanitypathWhitelist,
       'resource.resolver.vanitypath.blacklist' => ResourceResolverVanitypathBlacklist,
       'resource.resolver.vanity.precedence' => ResourceResolverVanityPrecedence,
       'resource.resolver.providerhandling.paranoid' => ResourceResolverProviderhandlingParanoid,
       'resource.resolver.log.closing' => ResourceResolverLogClosing,
       'resource.resolver.log.unclosed' => ResourceResolverLogUnclosed
     }.
