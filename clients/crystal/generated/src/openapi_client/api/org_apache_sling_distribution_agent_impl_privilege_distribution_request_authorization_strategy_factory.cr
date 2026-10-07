require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAuthorizationStrategyFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, jcr_privilege : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "jcrPrivilege" => jcr_privilege },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
