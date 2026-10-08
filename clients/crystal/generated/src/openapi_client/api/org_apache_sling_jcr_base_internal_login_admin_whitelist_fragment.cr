require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, whitelist_name : String? = nil, whitelist_bundles : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "whitelist.name" => whitelist_name, "whitelist.bundles" => whitelist_bundles },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
