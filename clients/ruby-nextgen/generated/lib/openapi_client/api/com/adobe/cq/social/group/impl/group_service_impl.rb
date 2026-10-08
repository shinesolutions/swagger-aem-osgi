# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialGroupImplGroupServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_wait_time: nil, min_wait_between_retries: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialGroupImplGroupServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxWaitTime' => max_wait_time, 'minWaitBetweenRetries' => min_wait_between_retries }
        )
      end
    end
  end
end
