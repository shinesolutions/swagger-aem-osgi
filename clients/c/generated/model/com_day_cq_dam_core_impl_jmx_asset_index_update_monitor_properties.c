#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties.h"



static com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create_internal(
    config_node_property_string_t *jmx_objectname,
    config_node_property_boolean_t *property_measure_enabled,
    config_node_property_string_t *property_name,
    config_node_property_integer_t *property_max_wait_ms,
    config_node_property_float_t *property_max_rate,
    config_node_property_boolean_t *fulltext_measure_enabled,
    config_node_property_string_t *fulltext_name,
    config_node_property_integer_t *fulltext_max_wait_ms,
    config_node_property_float_t *fulltext_max_rate
    ) {
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t));
    if (!com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t));
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->jmx_objectname = jmx_objectname;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->property_measure_enabled = property_measure_enabled;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->property_name = property_name;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->property_max_wait_ms = property_max_wait_ms;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->property_max_rate = property_max_rate;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->fulltext_measure_enabled = fulltext_measure_enabled;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->fulltext_name = fulltext_name;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->fulltext_max_wait_ms = fulltext_max_wait_ms;
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var->fulltext_max_rate = fulltext_max_rate;
    return com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create(
    config_node_property_string_t *jmx_objectname,
    config_node_property_boolean_t *property_measure_enabled,
    config_node_property_string_t *property_name,
    config_node_property_integer_t *property_max_wait_ms,
    config_node_property_float_t *property_max_rate,
    config_node_property_boolean_t *fulltext_measure_enabled,
    config_node_property_string_t *fulltext_name,
    config_node_property_integer_t *fulltext_max_wait_ms,
    config_node_property_float_t *fulltext_max_rate
    ) {
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *result = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create_internal (
        jmx_objectname,
        property_measure_enabled,
        property_name,
        property_max_wait_ms,
        property_max_rate,
        fulltext_measure_enabled,
        fulltext_name,
        fulltext_max_wait_ms,
        fulltext_max_rate
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties) {
    if(NULL == com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate) {
        config_node_property_float_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms = NULL;
    }
    if (com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate) {
        config_node_property_float_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate);
        com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate = NULL;
    }
    free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties);
}

