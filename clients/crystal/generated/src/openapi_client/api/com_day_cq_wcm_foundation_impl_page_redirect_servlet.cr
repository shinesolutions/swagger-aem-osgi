require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationImplPageRedirectServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, excluded_resource_types : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationImplPageRedirectServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationImplPageRedirectServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "excluded.resource.types" => excluded_resource_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
