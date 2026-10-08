#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties.h"



static com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_create_internal(
    config_node_property_integer_t *bucket_size
    ) {
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t));
    if (!com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t));
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var->bucket_size = bucket_size;
    return com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_create(
    config_node_property_integer_t *bucket_size
    ) {
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *result = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_create_internal (
        bucket_size
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_free(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties) {
    if(NULL == com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size);
        com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size = NULL;
    }
    free(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties);
}

cJSON *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_convertToJSON(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size
    if(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size) {
    cJSON *bucket_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size);
    if(bucket_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bucketSize", bucket_size_local_JSON);
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

com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_propertiesJSON){

    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_t *com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size
    config_node_property_integer_t *bucket_size_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties->bucket_size
    cJSON *bucket_size = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_propertiesJSON, "bucketSize");
    if (cJSON_IsNull(bucket_size)) {
        bucket_size = NULL;
    }
    if (bucket_size) { 
    bucket_size_local_nonprim = config_node_property_integer_parseFromJSON(bucket_size); //nonprimitive
    }



    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_create_internal (
        bucket_size ? bucket_size_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties_local_var;
end:
    if (bucket_size_local_nonprim) {
        config_node_property_integer_free(bucket_size_local_nonprim);
        bucket_size_local_nonprim = NULL;
    }
    return NULL;

}
