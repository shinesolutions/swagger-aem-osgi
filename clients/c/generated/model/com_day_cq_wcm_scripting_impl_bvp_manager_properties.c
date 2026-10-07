#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_scripting_impl_bvp_manager_properties.h"



static com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_create_internal(
    config_node_property_array_t *com_day_cq_wcm_scripting_bvp_script_engines
    ) {
    com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var = malloc(sizeof(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t));
    if (!com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var, 0, sizeof(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t));
    com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var->com_day_cq_wcm_scripting_bvp_script_engines = com_day_cq_wcm_scripting_bvp_script_engines;
    return com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_create(
    config_node_property_array_t *com_day_cq_wcm_scripting_bvp_script_engines
    ) {
    com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *result = com_day_cq_wcm_scripting_impl_bvp_manager_properties_create_internal (
        com_day_cq_wcm_scripting_bvp_script_engines
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_scripting_impl_bvp_manager_properties_free(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties) {
    if(NULL == com_day_cq_wcm_scripting_impl_bvp_manager_properties){
        return ;
    }
    if(com_day_cq_wcm_scripting_impl_bvp_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_scripting_impl_bvp_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines) {
        config_node_property_array_free(com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines);
        com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines = NULL;
    }
    free(com_day_cq_wcm_scripting_impl_bvp_manager_properties);
}

cJSON *com_day_cq_wcm_scripting_impl_bvp_manager_properties_convertToJSON(com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines
    if(com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines) {
    cJSON *com_day_cq_wcm_scripting_bvp_script_engines_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines);
    if(com_day_cq_wcm_scripting_bvp_script_engines_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.day.cq.wcm.scripting.bvp.script.engines", com_day_cq_wcm_scripting_bvp_script_engines_local_JSON);
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

com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_parseFromJSON(cJSON *com_day_cq_wcm_scripting_impl_bvp_manager_propertiesJSON){

    com_day_cq_wcm_scripting_impl_bvp_manager_properties_t *com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines
    config_node_property_array_t *com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim = NULL;

    // com_day_cq_wcm_scripting_impl_bvp_manager_properties->com_day_cq_wcm_scripting_bvp_script_engines
    cJSON *com_day_cq_wcm_scripting_bvp_script_engines = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_scripting_impl_bvp_manager_propertiesJSON, "com.day.cq.wcm.scripting.bvp.script.engines");
    if (cJSON_IsNull(com_day_cq_wcm_scripting_bvp_script_engines)) {
        com_day_cq_wcm_scripting_bvp_script_engines = NULL;
    }
    if (com_day_cq_wcm_scripting_bvp_script_engines) { 
    com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim = config_node_property_array_parseFromJSON(com_day_cq_wcm_scripting_bvp_script_engines); //nonprimitive
    }



    com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var = com_day_cq_wcm_scripting_impl_bvp_manager_properties_create_internal (
        com_day_cq_wcm_scripting_bvp_script_engines ? com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_scripting_impl_bvp_manager_properties_local_var;
end:
    if (com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim) {
        config_node_property_array_free(com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim);
        com_day_cq_wcm_scripting_bvp_script_engines_local_nonprim = NULL;
    }
    return NULL;

}
