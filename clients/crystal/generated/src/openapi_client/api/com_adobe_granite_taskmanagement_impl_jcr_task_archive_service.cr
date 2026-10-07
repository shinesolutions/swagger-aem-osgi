require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, archiving_enabled : Bool? = nil, scheduler_expression : String? = nil, archive_since_days_completed : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "archiving.enabled" => archiving_enabled, "scheduler.expression" => scheduler_expression, "archive.since.days.completed" => archive_since_days_completed },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
