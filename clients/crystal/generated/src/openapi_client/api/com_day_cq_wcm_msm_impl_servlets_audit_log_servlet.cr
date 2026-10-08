require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplServletsAuditLogServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, auditlogservlet_default_events_count : Int32? = nil, auditlogservlet_default_path : String? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplServletsAuditLogServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplServletsAuditLogServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "auditlogservlet.default.events.count" => auditlogservlet_default_events_count, "auditlogservlet.default.path" => auditlogservlet_default_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
