# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, batch_commit_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl',
          type: OpenapiClient::Models::ComDayCqDamPerformanceInternalAssetPerformanceDataHanH14b0a6cf,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'batch.commit.size' => batch_commit_size }
        )
      end
    end
  end
end
