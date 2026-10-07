require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEventJobsQueueConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, queue_name : String? = nil, queue_topics : Array(String)? = nil, queue_type : String? = nil, queue_priority : String? = nil, queue_retries : Int32? = nil, queue_retrydelay : Int32? = nil, queue_maxparallel : Float64? = nil, queue_keep_jobs : Bool? = nil, queue_prefer_run_on_creation_instance : Bool? = nil, queue_thread_pool_size : Int32? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingEventJobsQueueConfigurationInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEventJobsQueueConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "queue.name" => queue_name, "queue.topics" => queue_topics, "queue.type" => queue_type, "queue.priority" => queue_priority, "queue.retries" => queue_retries, "queue.retrydelay" => queue_retrydelay, "queue.maxparallel" => queue_maxparallel, "queue.keepJobs" => queue_keep_jobs, "queue.preferRunOnCreationInstance" => queue_prefer_run_on_creation_instance, "queue.threadPoolSize" => queue_thread_pool_size, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
