require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
