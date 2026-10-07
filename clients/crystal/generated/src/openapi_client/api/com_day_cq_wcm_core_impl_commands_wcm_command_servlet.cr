require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplCommandsWCMCommandServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, wcmcommandservlet_delete_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplCommandsWCMCommandServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplCommandsWCMCommandServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "wcmcommandservlet.delete_whitelist" => wcmcommandservlet_delete_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
