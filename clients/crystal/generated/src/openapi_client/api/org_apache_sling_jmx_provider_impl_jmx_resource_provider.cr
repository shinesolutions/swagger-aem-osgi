require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJmxProviderImplJMXResourceProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_roots : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJmxProviderImplJMXResourceProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJmxProviderImplJMXResourceProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "provider.roots" => provider_roots },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
