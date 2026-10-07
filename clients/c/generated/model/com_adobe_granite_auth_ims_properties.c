#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_ims_properties.h"



static com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties_create_internal(
    config_node_property_string_t *configid,
    config_node_property_string_t *scope
    ) {
    com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties_local_var = malloc(sizeof(com_adobe_granite_auth_ims_properties_t));
    if (!com_adobe_granite_auth_ims_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_ims_properties_local_var, 0, sizeof(com_adobe_granite_auth_ims_properties_t));
    com_adobe_granite_auth_ims_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_ims_properties_local_var->configid = configid;
    com_adobe_granite_auth_ims_properties_local_var->scope = scope;
    return com_adobe_granite_auth_ims_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties_create(
    config_node_property_string_t *configid,
    config_node_property_string_t *scope
    ) {
    com_adobe_granite_auth_ims_properties_t *result = com_adobe_granite_auth_ims_properties_create_internal (
        configid,
        scope
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_ims_properties_free(com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties) {
    if(NULL == com_adobe_granite_auth_ims_properties){
        return ;
    }
    if(com_adobe_granite_auth_ims_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_ims_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_ims_properties->configid) {
        config_node_property_string_free(com_adobe_granite_auth_ims_properties->configid);
        com_adobe_granite_auth_ims_properties->configid = NULL;
    }
    if (com_adobe_granite_auth_ims_properties->scope) {
        config_node_property_string_free(com_adobe_granite_auth_ims_properties->scope);
        com_adobe_granite_auth_ims_properties->scope = NULL;
    }
    free(com_adobe_granite_auth_ims_properties);
}

cJSON *com_adobe_granite_auth_ims_properties_convertToJSON(com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_ims_properties->configid
    if(com_adobe_granite_auth_ims_properties->configid) {
    cJSON *configid_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_properties->configid);
    if(configid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configid", configid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_properties->scope
    if(com_adobe_granite_auth_ims_properties->scope) {
    cJSON *scope_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_properties->scope);
    if(scope_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scope", scope_local_JSON);
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

com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_propertiesJSON){

    com_adobe_granite_auth_ims_properties_t *com_adobe_granite_auth_ims_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_ims_properties->configid
    config_node_property_string_t *configid_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_properties->scope
    config_node_property_string_t *scope_local_nonprim = NULL;

    // com_adobe_granite_auth_ims_properties->configid
    cJSON *configid = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_propertiesJSON, "configid");
    if (cJSON_IsNull(configid)) {
        configid = NULL;
    }
    if (configid) { 
    configid_local_nonprim = config_node_property_string_parseFromJSON(configid); //nonprimitive
    }

    // com_adobe_granite_auth_ims_properties->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_propertiesJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    if (scope) { 
    scope_local_nonprim = config_node_property_string_parseFromJSON(scope); //nonprimitive
    }



    com_adobe_granite_auth_ims_properties_local_var = com_adobe_granite_auth_ims_properties_create_internal (
        configid ? configid_local_nonprim : NULL,
        scope ? scope_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_ims_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_ims_properties_local_var;
end:
    if (configid_local_nonprim) {
        config_node_property_string_free(configid_local_nonprim);
        configid_local_nonprim = NULL;
    }
    if (scope_local_nonprim) {
        config_node_property_string_free(scope_local_nonprim);
        scope_local_nonprim = NULL;
    }
    return NULL;

}
