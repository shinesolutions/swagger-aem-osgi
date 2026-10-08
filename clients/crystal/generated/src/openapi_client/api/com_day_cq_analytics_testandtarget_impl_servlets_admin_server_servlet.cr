require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, testandtarget_endpoint_url : String? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "testandtarget.endpoint.url" => testandtarget_endpoint_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
