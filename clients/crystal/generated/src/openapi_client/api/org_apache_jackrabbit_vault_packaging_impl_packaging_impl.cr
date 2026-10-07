require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitVaultPackagingImplPackagingImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, package_roots : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "packageRoots" => package_roots },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
