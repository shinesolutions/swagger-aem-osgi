require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplDamEventRecorderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, event_queue_length : Int32? = nil, eventrecorder_enabled : Bool? = nil, eventrecorder_blacklist : Array(String)? = nil, eventrecorder_eventtypes : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplDamEventRecorderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplDamEventRecorderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "event.queue.length" => event_queue_length, "eventrecorder.enabled" => eventrecorder_enabled, "eventrecorder.blacklist" => eventrecorder_blacklist, "eventrecorder.eventtypes" => eventrecorder_eventtypes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
