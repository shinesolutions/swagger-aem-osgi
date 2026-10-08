# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, workflowpackageinfoprovider_filter: nil, workflowpackageinfoprovider_filter_rootpath: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider',
          type: OpenapiClient::Models::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'workflowpackageinfoprovider.filter' => workflowpackageinfoprovider_filter, 'workflowpackageinfoprovider.filter.rootpath' => workflowpackageinfoprovider_filter_rootpath }
        )
      end
    end
  end
end
