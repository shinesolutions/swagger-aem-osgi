require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
