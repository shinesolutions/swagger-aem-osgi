# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationImplPageImpressionsTracker
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_auth_requirements: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker',
          type: OpenapiClient::Models::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.auth.requirements' => sling_auth_requirements }
        )
      end
    end
  end
end
