# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensImplHandlerChannelsUpdateHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_pagesupdatehandler_imageresourcetypes: nil, cq_pagesupdatehandler_productresourcetypes: nil, cq_pagesupdatehandler_videoresourcetypes: nil, cq_pagesupdatehandler_dynamicsequenceresourcetypes: nil, cq_pagesupdatehandler_previewmodepaths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler',
          type: OpenapiClient::Models::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.pagesupdatehandler.imageresourcetypes' => cq_pagesupdatehandler_imageresourcetypes, 'cq.pagesupdatehandler.productresourcetypes' => cq_pagesupdatehandler_productresourcetypes, 'cq.pagesupdatehandler.videoresourcetypes' => cq_pagesupdatehandler_videoresourcetypes, 'cq.pagesupdatehandler.dynamicsequenceresourcetypes' => cq_pagesupdatehandler_dynamicsequenceresourcetypes, 'cq.pagesupdatehandler.previewmodepaths' => cq_pagesupdatehandler_previewmodepaths }
        )
      end
    end
  end
end
