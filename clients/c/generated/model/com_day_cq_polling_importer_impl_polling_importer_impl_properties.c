#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_polling_importer_impl_polling_importer_impl_properties.h"



static com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties_create_internal(
    config_node_property_integer_t *importer_min_interval,
    config_node_property_string_t *importer_user,
    config_node_property_array_t *exclude_paths,
    config_node_property_array_t *include_paths
    ) {
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var = malloc(sizeof(com_day_cq_polling_importer_impl_polling_importer_impl_properties_t));
    if (!com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var, 0, sizeof(com_day_cq_polling_importer_impl_polling_importer_impl_properties_t));
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var->_library_owned = 1;
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var->importer_min_interval = importer_min_interval;
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var->importer_user = importer_user;
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var->exclude_paths = exclude_paths;
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var->include_paths = include_paths;
    return com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties_create(
    config_node_property_integer_t *importer_min_interval,
    config_node_property_string_t *importer_user,
    config_node_property_array_t *exclude_paths,
    config_node_property_array_t *include_paths
    ) {
    com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *result = com_day_cq_polling_importer_impl_polling_importer_impl_properties_create_internal (
        importer_min_interval,
        importer_user,
        exclude_paths,
        include_paths
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_polling_importer_impl_polling_importer_impl_properties_free(com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties) {
    if(NULL == com_day_cq_polling_importer_impl_polling_importer_impl_properties){
        return ;
    }
    if(com_day_cq_polling_importer_impl_polling_importer_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_polling_importer_impl_polling_importer_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval) {
        config_node_property_integer_free(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval);
        com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval = NULL;
    }
    if (com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user);
        com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user = NULL;
    }
    if (com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths) {
        config_node_property_array_free(com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths);
        com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths = NULL;
    }
    if (com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths) {
        config_node_property_array_free(com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths);
        com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths = NULL;
    }
    free(com_day_cq_polling_importer_impl_polling_importer_impl_properties);
}

cJSON *com_day_cq_polling_importer_impl_polling_importer_impl_properties_convertToJSON(com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval
    if(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval) {
    cJSON *importer_min_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval);
    if(importer_min_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importer.min.interval", importer_min_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user
    if(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user) {
    cJSON *importer_user_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user);
    if(importer_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importer.user", importer_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths
    if(com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths) {
    cJSON *exclude_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths);
    if(exclude_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exclude.paths", exclude_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths
    if(com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths) {
    cJSON *include_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths);
    if(include_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "include.paths", include_paths_local_JSON);
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

com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties_parseFromJSON(cJSON *com_day_cq_polling_importer_impl_polling_importer_impl_propertiesJSON){

    com_day_cq_polling_importer_impl_polling_importer_impl_properties_t *com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval
    config_node_property_integer_t *importer_min_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user
    config_node_property_string_t *importer_user_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths
    config_node_property_array_t *exclude_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths
    config_node_property_array_t *include_paths_local_nonprim = NULL;

    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_min_interval
    cJSON *importer_min_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_polling_importer_impl_propertiesJSON, "importer.min.interval");
    if (cJSON_IsNull(importer_min_interval)) {
        importer_min_interval = NULL;
    }
    if (importer_min_interval) { 
    importer_min_interval_local_nonprim = config_node_property_integer_parseFromJSON(importer_min_interval); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->importer_user
    cJSON *importer_user = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_polling_importer_impl_propertiesJSON, "importer.user");
    if (cJSON_IsNull(importer_user)) {
        importer_user = NULL;
    }
    if (importer_user) { 
    importer_user_local_nonprim = config_node_property_string_parseFromJSON(importer_user); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->exclude_paths
    cJSON *exclude_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_polling_importer_impl_propertiesJSON, "exclude.paths");
    if (cJSON_IsNull(exclude_paths)) {
        exclude_paths = NULL;
    }
    if (exclude_paths) { 
    exclude_paths_local_nonprim = config_node_property_array_parseFromJSON(exclude_paths); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_polling_importer_impl_properties->include_paths
    cJSON *include_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_polling_importer_impl_propertiesJSON, "include.paths");
    if (cJSON_IsNull(include_paths)) {
        include_paths = NULL;
    }
    if (include_paths) { 
    include_paths_local_nonprim = config_node_property_array_parseFromJSON(include_paths); //nonprimitive
    }



    com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var = com_day_cq_polling_importer_impl_polling_importer_impl_properties_create_internal (
        importer_min_interval ? importer_min_interval_local_nonprim : NULL,
        importer_user ? importer_user_local_nonprim : NULL,
        exclude_paths ? exclude_paths_local_nonprim : NULL,
        include_paths ? include_paths_local_nonprim : NULL
        );

    if (!com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_polling_importer_impl_polling_importer_impl_properties_local_var;
end:
    if (importer_min_interval_local_nonprim) {
        config_node_property_integer_free(importer_min_interval_local_nonprim);
        importer_min_interval_local_nonprim = NULL;
    }
    if (importer_user_local_nonprim) {
        config_node_property_string_free(importer_user_local_nonprim);
        importer_user_local_nonprim = NULL;
    }
    if (exclude_paths_local_nonprim) {
        config_node_property_array_free(exclude_paths_local_nonprim);
        exclude_paths_local_nonprim = NULL;
    }
    if (include_paths_local_nonprim) {
        config_node_property_array_free(include_paths_local_nonprim);
        include_paths_local_nonprim = NULL;
    }
    return NULL;

}
