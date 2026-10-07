# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob',
          type: OpenapiClient::Models::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression }
        )
      end
    end
  end
end
