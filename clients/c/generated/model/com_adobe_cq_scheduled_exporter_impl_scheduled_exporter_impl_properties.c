#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties.h"



static com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_create_internal(
    config_node_property_array_t *include_paths,
    config_node_property_string_t *exporter_user
    ) {
    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var = malloc(sizeof(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t));
    if (!com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var, 0, sizeof(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t));
    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var->include_paths = include_paths;
    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var->exporter_user = exporter_user;
    return com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_create(
    config_node_property_array_t *include_paths,
    config_node_property_string_t *exporter_user
    ) {
    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *result = com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_create_internal (
        include_paths,
        exporter_user
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_free(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties) {
    if(NULL == com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties){
        return ;
    }
    if(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths) {
        config_node_property_array_free(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths);
        com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths = NULL;
    }
    if (com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user) {
        config_node_property_string_free(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user);
        com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user = NULL;
    }
    free(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties);
}

cJSON *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_convertToJSON(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths
    if(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths) {
    cJSON *include_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths);
    if(include_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "include.paths", include_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user
    if(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user) {
    cJSON *exporter_user_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user);
    if(exporter_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exporter.user", exporter_user_local_JSON);
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

com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_parseFromJSON(cJSON *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_propertiesJSON){

    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_t *com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths
    config_node_property_array_t *include_paths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user
    config_node_property_string_t *exporter_user_local_nonprim = NULL;

    // com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->include_paths
    cJSON *include_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_propertiesJSON, "include.paths");
    if (cJSON_IsNull(include_paths)) {
        include_paths = NULL;
    }
    if (include_paths) { 
    include_paths_local_nonprim = config_node_property_array_parseFromJSON(include_paths); //nonprimitive
    }

    // com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties->exporter_user
    cJSON *exporter_user = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_propertiesJSON, "exporter.user");
    if (cJSON_IsNull(exporter_user)) {
        exporter_user = NULL;
    }
    if (exporter_user) { 
    exporter_user_local_nonprim = config_node_property_string_parseFromJSON(exporter_user); //nonprimitive
    }



    com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var = com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_create_internal (
        include_paths ? include_paths_local_nonprim : NULL,
        exporter_user ? exporter_user_local_nonprim : NULL
        );

    if (!com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties_local_var;
end:
    if (include_paths_local_nonprim) {
        config_node_property_array_free(include_paths_local_nonprim);
        include_paths_local_nonprim = NULL;
    }
    if (exporter_user_local_nonprim) {
        config_node_property_string_free(exporter_user_local_nonprim);
        exporter_user_local_nonprim = NULL;
    }
    return NULL;

}
