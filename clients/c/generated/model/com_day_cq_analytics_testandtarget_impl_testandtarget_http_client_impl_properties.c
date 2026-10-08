#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties.h"



static com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_create_internal(
    config_node_property_string_t *cq_analytics_testandtarget_api_url,
    config_node_property_integer_t *cq_analytics_testandtarget_timeout,
    config_node_property_integer_t *cq_analytics_testandtarget_sockettimeout,
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replace,
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replacewith
    ) {
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var = malloc(sizeof(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t));
    if (!com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var, 0, sizeof(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t));
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->_library_owned = 1;
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->cq_analytics_testandtarget_api_url = cq_analytics_testandtarget_api_url;
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->cq_analytics_testandtarget_timeout = cq_analytics_testandtarget_timeout;
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->cq_analytics_testandtarget_sockettimeout = cq_analytics_testandtarget_sockettimeout;
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->cq_analytics_testandtarget_recommendations_url_replace = cq_analytics_testandtarget_recommendations_url_replace;
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var->cq_analytics_testandtarget_recommendations_url_replacewith = cq_analytics_testandtarget_recommendations_url_replacewith;
    return com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_create(
    config_node_property_string_t *cq_analytics_testandtarget_api_url,
    config_node_property_integer_t *cq_analytics_testandtarget_timeout,
    config_node_property_integer_t *cq_analytics_testandtarget_sockettimeout,
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replace,
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replacewith
    ) {
    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *result = com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_create_internal (
        cq_analytics_testandtarget_api_url,
        cq_analytics_testandtarget_timeout,
        cq_analytics_testandtarget_sockettimeout,
        cq_analytics_testandtarget_recommendations_url_replace,
        cq_analytics_testandtarget_recommendations_url_replacewith
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties) {
    if(NULL == com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties){
        return ;
    }
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url) {
        config_node_property_string_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url);
        com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url = NULL;
    }
    if (com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout) {
        config_node_property_integer_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout);
        com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout = NULL;
    }
    if (com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout) {
        config_node_property_integer_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout);
        com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout = NULL;
    }
    if (com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace) {
        config_node_property_string_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace);
        com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace = NULL;
    }
    if (com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith) {
        config_node_property_string_free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith);
        com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith = NULL;
    }
    free(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties);
}

