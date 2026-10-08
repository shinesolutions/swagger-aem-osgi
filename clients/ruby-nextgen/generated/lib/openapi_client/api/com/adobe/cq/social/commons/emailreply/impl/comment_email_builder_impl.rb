# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, context_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilHe61bb432,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'context.path' => context_path }
        )
      end
    end
  end
end
