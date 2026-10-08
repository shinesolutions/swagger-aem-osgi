require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, title : String? = nil, details : String? = nil, enabled : Bool? = nil, service_name : String? = nil, log_level : String? = nil, queue_processing_enabled : Bool? = nil, package_exporter_target : String? = nil, package_importer_target : String? = nil, request_authorization_strategy_target : String? = nil, triggers_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "title" => title, "details" => details, "enabled" => enabled, "serviceName" => service_name, "log.level" => log_level, "queue.processing.enabled" => queue_processing_enabled, "packageExporter.target" => package_exporter_target, "packageImporter.target" => package_importer_target, "requestAuthorizationStrategy.target" => request_authorization_strategy_target, "triggers.target" => triggers_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
