-module(openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties/0]).

-type openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties() ::
    #{ 'granite_workflowinbox_sort_propertyName' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'granite_workflowinbox_sort_order' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_workflow_job_retry' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_workflow_superuser' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'granite_workflow_inboxQuerySize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'granite_workflow_adminUserGroupFilter' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_workflow_enforceWorkitemAssigneePermissions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_workflow_enforceWorkflowInitiatorPermissions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_workflow_injectTenantIdInJobTopics' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_workflow_maxPurgeSaveThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'granite_workflow_maxPurgeQueryCount' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'granite_workflowinbox_sort_propertyName' := GraniteWorkflowinboxSortPropertyName,
          'granite_workflowinbox_sort_order' := GraniteWorkflowinboxSortOrder,
          'cq_workflow_job_retry' := CqWorkflowJobRetry,
          'cq_workflow_superuser' := CqWorkflowSuperuser,
          'granite_workflow_inboxQuerySize' := GraniteWorkflowInboxQuerySize,
          'granite_workflow_adminUserGroupFilter' := GraniteWorkflowAdminUserGroupFilter,
          'granite_workflow_enforceWorkitemAssigneePermissions' := GraniteWorkflowEnforceWorkitemAssigneePermissions,
          'granite_workflow_enforceWorkflowInitiatorPermissions' := GraniteWorkflowEnforceWorkflowInitiatorPermissions,
          'granite_workflow_injectTenantIdInJobTopics' := GraniteWorkflowInjectTenantIdInJobTopics,
          'granite_workflow_maxPurgeSaveThreshold' := GraniteWorkflowMaxPurgeSaveThreshold,
          'granite_workflow_maxPurgeQueryCount' := GraniteWorkflowMaxPurgeQueryCount
        }) ->
    #{ 'granite.workflowinbox.sort.propertyName' => GraniteWorkflowinboxSortPropertyName,
       'granite.workflowinbox.sort.order' => GraniteWorkflowinboxSortOrder,
       'cq.workflow.job.retry' => CqWorkflowJobRetry,
       'cq.workflow.superuser' => CqWorkflowSuperuser,
       'granite.workflow.inboxQuerySize' => GraniteWorkflowInboxQuerySize,
       'granite.workflow.adminUserGroupFilter' => GraniteWorkflowAdminUserGroupFilter,
       'granite.workflow.enforceWorkitemAssigneePermissions' => GraniteWorkflowEnforceWorkitemAssigneePermissions,
       'granite.workflow.enforceWorkflowInitiatorPermissions' => GraniteWorkflowEnforceWorkflowInitiatorPermissions,
       'granite.workflow.injectTenantIdInJobTopics' => GraniteWorkflowInjectTenantIdInJobTopics,
       'granite.workflow.maxPurgeSaveThreshold' => GraniteWorkflowMaxPurgeSaveThreshold,
       'granite.workflow.maxPurgeQueryCount' => GraniteWorkflowMaxPurgeQueryCount
     }.
