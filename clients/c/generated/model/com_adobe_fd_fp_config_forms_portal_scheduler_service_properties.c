#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_fd_fp_config_forms_portal_scheduler_service_properties.h"



static com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_create_internal(
    config_node_property_string_t *formportal_interval
    ) {
    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var = malloc(sizeof(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t));
    if (!com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var, 0, sizeof(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t));
    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var->_library_owned = 1;
    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var->formportal_interval = formportal_interval;
    return com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_create(
    config_node_property_string_t *formportal_interval
    ) {
    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *result = com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_create_internal (
        formportal_interval
        );
    if (!result) {
    }
    return result;
}

void com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_free(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties) {
    if(NULL == com_adobe_fd_fp_config_forms_portal_scheduler_service_properties){
        return ;
    }
    if(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval);
        com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval = NULL;
    }
    free(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties);
}

cJSON *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_convertToJSON(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval
    if(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval) {
    cJSON *formportal_interval_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval);
    if(formportal_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "formportal.interval", formportal_interval_local_JSON);
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

com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_parseFromJSON(cJSON *com_adobe_fd_fp_config_forms_portal_scheduler_service_propertiesJSON){

    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_t *com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval
    config_node_property_string_t *formportal_interval_local_nonprim = NULL;

    // com_adobe_fd_fp_config_forms_portal_scheduler_service_properties->formportal_interval
    cJSON *formportal_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_scheduler_service_propertiesJSON, "formportal.interval");
    if (cJSON_IsNull(formportal_interval)) {
        formportal_interval = NULL;
    }
    if (formportal_interval) { 
    formportal_interval_local_nonprim = config_node_property_string_parseFromJSON(formportal_interval); //nonprimitive
    }



    com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var = com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_create_internal (
        formportal_interval ? formportal_interval_local_nonprim : NULL
        );

    if (!com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var) {
        goto end;
    }

    return com_adobe_fd_fp_config_forms_portal_scheduler_service_properties_local_var;
end:
    if (formportal_interval_local_nonprim) {
        config_node_property_string_free(formportal_interval_local_nonprim);
        formportal_interval_local_nonprim = NULL;
    }
    return NULL;

}
