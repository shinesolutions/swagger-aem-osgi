require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEventImplJobsDefaultJobManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, queue_priority : String? = nil, queue_retries : Int32? = nil, queue_retrydelay : Int32? = nil, queue_maxparallel : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingEventImplJobsDefaultJobManagerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEventImplJobsDefaultJobManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "queue.priority" => queue_priority, "queue.retries" => queue_retries, "queue.retrydelay" => queue_retrydelay, "queue.maxparallel" => queue_maxparallel },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
