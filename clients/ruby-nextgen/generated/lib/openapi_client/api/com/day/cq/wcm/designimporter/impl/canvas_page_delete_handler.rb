# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, min_thread_pool_size: nil, max_thread_pool_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'minThreadPoolSize' => min_thread_pool_size, 'maxThreadPoolSize' => max_thread_pool_size }
        )
      end
    end
  end
end
