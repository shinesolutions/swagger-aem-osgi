require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil, notify_on_complete : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label, "Notify on Complete" => notify_on_complete },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
