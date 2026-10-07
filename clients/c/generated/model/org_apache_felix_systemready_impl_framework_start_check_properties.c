#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_systemready_impl_framework_start_check_properties.h"



static org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_create_internal(
    config_node_property_integer_t *timeout,
    config_node_property_integer_t *target_start_level,
    config_node_property_string_t *target_start_level_prop_name,
    config_node_property_drop_down_t *type
    ) {
    org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_local_var = malloc(sizeof(org_apache_felix_systemready_impl_framework_start_check_properties_t));
    if (!org_apache_felix_systemready_impl_framework_start_check_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_systemready_impl_framework_start_check_properties_local_var, 0, sizeof(org_apache_felix_systemready_impl_framework_start_check_properties_t));
    org_apache_felix_systemready_impl_framework_start_check_properties_local_var->_library_owned = 1;
    org_apache_felix_systemready_impl_framework_start_check_properties_local_var->timeout = timeout;
    org_apache_felix_systemready_impl_framework_start_check_properties_local_var->target_start_level = target_start_level;
    org_apache_felix_systemready_impl_framework_start_check_properties_local_var->target_start_level_prop_name = target_start_level_prop_name;
    org_apache_felix_systemready_impl_framework_start_check_properties_local_var->type = type;
    return org_apache_felix_systemready_impl_framework_start_check_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_create(
    config_node_property_integer_t *timeout,
    config_node_property_integer_t *target_start_level,
    config_node_property_string_t *target_start_level_prop_name,
    config_node_property_drop_down_t *type
    ) {
    org_apache_felix_systemready_impl_framework_start_check_properties_t *result = org_apache_felix_systemready_impl_framework_start_check_properties_create_internal (
        timeout,
        target_start_level,
        target_start_level_prop_name,
        type
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_systemready_impl_framework_start_check_properties_free(org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties) {
    if(NULL == org_apache_felix_systemready_impl_framework_start_check_properties){
        return ;
    }
    if(org_apache_felix_systemready_impl_framework_start_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_systemready_impl_framework_start_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_systemready_impl_framework_start_check_properties->timeout) {
        config_node_property_integer_free(org_apache_felix_systemready_impl_framework_start_check_properties->timeout);
        org_apache_felix_systemready_impl_framework_start_check_properties->timeout = NULL;
    }
    if (org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level) {
        config_node_property_integer_free(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level);
        org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level = NULL;
    }
    if (org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name) {
        config_node_property_string_free(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name);
        org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name = NULL;
    }
    if (org_apache_felix_systemready_impl_framework_start_check_properties->type) {
        config_node_property_drop_down_free(org_apache_felix_systemready_impl_framework_start_check_properties->type);
        org_apache_felix_systemready_impl_framework_start_check_properties->type = NULL;
    }
    free(org_apache_felix_systemready_impl_framework_start_check_properties);
}

cJSON *org_apache_felix_systemready_impl_framework_start_check_properties_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_systemready_impl_framework_start_check_properties->timeout
    if(org_apache_felix_systemready_impl_framework_start_check_properties->timeout) {
    cJSON *timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties->timeout);
    if(timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeout", timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level
    if(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level) {
    cJSON *target_start_level_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level);
    if(target_start_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "target.start.level", target_start_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name
    if(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name) {
    cJSON *target_start_level_prop_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name);
    if(target_start_level_prop_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "target.start.level.prop.name", target_start_level_prop_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_systemready_impl_framework_start_check_properties->type
    if(org_apache_felix_systemready_impl_framework_start_check_properties->type) {
    cJSON *type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
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

org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_parseFromJSON(cJSON *org_apache_felix_systemready_impl_framework_start_check_propertiesJSON){

    org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_local_var = NULL;

    // define the local variable for org_apache_felix_systemready_impl_framework_start_check_properties->timeout
    config_node_property_integer_t *timeout_local_nonprim = NULL;

    // define the local variable for org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level
    config_node_property_integer_t *target_start_level_local_nonprim = NULL;

    // define the local variable for org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name
    config_node_property_string_t *target_start_level_prop_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_systemready_impl_framework_start_check_properties->type
    config_node_property_drop_down_t *type_local_nonprim = NULL;

    // org_apache_felix_systemready_impl_framework_start_check_properties->timeout
    cJSON *timeout = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_framework_start_check_propertiesJSON, "timeout");
    if (cJSON_IsNull(timeout)) {
        timeout = NULL;
    }
    if (timeout) { 
    timeout_local_nonprim = config_node_property_integer_parseFromJSON(timeout); //nonprimitive
    }

    // org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level
    cJSON *target_start_level = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_framework_start_check_propertiesJSON, "target.start.level");
    if (cJSON_IsNull(target_start_level)) {
        target_start_level = NULL;
    }
    if (target_start_level) { 
    target_start_level_local_nonprim = config_node_property_integer_parseFromJSON(target_start_level); //nonprimitive
    }

    // org_apache_felix_systemready_impl_framework_start_check_properties->target_start_level_prop_name
    cJSON *target_start_level_prop_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_framework_start_check_propertiesJSON, "target.start.level.prop.name");
    if (cJSON_IsNull(target_start_level_prop_name)) {
        target_start_level_prop_name = NULL;
    }
    if (target_start_level_prop_name) { 
    target_start_level_prop_name_local_nonprim = config_node_property_string_parseFromJSON(target_start_level_prop_name); //nonprimitive
    }

    // org_apache_felix_systemready_impl_framework_start_check_properties->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_framework_start_check_propertiesJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = config_node_property_drop_down_parseFromJSON(type); //nonprimitive
    }



    org_apache_felix_systemready_impl_framework_start_check_properties_local_var = org_apache_felix_systemready_impl_framework_start_check_properties_create_internal (
        timeout ? timeout_local_nonprim : NULL,
        target_start_level ? target_start_level_local_nonprim : NULL,
        target_start_level_prop_name ? target_start_level_prop_name_local_nonprim : NULL,
        type ? type_local_nonprim : NULL
        );

    if (!org_apache_felix_systemready_impl_framework_start_check_properties_local_var) {
        goto end;
    }

    return org_apache_felix_systemready_impl_framework_start_check_properties_local_var;
end:
    if (timeout_local_nonprim) {
        config_node_property_integer_free(timeout_local_nonprim);
        timeout_local_nonprim = NULL;
    }
    if (target_start_level_local_nonprim) {
        config_node_property_integer_free(target_start_level_local_nonprim);
        target_start_level_local_nonprim = NULL;
    }
    if (target_start_level_prop_name_local_nonprim) {
        config_node_property_string_free(target_start_level_prop_name_local_nonprim);
        target_start_level_prop_name_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        config_node_property_drop_down_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
