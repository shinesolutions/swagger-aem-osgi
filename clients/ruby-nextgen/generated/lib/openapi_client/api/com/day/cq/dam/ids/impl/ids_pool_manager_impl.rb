# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamIdsImplIDSPoolManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_errors_to_blacklist: nil, retry_interval_to_whitelist: nil, connect_timeout: nil, socket_timeout: nil, process_label: nil, connection_use_max: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl',
          type: OpenapiClient::Models::ComDayCqDamIdsImplIDSPoolManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'max.errors.to.blacklist' => max_errors_to_blacklist, 'retry.interval.to.whitelist' => retry_interval_to_whitelist, 'connect.timeout' => connect_timeout, 'socket.timeout' => socket_timeout, 'process.label' => process_label, 'connection.use.max' => connection_use_max }
        )
      end
    end
  end
end
