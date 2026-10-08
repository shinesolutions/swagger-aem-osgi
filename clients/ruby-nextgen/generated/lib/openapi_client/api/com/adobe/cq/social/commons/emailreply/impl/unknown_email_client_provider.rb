# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, reply_email_patterns: nil, priority_order: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClieHb436862a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'replyEmailPatterns' => reply_email_patterns, 'priorityOrder' => priority_order }
        )
      end
    end
  end
end
