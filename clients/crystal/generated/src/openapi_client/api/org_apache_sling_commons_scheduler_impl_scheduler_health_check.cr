require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_quartz_job_duration_acceptable : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.quartzJob.duration.acceptable" => max_quartz_job_duration_acceptable },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
