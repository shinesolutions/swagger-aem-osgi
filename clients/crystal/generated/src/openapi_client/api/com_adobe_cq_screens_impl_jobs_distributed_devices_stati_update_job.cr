require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil) : Response(OpenAPIClient::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
