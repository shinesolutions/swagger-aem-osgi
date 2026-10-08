require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreWorkflowConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_workflow_config_workflow_packages_root_path : Array(String)? = nil, cq_workflow_config_workflow_process_legacy_mode : Bool? = nil, cq_workflow_config_allow_locking : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreWorkflowConfigInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreWorkflowConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.workflow.config.workflow.packages.root.path" => cq_workflow_config_workflow_packages_root_path, "cq.workflow.config.workflow.process.legacy.mode" => cq_workflow_config_workflow_process_legacy_mode, "cq.workflow.config.allow.locking" => cq_workflow_config_allow_locking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
