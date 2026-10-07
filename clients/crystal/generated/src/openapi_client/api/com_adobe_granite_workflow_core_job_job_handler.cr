require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreJobJobHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, job_topics : Array(String)? = nil, allow_self_process_termination : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreJobJobHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreJobJobHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "job.topics" => job_topics, "allow.self.process.termination" => allow_self_process_termination },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
