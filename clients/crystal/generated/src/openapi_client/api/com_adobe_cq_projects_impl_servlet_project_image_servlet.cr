require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqProjectsImplServletProjectImageServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, image_quality : String? = nil, image_supported_resolutions : String? = nil) : Response(OpenAPIClient::ComAdobeCqProjectsImplServletProjectImageServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqProjectsImplServletProjectImageServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "image.quality" => image_quality, "image.supported.resolutions" => image_supported_resolutions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