cJSON *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname) {
    cJSON *jmx_objectname_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname);
    if(jmx_objectname_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jmx.objectname", jmx_objectname_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled) {
    cJSON *property_measure_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled);
    if(property_measure_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.measure.enabled", property_measure_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name) {
    cJSON *property_name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name);
    if(property_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.name", property_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms) {
    cJSON *property_max_wait_ms_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms);
    if(property_max_wait_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.max.wait.ms", property_max_wait_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate) {
    cJSON *property_max_rate_local_JSON = config_node_property_float_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate);
    if(property_max_rate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.max.rate", property_max_rate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled) {
    cJSON *fulltext_measure_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled);
    if(fulltext_measure_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fulltext.measure.enabled", fulltext_measure_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name) {
    cJSON *fulltext_name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name);
    if(fulltext_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fulltext.name", fulltext_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms) {
    cJSON *fulltext_max_wait_ms_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms);
    if(fulltext_max_wait_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fulltext.max.wait.ms", fulltext_max_wait_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate
    if(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate) {
    cJSON *fulltext_max_rate_local_JSON = config_node_property_float_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate);
    if(fulltext_max_rate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fulltext.max.rate", fulltext_max_rate_local_JSON);
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

com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON){

    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname
    config_node_property_string_t *jmx_objectname_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled
    config_node_property_boolean_t *property_measure_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name
    config_node_property_string_t *property_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms
    config_node_property_integer_t *property_max_wait_ms_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate
    config_node_property_float_t *property_max_rate_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled
    config_node_property_boolean_t *fulltext_measure_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name
    config_node_property_string_t *fulltext_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms
    config_node_property_integer_t *fulltext_max_wait_ms_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate
    config_node_property_float_t *fulltext_max_rate_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->jmx_objectname
    cJSON *jmx_objectname = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "jmx.objectname");
    if (cJSON_IsNull(jmx_objectname)) {
        jmx_objectname = NULL;
    }
    if (jmx_objectname) { 
    jmx_objectname_local_nonprim = config_node_property_string_parseFromJSON(jmx_objectname); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_measure_enabled
    cJSON *property_measure_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "property.measure.enabled");
    if (cJSON_IsNull(property_measure_enabled)) {
        property_measure_enabled = NULL;
    }
    if (property_measure_enabled) { 
    property_measure_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(property_measure_enabled); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_name
    cJSON *property_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "property.name");
    if (cJSON_IsNull(property_name)) {
        property_name = NULL;
    }
    if (property_name) { 
    property_name_local_nonprim = config_node_property_string_parseFromJSON(property_name); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_wait_ms
    cJSON *property_max_wait_ms = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "property.max.wait.ms");
    if (cJSON_IsNull(property_max_wait_ms)) {
        property_max_wait_ms = NULL;
    }
    if (property_max_wait_ms) { 
    property_max_wait_ms_local_nonprim = config_node_property_integer_parseFromJSON(property_max_wait_ms); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->property_max_rate
    cJSON *property_max_rate = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "property.max.rate");
    if (cJSON_IsNull(property_max_rate)) {
        property_max_rate = NULL;
    }
    if (property_max_rate) { 
    property_max_rate_local_nonprim = config_node_property_float_parseFromJSON(property_max_rate); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_measure_enabled
    cJSON *fulltext_measure_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "fulltext.measure.enabled");
    if (cJSON_IsNull(fulltext_measure_enabled)) {
        fulltext_measure_enabled = NULL;
    }
    if (fulltext_measure_enabled) { 
    fulltext_measure_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(fulltext_measure_enabled); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_name
    cJSON *fulltext_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "fulltext.name");
    if (cJSON_IsNull(fulltext_name)) {
        fulltext_name = NULL;
    }
    if (fulltext_name) { 
    fulltext_name_local_nonprim = config_node_property_string_parseFromJSON(fulltext_name); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_wait_ms
    cJSON *fulltext_max_wait_ms = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "fulltext.max.wait.ms");
    if (cJSON_IsNull(fulltext_max_wait_ms)) {
        fulltext_max_wait_ms = NULL;
    }
    if (fulltext_max_wait_ms) { 
    fulltext_max_wait_ms_local_nonprim = config_node_property_integer_parseFromJSON(fulltext_max_wait_ms); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties->fulltext_max_rate
    cJSON *fulltext_max_rate = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON, "fulltext.max.rate");
    if (cJSON_IsNull(fulltext_max_rate)) {
        fulltext_max_rate = NULL;
    }
    if (fulltext_max_rate) { 
    fulltext_max_rate_local_nonprim = config_node_property_float_parseFromJSON(fulltext_max_rate); //nonprimitive
    }



    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create_internal (
        jmx_objectname ? jmx_objectname_local_nonprim : NULL,
        property_measure_enabled ? property_measure_enabled_local_nonprim : NULL,
        property_name ? property_name_local_nonprim : NULL,
        property_max_wait_ms ? property_max_wait_ms_local_nonprim : NULL,
        property_max_rate ? property_max_rate_local_nonprim : NULL,
        fulltext_measure_enabled ? fulltext_measure_enabled_local_nonprim : NULL,
        fulltext_name ? fulltext_name_local_nonprim : NULL,
        fulltext_max_wait_ms ? fulltext_max_wait_ms_local_nonprim : NULL,
        fulltext_max_rate ? fulltext_max_rate_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_local_var;
end:
    if (jmx_objectname_local_nonprim) {
        config_node_property_string_free(jmx_objectname_local_nonprim);
        jmx_objectname_local_nonprim = NULL;
    }
    if (property_measure_enabled_local_nonprim) {
        config_node_property_boolean_free(property_measure_enabled_local_nonprim);
        property_measure_enabled_local_nonprim = NULL;
    }
    if (property_name_local_nonprim) {
        config_node_property_string_free(property_name_local_nonprim);
        property_name_local_nonprim = NULL;
    }
    if (property_max_wait_ms_local_nonprim) {
        config_node_property_integer_free(property_max_wait_ms_local_nonprim);
        property_max_wait_ms_local_nonprim = NULL;
    }
    if (property_max_rate_local_nonprim) {
        config_node_property_float_free(property_max_rate_local_nonprim);
        property_max_rate_local_nonprim = NULL;
    }
    if (fulltext_measure_enabled_local_nonprim) {
        config_node_property_boolean_free(fulltext_measure_enabled_local_nonprim);
        fulltext_measure_enabled_local_nonprim = NULL;
    }
    if (fulltext_name_local_nonprim) {
        config_node_property_string_free(fulltext_name_local_nonprim);
        fulltext_name_local_nonprim = NULL;
    }
    if (fulltext_max_wait_ms_local_nonprim) {
        config_node_property_integer_free(fulltext_max_wait_ms_local_nonprim);
        fulltext_max_wait_ms_local_nonprim = NULL;
    }
    if (fulltext_max_rate_local_nonprim) {
        config_node_property_float_free(fulltext_max_rate_local_nonprim);
        fulltext_max_rate_local_nonprim = NULL;
    }
    return NULL;

}
