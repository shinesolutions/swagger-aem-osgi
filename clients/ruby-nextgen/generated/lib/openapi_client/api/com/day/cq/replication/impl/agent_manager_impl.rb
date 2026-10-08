# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplAgentManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, job_topics: nil, service_user_target: nil, agent_provider_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl',
          type: OpenapiClient::Models::ComDayCqReplicationImplAgentManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'job.topics' => job_topics, 'serviceUser.target' => service_user_target, 'agentProvider.target' => agent_provider_target }
        )
      end
    end
  end
end
