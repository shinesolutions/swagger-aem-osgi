# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachment
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, attachment_type_blacklist: nil, extension_order: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment',
          type: OpenapiClient::Models::ComAdobeCqSocialCalendarClientOperationextensionsEventAH330846b9,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'attachmentTypeBlacklist' => attachment_type_blacklist, 'extension.order' => extension_order }
        )
      end
    end
  end
end
