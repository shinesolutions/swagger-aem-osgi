#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_undo_undo_config_properties.h"



static com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_create_internal(
    config_node_property_boolean_t *cq_wcm_undo_enabled,
    config_node_property_string_t *cq_wcm_undo_path,
    config_node_property_integer_t *cq_wcm_undo_validity,
    config_node_property_integer_t *cq_wcm_undo_steps,
    config_node_property_string_t *cq_wcm_undo_persistence,
    config_node_property_boolean_t *cq_wcm_undo_persistence_mode,
    config_node_property_string_t *cq_wcm_undo_markermode,
    config_node_property_array_t *cq_wcm_undo_whitelist,
    config_node_property_array_t *cq_wcm_undo_blacklist
    ) {
    com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_local_var = malloc(sizeof(com_day_cq_wcm_undo_undo_config_properties_t));
    if (!com_day_cq_wcm_undo_undo_config_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_undo_undo_config_properties_local_var, 0, sizeof(com_day_cq_wcm_undo_undo_config_properties_t));
    com_day_cq_wcm_undo_undo_config_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_enabled = cq_wcm_undo_enabled;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_path = cq_wcm_undo_path;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_validity = cq_wcm_undo_validity;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_steps = cq_wcm_undo_steps;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_persistence = cq_wcm_undo_persistence;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_persistence_mode = cq_wcm_undo_persistence_mode;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_markermode = cq_wcm_undo_markermode;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_whitelist = cq_wcm_undo_whitelist;
    com_day_cq_wcm_undo_undo_config_properties_local_var->cq_wcm_undo_blacklist = cq_wcm_undo_blacklist;
    return com_day_cq_wcm_undo_undo_config_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_create(
    config_node_property_boolean_t *cq_wcm_undo_enabled,
    config_node_property_string_t *cq_wcm_undo_path,
    config_node_property_integer_t *cq_wcm_undo_validity,
    config_node_property_integer_t *cq_wcm_undo_steps,
    config_node_property_string_t *cq_wcm_undo_persistence,
    config_node_property_boolean_t *cq_wcm_undo_persistence_mode,
    config_node_property_string_t *cq_wcm_undo_markermode,
    config_node_property_array_t *cq_wcm_undo_whitelist,
    config_node_property_array_t *cq_wcm_undo_blacklist
    ) {
    com_day_cq_wcm_undo_undo_config_properties_t *result = com_day_cq_wcm_undo_undo_config_properties_create_internal (
        cq_wcm_undo_enabled,
        cq_wcm_undo_path,
        cq_wcm_undo_validity,
        cq_wcm_undo_steps,
        cq_wcm_undo_persistence,
        cq_wcm_undo_persistence_mode,
        cq_wcm_undo_markermode,
        cq_wcm_undo_whitelist,
        cq_wcm_undo_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_undo_undo_config_properties_free(com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties) {
    if(NULL == com_day_cq_wcm_undo_undo_config_properties){
        return ;
    }
    if(com_day_cq_wcm_undo_undo_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_undo_undo_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path) {
        config_node_property_string_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity) {
        config_node_property_integer_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps) {
        config_node_property_integer_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence) {
        config_node_property_string_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode) {
        config_node_property_boolean_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode) {
        config_node_property_string_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist) {
        config_node_property_array_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist = NULL;
    }
    if (com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist) {
        config_node_property_array_free(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist);
        com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist = NULL;
    }
    free(com_day_cq_wcm_undo_undo_config_properties);
}

cJSON *com_day_cq_wcm_undo_undo_config_properties_convertToJSON(com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled) {
    cJSON *cq_wcm_undo_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled);
    if(cq_wcm_undo_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.enabled", cq_wcm_undo_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path) {
    cJSON *cq_wcm_undo_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path);
    if(cq_wcm_undo_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.path", cq_wcm_undo_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity) {
    cJSON *cq_wcm_undo_validity_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity);
    if(cq_wcm_undo_validity_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.validity", cq_wcm_undo_validity_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps) {
    cJSON *cq_wcm_undo_steps_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps);
    if(cq_wcm_undo_steps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.steps", cq_wcm_undo_steps_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence) {
    cJSON *cq_wcm_undo_persistence_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence);
    if(cq_wcm_undo_persistence_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.persistence", cq_wcm_undo_persistence_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode) {
    cJSON *cq_wcm_undo_persistence_mode_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode);
    if(cq_wcm_undo_persistence_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.persistence.mode", cq_wcm_undo_persistence_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode) {
    cJSON *cq_wcm_undo_markermode_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode);
    if(cq_wcm_undo_markermode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.markermode", cq_wcm_undo_markermode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist) {
    cJSON *cq_wcm_undo_whitelist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist);
    if(cq_wcm_undo_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.whitelist", cq_wcm_undo_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist
    if(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist) {
    cJSON *cq_wcm_undo_blacklist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist);
    if(cq_wcm_undo_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.undo.blacklist", cq_wcm_undo_blacklist_local_JSON);
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

com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_parseFromJSON(cJSON *com_day_cq_wcm_undo_undo_config_propertiesJSON){

    com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled
    config_node_property_boolean_t *cq_wcm_undo_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path
    config_node_property_string_t *cq_wcm_undo_path_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity
    config_node_property_integer_t *cq_wcm_undo_validity_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps
    config_node_property_integer_t *cq_wcm_undo_steps_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence
    config_node_property_string_t *cq_wcm_undo_persistence_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode
    config_node_property_boolean_t *cq_wcm_undo_persistence_mode_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode
    config_node_property_string_t *cq_wcm_undo_markermode_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist
    config_node_property_array_t *cq_wcm_undo_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist
    config_node_property_array_t *cq_wcm_undo_blacklist_local_nonprim = NULL;

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_enabled
    cJSON *cq_wcm_undo_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.enabled");
    if (cJSON_IsNull(cq_wcm_undo_enabled)) {
        cq_wcm_undo_enabled = NULL;
    }
    if (cq_wcm_undo_enabled) { 
    cq_wcm_undo_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(cq_wcm_undo_enabled); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_path
    cJSON *cq_wcm_undo_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.path");
    if (cJSON_IsNull(cq_wcm_undo_path)) {
        cq_wcm_undo_path = NULL;
    }
    if (cq_wcm_undo_path) { 
    cq_wcm_undo_path_local_nonprim = config_node_property_string_parseFromJSON(cq_wcm_undo_path); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_validity
    cJSON *cq_wcm_undo_validity = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.validity");
    if (cJSON_IsNull(cq_wcm_undo_validity)) {
        cq_wcm_undo_validity = NULL;
    }
    if (cq_wcm_undo_validity) { 
    cq_wcm_undo_validity_local_nonprim = config_node_property_integer_parseFromJSON(cq_wcm_undo_validity); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_steps
    cJSON *cq_wcm_undo_steps = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.steps");
    if (cJSON_IsNull(cq_wcm_undo_steps)) {
        cq_wcm_undo_steps = NULL;
    }
    if (cq_wcm_undo_steps) { 
    cq_wcm_undo_steps_local_nonprim = config_node_property_integer_parseFromJSON(cq_wcm_undo_steps); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence
    cJSON *cq_wcm_undo_persistence = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.persistence");
    if (cJSON_IsNull(cq_wcm_undo_persistence)) {
        cq_wcm_undo_persistence = NULL;
    }
    if (cq_wcm_undo_persistence) { 
    cq_wcm_undo_persistence_local_nonprim = config_node_property_string_parseFromJSON(cq_wcm_undo_persistence); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_persistence_mode
    cJSON *cq_wcm_undo_persistence_mode = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.persistence.mode");
    if (cJSON_IsNull(cq_wcm_undo_persistence_mode)) {
        cq_wcm_undo_persistence_mode = NULL;
    }
    if (cq_wcm_undo_persistence_mode) { 
    cq_wcm_undo_persistence_mode_local_nonprim = config_node_property_boolean_parseFromJSON(cq_wcm_undo_persistence_mode); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_markermode
    cJSON *cq_wcm_undo_markermode = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.markermode");
    if (cJSON_IsNull(cq_wcm_undo_markermode)) {
        cq_wcm_undo_markermode = NULL;
    }
    if (cq_wcm_undo_markermode) { 
    cq_wcm_undo_markermode_local_nonprim = config_node_property_string_parseFromJSON(cq_wcm_undo_markermode); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_whitelist
    cJSON *cq_wcm_undo_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.whitelist");
    if (cJSON_IsNull(cq_wcm_undo_whitelist)) {
        cq_wcm_undo_whitelist = NULL;
    }
    if (cq_wcm_undo_whitelist) { 
    cq_wcm_undo_whitelist_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_undo_whitelist); //nonprimitive
    }

    // com_day_cq_wcm_undo_undo_config_properties->cq_wcm_undo_blacklist
    cJSON *cq_wcm_undo_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_undo_undo_config_propertiesJSON, "cq.wcm.undo.blacklist");
    if (cJSON_IsNull(cq_wcm_undo_blacklist)) {
        cq_wcm_undo_blacklist = NULL;
    }
    if (cq_wcm_undo_blacklist) { 
    cq_wcm_undo_blacklist_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_undo_blacklist); //nonprimitive
    }



    com_day_cq_wcm_undo_undo_config_properties_local_var = com_day_cq_wcm_undo_undo_config_properties_create_internal (
        cq_wcm_undo_enabled ? cq_wcm_undo_enabled_local_nonprim : NULL,
        cq_wcm_undo_path ? cq_wcm_undo_path_local_nonprim : NULL,
        cq_wcm_undo_validity ? cq_wcm_undo_validity_local_nonprim : NULL,
        cq_wcm_undo_steps ? cq_wcm_undo_steps_local_nonprim : NULL,
        cq_wcm_undo_persistence ? cq_wcm_undo_persistence_local_nonprim : NULL,
        cq_wcm_undo_persistence_mode ? cq_wcm_undo_persistence_mode_local_nonprim : NULL,
        cq_wcm_undo_markermode ? cq_wcm_undo_markermode_local_nonprim : NULL,
        cq_wcm_undo_whitelist ? cq_wcm_undo_whitelist_local_nonprim : NULL,
        cq_wcm_undo_blacklist ? cq_wcm_undo_blacklist_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_undo_undo_config_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_undo_undo_config_properties_local_var;
end:
    if (cq_wcm_undo_enabled_local_nonprim) {
        config_node_property_boolean_free(cq_wcm_undo_enabled_local_nonprim);
        cq_wcm_undo_enabled_local_nonprim = NULL;
    }
    if (cq_wcm_undo_path_local_nonprim) {
        config_node_property_string_free(cq_wcm_undo_path_local_nonprim);
        cq_wcm_undo_path_local_nonprim = NULL;
    }
    if (cq_wcm_undo_validity_local_nonprim) {
        config_node_property_integer_free(cq_wcm_undo_validity_local_nonprim);
        cq_wcm_undo_validity_local_nonprim = NULL;
    }
    if (cq_wcm_undo_steps_local_nonprim) {
        config_node_property_integer_free(cq_wcm_undo_steps_local_nonprim);
        cq_wcm_undo_steps_local_nonprim = NULL;
    }
    if (cq_wcm_undo_persistence_local_nonprim) {
        config_node_property_string_free(cq_wcm_undo_persistence_local_nonprim);
        cq_wcm_undo_persistence_local_nonprim = NULL;
    }
    if (cq_wcm_undo_persistence_mode_local_nonprim) {
        config_node_property_boolean_free(cq_wcm_undo_persistence_mode_local_nonprim);
        cq_wcm_undo_persistence_mode_local_nonprim = NULL;
    }
    if (cq_wcm_undo_markermode_local_nonprim) {
        config_node_property_string_free(cq_wcm_undo_markermode_local_nonprim);
        cq_wcm_undo_markermode_local_nonprim = NULL;
    }
    if (cq_wcm_undo_whitelist_local_nonprim) {
        config_node_property_array_free(cq_wcm_undo_whitelist_local_nonprim);
        cq_wcm_undo_whitelist_local_nonprim = NULL;
    }
    if (cq_wcm_undo_blacklist_local_nonprim) {
        config_node_property_array_free(cq_wcm_undo_blacklist_local_nonprim);
        cq_wcm_undo_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
