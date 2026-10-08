require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, length : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "length" => length },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
