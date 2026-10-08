#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_optout_impl_opt_out_service_impl_properties.h"



static com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties_create_internal(
    config_node_property_array_t *optout_cookies,
    config_node_property_array_t *optout_headers,
    config_node_property_array_t *optout_whitelist_cookies
    ) {
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var = malloc(sizeof(com_adobe_granite_optout_impl_opt_out_service_impl_properties_t));
    if (!com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var, 0, sizeof(com_adobe_granite_optout_impl_opt_out_service_impl_properties_t));
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var->optout_cookies = optout_cookies;
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var->optout_headers = optout_headers;
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var->optout_whitelist_cookies = optout_whitelist_cookies;
    return com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties_create(
    config_node_property_array_t *optout_cookies,
    config_node_property_array_t *optout_headers,
    config_node_property_array_t *optout_whitelist_cookies
    ) {
    com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *result = com_adobe_granite_optout_impl_opt_out_service_impl_properties_create_internal (
        optout_cookies,
        optout_headers,
        optout_whitelist_cookies
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_optout_impl_opt_out_service_impl_properties_free(com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties) {
    if(NULL == com_adobe_granite_optout_impl_opt_out_service_impl_properties){
        return ;
    }
    if(com_adobe_granite_optout_impl_opt_out_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_optout_impl_opt_out_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies) {
        config_node_property_array_free(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies);
        com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies = NULL;
    }
    if (com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers) {
        config_node_property_array_free(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers);
        com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers = NULL;
    }
    if (com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies) {
        config_node_property_array_free(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies);
        com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies = NULL;
    }
    free(com_adobe_granite_optout_impl_opt_out_service_impl_properties);
}

cJSON *com_adobe_granite_optout_impl_opt_out_service_impl_properties_convertToJSON(com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies
    if(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies) {
    cJSON *optout_cookies_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies);
    if(optout_cookies_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optout.cookies", optout_cookies_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers
    if(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers) {
    cJSON *optout_headers_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers);
    if(optout_headers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optout.headers", optout_headers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies
    if(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies) {
    cJSON *optout_whitelist_cookies_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies);
    if(optout_whitelist_cookies_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optout.whitelist.cookies", optout_whitelist_cookies_local_JSON);
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

com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties_parseFromJSON(cJSON *com_adobe_granite_optout_impl_opt_out_service_impl_propertiesJSON){

    com_adobe_granite_optout_impl_opt_out_service_impl_properties_t *com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies
    config_node_property_array_t *optout_cookies_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers
    config_node_property_array_t *optout_headers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies
    config_node_property_array_t *optout_whitelist_cookies_local_nonprim = NULL;

    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_cookies
    cJSON *optout_cookies = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_optout_impl_opt_out_service_impl_propertiesJSON, "optout.cookies");
    if (cJSON_IsNull(optout_cookies)) {
        optout_cookies = NULL;
    }
    if (optout_cookies) { 
    optout_cookies_local_nonprim = config_node_property_array_parseFromJSON(optout_cookies); //nonprimitive
    }

    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_headers
    cJSON *optout_headers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_optout_impl_opt_out_service_impl_propertiesJSON, "optout.headers");
    if (cJSON_IsNull(optout_headers)) {
        optout_headers = NULL;
    }
    if (optout_headers) { 
    optout_headers_local_nonprim = config_node_property_array_parseFromJSON(optout_headers); //nonprimitive
    }

    // com_adobe_granite_optout_impl_opt_out_service_impl_properties->optout_whitelist_cookies
    cJSON *optout_whitelist_cookies = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_optout_impl_opt_out_service_impl_propertiesJSON, "optout.whitelist.cookies");
    if (cJSON_IsNull(optout_whitelist_cookies)) {
        optout_whitelist_cookies = NULL;
    }
    if (optout_whitelist_cookies) { 
    optout_whitelist_cookies_local_nonprim = config_node_property_array_parseFromJSON(optout_whitelist_cookies); //nonprimitive
    }



    com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var = com_adobe_granite_optout_impl_opt_out_service_impl_properties_create_internal (
        optout_cookies ? optout_cookies_local_nonprim : NULL,
        optout_headers ? optout_headers_local_nonprim : NULL,
        optout_whitelist_cookies ? optout_whitelist_cookies_local_nonprim : NULL
        );

    if (!com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_optout_impl_opt_out_service_impl_properties_local_var;
end:
    if (optout_cookies_local_nonprim) {
        config_node_property_array_free(optout_cookies_local_nonprim);
        optout_cookies_local_nonprim = NULL;
    }
    if (optout_headers_local_nonprim) {
        config_node_property_array_free(optout_headers_local_nonprim);
        optout_headers_local_nonprim = NULL;
    }
    if (optout_whitelist_cookies_local_nonprim) {
        config_node_property_array_free(optout_whitelist_cookies_local_nonprim);
        optout_whitelist_cookies_local_nonprim = NULL;
    }
    return NULL;

}
