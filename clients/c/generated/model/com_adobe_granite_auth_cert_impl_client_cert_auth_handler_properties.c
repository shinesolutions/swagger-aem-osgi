#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties.h"



static com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking
    ) {
    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var = malloc(sizeof(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t));
    if (!com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var, 0, sizeof(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t));
    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var->path = path;
    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var->service_ranking = service_ranking;
    return com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking
    ) {
    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *result = com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_create_internal (
        path,
        service_ranking
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_free(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties) {
    if(NULL == com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties){
        return ;
    }
    if(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path) {
        config_node_property_string_free(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path);
        com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path = NULL;
    }
    if (com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking);
        com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking = NULL;
    }
    free(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties);
}

cJSON *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_convertToJSON(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path
    if(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking
    if(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
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

com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_propertiesJSON){

    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_t *com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_cert_impl_client_cert_auth_handler_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }



    com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var = com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    return NULL;

}
