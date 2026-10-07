require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, checkpath_prefix : String? = nil, jcr_path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "checkpath.prefix" => checkpath_prefix, "jcrPath" => jcr_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
