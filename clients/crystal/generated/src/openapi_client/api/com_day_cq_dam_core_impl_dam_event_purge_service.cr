require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplDamEventPurgeService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, max_saved_activities : Int32? = nil, save_interval : Int32? = nil, enable_activity_purge : Bool? = nil, event_types : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplDamEventPurgeServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplDamEventPurgeServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "maxSavedActivities" => max_saved_activities, "saveInterval" => save_interval, "enableActivityPurge" => enable_activity_purge, "eventTypes" => event_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
