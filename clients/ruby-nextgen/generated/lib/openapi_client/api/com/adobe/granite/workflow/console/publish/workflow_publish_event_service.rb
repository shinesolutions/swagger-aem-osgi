# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, granite_workflow_workflow_publish_event_service_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService',
          type: OpenapiClient::Models::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEvH69756edf,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'granite.workflow.WorkflowPublishEventService.enabled' => granite_workflow_workflow_publish_event_service_enabled }
        )
      end
    end
  end
end
