# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqPollingImporterImplPollingImporterImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, importer_min_interval: nil, importer_user: nil, exclude_paths: nil, include_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl',
          type: OpenapiClient::Models::ComDayCqPollingImporterImplPollingImporterImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'importer.min.interval' => importer_min_interval, 'importer.user' => importer_user, 'exclude.paths' => exclude_paths, 'include.paths' => include_paths }
        )
      end
    end
  end
end
