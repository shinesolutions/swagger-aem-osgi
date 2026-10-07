# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, resource_resolver_searchpath: nil, resource_resolver_manglenamespaces: nil, resource_resolver_allow_direct: nil, resource_resolver_required_providers: nil, resource_resolver_required_providernames: nil, resource_resolver_virtual: nil, resource_resolver_mapping: nil, resource_resolver_map_location: nil, resource_resolver_map_observation: nil, resource_resolver_default_vanity_redirect_status: nil, resource_resolver_enable_vanitypath: nil, resource_resolver_vanitypath_max_entries: nil, resource_resolver_vanitypath_max_entries_startup: nil, resource_resolver_vanitypath_bloomfilter_max_bytes: nil, resource_resolver_optimize_alias_resolution: nil, resource_resolver_vanitypath_whitelist: nil, resource_resolver_vanitypath_blacklist: nil, resource_resolver_vanity_precedence: nil, resource_resolver_providerhandling_paranoid: nil, resource_resolver_log_closing: nil, resource_resolver_log_unclosed: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl',
          type: OpenapiClient::Models::OrgApacheSlingJcrResourceInternalJcrResourceResolverFH503e87d5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'resource.resolver.searchpath' => resource_resolver_searchpath, 'resource.resolver.manglenamespaces' => resource_resolver_manglenamespaces, 'resource.resolver.allowDirect' => resource_resolver_allow_direct, 'resource.resolver.required.providers' => resource_resolver_required_providers, 'resource.resolver.required.providernames' => resource_resolver_required_providernames, 'resource.resolver.virtual' => resource_resolver_virtual, 'resource.resolver.mapping' => resource_resolver_mapping, 'resource.resolver.map.location' => resource_resolver_map_location, 'resource.resolver.map.observation' => resource_resolver_map_observation, 'resource.resolver.default.vanity.redirect.status' => resource_resolver_default_vanity_redirect_status, 'resource.resolver.enable.vanitypath' => resource_resolver_enable_vanitypath, 'resource.resolver.vanitypath.maxEntries' => resource_resolver_vanitypath_max_entries, 'resource.resolver.vanitypath.maxEntries.startup' => resource_resolver_vanitypath_max_entries_startup, 'resource.resolver.vanitypath.bloomfilter.maxBytes' => resource_resolver_vanitypath_bloomfilter_max_bytes, 'resource.resolver.optimize.alias.resolution' => resource_resolver_optimize_alias_resolution, 'resource.resolver.vanitypath.whitelist' => resource_resolver_vanitypath_whitelist, 'resource.resolver.vanitypath.blacklist' => resource_resolver_vanitypath_blacklist, 'resource.resolver.vanity.precedence' => resource_resolver_vanity_precedence, 'resource.resolver.providerhandling.paranoid' => resource_resolver_providerhandling_paranoid, 'resource.resolver.log.closing' => resource_resolver_log_closing, 'resource.resolver.log.unclosed' => resource_resolver_log_unclosed }
        )
      end
    end
  end
end
