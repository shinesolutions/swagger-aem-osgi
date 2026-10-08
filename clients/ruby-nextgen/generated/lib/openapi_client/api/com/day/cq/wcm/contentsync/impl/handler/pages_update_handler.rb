# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_pagesupdatehandler_imageresourcetypes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler',
          type: OpenapiClient::Models::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.pagesupdatehandler.imageresourcetypes' => cq_pagesupdatehandler_imageresourcetypes }
        )
      end
    end
  end
end
