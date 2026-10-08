require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, path : String? = nil, seconds : String? = nil, service_name : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "path" => path, "seconds" => seconds, "serviceName" => service_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
