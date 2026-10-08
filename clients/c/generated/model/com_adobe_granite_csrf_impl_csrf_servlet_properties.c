#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_csrf_impl_csrf_servlet_properties.h"



static com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties_create_internal(
    config_node_property_integer_t *csrf_token_expires_in,
    config_node_property_string_t *sling_auth_requirements
    ) {
    com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_csrf_impl_csrf_servlet_properties_t));
    if (!com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var, 0, sizeof(com_adobe_granite_csrf_impl_csrf_servlet_properties_t));
    com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var->csrf_token_expires_in = csrf_token_expires_in;
    com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var->sling_auth_requirements = sling_auth_requirements;
    return com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties_create(
    config_node_property_integer_t *csrf_token_expires_in,
    config_node_property_string_t *sling_auth_requirements
    ) {
    com_adobe_granite_csrf_impl_csrf_servlet_properties_t *result = com_adobe_granite_csrf_impl_csrf_servlet_properties_create_internal (
        csrf_token_expires_in,
        sling_auth_requirements
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_csrf_impl_csrf_servlet_properties_free(com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties) {
    if(NULL == com_adobe_granite_csrf_impl_csrf_servlet_properties){
        return ;
    }
    if(com_adobe_granite_csrf_impl_csrf_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_csrf_impl_csrf_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in) {
        config_node_property_integer_free(com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in);
        com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in = NULL;
    }
    if (com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements) {
        config_node_property_string_free(com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements);
        com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements = NULL;
    }
    free(com_adobe_granite_csrf_impl_csrf_servlet_properties);
}

cJSON *com_adobe_granite_csrf_impl_csrf_servlet_properties_convertToJSON(com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in
    if(com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in) {
    cJSON *csrf_token_expires_in_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in);
    if(csrf_token_expires_in_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "csrf.token.expires.in", csrf_token_expires_in_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements
    if(com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements) {
    cJSON *sling_auth_requirements_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements);
    if(sling_auth_requirements_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.auth.requirements", sling_auth_requirements_local_JSON);
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

com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_csrf_impl_csrf_servlet_propertiesJSON){

    com_adobe_granite_csrf_impl_csrf_servlet_properties_t *com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in
    config_node_property_integer_t *csrf_token_expires_in_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements
    config_node_property_string_t *sling_auth_requirements_local_nonprim = NULL;

    // com_adobe_granite_csrf_impl_csrf_servlet_properties->csrf_token_expires_in
    cJSON *csrf_token_expires_in = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_servlet_propertiesJSON, "csrf.token.expires.in");
    if (cJSON_IsNull(csrf_token_expires_in)) {
        csrf_token_expires_in = NULL;
    }
    if (csrf_token_expires_in) { 
    csrf_token_expires_in_local_nonprim = config_node_property_integer_parseFromJSON(csrf_token_expires_in); //nonprimitive
    }

    // com_adobe_granite_csrf_impl_csrf_servlet_properties->sling_auth_requirements
    cJSON *sling_auth_requirements = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_servlet_propertiesJSON, "sling.auth.requirements");
    if (cJSON_IsNull(sling_auth_requirements)) {
        sling_auth_requirements = NULL;
    }
    if (sling_auth_requirements) { 
    sling_auth_requirements_local_nonprim = config_node_property_string_parseFromJSON(sling_auth_requirements); //nonprimitive
    }



    com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var = com_adobe_granite_csrf_impl_csrf_servlet_properties_create_internal (
        csrf_token_expires_in ? csrf_token_expires_in_local_nonprim : NULL,
        sling_auth_requirements ? sling_auth_requirements_local_nonprim : NULL
        );

    if (!com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_csrf_impl_csrf_servlet_properties_local_var;
end:
    if (csrf_token_expires_in_local_nonprim) {
        config_node_property_integer_free(csrf_token_expires_in_local_nonprim);
        csrf_token_expires_in_local_nonprim = NULL;
    }
    if (sling_auth_requirements_local_nonprim) {
        config_node_property_string_free(sling_auth_requirements_local_nonprim);
        sling_auth_requirements_local_nonprim = NULL;
    }
    return NULL;

}
