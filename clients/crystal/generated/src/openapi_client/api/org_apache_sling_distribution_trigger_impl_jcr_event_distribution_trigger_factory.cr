require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, path : String? = nil, ignored_paths_patterns : Array(String)? = nil, service_name : String? = nil, deep : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "path" => path, "ignoredPathsPatterns" => ignored_paths_patterns, "serviceName" => service_name, "deep" => deep },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
