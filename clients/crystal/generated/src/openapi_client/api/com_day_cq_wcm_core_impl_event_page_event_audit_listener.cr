require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplEventPageEventAuditListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, configured : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplEventPageEventAuditListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplEventPageEventAuditListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "configured" => configured },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
