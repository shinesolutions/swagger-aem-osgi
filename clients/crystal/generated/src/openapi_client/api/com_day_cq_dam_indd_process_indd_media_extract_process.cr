require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamInddProcessINDDMediaExtractProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil, cq_dam_indd_pages_regex : String? = nil, ids_job_decoupled : Bool? = nil, ids_job_workflow_model : String? = nil) : Response(OpenAPIClient::ComDayCqDamInddProcessINDDMediaExtractProcessInfo)
      @conn.request(OpenAPIClient::ComDayCqDamInddProcessINDDMediaExtractProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label, "cq.dam.indd.pages.regex" => cq_dam_indd_pages_regex, "ids.job.decoupled" => ids_job_decoupled, "ids.job.workflow.model" => ids_job_workflow_model },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
