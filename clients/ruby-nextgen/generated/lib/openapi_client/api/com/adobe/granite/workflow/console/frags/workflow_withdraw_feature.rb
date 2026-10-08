# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature',
          type: OpenapiClient::Models::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled }
        )
      end
    end
  end
end
