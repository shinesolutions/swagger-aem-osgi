require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTriggerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, endpoint : String? = nil, transport_secret_provider_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "endpoint" => endpoint, "transportSecretProvider.target" => transport_secret_provider_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
