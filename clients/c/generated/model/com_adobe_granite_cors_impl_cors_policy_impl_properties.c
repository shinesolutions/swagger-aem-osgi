#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_cors_impl_cors_policy_impl_properties.h"



static com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_create_internal(
    config_node_property_array_t *alloworigin,
    config_node_property_array_t *alloworiginregexp,
    config_node_property_array_t *allowedpaths,
    config_node_property_array_t *exposedheaders,
    config_node_property_integer_t *maxage,
    config_node_property_array_t *supportedheaders,
    config_node_property_array_t *supportedmethods,
    config_node_property_boolean_t *supportscredentials
    ) {
    com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var = malloc(sizeof(com_adobe_granite_cors_impl_cors_policy_impl_properties_t));
    if (!com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var, 0, sizeof(com_adobe_granite_cors_impl_cors_policy_impl_properties_t));
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->alloworigin = alloworigin;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->alloworiginregexp = alloworiginregexp;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->allowedpaths = allowedpaths;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->exposedheaders = exposedheaders;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->maxage = maxage;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->supportedheaders = supportedheaders;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->supportedmethods = supportedmethods;
    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var->supportscredentials = supportscredentials;
    return com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_create(
    config_node_property_array_t *alloworigin,
    config_node_property_array_t *alloworiginregexp,
    config_node_property_array_t *allowedpaths,
    config_node_property_array_t *exposedheaders,
    config_node_property_integer_t *maxage,
    config_node_property_array_t *supportedheaders,
    config_node_property_array_t *supportedmethods,
    config_node_property_boolean_t *supportscredentials
    ) {
    com_adobe_granite_cors_impl_cors_policy_impl_properties_t *result = com_adobe_granite_cors_impl_cors_policy_impl_properties_create_internal (
        alloworigin,
        alloworiginregexp,
        allowedpaths,
        exposedheaders,
        maxage,
        supportedheaders,
        supportedmethods,
        supportscredentials
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_cors_impl_cors_policy_impl_properties_free(com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties) {
    if(NULL == com_adobe_granite_cors_impl_cors_policy_impl_properties){
        return ;
    }
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_cors_impl_cors_policy_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage) {
        config_node_property_integer_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods) {
        config_node_property_array_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods = NULL;
    }
    if (com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials) {
        config_node_property_boolean_free(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials);
        com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials = NULL;
    }
    free(com_adobe_granite_cors_impl_cors_policy_impl_properties);
}

cJSON *com_adobe_granite_cors_impl_cors_policy_impl_properties_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin) {
    cJSON *alloworigin_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin);
    if(alloworigin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "alloworigin", alloworigin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp) {
    cJSON *alloworiginregexp_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp);
    if(alloworiginregexp_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "alloworiginregexp", alloworiginregexp_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths) {
    cJSON *allowedpaths_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths);
    if(allowedpaths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowedpaths", allowedpaths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders) {
    cJSON *exposedheaders_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders);
    if(exposedheaders_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exposedheaders", exposedheaders_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage) {
    cJSON *maxage_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage);
    if(maxage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxage", maxage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders) {
    cJSON *supportedheaders_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders);
    if(supportedheaders_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportedheaders", supportedheaders_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods) {
    cJSON *supportedmethods_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods);
    if(supportedmethods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportedmethods", supportedmethods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials
    if(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials) {
    cJSON *supportscredentials_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials);
    if(supportscredentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportscredentials", supportscredentials_local_JSON);
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

com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_parseFromJSON(cJSON *com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON){

    com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin
    config_node_property_array_t *alloworigin_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp
    config_node_property_array_t *alloworiginregexp_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths
    config_node_property_array_t *allowedpaths_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders
    config_node_property_array_t *exposedheaders_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage
    config_node_property_integer_t *maxage_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders
    config_node_property_array_t *supportedheaders_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods
    config_node_property_array_t *supportedmethods_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials
    config_node_property_boolean_t *supportscredentials_local_nonprim = NULL;

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworigin
    cJSON *alloworigin = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "alloworigin");
    if (cJSON_IsNull(alloworigin)) {
        alloworigin = NULL;
    }
    if (alloworigin) { 
    alloworigin_local_nonprim = config_node_property_array_parseFromJSON(alloworigin); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->alloworiginregexp
    cJSON *alloworiginregexp = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "alloworiginregexp");
    if (cJSON_IsNull(alloworiginregexp)) {
        alloworiginregexp = NULL;
    }
    if (alloworiginregexp) { 
    alloworiginregexp_local_nonprim = config_node_property_array_parseFromJSON(alloworiginregexp); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->allowedpaths
    cJSON *allowedpaths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "allowedpaths");
    if (cJSON_IsNull(allowedpaths)) {
        allowedpaths = NULL;
    }
    if (allowedpaths) { 
    allowedpaths_local_nonprim = config_node_property_array_parseFromJSON(allowedpaths); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->exposedheaders
    cJSON *exposedheaders = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "exposedheaders");
    if (cJSON_IsNull(exposedheaders)) {
        exposedheaders = NULL;
    }
    if (exposedheaders) { 
    exposedheaders_local_nonprim = config_node_property_array_parseFromJSON(exposedheaders); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->maxage
    cJSON *maxage = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "maxage");
    if (cJSON_IsNull(maxage)) {
        maxage = NULL;
    }
    if (maxage) { 
    maxage_local_nonprim = config_node_property_integer_parseFromJSON(maxage); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedheaders
    cJSON *supportedheaders = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "supportedheaders");
    if (cJSON_IsNull(supportedheaders)) {
        supportedheaders = NULL;
    }
    if (supportedheaders) { 
    supportedheaders_local_nonprim = config_node_property_array_parseFromJSON(supportedheaders); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportedmethods
    cJSON *supportedmethods = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "supportedmethods");
    if (cJSON_IsNull(supportedmethods)) {
        supportedmethods = NULL;
    }
    if (supportedmethods) { 
    supportedmethods_local_nonprim = config_node_property_array_parseFromJSON(supportedmethods); //nonprimitive
    }

    // com_adobe_granite_cors_impl_cors_policy_impl_properties->supportscredentials
    cJSON *supportscredentials = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON, "supportscredentials");
    if (cJSON_IsNull(supportscredentials)) {
        supportscredentials = NULL;
    }
    if (supportscredentials) { 
    supportscredentials_local_nonprim = config_node_property_boolean_parseFromJSON(supportscredentials); //nonprimitive
    }



    com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var = com_adobe_granite_cors_impl_cors_policy_impl_properties_create_internal (
        alloworigin ? alloworigin_local_nonprim : NULL,
        alloworiginregexp ? alloworiginregexp_local_nonprim : NULL,
        allowedpaths ? allowedpaths_local_nonprim : NULL,
        exposedheaders ? exposedheaders_local_nonprim : NULL,
        maxage ? maxage_local_nonprim : NULL,
        supportedheaders ? supportedheaders_local_nonprim : NULL,
        supportedmethods ? supportedmethods_local_nonprim : NULL,
        supportscredentials ? supportscredentials_local_nonprim : NULL
        );

    if (!com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_cors_impl_cors_policy_impl_properties_local_var;
end:
    if (alloworigin_local_nonprim) {
        config_node_property_array_free(alloworigin_local_nonprim);
        alloworigin_local_nonprim = NULL;
    }
    if (alloworiginregexp_local_nonprim) {
        config_node_property_array_free(alloworiginregexp_local_nonprim);
        alloworiginregexp_local_nonprim = NULL;
    }
    if (allowedpaths_local_nonprim) {
        config_node_property_array_free(allowedpaths_local_nonprim);
        allowedpaths_local_nonprim = NULL;
    }
    if (exposedheaders_local_nonprim) {
        config_node_property_array_free(exposedheaders_local_nonprim);
        exposedheaders_local_nonprim = NULL;
    }
    if (maxage_local_nonprim) {
        config_node_property_integer_free(maxage_local_nonprim);
        maxage_local_nonprim = NULL;
    }
    if (supportedheaders_local_nonprim) {
        config_node_property_array_free(supportedheaders_local_nonprim);
        supportedheaders_local_nonprim = NULL;
    }
    if (supportedmethods_local_nonprim) {
        config_node_property_array_free(supportedmethods_local_nonprim);
        supportedmethods_local_nonprim = NULL;
    }
    if (supportscredentials_local_nonprim) {
        config_node_property_boolean_free(supportscredentials_local_nonprim);
        supportscredentials_local_nonprim = NULL;
    }
    return NULL;

}
