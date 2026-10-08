# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySuppressor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ranking: nil, enable: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor',
          type: OpenapiClient::Models::ComAdobeCqSocialActivitystreamsListenerImplRatingEventH5bbd6fa5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ranking' => ranking, 'enable' => enable }
        )
      end
    end
  end
end
