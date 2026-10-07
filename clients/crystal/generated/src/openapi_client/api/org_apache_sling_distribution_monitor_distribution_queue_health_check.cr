require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_name : String? = nil, hc_tags : Array(String)? = nil, hc_mbean_name : String? = nil, number_of_retries_allowed : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.name" => hc_name, "hc.tags" => hc_tags, "hc.mbean.name" => hc_mbean_name, "numberOfRetriesAllowed" => number_of_retries_allowed },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
