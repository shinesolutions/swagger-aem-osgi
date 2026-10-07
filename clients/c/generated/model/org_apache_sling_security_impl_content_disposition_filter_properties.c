#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_security_impl_content_disposition_filter_properties.h"



static org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_create_internal(
    config_node_property_array_t *sling_content_disposition_paths,
    config_node_property_array_t *sling_content_disposition_excluded_paths,
    config_node_property_boolean_t *sling_content_disposition_all_paths
    ) {
    org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_local_var = malloc(sizeof(org_apache_sling_security_impl_content_disposition_filter_properties_t));
    if (!org_apache_sling_security_impl_content_disposition_filter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_security_impl_content_disposition_filter_properties_local_var, 0, sizeof(org_apache_sling_security_impl_content_disposition_filter_properties_t));
    org_apache_sling_security_impl_content_disposition_filter_properties_local_var->_library_owned = 1;
    org_apache_sling_security_impl_content_disposition_filter_properties_local_var->sling_content_disposition_paths = sling_content_disposition_paths;
    org_apache_sling_security_impl_content_disposition_filter_properties_local_var->sling_content_disposition_excluded_paths = sling_content_disposition_excluded_paths;
    org_apache_sling_security_impl_content_disposition_filter_properties_local_var->sling_content_disposition_all_paths = sling_content_disposition_all_paths;
    return org_apache_sling_security_impl_content_disposition_filter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_create(
    config_node_property_array_t *sling_content_disposition_paths,
    config_node_property_array_t *sling_content_disposition_excluded_paths,
    config_node_property_boolean_t *sling_content_disposition_all_paths
    ) {
    org_apache_sling_security_impl_content_disposition_filter_properties_t *result = org_apache_sling_security_impl_content_disposition_filter_properties_create_internal (
        sling_content_disposition_paths,
        sling_content_disposition_excluded_paths,
        sling_content_disposition_all_paths
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_security_impl_content_disposition_filter_properties_free(org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties) {
    if(NULL == org_apache_sling_security_impl_content_disposition_filter_properties){
        return ;
    }
    if(org_apache_sling_security_impl_content_disposition_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_security_impl_content_disposition_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths) {
        config_node_property_array_free(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths);
        org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths) {
        config_node_property_array_free(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths);
        org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths) {
        config_node_property_boolean_free(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths);
        org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths = NULL;
    }
    free(org_apache_sling_security_impl_content_disposition_filter_properties);
}

cJSON *org_apache_sling_security_impl_content_disposition_filter_properties_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths
    if(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths) {
    cJSON *sling_content_disposition_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths);
    if(sling_content_disposition_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.content.disposition.paths", sling_content_disposition_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths
    if(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths) {
    cJSON *sling_content_disposition_excluded_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths);
    if(sling_content_disposition_excluded_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.content.disposition.excluded.paths", sling_content_disposition_excluded_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths
    if(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths) {
    cJSON *sling_content_disposition_all_paths_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths);
    if(sling_content_disposition_all_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.content.disposition.all.paths", sling_content_disposition_all_paths_local_JSON);
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

org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_parseFromJSON(cJSON *org_apache_sling_security_impl_content_disposition_filter_propertiesJSON){

    org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths
    config_node_property_array_t *sling_content_disposition_paths_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths
    config_node_property_array_t *sling_content_disposition_excluded_paths_local_nonprim = NULL;

    // define the local variable for org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths
    config_node_property_boolean_t *sling_content_disposition_all_paths_local_nonprim = NULL;

    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_paths
    cJSON *sling_content_disposition_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_propertiesJSON, "sling.content.disposition.paths");
    if (cJSON_IsNull(sling_content_disposition_paths)) {
        sling_content_disposition_paths = NULL;
    }
    if (sling_content_disposition_paths) { 
    sling_content_disposition_paths_local_nonprim = config_node_property_array_parseFromJSON(sling_content_disposition_paths); //nonprimitive
    }

    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_excluded_paths
    cJSON *sling_content_disposition_excluded_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_propertiesJSON, "sling.content.disposition.excluded.paths");
    if (cJSON_IsNull(sling_content_disposition_excluded_paths)) {
        sling_content_disposition_excluded_paths = NULL;
    }
    if (sling_content_disposition_excluded_paths) { 
    sling_content_disposition_excluded_paths_local_nonprim = config_node_property_array_parseFromJSON(sling_content_disposition_excluded_paths); //nonprimitive
    }

    // org_apache_sling_security_impl_content_disposition_filter_properties->sling_content_disposition_all_paths
    cJSON *sling_content_disposition_all_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_propertiesJSON, "sling.content.disposition.all.paths");
    if (cJSON_IsNull(sling_content_disposition_all_paths)) {
        sling_content_disposition_all_paths = NULL;
    }
    if (sling_content_disposition_all_paths) { 
    sling_content_disposition_all_paths_local_nonprim = config_node_property_boolean_parseFromJSON(sling_content_disposition_all_paths); //nonprimitive
    }



    org_apache_sling_security_impl_content_disposition_filter_properties_local_var = org_apache_sling_security_impl_content_disposition_filter_properties_create_internal (
        sling_content_disposition_paths ? sling_content_disposition_paths_local_nonprim : NULL,
        sling_content_disposition_excluded_paths ? sling_content_disposition_excluded_paths_local_nonprim : NULL,
        sling_content_disposition_all_paths ? sling_content_disposition_all_paths_local_nonprim : NULL
        );

    if (!org_apache_sling_security_impl_content_disposition_filter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_security_impl_content_disposition_filter_properties_local_var;
end:
    if (sling_content_disposition_paths_local_nonprim) {
        config_node_property_array_free(sling_content_disposition_paths_local_nonprim);
        sling_content_disposition_paths_local_nonprim = NULL;
    }
    if (sling_content_disposition_excluded_paths_local_nonprim) {
        config_node_property_array_free(sling_content_disposition_excluded_paths_local_nonprim);
        sling_content_disposition_excluded_paths_local_nonprim = NULL;
    }
    if (sling_content_disposition_all_paths_local_nonprim) {
        config_node_property_boolean_free(sling_content_disposition_all_paths_local_nonprim);
        sling_content_disposition_all_paths_local_nonprim = NULL;
    }
    return NULL;

}
