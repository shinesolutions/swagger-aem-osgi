#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mcm_impl_mcm_configuration_properties.h"



static com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties_create_internal(
    config_node_property_array_t *experience_indirection,
    config_node_property_array_t *touchpoint_indirection
    ) {
    com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties_local_var = malloc(sizeof(com_day_cq_mcm_impl_mcm_configuration_properties_t));
    if (!com_day_cq_mcm_impl_mcm_configuration_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mcm_impl_mcm_configuration_properties_local_var, 0, sizeof(com_day_cq_mcm_impl_mcm_configuration_properties_t));
    com_day_cq_mcm_impl_mcm_configuration_properties_local_var->_library_owned = 1;
    com_day_cq_mcm_impl_mcm_configuration_properties_local_var->experience_indirection = experience_indirection;
    com_day_cq_mcm_impl_mcm_configuration_properties_local_var->touchpoint_indirection = touchpoint_indirection;
    return com_day_cq_mcm_impl_mcm_configuration_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties_create(
    config_node_property_array_t *experience_indirection,
    config_node_property_array_t *touchpoint_indirection
    ) {
    com_day_cq_mcm_impl_mcm_configuration_properties_t *result = com_day_cq_mcm_impl_mcm_configuration_properties_create_internal (
        experience_indirection,
        touchpoint_indirection
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mcm_impl_mcm_configuration_properties_free(com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties) {
    if(NULL == com_day_cq_mcm_impl_mcm_configuration_properties){
        return ;
    }
    if(com_day_cq_mcm_impl_mcm_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mcm_impl_mcm_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection) {
        config_node_property_array_free(com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection);
        com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection = NULL;
    }
    if (com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection) {
        config_node_property_array_free(com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection);
        com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection = NULL;
    }
    free(com_day_cq_mcm_impl_mcm_configuration_properties);
}

cJSON *com_day_cq_mcm_impl_mcm_configuration_properties_convertToJSON(com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection
    if(com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection) {
    cJSON *experience_indirection_local_JSON = config_node_property_array_convertToJSON(com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection);
    if(experience_indirection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "experience.indirection", experience_indirection_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection
    if(com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection) {
    cJSON *touchpoint_indirection_local_JSON = config_node_property_array_convertToJSON(com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection);
    if(touchpoint_indirection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "touchpoint.indirection", touchpoint_indirection_local_JSON);
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

com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties_parseFromJSON(cJSON *com_day_cq_mcm_impl_mcm_configuration_propertiesJSON){

    com_day_cq_mcm_impl_mcm_configuration_properties_t *com_day_cq_mcm_impl_mcm_configuration_properties_local_var = NULL;

    // define the local variable for com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection
    config_node_property_array_t *experience_indirection_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection
    config_node_property_array_t *touchpoint_indirection_local_nonprim = NULL;

    // com_day_cq_mcm_impl_mcm_configuration_properties->experience_indirection
    cJSON *experience_indirection = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_impl_mcm_configuration_propertiesJSON, "experience.indirection");
    if (cJSON_IsNull(experience_indirection)) {
        experience_indirection = NULL;
    }
    if (experience_indirection) { 
    experience_indirection_local_nonprim = config_node_property_array_parseFromJSON(experience_indirection); //nonprimitive
    }

    // com_day_cq_mcm_impl_mcm_configuration_properties->touchpoint_indirection
    cJSON *touchpoint_indirection = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_impl_mcm_configuration_propertiesJSON, "touchpoint.indirection");
    if (cJSON_IsNull(touchpoint_indirection)) {
        touchpoint_indirection = NULL;
    }
    if (touchpoint_indirection) { 
    touchpoint_indirection_local_nonprim = config_node_property_array_parseFromJSON(touchpoint_indirection); //nonprimitive
    }



    com_day_cq_mcm_impl_mcm_configuration_properties_local_var = com_day_cq_mcm_impl_mcm_configuration_properties_create_internal (
        experience_indirection ? experience_indirection_local_nonprim : NULL,
        touchpoint_indirection ? touchpoint_indirection_local_nonprim : NULL
        );

    if (!com_day_cq_mcm_impl_mcm_configuration_properties_local_var) {
        goto end;
    }

    return com_day_cq_mcm_impl_mcm_configuration_properties_local_var;
end:
    if (experience_indirection_local_nonprim) {
        config_node_property_array_free(experience_indirection_local_nonprim);
        experience_indirection_local_nonprim = NULL;
    }
    if (touchpoint_indirection_local_nonprim) {
        config_node_property_array_free(touchpoint_indirection_local_nonprim);
        touchpoint_indirection_local_nonprim = NULL;
    }
    return NULL;

}
