# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, is_primary_publisher: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'isPrimaryPublisher' => is_primary_publisher }
        )
      end
    end
  end
end
