# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, priority_order: nil, reply_email_patterns: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClieH618257d5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'priorityOrder' => priority_order, 'replyEmailPatterns' => reply_email_patterns }
        )
      end
    end
  end
end
