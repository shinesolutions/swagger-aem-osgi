require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsThumbnailServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, workspace : String? = nil, dimensions : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsThumbnailServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsThumbnailServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "workspace" => workspace, "dimensions" => dimensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
