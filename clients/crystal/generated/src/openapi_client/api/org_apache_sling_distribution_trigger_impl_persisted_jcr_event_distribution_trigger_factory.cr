require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, path : String? = nil, service_name : String? = nil, nuggets_path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "path" => path, "serviceName" => service_name, "nuggetsPath" => nuggets_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
