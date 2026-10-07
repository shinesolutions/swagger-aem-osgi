require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, resource_resolver_searchpath : Array(String)? = nil, resource_resolver_manglenamespaces : Bool? = nil, resource_resolver_allow_direct : Bool? = nil, resource_resolver_required_providers : Array(String)? = nil, resource_resolver_required_providernames : Array(String)? = nil, resource_resolver_virtual : Array(String)? = nil, resource_resolver_mapping : Array(String)? = nil, resource_resolver_map_location : String? = nil, resource_resolver_map_observation : Array(String)? = nil, resource_resolver_default_vanity_redirect_status : Int32? = nil, resource_resolver_enable_vanitypath : Bool? = nil, resource_resolver_vanitypath_max_entries : Int32? = nil, resource_resolver_vanitypath_max_entries_startup : Bool? = nil, resource_resolver_vanitypath_bloomfilter_max_bytes : Int32? = nil, resource_resolver_optimize_alias_resolution : Bool? = nil, resource_resolver_vanitypath_whitelist : Array(String)? = nil, resource_resolver_vanitypath_blacklist : Array(String)? = nil, resource_resolver_vanity_precedence : Bool? = nil, resource_resolver_providerhandling_paranoid : Bool? = nil, resource_resolver_log_closing : Bool? = nil, resource_resolver_log_unclosed : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "resource.resolver.searchpath" => resource_resolver_searchpath, "resource.resolver.manglenamespaces" => resource_resolver_manglenamespaces, "resource.resolver.allowDirect" => resource_resolver_allow_direct, "resource.resolver.required.providers" => resource_resolver_required_providers, "resource.resolver.required.providernames" => resource_resolver_required_providernames, "resource.resolver.virtual" => resource_resolver_virtual, "resource.resolver.mapping" => resource_resolver_mapping, "resource.resolver.map.location" => resource_resolver_map_location, "resource.resolver.map.observation" => resource_resolver_map_observation, "resource.resolver.default.vanity.redirect.status" => resource_resolver_default_vanity_redirect_status, "resource.resolver.enable.vanitypath" => resource_resolver_enable_vanitypath, "resource.resolver.vanitypath.maxEntries" => resource_resolver_vanitypath_max_entries, "resource.resolver.vanitypath.maxEntries.startup" => resource_resolver_vanitypath_max_entries_startup, "resource.resolver.vanitypath.bloomfilter.maxBytes" => resource_resolver_vanitypath_bloomfilter_max_bytes, "resource.resolver.optimize.alias.resolution" => resource_resolver_optimize_alias_resolution, "resource.resolver.vanitypath.whitelist" => resource_resolver_vanitypath_whitelist, "resource.resolver.vanitypath.blacklist" => resource_resolver_vanitypath_blacklist, "resource.resolver.vanity.precedence" => resource_resolver_vanity_precedence, "resource.resolver.providerhandling.paranoid" => resource_resolver_providerhandling_paranoid, "resource.resolver.log.closing" => resource_resolver_log_closing, "resource.resolver.log.unclosed" => resource_resolver_log_unclosed },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
