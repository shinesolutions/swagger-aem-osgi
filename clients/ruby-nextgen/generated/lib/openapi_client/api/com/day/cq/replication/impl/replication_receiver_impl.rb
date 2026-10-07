# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplReplicationReceiverImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, receiver_tmpfile_threshold: nil, receiver_packages_use_install: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl',
          type: OpenapiClient::Models::ComDayCqReplicationImplReplicationReceiverImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'receiver.tmpfile.threshold' => receiver_tmpfile_threshold, 'receiver.packages.use.install' => receiver_packages_use_install }
        )
      end
    end
  end
end
