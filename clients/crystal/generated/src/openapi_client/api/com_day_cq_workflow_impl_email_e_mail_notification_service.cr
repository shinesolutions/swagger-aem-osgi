require "json"

module OpenAPIClient
  module Api
  class ComDayCqWorkflowImplEmailEMailNotificationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, from_address : String? = nil, host_prefix : String? = nil, notify_onabort : Bool? = nil, notify_oncomplete : Bool? = nil, notify_oncontainercomplete : Bool? = nil, notify_useronly : Bool? = nil) : Response(OpenAPIClient::ComDayCqWorkflowImplEmailEMailNotificationServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqWorkflowImplEmailEMailNotificationServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "from.address" => from_address, "host.prefix" => host_prefix, "notify.onabort" => notify_onabort, "notify.oncomplete" => notify_oncomplete, "notify.oncontainercomplete" => notify_oncontainercomplete, "notify.useronly" => notify_useronly },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
