require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrBaseInternalLoginAdminWhitelist
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, whitelist_bypass : Bool? = nil, whitelist_bundles_regexp : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "whitelist.bypass" => whitelist_bypass, "whitelist.bundles.regexp" => whitelist_bundles_regexp },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
