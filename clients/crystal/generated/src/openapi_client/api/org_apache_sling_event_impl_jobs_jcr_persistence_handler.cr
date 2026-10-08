require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEventImplJobsJcrPersistenceHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, job_consumermanager_disable_distribution : Bool? = nil, startup_delay : Int32? = nil, cleanup_period : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "job.consumermanager.disableDistribution" => job_consumermanager_disable_distribution, "startup.delay" => startup_delay, "cleanup.period" => cleanup_period },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
