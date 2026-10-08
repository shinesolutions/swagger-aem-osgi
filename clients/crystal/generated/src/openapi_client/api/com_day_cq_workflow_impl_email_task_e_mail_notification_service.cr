require "json"

module OpenAPIClient
  module Api
  class ComDayCqWorkflowImplEmailTaskEMailNotificationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, notify_onupdate : Bool? = nil, notify_oncomplete : Bool? = nil) : Response(OpenAPIClient::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "notify.onupdate" => notify_onupdate, "notify.oncomplete" => notify_oncomplete },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
