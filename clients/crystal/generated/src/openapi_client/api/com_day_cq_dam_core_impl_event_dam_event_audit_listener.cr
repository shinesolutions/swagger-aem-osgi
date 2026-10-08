require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplEventDamEventAuditListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplEventDamEventAuditListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplEventDamEventAuditListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
