#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties.h"



static com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_create_internal(
    config_node_property_string_t *jmx_objectname,
    config_node_property_boolean_t *active
    ) {
    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t));
    if (!com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t));
    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var->jmx_objectname = jmx_objectname;
    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var->active = active;
    return com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_create(
    config_node_property_string_t *jmx_objectname,
    config_node_property_boolean_t *active
    ) {
    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *result = com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_create_internal (
        jmx_objectname,
        active
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_free(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties) {
    if(NULL == com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname);
        com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active);
        com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active = NULL;
    }
    free(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties);
}

cJSON *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname
    if(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname) {
    cJSON *jmx_objectname_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname);
    if(jmx_objectname_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jmx.objectname", jmx_objectname_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active
    if(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active) {
    cJSON *active_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active);
    if(active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "active", active_local_JSON);
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

com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_propertiesJSON){

    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_t *com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname
    config_node_property_string_t *jmx_objectname_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active
    config_node_property_boolean_t *active_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->jmx_objectname
    cJSON *jmx_objectname = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_propertiesJSON, "jmx.objectname");
    if (cJSON_IsNull(jmx_objectname)) {
        jmx_objectname = NULL;
    }
    if (jmx_objectname) { 
    jmx_objectname_local_nonprim = config_node_property_string_parseFromJSON(jmx_objectname); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_propertiesJSON, "active");
    if (cJSON_IsNull(active)) {
        active = NULL;
    }
    if (active) { 
    active_local_nonprim = config_node_property_boolean_parseFromJSON(active); //nonprimitive
    }



    com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var = com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_create_internal (
        jmx_objectname ? jmx_objectname_local_nonprim : NULL,
        active ? active_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties_local_var;
end:
    if (jmx_objectname_local_nonprim) {
        config_node_property_string_free(jmx_objectname_local_nonprim);
        jmx_objectname_local_nonprim = NULL;
    }
    if (active_local_nonprim) {
        config_node_property_boolean_free(active_local_nonprim);
        active_local_nonprim = NULL;
    }
    return NULL;

}
