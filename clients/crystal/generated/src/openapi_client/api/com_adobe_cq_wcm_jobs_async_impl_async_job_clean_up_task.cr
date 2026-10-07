require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, job_purge_threshold : Int32? = nil, job_purge_max_jobs : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "job.purge.threshold" => job_purge_threshold, "job.purge.max.jobs" => job_purge_max_jobs },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
