require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteBundlesHcImplJobsHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, max_queued_jobs : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "max.queued.jobs" => max_queued_jobs },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
