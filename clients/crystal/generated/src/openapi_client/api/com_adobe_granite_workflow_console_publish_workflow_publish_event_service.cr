require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, granite_workflow_workflow_publish_event_service_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "granite.workflow.WorkflowPublishEventService.enabled" => granite_workflow_workflow_publish_event_service_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
