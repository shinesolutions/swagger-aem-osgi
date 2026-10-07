require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, home_path : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "homePath" => home_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
