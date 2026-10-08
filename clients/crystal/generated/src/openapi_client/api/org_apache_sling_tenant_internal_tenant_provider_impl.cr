require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingTenantInternalTenantProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, tenant_root : String? = nil, tenant_path_matcher : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingTenantInternalTenantProviderImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingTenantInternalTenantProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "tenant.root" => tenant_root, "tenant.path.matcher" => tenant_path_matcher },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
