#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties.h"



static com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_create_internal(
    config_node_property_string_t *adapter_condition
    ) {
    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var = malloc(sizeof(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t));
    if (!com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var, 0, sizeof(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t));
    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var->_library_owned = 1;
    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var->adapter_condition = adapter_condition;
    return com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_create(
    config_node_property_string_t *adapter_condition
    ) {
    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *result = com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_create_internal (
        adapter_condition
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_free(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties) {
    if(NULL == com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties){
        return ;
    }
    if(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition) {
        config_node_property_string_free(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition);
        com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition = NULL;
    }
    free(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties);
}

cJSON *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition
    if(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition) {
    cJSON *adapter_condition_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition);
    if(adapter_condition_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "adapter.condition", adapter_condition_local_JSON);
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

com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_parseFromJSON(cJSON *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_propertiesJSON){

    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition
    config_node_property_string_t *adapter_condition_local_nonprim = NULL;

    // com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties->adapter_condition
    cJSON *adapter_condition = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_propertiesJSON, "adapter.condition");
    if (cJSON_IsNull(adapter_condition)) {
        adapter_condition = NULL;
    }
    if (adapter_condition) { 
    adapter_condition_local_nonprim = config_node_property_string_parseFromJSON(adapter_condition); //nonprimitive
    }



    com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var = com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_create_internal (
        adapter_condition ? adapter_condition_local_nonprim : NULL
        );

    if (!com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties_local_var;
end:
    if (adapter_condition_local_nonprim) {
        config_node_property_string_free(adapter_condition_local_nonprim);
        adapter_condition_local_nonprim = NULL;
    }
    return NULL;

}
