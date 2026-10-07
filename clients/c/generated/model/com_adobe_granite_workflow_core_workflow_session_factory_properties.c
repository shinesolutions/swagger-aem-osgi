#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_workflow_session_factory_properties.h"



static com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_create_internal(
    config_node_property_drop_down_t *granite_workflowinbox_sort_property_name,
    config_node_property_string_t *granite_workflowinbox_sort_order,
    config_node_property_integer_t *cq_workflow_job_retry,
    config_node_property_array_t *cq_workflow_superuser,
    config_node_property_integer_t *granite_workflow_inbox_query_size,
    config_node_property_boolean_t *granite_workflow_admin_user_group_filter,
    config_node_property_boolean_t *granite_workflow_enforce_workitem_assignee_permissions,
    config_node_property_boolean_t *granite_workflow_enforce_workflow_initiator_permissions,
    config_node_property_boolean_t *granite_workflow_inject_tenant_id_in_job_topics,
    config_node_property_integer_t *granite_workflow_max_purge_save_threshold,
    config_node_property_integer_t *granite_workflow_max_purge_query_count
    ) {
    com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_workflow_session_factory_properties_t));
    if (!com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_workflow_session_factory_properties_t));
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflowinbox_sort_property_name = granite_workflowinbox_sort_property_name;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflowinbox_sort_order = granite_workflowinbox_sort_order;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->cq_workflow_job_retry = cq_workflow_job_retry;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->cq_workflow_superuser = cq_workflow_superuser;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_inbox_query_size = granite_workflow_inbox_query_size;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_admin_user_group_filter = granite_workflow_admin_user_group_filter;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_enforce_workitem_assignee_permissions = granite_workflow_enforce_workitem_assignee_permissions;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_enforce_workflow_initiator_permissions = granite_workflow_enforce_workflow_initiator_permissions;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_inject_tenant_id_in_job_topics = granite_workflow_inject_tenant_id_in_job_topics;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_max_purge_save_threshold = granite_workflow_max_purge_save_threshold;
    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var->granite_workflow_max_purge_query_count = granite_workflow_max_purge_query_count;
    return com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_create(
    config_node_property_drop_down_t *granite_workflowinbox_sort_property_name,
    config_node_property_string_t *granite_workflowinbox_sort_order,
    config_node_property_integer_t *cq_workflow_job_retry,
    config_node_property_array_t *cq_workflow_superuser,
    config_node_property_integer_t *granite_workflow_inbox_query_size,
    config_node_property_boolean_t *granite_workflow_admin_user_group_filter,
    config_node_property_boolean_t *granite_workflow_enforce_workitem_assignee_permissions,
    config_node_property_boolean_t *granite_workflow_enforce_workflow_initiator_permissions,
    config_node_property_boolean_t *granite_workflow_inject_tenant_id_in_job_topics,
    config_node_property_integer_t *granite_workflow_max_purge_save_threshold,
    config_node_property_integer_t *granite_workflow_max_purge_query_count
    ) {
    com_adobe_granite_workflow_core_workflow_session_factory_properties_t *result = com_adobe_granite_workflow_core_workflow_session_factory_properties_create_internal (
        granite_workflowinbox_sort_property_name,
        granite_workflowinbox_sort_order,
        cq_workflow_job_retry,
        cq_workflow_superuser,
        granite_workflow_inbox_query_size,
        granite_workflow_admin_user_group_filter,
        granite_workflow_enforce_workitem_assignee_permissions,
        granite_workflow_enforce_workflow_initiator_permissions,
        granite_workflow_inject_tenant_id_in_job_topics,
        granite_workflow_max_purge_save_threshold,
        granite_workflow_max_purge_query_count
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_workflow_session_factory_properties_free(com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties) {
    if(NULL == com_adobe_granite_workflow_core_workflow_session_factory_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_workflow_session_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name) {
        config_node_property_drop_down_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order) {
        config_node_property_string_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser) {
        config_node_property_array_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count);
        com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count = NULL;
    }
    free(com_adobe_granite_workflow_core_workflow_session_factory_properties);
}

cJSON *com_adobe_granite_workflow_core_workflow_session_factory_properties_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name) {
    cJSON *granite_workflowinbox_sort_property_name_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name);
    if(granite_workflowinbox_sort_property_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflowinbox.sort.propertyName", granite_workflowinbox_sort_property_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order) {
    cJSON *granite_workflowinbox_sort_order_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order);
    if(granite_workflowinbox_sort_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflowinbox.sort.order", granite_workflowinbox_sort_order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry) {
    cJSON *cq_workflow_job_retry_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry);
    if(cq_workflow_job_retry_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.workflow.job.retry", cq_workflow_job_retry_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser) {
    cJSON *cq_workflow_superuser_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser);
    if(cq_workflow_superuser_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.workflow.superuser", cq_workflow_superuser_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size) {
    cJSON *granite_workflow_inbox_query_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size);
    if(granite_workflow_inbox_query_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.inboxQuerySize", granite_workflow_inbox_query_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter) {
    cJSON *granite_workflow_admin_user_group_filter_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter);
    if(granite_workflow_admin_user_group_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.adminUserGroupFilter", granite_workflow_admin_user_group_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions) {
    cJSON *granite_workflow_enforce_workitem_assignee_permissions_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions);
    if(granite_workflow_enforce_workitem_assignee_permissions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.enforceWorkitemAssigneePermissions", granite_workflow_enforce_workitem_assignee_permissions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions) {
    cJSON *granite_workflow_enforce_workflow_initiator_permissions_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions);
    if(granite_workflow_enforce_workflow_initiator_permissions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.enforceWorkflowInitiatorPermissions", granite_workflow_enforce_workflow_initiator_permissions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics) {
    cJSON *granite_workflow_inject_tenant_id_in_job_topics_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics);
    if(granite_workflow_inject_tenant_id_in_job_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.injectTenantIdInJobTopics", granite_workflow_inject_tenant_id_in_job_topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold) {
    cJSON *granite_workflow_max_purge_save_threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold);
    if(granite_workflow_max_purge_save_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.maxPurgeSaveThreshold", granite_workflow_max_purge_save_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count
    if(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count) {
    cJSON *granite_workflow_max_purge_query_count_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count);
    if(granite_workflow_max_purge_query_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.workflow.maxPurgeQueryCount", granite_workflow_max_purge_query_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON){

    com_adobe_granite_workflow_core_workflow_session_factory_properties_t *com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name
    config_node_property_drop_down_t *granite_workflowinbox_sort_property_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order
    config_node_property_string_t *granite_workflowinbox_sort_order_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry
    config_node_property_integer_t *cq_workflow_job_retry_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser
    config_node_property_array_t *cq_workflow_superuser_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size
    config_node_property_integer_t *granite_workflow_inbox_query_size_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter
    config_node_property_boolean_t *granite_workflow_admin_user_group_filter_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions
    config_node_property_boolean_t *granite_workflow_enforce_workitem_assignee_permissions_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions
    config_node_property_boolean_t *granite_workflow_enforce_workflow_initiator_permissions_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics
    config_node_property_boolean_t *granite_workflow_inject_tenant_id_in_job_topics_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold
    config_node_property_integer_t *granite_workflow_max_purge_save_threshold_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count
    config_node_property_integer_t *granite_workflow_max_purge_query_count_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_property_name
    cJSON *granite_workflowinbox_sort_property_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflowinbox.sort.propertyName");
    if (cJSON_IsNull(granite_workflowinbox_sort_property_name)) {
        granite_workflowinbox_sort_property_name = NULL;
    }
    if (granite_workflowinbox_sort_property_name) { 
    granite_workflowinbox_sort_property_name_local_nonprim = config_node_property_drop_down_parseFromJSON(granite_workflowinbox_sort_property_name); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflowinbox_sort_order
    cJSON *granite_workflowinbox_sort_order = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflowinbox.sort.order");
    if (cJSON_IsNull(granite_workflowinbox_sort_order)) {
        granite_workflowinbox_sort_order = NULL;
    }
    if (granite_workflowinbox_sort_order) { 
    granite_workflowinbox_sort_order_local_nonprim = config_node_property_string_parseFromJSON(granite_workflowinbox_sort_order); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_job_retry
    cJSON *cq_workflow_job_retry = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "cq.workflow.job.retry");
    if (cJSON_IsNull(cq_workflow_job_retry)) {
        cq_workflow_job_retry = NULL;
    }
    if (cq_workflow_job_retry) { 
    cq_workflow_job_retry_local_nonprim = config_node_property_integer_parseFromJSON(cq_workflow_job_retry); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->cq_workflow_superuser
    cJSON *cq_workflow_superuser = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "cq.workflow.superuser");
    if (cJSON_IsNull(cq_workflow_superuser)) {
        cq_workflow_superuser = NULL;
    }
    if (cq_workflow_superuser) { 
    cq_workflow_superuser_local_nonprim = config_node_property_array_parseFromJSON(cq_workflow_superuser); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inbox_query_size
    cJSON *granite_workflow_inbox_query_size = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.inboxQuerySize");
    if (cJSON_IsNull(granite_workflow_inbox_query_size)) {
        granite_workflow_inbox_query_size = NULL;
    }
    if (granite_workflow_inbox_query_size) { 
    granite_workflow_inbox_query_size_local_nonprim = config_node_property_integer_parseFromJSON(granite_workflow_inbox_query_size); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_admin_user_group_filter
    cJSON *granite_workflow_admin_user_group_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.adminUserGroupFilter");
    if (cJSON_IsNull(granite_workflow_admin_user_group_filter)) {
        granite_workflow_admin_user_group_filter = NULL;
    }
    if (granite_workflow_admin_user_group_filter) { 
    granite_workflow_admin_user_group_filter_local_nonprim = config_node_property_boolean_parseFromJSON(granite_workflow_admin_user_group_filter); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workitem_assignee_permissions
    cJSON *granite_workflow_enforce_workitem_assignee_permissions = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.enforceWorkitemAssigneePermissions");
    if (cJSON_IsNull(granite_workflow_enforce_workitem_assignee_permissions)) {
        granite_workflow_enforce_workitem_assignee_permissions = NULL;
    }
    if (granite_workflow_enforce_workitem_assignee_permissions) { 
    granite_workflow_enforce_workitem_assignee_permissions_local_nonprim = config_node_property_boolean_parseFromJSON(granite_workflow_enforce_workitem_assignee_permissions); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_enforce_workflow_initiator_permissions
    cJSON *granite_workflow_enforce_workflow_initiator_permissions = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.enforceWorkflowInitiatorPermissions");
    if (cJSON_IsNull(granite_workflow_enforce_workflow_initiator_permissions)) {
        granite_workflow_enforce_workflow_initiator_permissions = NULL;
    }
    if (granite_workflow_enforce_workflow_initiator_permissions) { 
    granite_workflow_enforce_workflow_initiator_permissions_local_nonprim = config_node_property_boolean_parseFromJSON(granite_workflow_enforce_workflow_initiator_permissions); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_inject_tenant_id_in_job_topics
    cJSON *granite_workflow_inject_tenant_id_in_job_topics = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.injectTenantIdInJobTopics");
    if (cJSON_IsNull(granite_workflow_inject_tenant_id_in_job_topics)) {
        granite_workflow_inject_tenant_id_in_job_topics = NULL;
    }
    if (granite_workflow_inject_tenant_id_in_job_topics) { 
    granite_workflow_inject_tenant_id_in_job_topics_local_nonprim = config_node_property_boolean_parseFromJSON(granite_workflow_inject_tenant_id_in_job_topics); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_save_threshold
    cJSON *granite_workflow_max_purge_save_threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.maxPurgeSaveThreshold");
    if (cJSON_IsNull(granite_workflow_max_purge_save_threshold)) {
        granite_workflow_max_purge_save_threshold = NULL;
    }
    if (granite_workflow_max_purge_save_threshold) { 
    granite_workflow_max_purge_save_threshold_local_nonprim = config_node_property_integer_parseFromJSON(granite_workflow_max_purge_save_threshold); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_session_factory_properties->granite_workflow_max_purge_query_count
    cJSON *granite_workflow_max_purge_query_count = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_session_factory_propertiesJSON, "granite.workflow.maxPurgeQueryCount");
    if (cJSON_IsNull(granite_workflow_max_purge_query_count)) {
        granite_workflow_max_purge_query_count = NULL;
    }
    if (granite_workflow_max_purge_query_count) { 
    granite_workflow_max_purge_query_count_local_nonprim = config_node_property_integer_parseFromJSON(granite_workflow_max_purge_query_count); //nonprimitive
    }



    com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var = com_adobe_granite_workflow_core_workflow_session_factory_properties_create_internal (
        granite_workflowinbox_sort_property_name ? granite_workflowinbox_sort_property_name_local_nonprim : NULL,
        granite_workflowinbox_sort_order ? granite_workflowinbox_sort_order_local_nonprim : NULL,
        cq_workflow_job_retry ? cq_workflow_job_retry_local_nonprim : NULL,
        cq_workflow_superuser ? cq_workflow_superuser_local_nonprim : NULL,
        granite_workflow_inbox_query_size ? granite_workflow_inbox_query_size_local_nonprim : NULL,
        granite_workflow_admin_user_group_filter ? granite_workflow_admin_user_group_filter_local_nonprim : NULL,
        granite_workflow_enforce_workitem_assignee_permissions ? granite_workflow_enforce_workitem_assignee_permissions_local_nonprim : NULL,
        granite_workflow_enforce_workflow_initiator_permissions ? granite_workflow_enforce_workflow_initiator_permissions_local_nonprim : NULL,
        granite_workflow_inject_tenant_id_in_job_topics ? granite_workflow_inject_tenant_id_in_job_topics_local_nonprim : NULL,
        granite_workflow_max_purge_save_threshold ? granite_workflow_max_purge_save_threshold_local_nonprim : NULL,
        granite_workflow_max_purge_query_count ? granite_workflow_max_purge_query_count_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_workflow_session_factory_properties_local_var;
end:
    if (granite_workflowinbox_sort_property_name_local_nonprim) {
        config_node_property_drop_down_free(granite_workflowinbox_sort_property_name_local_nonprim);
        granite_workflowinbox_sort_property_name_local_nonprim = NULL;
    }
    if (granite_workflowinbox_sort_order_local_nonprim) {
        config_node_property_string_free(granite_workflowinbox_sort_order_local_nonprim);
        granite_workflowinbox_sort_order_local_nonprim = NULL;
    }
    if (cq_workflow_job_retry_local_nonprim) {
        config_node_property_integer_free(cq_workflow_job_retry_local_nonprim);
        cq_workflow_job_retry_local_nonprim = NULL;
    }
    if (cq_workflow_superuser_local_nonprim) {
        config_node_property_array_free(cq_workflow_superuser_local_nonprim);
        cq_workflow_superuser_local_nonprim = NULL;
    }
    if (granite_workflow_inbox_query_size_local_nonprim) {
        config_node_property_integer_free(granite_workflow_inbox_query_size_local_nonprim);
        granite_workflow_inbox_query_size_local_nonprim = NULL;
    }
    if (granite_workflow_admin_user_group_filter_local_nonprim) {
        config_node_property_boolean_free(granite_workflow_admin_user_group_filter_local_nonprim);
        granite_workflow_admin_user_group_filter_local_nonprim = NULL;
    }
    if (granite_workflow_enforce_workitem_assignee_permissions_local_nonprim) {
        config_node_property_boolean_free(granite_workflow_enforce_workitem_assignee_permissions_local_nonprim);
        granite_workflow_enforce_workitem_assignee_permissions_local_nonprim = NULL;
    }
    if (granite_workflow_enforce_workflow_initiator_permissions_local_nonprim) {
        config_node_property_boolean_free(granite_workflow_enforce_workflow_initiator_permissions_local_nonprim);
        granite_workflow_enforce_workflow_initiator_permissions_local_nonprim = NULL;
    }
    if (granite_workflow_inject_tenant_id_in_job_topics_local_nonprim) {
        config_node_property_boolean_free(granite_workflow_inject_tenant_id_in_job_topics_local_nonprim);
        granite_workflow_inject_tenant_id_in_job_topics_local_nonprim = NULL;
    }
    if (granite_workflow_max_purge_save_threshold_local_nonprim) {
        config_node_property_integer_free(granite_workflow_max_purge_save_threshold_local_nonprim);
        granite_workflow_max_purge_save_threshold_local_nonprim = NULL;
    }
    if (granite_workflow_max_purge_query_count_local_nonprim) {
        config_node_property_integer_free(granite_workflow_max_purge_query_count_local_nonprim);
        granite_workflow_max_purge_query_count_local_nonprim = NULL;
    }
    return NULL;

}
