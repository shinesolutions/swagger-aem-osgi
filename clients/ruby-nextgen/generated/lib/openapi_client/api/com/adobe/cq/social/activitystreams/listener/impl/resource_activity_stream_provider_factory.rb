# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreamProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, stream_path: nil, stream_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialActivitystreamsListenerImplResourceActH7d6e48d5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'streamPath' => stream_path, 'streamName' => stream_name }
        )
      end
    end
  end
end
