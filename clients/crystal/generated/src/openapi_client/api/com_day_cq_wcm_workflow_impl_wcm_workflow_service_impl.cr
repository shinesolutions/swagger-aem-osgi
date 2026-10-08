require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, min_thread_pool_size : Int32? = nil, max_thread_pool_size : Int32? = nil, cq_wcm_workflow_terminate_on_activate : Bool? = nil, cq_wcm_worklfow_terminate_exclusion_list : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "minThreadPoolSize" => min_thread_pool_size, "maxThreadPoolSize" => max_thread_pool_size, "cq.wcm.workflow.terminate.on.activate" => cq_wcm_workflow_terminate_on_activate, "cq.wcm.worklfow.terminate.exclusion.list" => cq_wcm_worklfow_terminate_exclusion_list },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
