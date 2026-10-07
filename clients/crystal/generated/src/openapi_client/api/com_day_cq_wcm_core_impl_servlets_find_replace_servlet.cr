require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsFindReplaceServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scope : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsFindReplaceServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsFindReplaceServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scope" => scope },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
