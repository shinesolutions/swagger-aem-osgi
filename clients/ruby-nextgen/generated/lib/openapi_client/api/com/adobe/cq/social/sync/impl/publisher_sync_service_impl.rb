# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSyncImplPublisherSyncServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, active_run_modes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'activeRunModes' => active_run_modes }
        )
      end
    end
  end
end
