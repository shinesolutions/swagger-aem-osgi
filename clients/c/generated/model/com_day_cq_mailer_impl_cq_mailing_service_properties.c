#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mailer_impl_cq_mailing_service_properties.h"



static com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties_create_internal(
    config_node_property_string_t *max_recipient_count
    ) {
    com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties_local_var = malloc(sizeof(com_day_cq_mailer_impl_cq_mailing_service_properties_t));
    if (!com_day_cq_mailer_impl_cq_mailing_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mailer_impl_cq_mailing_service_properties_local_var, 0, sizeof(com_day_cq_mailer_impl_cq_mailing_service_properties_t));
    com_day_cq_mailer_impl_cq_mailing_service_properties_local_var->_library_owned = 1;
    com_day_cq_mailer_impl_cq_mailing_service_properties_local_var->max_recipient_count = max_recipient_count;
    return com_day_cq_mailer_impl_cq_mailing_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties_create(
    config_node_property_string_t *max_recipient_count
    ) {
    com_day_cq_mailer_impl_cq_mailing_service_properties_t *result = com_day_cq_mailer_impl_cq_mailing_service_properties_create_internal (
        max_recipient_count
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mailer_impl_cq_mailing_service_properties_free(com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties) {
    if(NULL == com_day_cq_mailer_impl_cq_mailing_service_properties){
        return ;
    }
    if(com_day_cq_mailer_impl_cq_mailing_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mailer_impl_cq_mailing_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count) {
        config_node_property_string_free(com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count);
        com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count = NULL;
    }
    free(com_day_cq_mailer_impl_cq_mailing_service_properties);
}

cJSON *com_day_cq_mailer_impl_cq_mailing_service_properties_convertToJSON(com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count
    if(com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count) {
    cJSON *max_recipient_count_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count);
    if(max_recipient_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.recipient.count", max_recipient_count_local_JSON);
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

com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties_parseFromJSON(cJSON *com_day_cq_mailer_impl_cq_mailing_service_propertiesJSON){

    com_day_cq_mailer_impl_cq_mailing_service_properties_t *com_day_cq_mailer_impl_cq_mailing_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count
    config_node_property_string_t *max_recipient_count_local_nonprim = NULL;

    // com_day_cq_mailer_impl_cq_mailing_service_properties->max_recipient_count
    cJSON *max_recipient_count = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_impl_cq_mailing_service_propertiesJSON, "max.recipient.count");
    if (cJSON_IsNull(max_recipient_count)) {
        max_recipient_count = NULL;
    }
    if (max_recipient_count) { 
    max_recipient_count_local_nonprim = config_node_property_string_parseFromJSON(max_recipient_count); //nonprimitive
    }



    com_day_cq_mailer_impl_cq_mailing_service_properties_local_var = com_day_cq_mailer_impl_cq_mailing_service_properties_create_internal (
        max_recipient_count ? max_recipient_count_local_nonprim : NULL
        );

    if (!com_day_cq_mailer_impl_cq_mailing_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_mailer_impl_cq_mailing_service_properties_local_var;
end:
    if (max_recipient_count_local_nonprim) {
        config_node_property_string_free(max_recipient_count_local_nonprim);
        max_recipient_count_local_nonprim = NULL;
    }
    return NULL;

}
