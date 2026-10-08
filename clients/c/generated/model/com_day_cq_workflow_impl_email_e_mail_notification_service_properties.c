#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_workflow_impl_email_e_mail_notification_service_properties.h"



static com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_create_internal(
    config_node_property_string_t *from_address,
    config_node_property_string_t *host_prefix,
    config_node_property_boolean_t *notify_onabort,
    config_node_property_boolean_t *notify_oncomplete,
    config_node_property_boolean_t *notify_oncontainercomplete,
    config_node_property_boolean_t *notify_useronly
    ) {
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var = malloc(sizeof(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t));
    if (!com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var, 0, sizeof(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t));
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->_library_owned = 1;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->from_address = from_address;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->host_prefix = host_prefix;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->notify_onabort = notify_onabort;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->notify_oncomplete = notify_oncomplete;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->notify_oncontainercomplete = notify_oncontainercomplete;
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var->notify_useronly = notify_useronly;
    return com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_create(
    config_node_property_string_t *from_address,
    config_node_property_string_t *host_prefix,
    config_node_property_boolean_t *notify_onabort,
    config_node_property_boolean_t *notify_oncomplete,
    config_node_property_boolean_t *notify_oncontainercomplete,
    config_node_property_boolean_t *notify_useronly
    ) {
    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *result = com_day_cq_workflow_impl_email_e_mail_notification_service_properties_create_internal (
        from_address,
        host_prefix,
        notify_onabort,
        notify_oncomplete,
        notify_oncontainercomplete,
        notify_useronly
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_workflow_impl_email_e_mail_notification_service_properties_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties) {
    if(NULL == com_day_cq_workflow_impl_email_e_mail_notification_service_properties){
        return ;
    }
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_workflow_impl_email_e_mail_notification_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address) {
        config_node_property_string_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address = NULL;
    }
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix) {
        config_node_property_string_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix = NULL;
    }
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort = NULL;
    }
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete = NULL;
    }
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete = NULL;
    }
    if (com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly) {
        config_node_property_boolean_free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly);
        com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly = NULL;
    }
    free(com_day_cq_workflow_impl_email_e_mail_notification_service_properties);
}

cJSON *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address) {
    cJSON *from_address_local_JSON = config_node_property_string_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address);
    if(from_address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "from.address", from_address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix) {
    cJSON *host_prefix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix);
    if(host_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.prefix", host_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort) {
    cJSON *notify_onabort_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort);
    if(notify_onabort_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.onabort", notify_onabort_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete) {
    cJSON *notify_oncomplete_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete);
    if(notify_oncomplete_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.oncomplete", notify_oncomplete_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete) {
    cJSON *notify_oncontainercomplete_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete);
    if(notify_oncontainercomplete_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.oncontainercomplete", notify_oncontainercomplete_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly
    if(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly) {
    cJSON *notify_useronly_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly);
    if(notify_useronly_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notify.useronly", notify_useronly_local_JSON);
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

com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_parseFromJSON(cJSON *com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON){

    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_t *com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address
    config_node_property_string_t *from_address_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix
    config_node_property_string_t *host_prefix_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort
    config_node_property_boolean_t *notify_onabort_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete
    config_node_property_boolean_t *notify_oncomplete_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete
    config_node_property_boolean_t *notify_oncontainercomplete_local_nonprim = NULL;

    // define the local variable for com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly
    config_node_property_boolean_t *notify_useronly_local_nonprim = NULL;

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->from_address
    cJSON *from_address = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "from.address");
    if (cJSON_IsNull(from_address)) {
        from_address = NULL;
    }
    if (from_address) { 
    from_address_local_nonprim = config_node_property_string_parseFromJSON(from_address); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->host_prefix
    cJSON *host_prefix = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "host.prefix");
    if (cJSON_IsNull(host_prefix)) {
        host_prefix = NULL;
    }
    if (host_prefix) { 
    host_prefix_local_nonprim = config_node_property_string_parseFromJSON(host_prefix); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_onabort
    cJSON *notify_onabort = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "notify.onabort");
    if (cJSON_IsNull(notify_onabort)) {
        notify_onabort = NULL;
    }
    if (notify_onabort) { 
    notify_onabort_local_nonprim = config_node_property_boolean_parseFromJSON(notify_onabort); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncomplete
    cJSON *notify_oncomplete = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "notify.oncomplete");
    if (cJSON_IsNull(notify_oncomplete)) {
        notify_oncomplete = NULL;
    }
    if (notify_oncomplete) { 
    notify_oncomplete_local_nonprim = config_node_property_boolean_parseFromJSON(notify_oncomplete); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_oncontainercomplete
    cJSON *notify_oncontainercomplete = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "notify.oncontainercomplete");
    if (cJSON_IsNull(notify_oncontainercomplete)) {
        notify_oncontainercomplete = NULL;
    }
    if (notify_oncontainercomplete) { 
    notify_oncontainercomplete_local_nonprim = config_node_property_boolean_parseFromJSON(notify_oncontainercomplete); //nonprimitive
    }

    // com_day_cq_workflow_impl_email_e_mail_notification_service_properties->notify_useronly
    cJSON *notify_useronly = cJSON_GetObjectItemCaseSensitive(com_day_cq_workflow_impl_email_e_mail_notification_service_propertiesJSON, "notify.useronly");
    if (cJSON_IsNull(notify_useronly)) {
        notify_useronly = NULL;
    }
    if (notify_useronly) { 
    notify_useronly_local_nonprim = config_node_property_boolean_parseFromJSON(notify_useronly); //nonprimitive
    }



    com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var = com_day_cq_workflow_impl_email_e_mail_notification_service_properties_create_internal (
        from_address ? from_address_local_nonprim : NULL,
        host_prefix ? host_prefix_local_nonprim : NULL,
        notify_onabort ? notify_onabort_local_nonprim : NULL,
        notify_oncomplete ? notify_oncomplete_local_nonprim : NULL,
        notify_oncontainercomplete ? notify_oncontainercomplete_local_nonprim : NULL,
        notify_useronly ? notify_useronly_local_nonprim : NULL
        );

    if (!com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_workflow_impl_email_e_mail_notification_service_properties_local_var;
end:
    if (from_address_local_nonprim) {
        config_node_property_string_free(from_address_local_nonprim);
        from_address_local_nonprim = NULL;
    }
    if (host_prefix_local_nonprim) {
        config_node_property_string_free(host_prefix_local_nonprim);
        host_prefix_local_nonprim = NULL;
    }
    if (notify_onabort_local_nonprim) {
        config_node_property_boolean_free(notify_onabort_local_nonprim);
        notify_onabort_local_nonprim = NULL;
    }
    if (notify_oncomplete_local_nonprim) {
        config_node_property_boolean_free(notify_oncomplete_local_nonprim);
        notify_oncomplete_local_nonprim = NULL;
    }
    if (notify_oncontainercomplete_local_nonprim) {
        config_node_property_boolean_free(notify_oncontainercomplete_local_nonprim);
        notify_oncontainercomplete_local_nonprim = NULL;
    }
    if (notify_useronly_local_nonprim) {
        config_node_property_boolean_free(notify_useronly_local_nonprim);
        notify_useronly_local_nonprim = NULL;
    }
    return NULL;

}
