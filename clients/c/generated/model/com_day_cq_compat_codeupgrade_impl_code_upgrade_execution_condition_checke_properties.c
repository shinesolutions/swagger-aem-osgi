#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties.h"



static com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_create_internal(
    config_node_property_array_t *codeupgradetasks,
    config_node_property_array_t *codeupgradetaskfilters
    ) {
    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var = malloc(sizeof(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t));
    if (!com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var, 0, sizeof(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t));
    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var->_library_owned = 1;
    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var->codeupgradetasks = codeupgradetasks;
    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var->codeupgradetaskfilters = codeupgradetaskfilters;
    return com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_create(
    config_node_property_array_t *codeupgradetasks,
    config_node_property_array_t *codeupgradetaskfilters
    ) {
    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *result = com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_create_internal (
        codeupgradetasks,
        codeupgradetaskfilters
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_free(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties) {
    if(NULL == com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties){
        return ;
    }
    if(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks) {
        config_node_property_array_free(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks);
        com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks = NULL;
    }
    if (com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters) {
        config_node_property_array_free(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters);
        com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters = NULL;
    }
    free(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties);
}

cJSON *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_convertToJSON(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks
    if(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks) {
    cJSON *codeupgradetasks_local_JSON = config_node_property_array_convertToJSON(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks);
    if(codeupgradetasks_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "codeupgradetasks", codeupgradetasks_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters
    if(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters) {
    cJSON *codeupgradetaskfilters_local_JSON = config_node_property_array_convertToJSON(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters);
    if(codeupgradetaskfilters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "codeupgradetaskfilters", codeupgradetaskfilters_local_JSON);
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

com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_parseFromJSON(cJSON *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_propertiesJSON){

    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_t *com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var = NULL;

    // define the local variable for com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks
    config_node_property_array_t *codeupgradetasks_local_nonprim = NULL;

    // define the local variable for com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters
    config_node_property_array_t *codeupgradetaskfilters_local_nonprim = NULL;

    // com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetasks
    cJSON *codeupgradetasks = cJSON_GetObjectItemCaseSensitive(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_propertiesJSON, "codeupgradetasks");
    if (cJSON_IsNull(codeupgradetasks)) {
        codeupgradetasks = NULL;
    }
    if (codeupgradetasks) { 
    codeupgradetasks_local_nonprim = config_node_property_array_parseFromJSON(codeupgradetasks); //nonprimitive
    }

    // com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties->codeupgradetaskfilters
    cJSON *codeupgradetaskfilters = cJSON_GetObjectItemCaseSensitive(com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_propertiesJSON, "codeupgradetaskfilters");
    if (cJSON_IsNull(codeupgradetaskfilters)) {
        codeupgradetaskfilters = NULL;
    }
    if (codeupgradetaskfilters) { 
    codeupgradetaskfilters_local_nonprim = config_node_property_array_parseFromJSON(codeupgradetaskfilters); //nonprimitive
    }



    com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var = com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_create_internal (
        codeupgradetasks ? codeupgradetasks_local_nonprim : NULL,
        codeupgradetaskfilters ? codeupgradetaskfilters_local_nonprim : NULL
        );

    if (!com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var) {
        goto end;
    }

    return com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties_local_var;
end:
    if (codeupgradetasks_local_nonprim) {
        config_node_property_array_free(codeupgradetasks_local_nonprim);
        codeupgradetasks_local_nonprim = NULL;
    }
    if (codeupgradetaskfilters_local_nonprim) {
        config_node_property_array_free(codeupgradetaskfilters_local_nonprim);
        codeupgradetaskfilters_local_nonprim = NULL;
    }
    return NULL;

}
