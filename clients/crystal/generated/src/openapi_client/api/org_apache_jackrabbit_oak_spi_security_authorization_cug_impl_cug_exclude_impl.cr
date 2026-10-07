require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcludeImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, principal_names : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "principalNames" => principal_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
