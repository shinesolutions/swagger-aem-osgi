# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplReplicationContentFactoryProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, replication_content_use_file_storage: nil, replication_content_max_commit_attempts: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl',
          type: OpenapiClient::Models::ComDayCqReplicationImplReplicationContentFactoryProvidHf994ace4,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'replication.content.useFileStorage' => replication_content_use_file_storage, 'replication.content.maxCommitAttempts' => replication_content_max_commit_attempts }
        )
      end
    end
  end
end
