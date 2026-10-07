# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_filter: nil, min_thread_pool_size: nil, max_thread_pool_size: nil, cq_wcm_workflow_terminate_on_activate: nil, cq_wcm_worklfow_terminate_exclusion_list: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl',
          type: OpenapiClient::Models::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.filter' => event_filter, 'minThreadPoolSize' => min_thread_pool_size, 'maxThreadPoolSize' => max_thread_pool_size, 'cq.wcm.workflow.terminate.on.activate' => cq_wcm_workflow_terminate_on_activate, 'cq.wcm.worklfow.terminate.exclusion.list' => cq_wcm_worklfow_terminate_exclusion_list }
        )
      end
    end
  end
end
