require "json"

module OpenAPIClient
  module Api
  class ComDayCqMcmImplMCMConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, experience_indirection : Array(String)? = nil, touchpoint_indirection : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqMcmImplMCMConfigurationInfo)
      @conn.request(OpenAPIClient::ComDayCqMcmImplMCMConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "experience.indirection" => experience_indirection, "touchpoint.indirection" => touchpoint_indirection },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
