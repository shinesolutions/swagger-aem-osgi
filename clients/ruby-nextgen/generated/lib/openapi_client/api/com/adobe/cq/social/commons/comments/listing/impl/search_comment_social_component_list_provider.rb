# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialComponentListProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, num_user_limit: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsCommentsListingImplSearchCommeHe36e06d7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'numUserLimit' => num_user_limit }
        )
      end
    end
  end
end
