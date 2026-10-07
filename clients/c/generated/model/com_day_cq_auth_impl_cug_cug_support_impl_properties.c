#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_auth_impl_cug_cug_support_impl_properties.h"



static com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties_create_internal(
    config_node_property_array_t *cug_exempted_principals,
    config_node_property_boolean_t *cug_enabled,
    config_node_property_string_t *cug_principals_regex,
    config_node_property_string_t *cug_principals_replacement
    ) {
    com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var = malloc(sizeof(com_day_cq_auth_impl_cug_cug_support_impl_properties_t));
    if (!com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var, 0, sizeof(com_day_cq_auth_impl_cug_cug_support_impl_properties_t));
    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var->_library_owned = 1;
    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var->cug_exempted_principals = cug_exempted_principals;
    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var->cug_enabled = cug_enabled;
    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var->cug_principals_regex = cug_principals_regex;
    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var->cug_principals_replacement = cug_principals_replacement;
    return com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties_create(
    config_node_property_array_t *cug_exempted_principals,
    config_node_property_boolean_t *cug_enabled,
    config_node_property_string_t *cug_principals_regex,
    config_node_property_string_t *cug_principals_replacement
    ) {
    com_day_cq_auth_impl_cug_cug_support_impl_properties_t *result = com_day_cq_auth_impl_cug_cug_support_impl_properties_create_internal (
        cug_exempted_principals,
        cug_enabled,
        cug_principals_regex,
        cug_principals_replacement
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_auth_impl_cug_cug_support_impl_properties_free(com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties) {
    if(NULL == com_day_cq_auth_impl_cug_cug_support_impl_properties){
        return ;
    }
    if(com_day_cq_auth_impl_cug_cug_support_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_auth_impl_cug_cug_support_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals) {
        config_node_property_array_free(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals);
        com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals = NULL;
    }
    if (com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled) {
        config_node_property_boolean_free(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled);
        com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled = NULL;
    }
    if (com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex) {
        config_node_property_string_free(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex);
        com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex = NULL;
    }
    if (com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement) {
        config_node_property_string_free(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement);
        com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement = NULL;
    }
    free(com_day_cq_auth_impl_cug_cug_support_impl_properties);
}

cJSON *com_day_cq_auth_impl_cug_cug_support_impl_properties_convertToJSON(com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals
    if(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals) {
    cJSON *cug_exempted_principals_local_JSON = config_node_property_array_convertToJSON(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals);
    if(cug_exempted_principals_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cug.exempted.principals", cug_exempted_principals_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled
    if(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled) {
    cJSON *cug_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled);
    if(cug_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cug.enabled", cug_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex
    if(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex) {
    cJSON *cug_principals_regex_local_JSON = config_node_property_string_convertToJSON(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex);
    if(cug_principals_regex_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cug.principals.regex", cug_principals_regex_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement
    if(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement) {
    cJSON *cug_principals_replacement_local_JSON = config_node_property_string_convertToJSON(com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement);
    if(cug_principals_replacement_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cug.principals.replacement", cug_principals_replacement_local_JSON);
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

com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties_parseFromJSON(cJSON *com_day_cq_auth_impl_cug_cug_support_impl_propertiesJSON){

    com_day_cq_auth_impl_cug_cug_support_impl_properties_t *com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals
    config_node_property_array_t *cug_exempted_principals_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled
    config_node_property_boolean_t *cug_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex
    config_node_property_string_t *cug_principals_regex_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement
    config_node_property_string_t *cug_principals_replacement_local_nonprim = NULL;

    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_exempted_principals
    cJSON *cug_exempted_principals = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_cug_cug_support_impl_propertiesJSON, "cug.exempted.principals");
    if (cJSON_IsNull(cug_exempted_principals)) {
        cug_exempted_principals = NULL;
    }
    if (cug_exempted_principals) { 
    cug_exempted_principals_local_nonprim = config_node_property_array_parseFromJSON(cug_exempted_principals); //nonprimitive
    }

    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_enabled
    cJSON *cug_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_cug_cug_support_impl_propertiesJSON, "cug.enabled");
    if (cJSON_IsNull(cug_enabled)) {
        cug_enabled = NULL;
    }
    if (cug_enabled) { 
    cug_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(cug_enabled); //nonprimitive
    }

    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_regex
    cJSON *cug_principals_regex = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_cug_cug_support_impl_propertiesJSON, "cug.principals.regex");
    if (cJSON_IsNull(cug_principals_regex)) {
        cug_principals_regex = NULL;
    }
    if (cug_principals_regex) { 
    cug_principals_regex_local_nonprim = config_node_property_string_parseFromJSON(cug_principals_regex); //nonprimitive
    }

    // com_day_cq_auth_impl_cug_cug_support_impl_properties->cug_principals_replacement
    cJSON *cug_principals_replacement = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_cug_cug_support_impl_propertiesJSON, "cug.principals.replacement");
    if (cJSON_IsNull(cug_principals_replacement)) {
        cug_principals_replacement = NULL;
    }
    if (cug_principals_replacement) { 
    cug_principals_replacement_local_nonprim = config_node_property_string_parseFromJSON(cug_principals_replacement); //nonprimitive
    }



    com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var = com_day_cq_auth_impl_cug_cug_support_impl_properties_create_internal (
        cug_exempted_principals ? cug_exempted_principals_local_nonprim : NULL,
        cug_enabled ? cug_enabled_local_nonprim : NULL,
        cug_principals_regex ? cug_principals_regex_local_nonprim : NULL,
        cug_principals_replacement ? cug_principals_replacement_local_nonprim : NULL
        );

    if (!com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_auth_impl_cug_cug_support_impl_properties_local_var;
end:
    if (cug_exempted_principals_local_nonprim) {
        config_node_property_array_free(cug_exempted_principals_local_nonprim);
        cug_exempted_principals_local_nonprim = NULL;
    }
    if (cug_enabled_local_nonprim) {
        config_node_property_boolean_free(cug_enabled_local_nonprim);
        cug_enabled_local_nonprim = NULL;
    }
    if (cug_principals_regex_local_nonprim) {
        config_node_property_string_free(cug_principals_regex_local_nonprim);
        cug_principals_regex_local_nonprim = NULL;
    }
    if (cug_principals_replacement_local_nonprim) {
        config_node_property_string_free(cug_principals_replacement_local_nonprim);
        cug_principals_replacement_local_nonprim = NULL;
    }
    return NULL;

}
