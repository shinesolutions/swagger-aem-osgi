# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventActivitySuppressor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeHdc34664c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ranking' => ranking }
        )
      end
    end
  end
end
