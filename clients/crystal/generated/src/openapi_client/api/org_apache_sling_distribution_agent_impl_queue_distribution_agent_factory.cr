require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, title : String? = nil, details : String? = nil, enabled : Bool? = nil, service_name : String? = nil, log_level : String? = nil, allowed_roots : Array(String)? = nil, request_authorization_strategy_target : String? = nil, queue_provider_factory_target : String? = nil, package_builder_target : String? = nil, triggers_target : String? = nil, priority_queues : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "title" => title, "details" => details, "enabled" => enabled, "serviceName" => service_name, "log.level" => log_level, "allowed.roots" => allowed_roots, "requestAuthorizationStrategy.target" => request_authorization_strategy_target, "queueProviderFactory.target" => queue_provider_factory_target, "packageBuilder.target" => package_builder_target, "triggers.target" => triggers_target, "priorityQueues" => priority_queues },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
