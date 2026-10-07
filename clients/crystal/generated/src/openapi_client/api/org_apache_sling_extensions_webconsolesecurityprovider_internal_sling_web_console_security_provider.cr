require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWebConsoleSecurityProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, users : Array(String)? = nil, groups : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "users" => users, "groups" => groups },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
