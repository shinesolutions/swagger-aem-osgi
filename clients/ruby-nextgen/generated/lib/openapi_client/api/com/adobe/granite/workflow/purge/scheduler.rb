# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteWorkflowPurgeScheduler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduledpurge_name: nil, scheduledpurge_workflow_status: nil, scheduledpurge_model_ids: nil, scheduledpurge_daysold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler',
          type: OpenapiClient::Models::ComAdobeGraniteWorkflowPurgeSchedulerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduledpurge.name' => scheduledpurge_name, 'scheduledpurge.workflowStatus' => scheduledpurge_workflow_status, 'scheduledpurge.modelIds' => scheduledpurge_model_ids, 'scheduledpurge.daysold' => scheduledpurge_daysold }
        )
      end
    end
  end
end
