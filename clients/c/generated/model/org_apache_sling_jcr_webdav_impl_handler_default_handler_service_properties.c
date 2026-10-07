#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties.h"



static org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
    ) {
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var = malloc(sizeof(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t));
    if (!org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var, 0, sizeof(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t));
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var->service_ranking = service_ranking;
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var->type_collections = type_collections;
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var->type_noncollections = type_noncollections;
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var->type_content = type_content;
    return org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
    ) {
    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *result = org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_create_internal (
        service_ranking,
        type_collections,
        type_noncollections,
        type_content
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties) {
    if(NULL == org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties){
        return ;
    }
    if(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking) {
        config_node_property_integer_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking);
        org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections);
        org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections);
        org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content);
        org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content = NULL;
    }
    free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties);
}

cJSON *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking
    if(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections
    if(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections) {
    cJSON *type_collections_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections);
    if(type_collections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.collections", type_collections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections
    if(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections) {
    cJSON *type_noncollections_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections);
    if(type_noncollections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.noncollections", type_noncollections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content
    if(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content) {
    cJSON *type_content_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content);
    if(type_content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.content", type_content_local_JSON);
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

org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_parseFromJSON(cJSON *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON){

    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections
    config_node_property_string_t *type_collections_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections
    config_node_property_string_t *type_noncollections_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content
    config_node_property_string_t *type_content_local_nonprim = NULL;

    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_collections
    cJSON *type_collections = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON, "type.collections");
    if (cJSON_IsNull(type_collections)) {
        type_collections = NULL;
    }
    if (type_collections) { 
    type_collections_local_nonprim = config_node_property_string_parseFromJSON(type_collections); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_noncollections
    cJSON *type_noncollections = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON, "type.noncollections");
    if (cJSON_IsNull(type_noncollections)) {
        type_noncollections = NULL;
    }
    if (type_noncollections) { 
    type_noncollections_local_nonprim = config_node_property_string_parseFromJSON(type_noncollections); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties->type_content
    cJSON *type_content = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON, "type.content");
    if (cJSON_IsNull(type_content)) {
        type_content = NULL;
    }
    if (type_content) { 
    type_content_local_nonprim = config_node_property_string_parseFromJSON(type_content); //nonprimitive
    }



    org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var = org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        type_collections ? type_collections_local_nonprim : NULL,
        type_noncollections ? type_noncollections_local_nonprim : NULL,
        type_content ? type_content_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (type_collections_local_nonprim) {
        config_node_property_string_free(type_collections_local_nonprim);
        type_collections_local_nonprim = NULL;
    }
    if (type_noncollections_local_nonprim) {
        config_node_property_string_free(type_noncollections_local_nonprim);
        type_noncollections_local_nonprim = NULL;
    }
    if (type_content_local_nonprim) {
        config_node_property_string_free(type_content_local_nonprim);
        type_content_local_nonprim = NULL;
    }
    return NULL;

}
