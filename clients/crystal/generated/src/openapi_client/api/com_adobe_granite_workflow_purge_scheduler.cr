require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowPurgeScheduler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduledpurge_name : String? = nil, scheduledpurge_workflow_status : String? = nil, scheduledpurge_model_ids : Array(String)? = nil, scheduledpurge_daysold : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowPurgeSchedulerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowPurgeSchedulerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduledpurge.name" => scheduledpurge_name, "scheduledpurge.workflowStatus" => scheduledpurge_workflow_status, "scheduledpurge.modelIds" => scheduledpurge_model_ids, "scheduledpurge.daysold" => scheduledpurge_daysold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
