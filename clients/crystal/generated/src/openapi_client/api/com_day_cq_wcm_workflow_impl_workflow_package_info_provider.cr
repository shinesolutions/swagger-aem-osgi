require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, workflowpackageinfoprovider_filter : Array(String)? = nil, workflowpackageinfoprovider_filter_rootpath : String? = nil) : Response(OpenAPIClient::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "workflowpackageinfoprovider.filter" => workflowpackageinfoprovider_filter, "workflowpackageinfoprovider.filter.rootpath" => workflowpackageinfoprovider_filter_rootpath },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
