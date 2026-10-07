require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, title : String? = nil, details : String? = nil, enabled : Bool? = nil, service_name : String? = nil, log_level : String? = nil, queue_processing_enabled : Bool? = nil, passive_queues : Array(String)? = nil, package_exporter_endpoints : Array(String)? = nil, package_importer_endpoints : Array(String)? = nil, retry_strategy : String? = nil, retry_attempts : Int32? = nil, pull_items : Int32? = nil, http_conn_timeout : Int32? = nil, request_authorization_strategy_target : String? = nil, transport_secret_provider_target : String? = nil, package_builder_target : String? = nil, triggers_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "title" => title, "details" => details, "enabled" => enabled, "serviceName" => service_name, "log.level" => log_level, "queue.processing.enabled" => queue_processing_enabled, "passiveQueues" => passive_queues, "packageExporter.endpoints" => package_exporter_endpoints, "packageImporter.endpoints" => package_importer_endpoints, "retry.strategy" => retry_strategy, "retry.attempts" => retry_attempts, "pull.items" => pull_items, "http.conn.timeout" => http_conn_timeout, "requestAuthorizationStrategy.target" => request_authorization_strategy_target, "transportSecretProvider.target" => transport_secret_provider_target, "packageBuilder.target" => package_builder_target, "triggers.target" => triggers_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
