# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialForumDispatcherImplFlushOperations
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, extension_order: nil, flush_forumontopic: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations',
          type: OpenapiClient::Models::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'extension.order' => extension_order, 'flush.forumontopic' => flush_forumontopic }
        )
      end
    end
  end
end
