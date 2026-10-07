# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqPollingImporterImplManagedPollingImporterImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, importer_user: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl',
          type: OpenapiClient::Models::ComDayCqPollingImporterImplManagedPollingImporterImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'importer.user' => importer_user }
        )
      end
    end
  end
end
