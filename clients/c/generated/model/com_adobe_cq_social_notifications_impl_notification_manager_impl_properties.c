#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_notifications_impl_notification_manager_impl_properties.h"



static com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_create_internal(
    config_node_property_integer_t *max_unread_notification_count
    ) {
    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t));
    if (!com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t));
    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var->max_unread_notification_count = max_unread_notification_count;
    return com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_create(
    config_node_property_integer_t *max_unread_notification_count
    ) {
    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *result = com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_create_internal (
        max_unread_notification_count
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_free(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties) {
    if(NULL == com_adobe_cq_social_notifications_impl_notification_manager_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count) {
        config_node_property_integer_free(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count);
        com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count = NULL;
    }
    free(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties);
}

cJSON *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_convertToJSON(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count
    if(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count) {
    cJSON *max_unread_notification_count_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count);
    if(max_unread_notification_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.unread.notification.count", max_unread_notification_count_local_JSON);
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

com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_notifications_impl_notification_manager_impl_propertiesJSON){

    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_t *com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count
    config_node_property_integer_t *max_unread_notification_count_local_nonprim = NULL;

    // com_adobe_cq_social_notifications_impl_notification_manager_impl_properties->max_unread_notification_count
    cJSON *max_unread_notification_count = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_notifications_impl_notification_manager_impl_propertiesJSON, "max.unread.notification.count");
    if (cJSON_IsNull(max_unread_notification_count)) {
        max_unread_notification_count = NULL;
    }
    if (max_unread_notification_count) { 
    max_unread_notification_count_local_nonprim = config_node_property_integer_parseFromJSON(max_unread_notification_count); //nonprimitive
    }



    com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var = com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_create_internal (
        max_unread_notification_count ? max_unread_notification_count_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_notifications_impl_notification_manager_impl_properties_local_var;
end:
    if (max_unread_notification_count_local_nonprim) {
        config_node_property_integer_free(max_unread_notification_count_local_nonprim);
        max_unread_notification_count_local_nonprim = NULL;
    }
    return NULL;

}
