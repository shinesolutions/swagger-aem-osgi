require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, queue : String? = nil, drop_invalid_items : Bool? = nil, agent_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "queue" => queue, "drop.invalid.items" => drop_invalid_items, "agent.target" => agent_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
