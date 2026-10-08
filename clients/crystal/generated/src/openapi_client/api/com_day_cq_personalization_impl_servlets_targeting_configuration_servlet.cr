require "json"

module OpenAPIClient
  module Api
  class ComDayCqPersonalizationImplServletsTargetingConfigurationServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, forcelocation : Bool? = nil) : Response(OpenAPIClient::ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo)
      @conn.request(OpenAPIClient::ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "forcelocation" => forcelocation },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
