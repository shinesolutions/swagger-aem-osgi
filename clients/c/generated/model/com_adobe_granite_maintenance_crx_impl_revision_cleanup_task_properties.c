#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties.h"



static com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_create_internal(
    config_node_property_array_t *full_gc_days
    ) {
    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var = malloc(sizeof(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t));
    if (!com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var, 0, sizeof(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t));
    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var->_library_owned = 1;
    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var->full_gc_days = full_gc_days;
    return com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_create(
    config_node_property_array_t *full_gc_days
    ) {
    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *result = com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_create_internal (
        full_gc_days
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_free(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties) {
    if(NULL == com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties){
        return ;
    }
    if(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days) {
        config_node_property_array_free(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days);
        com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days = NULL;
    }
    free(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties);
}

cJSON *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_convertToJSON(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days
    if(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days) {
    cJSON *full_gc_days_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days);
    if(full_gc_days_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "full.gc.days", full_gc_days_local_JSON);
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

com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_parseFromJSON(cJSON *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_propertiesJSON){

    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days
    config_node_property_array_t *full_gc_days_local_nonprim = NULL;

    // com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties->full_gc_days
    cJSON *full_gc_days = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_propertiesJSON, "full.gc.days");
    if (cJSON_IsNull(full_gc_days)) {
        full_gc_days = NULL;
    }
    if (full_gc_days) { 
    full_gc_days_local_nonprim = config_node_property_array_parseFromJSON(full_gc_days); //nonprimitive
    }



    com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var = com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_create_internal (
        full_gc_days ? full_gc_days_local_nonprim : NULL
        );

    if (!com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties_local_var;
end:
    if (full_gc_days_local_nonprim) {
        config_node_property_array_free(full_gc_days_local_nonprim);
        full_gc_days_local_nonprim = NULL;
    }
    return NULL;

}
