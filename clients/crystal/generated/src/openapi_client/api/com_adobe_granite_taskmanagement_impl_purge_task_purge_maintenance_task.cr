require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, purge_completed : Bool? = nil, completed_age : Int32? = nil, purge_active : Bool? = nil, active_age : Int32? = nil, save_threshold : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "purgeCompleted" => purge_completed, "completedAge" => completed_age, "purgeActive" => purge_active, "activeAge" => active_age, "saveThreshold" => save_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
