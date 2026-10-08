#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_notification_email_impl_email_channel_properties.h"



static com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties_create_internal(
    config_node_property_string_t *email_from
    ) {
    com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var = malloc(sizeof(com_day_cq_wcm_notification_email_impl_email_channel_properties_t));
    if (!com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var, 0, sizeof(com_day_cq_wcm_notification_email_impl_email_channel_properties_t));
    com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var->email_from = email_from;
    return com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties_create(
    config_node_property_string_t *email_from
    ) {
    com_day_cq_wcm_notification_email_impl_email_channel_properties_t *result = com_day_cq_wcm_notification_email_impl_email_channel_properties_create_internal (
        email_from
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_notification_email_impl_email_channel_properties_free(com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties) {
    if(NULL == com_day_cq_wcm_notification_email_impl_email_channel_properties){
        return ;
    }
    if(com_day_cq_wcm_notification_email_impl_email_channel_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_notification_email_impl_email_channel_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from) {
        config_node_property_string_free(com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from);
        com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from = NULL;
    }
    free(com_day_cq_wcm_notification_email_impl_email_channel_properties);
}

cJSON *com_day_cq_wcm_notification_email_impl_email_channel_properties_convertToJSON(com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from
    if(com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from) {
    cJSON *email_from_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from);
    if(email_from_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.from", email_from_local_JSON);
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

com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties_parseFromJSON(cJSON *com_day_cq_wcm_notification_email_impl_email_channel_propertiesJSON){

    com_day_cq_wcm_notification_email_impl_email_channel_properties_t *com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from
    config_node_property_string_t *email_from_local_nonprim = NULL;

    // com_day_cq_wcm_notification_email_impl_email_channel_properties->email_from
    cJSON *email_from = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_notification_email_impl_email_channel_propertiesJSON, "email.from");
    if (cJSON_IsNull(email_from)) {
        email_from = NULL;
    }
    if (email_from) { 
    email_from_local_nonprim = config_node_property_string_parseFromJSON(email_from); //nonprimitive
    }



    com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var = com_day_cq_wcm_notification_email_impl_email_channel_properties_create_internal (
        email_from ? email_from_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_notification_email_impl_email_channel_properties_local_var;
end:
    if (email_from_local_nonprim) {
        config_node_property_string_free(email_from_local_nonprim);
        email_from_local_nonprim = NULL;
    }
    return NULL;

}
