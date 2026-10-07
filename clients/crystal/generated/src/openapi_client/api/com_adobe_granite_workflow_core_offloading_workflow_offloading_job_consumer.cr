require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, job_topics : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "job.topics" => job_topics },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
