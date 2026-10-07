require "json"

module OpenAPIClient
  module Api
  class ComDayCqExtwidgetServletsImageSpriteServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_width : Int32? = nil, max_height : Int32? = nil) : Response(OpenAPIClient::ComDayCqExtwidgetServletsImageSpriteServletInfo)
      @conn.request(OpenAPIClient::ComDayCqExtwidgetServletsImageSpriteServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxWidth" => max_width, "maxHeight" => max_height },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
