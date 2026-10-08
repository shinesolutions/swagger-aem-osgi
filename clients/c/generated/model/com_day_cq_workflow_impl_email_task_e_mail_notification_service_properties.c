#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties.h"



static com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_create_internal(
    config_node_property_boolean_t *notify_onupdate,
    config_node_property_boolean_t *notify_oncomplete
    ) {
    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var = malloc(sizeof(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t));
    if (!com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var, 0, sizeof(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t));
    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var->_library_owned = 1;
    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var->notify_onupdate = notify_onupdate;
    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var->notify_oncomplete = notify_oncomplete;
    return com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_create(
    config_node_property_boolean_t *notify_onupdate,
    config_node_property_boolean_t *notify_oncomplete
    ) {
    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *result = com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_create_internal (
        notify_onupdate,
        notify_oncomplete
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_free(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties) {
    if(NULL == com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties){
        return ;
    }
    if(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate);
        com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate = NULL;
    }
    if (com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete);
        com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete = NULL;
    }
    free(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties);
}

cJSON *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_convertToJSON(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate
    if(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate) {
    cJSON *notify_onupdate_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate);
    if(notify_onupdate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.onupdate", notify_onupdate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete
    if(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete) {
    cJSON *notify_oncomplete_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete);
    if(notify_oncomplete_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.oncomplete", notify_oncomplete_local_JSON);
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

com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_parseFromJSON(cJSON *com_day_cq_workflow_impl_email_task_e_mail_notification_service_propertiesJSON){

    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate
    config_node_property_boolean_t *notify_onupdate_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete
    config_node_property_boolean_t *notify_oncomplete_local_nonprim = NULL;

    // com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_onupdate
    cJSON *notify_onupdate = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_task_e_mail_notification_service_propertiesJSON, "notify.onupdate");
    if (cJSON_IsNull(notify_onupdate)) {
        notify_onupdate = NULL;
    }
    if (notify_onupdate) { 
    notify_onupdate_local_nonprim = config_node_property_boolean_parseFromJSON(notify_onupdate); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties->notify_oncomplete
    cJSON *notify_oncomplete = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_task_e_mail_notification_service_propertiesJSON, "notify.oncomplete");
    if (cJSON_IsNull(notify_oncomplete)) {
        notify_oncomplete = NULL;
    }
    if (notify_oncomplete) { 
    notify_oncomplete_local_nonprim = config_node_property_boolean_parseFromJSON(notify_oncomplete); //nonprimitive
    }



    com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var = com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_create_internal (
        notify_onupdate ? notify_onupdate_local_nonprim : NULL,
        notify_oncomplete ? notify_oncomplete_local_nonprim : NULL
        );

    if (!com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties_local_var;
end:
    if (notify_onupdate_local_nonprim) {
        config_node_property_boolean_free(notify_onupdate_local_nonprim);
        notify_onupdate_local_nonprim = NULL;
    }
    if (notify_oncomplete_local_nonprim) {
        config_node_property_boolean_free(notify_oncomplete_local_nonprim);
        notify_oncomplete_local_nonprim = NULL;
    }
    return NULL;

}
