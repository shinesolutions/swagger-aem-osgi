# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, replicate_comment_resource_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory',
          type: OpenapiClient::Models::ComAdobeGraniteCommentsInternalCommentReplicationContenH9c1eba28,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'replicate.comment.resourceTypes' => replicate_comment_resource_types }
        )
      end
    end
  end
end
