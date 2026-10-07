# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixSystemreadySystemReadyMonitor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, poll_interval: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor',
          type: OpenapiClient::Models::OrgApacheFelixSystemreadySystemReadyMonitorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'poll.interval' => poll_interval }
        )
      end
    end
  end
end
