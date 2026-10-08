#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties.h"



static com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *path_prefix,
    config_node_property_boolean_t *create_version
    ) {
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var = malloc(sizeof(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t));
    if (!com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var, 0, sizeof(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t));
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var->service_ranking = service_ranking;
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var->path_prefix = path_prefix;
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var->create_version = create_version;
    return com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *path_prefix,
    config_node_property_boolean_t *create_version
    ) {
    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *result = com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_create_internal (
        service_ranking,
        path_prefix,
        create_version
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_free(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties) {
    if(NULL == com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties){
        return ;
    }
    if(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking);
        com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking = NULL;
    }
    if (com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix) {
        config_node_property_string_free(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix);
        com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix = NULL;
    }
    if (com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version) {
        config_node_property_boolean_free(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version);
        com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version = NULL;
    }
    free(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties);
}

cJSON *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_convertToJSON(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking
    if(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix
    if(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix) {
    cJSON *path_prefix_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix);
    if(path_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pathPrefix", path_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version
    if(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version) {
    cJSON *create_version_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version);
    if(create_version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "createVersion", create_version_local_JSON);
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

com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_parseFromJSON(cJSON *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_propertiesJSON){

    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_t *com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix
    config_node_property_string_t *path_prefix_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version
    config_node_property_boolean_t *create_version_local_nonprim = NULL;

    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->path_prefix
    cJSON *path_prefix = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_propertiesJSON, "pathPrefix");
    if (cJSON_IsNull(path_prefix)) {
        path_prefix = NULL;
    }
    if (path_prefix) { 
    path_prefix_local_nonprim = config_node_property_string_parseFromJSON(path_prefix); //nonprimitive
    }

    // com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties->create_version
    cJSON *create_version = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_webdav_impl_io_asset_io_handler_propertiesJSON, "createVersion");
    if (cJSON_IsNull(create_version)) {
        create_version = NULL;
    }
    if (create_version) { 
    create_version_local_nonprim = config_node_property_boolean_parseFromJSON(create_version); //nonprimitive
    }



    com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var = com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        path_prefix ? path_prefix_local_nonprim : NULL,
        create_version ? create_version_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (path_prefix_local_nonprim) {
        config_node_property_string_free(path_prefix_local_nonprim);
        path_prefix_local_nonprim = NULL;
    }
    if (create_version_local_nonprim) {
        config_node_property_boolean_free(create_version_local_nonprim);
        create_version_local_nonprim = NULL;
    }
    return NULL;

}