cJSON *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url) {
    cJSON *cq_analytics_testandtarget_api_url_local_JSON = config_node_property_string_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url);
    if(cq_analytics_testandtarget_api_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.testandtarget.api.url", cq_analytics_testandtarget_api_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout) {
    cJSON *cq_analytics_testandtarget_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout);
    if(cq_analytics_testandtarget_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.testandtarget.timeout", cq_analytics_testandtarget_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout) {
    cJSON *cq_analytics_testandtarget_sockettimeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout);
    if(cq_analytics_testandtarget_sockettimeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.testandtarget.sockettimeout", cq_analytics_testandtarget_sockettimeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace) {
    cJSON *cq_analytics_testandtarget_recommendations_url_replace_local_JSON = config_node_property_string_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace);
    if(cq_analytics_testandtarget_recommendations_url_replace_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.testandtarget.recommendations.url.replace", cq_analytics_testandtarget_recommendations_url_replace_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith
    if(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith) {
    cJSON *cq_analytics_testandtarget_recommendations_url_replacewith_local_JSON = config_node_property_string_convertToJSON(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith);
    if(cq_analytics_testandtarget_recommendations_url_replacewith_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.testandtarget.recommendations.url.replacewith", cq_analytics_testandtarget_recommendations_url_replacewith_local_JSON);
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

com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_parseFromJSON(cJSON *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON){

    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_t *com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url
    config_node_property_string_t *cq_analytics_testandtarget_api_url_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout
    config_node_property_integer_t *cq_analytics_testandtarget_timeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout
    config_node_property_integer_t *cq_analytics_testandtarget_sockettimeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replace_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith
    config_node_property_string_t *cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim = NULL;

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_api_url
    cJSON *cq_analytics_testandtarget_api_url = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON, "cq.analytics.testandtarget.api.url");
    if (cJSON_IsNull(cq_analytics_testandtarget_api_url)) {
        cq_analytics_testandtarget_api_url = NULL;
    }
    if (cq_analytics_testandtarget_api_url) { 
    cq_analytics_testandtarget_api_url_local_nonprim = config_node_property_string_parseFromJSON(cq_analytics_testandtarget_api_url); //nonprimitive
    }

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_timeout
    cJSON *cq_analytics_testandtarget_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON, "cq.analytics.testandtarget.timeout");
    if (cJSON_IsNull(cq_analytics_testandtarget_timeout)) {
        cq_analytics_testandtarget_timeout = NULL;
    }
    if (cq_analytics_testandtarget_timeout) { 
    cq_analytics_testandtarget_timeout_local_nonprim = config_node_property_integer_parseFromJSON(cq_analytics_testandtarget_timeout); //nonprimitive
    }

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_sockettimeout
    cJSON *cq_analytics_testandtarget_sockettimeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON, "cq.analytics.testandtarget.sockettimeout");
    if (cJSON_IsNull(cq_analytics_testandtarget_sockettimeout)) {
        cq_analytics_testandtarget_sockettimeout = NULL;
    }
    if (cq_analytics_testandtarget_sockettimeout) { 
    cq_analytics_testandtarget_sockettimeout_local_nonprim = config_node_property_integer_parseFromJSON(cq_analytics_testandtarget_sockettimeout); //nonprimitive
    }

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replace
    cJSON *cq_analytics_testandtarget_recommendations_url_replace = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON, "cq.analytics.testandtarget.recommendations.url.replace");
    if (cJSON_IsNull(cq_analytics_testandtarget_recommendations_url_replace)) {
        cq_analytics_testandtarget_recommendations_url_replace = NULL;
    }
    if (cq_analytics_testandtarget_recommendations_url_replace) { 
    cq_analytics_testandtarget_recommendations_url_replace_local_nonprim = config_node_property_string_parseFromJSON(cq_analytics_testandtarget_recommendations_url_replace); //nonprimitive
    }

    // com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties->cq_analytics_testandtarget_recommendations_url_replacewith
    cJSON *cq_analytics_testandtarget_recommendations_url_replacewith = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_propertiesJSON, "cq.analytics.testandtarget.recommendations.url.replacewith");
    if (cJSON_IsNull(cq_analytics_testandtarget_recommendations_url_replacewith)) {
        cq_analytics_testandtarget_recommendations_url_replacewith = NULL;
    }
    if (cq_analytics_testandtarget_recommendations_url_replacewith) { 
    cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim = config_node_property_string_parseFromJSON(cq_analytics_testandtarget_recommendations_url_replacewith); //nonprimitive
    }



    com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var = com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_create_internal (
        cq_analytics_testandtarget_api_url ? cq_analytics_testandtarget_api_url_local_nonprim : NULL,
        cq_analytics_testandtarget_timeout ? cq_analytics_testandtarget_timeout_local_nonprim : NULL,
        cq_analytics_testandtarget_sockettimeout ? cq_analytics_testandtarget_sockettimeout_local_nonprim : NULL,
        cq_analytics_testandtarget_recommendations_url_replace ? cq_analytics_testandtarget_recommendations_url_replace_local_nonprim : NULL,
        cq_analytics_testandtarget_recommendations_url_replacewith ? cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim : NULL
        );

    if (!com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties_local_var;
end:
    if (cq_analytics_testandtarget_api_url_local_nonprim) {
        config_node_property_string_free(cq_analytics_testandtarget_api_url_local_nonprim);
        cq_analytics_testandtarget_api_url_local_nonprim = NULL;
    }
    if (cq_analytics_testandtarget_timeout_local_nonprim) {
        config_node_property_integer_free(cq_analytics_testandtarget_timeout_local_nonprim);
        cq_analytics_testandtarget_timeout_local_nonprim = NULL;
    }
    if (cq_analytics_testandtarget_sockettimeout_local_nonprim) {
        config_node_property_integer_free(cq_analytics_testandtarget_sockettimeout_local_nonprim);
        cq_analytics_testandtarget_sockettimeout_local_nonprim = NULL;
    }
    if (cq_analytics_testandtarget_recommendations_url_replace_local_nonprim) {
        config_node_property_string_free(cq_analytics_testandtarget_recommendations_url_replace_local_nonprim);
        cq_analytics_testandtarget_recommendations_url_replace_local_nonprim = NULL;
    }
    if (cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim) {
        config_node_property_string_free(cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim);
        cq_analytics_testandtarget_recommendations_url_replacewith_local_nonprim = NULL;
    }
    return NULL;

}
