#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties.h"



static com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_create_internal(
    config_node_property_array_t *replicate_comment_resource_types
    ) {
    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var = malloc(sizeof(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t));
    if (!com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var, 0, sizeof(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t));
    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var->_library_owned = 1;
    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var->replicate_comment_resource_types = replicate_comment_resource_types;
    return com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_create(
    config_node_property_array_t *replicate_comment_resource_types
    ) {
    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *result = com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_create_internal (
        replicate_comment_resource_types
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_free(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties) {
    if(NULL == com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties){
        return ;
    }
    if(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types) {
        config_node_property_array_free(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types);
        com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types = NULL;
    }
    free(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties);
}

cJSON *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_convertToJSON(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types
    if(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types) {
    cJSON *replicate_comment_resource_types_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types);
    if(replicate_comment_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "replicate.comment.resourceTypes", replicate_comment_resource_types_local_JSON);
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

com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_parseFromJSON(cJSON *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_propertiesJSON){

    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_t *com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types
    config_node_property_array_t *replicate_comment_resource_types_local_nonprim = NULL;

    // com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties->replicate_comment_resource_types
    cJSON *replicate_comment_resource_types = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_comments_internal_comment_replication_content_filter_fac_propertiesJSON, "replicate.comment.resourceTypes");
    if (cJSON_IsNull(replicate_comment_resource_types)) {
        replicate_comment_resource_types = NULL;
    }
    if (replicate_comment_resource_types) { 
    replicate_comment_resource_types_local_nonprim = config_node_property_array_parseFromJSON(replicate_comment_resource_types); //nonprimitive
    }



    com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var = com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_create_internal (
        replicate_comment_resource_types ? replicate_comment_resource_types_local_nonprim : NULL
        );

    if (!com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties_local_var;
end:
    if (replicate_comment_resource_types_local_nonprim) {
        config_node_property_array_free(replicate_comment_resource_types_local_nonprim);
        replicate_comment_resource_types_local_nonprim = NULL;
    }
    return NULL;

}
