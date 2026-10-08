require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionResourcesImplDistributionConfigurationResourceProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_roots : String? = nil, kind : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "provider.roots" => provider_roots, "kind" => kind },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
