#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties.h"



static com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_create_internal(
    config_node_property_boolean_t *validation_enabled
    ) {
    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var = malloc(sizeof(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t));
    if (!com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var, 0, sizeof(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t));
    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var->_library_owned = 1;
    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var->validation_enabled = validation_enabled;
    return com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_create(
    config_node_property_boolean_t *validation_enabled
    ) {
    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *result = com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_create_internal (
        validation_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_free(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties) {
    if(NULL == com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties){
        return ;
    }
    if(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled) {
        config_node_property_boolean_free(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled);
        com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled = NULL;
    }
    free(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties);
}

cJSON *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_convertToJSON(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled
    if(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled) {
    cJSON *validation_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled);
    if(validation_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "validation.enabled", validation_enabled_local_JSON);
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

com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_parseFromJSON(cJSON *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_propertiesJSON){

    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_t *com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled
    config_node_property_boolean_t *validation_enabled_local_nonprim = NULL;

    // com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties->validation_enabled
    cJSON *validation_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_propertiesJSON, "validation.enabled");
    if (cJSON_IsNull(validation_enabled)) {
        validation_enabled = NULL;
    }
    if (validation_enabled) { 
    validation_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(validation_enabled); //nonprimitive
    }



    com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var = com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_create_internal (
        validation_enabled ? validation_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties_local_var;
end:
    if (validation_enabled_local_nonprim) {
        config_node_property_boolean_free(validation_enabled_local_nonprim);
        validation_enabled_local_nonprim = NULL;
    }
    return NULL;

}
