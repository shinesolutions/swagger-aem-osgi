# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplTransportBinaryLessTransportHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, disabled_cipher_suites: nil, enabled_cipher_suites: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler',
          type: OpenapiClient::Models::ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'disabled.cipher.suites' => disabled_cipher_suites, 'enabled.cipher.suites' => enabled_cipher_suites }
        )
      end
    end
  end
end
