require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
