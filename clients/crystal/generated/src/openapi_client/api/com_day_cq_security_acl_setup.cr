require "json"

module OpenAPIClient
  module Api
  class ComDayCqSecurityACLSetup
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_aclsetup_rules : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqSecurityACLSetupInfo)
      @conn.request(OpenAPIClient::ComDayCqSecurityACLSetupInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.security.ACLSetup",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.aclsetup.rules" => cq_aclsetup_rules },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
