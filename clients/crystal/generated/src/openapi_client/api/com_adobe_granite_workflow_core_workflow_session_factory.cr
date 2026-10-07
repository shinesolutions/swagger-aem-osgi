require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreWorkflowSessionFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, granite_workflowinbox_sort_property_name : String? = nil, granite_workflowinbox_sort_order : String? = nil, cq_workflow_job_retry : Int32? = nil, cq_workflow_superuser : Array(String)? = nil, granite_workflow_inbox_query_size : Int32? = nil, granite_workflow_admin_user_group_filter : Bool? = nil, granite_workflow_enforce_workitem_assignee_permissions : Bool? = nil, granite_workflow_enforce_workflow_initiator_permissions : Bool? = nil, granite_workflow_inject_tenant_id_in_job_topics : Bool? = nil, granite_workflow_max_purge_save_threshold : Int32? = nil, granite_workflow_max_purge_query_count : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "granite.workflowinbox.sort.propertyName" => granite_workflowinbox_sort_property_name, "granite.workflowinbox.sort.order" => granite_workflowinbox_sort_order, "cq.workflow.job.retry" => cq_workflow_job_retry, "cq.workflow.superuser" => cq_workflow_superuser, "granite.workflow.inboxQuerySize" => granite_workflow_inbox_query_size, "granite.workflow.adminUserGroupFilter" => granite_workflow_admin_user_group_filter, "granite.workflow.enforceWorkitemAssigneePermissions" => granite_workflow_enforce_workitem_assignee_permissions, "granite.workflow.enforceWorkflowInitiatorPermissions" => granite_workflow_enforce_workflow_initiator_permissions, "granite.workflow.injectTenantIdInJobTopics" => granite_workflow_inject_tenant_id_in_job_topics, "granite.workflow.maxPurgeSaveThreshold" => granite_workflow_max_purge_save_threshold, "granite.workflow.maxPurgeQueryCount" => granite_workflow_max_purge_query_count },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
