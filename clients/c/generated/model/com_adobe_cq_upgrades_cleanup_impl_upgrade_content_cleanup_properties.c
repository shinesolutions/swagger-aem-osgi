#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties.h"



static com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_create_internal(
    config_node_property_array_t *delete_path_regexps,
    config_node_property_string_t *delete_sql2_query
    ) {
    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var = malloc(sizeof(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t));
    if (!com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var, 0, sizeof(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t));
    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var->_library_owned = 1;
    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var->delete_path_regexps = delete_path_regexps;
    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var->delete_sql2_query = delete_sql2_query;
    return com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_create(
    config_node_property_array_t *delete_path_regexps,
    config_node_property_string_t *delete_sql2_query
    ) {
    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *result = com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_create_internal (
        delete_path_regexps,
        delete_sql2_query
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_free(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties) {
    if(NULL == com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties){
        return ;
    }
    if(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps) {
        config_node_property_array_free(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps);
        com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps = NULL;
    }
    if (com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query) {
        config_node_property_string_free(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query);
        com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query = NULL;
    }
    free(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties);
}

cJSON *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_convertToJSON(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps
    if(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps) {
    cJSON *delete_path_regexps_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps);
    if(delete_path_regexps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delete.path.regexps", delete_path_regexps_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query
    if(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query) {
    cJSON *delete_sql2_query_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query);
    if(delete_sql2_query_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delete.sql2.query", delete_sql2_query_local_JSON);
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

com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_parseFromJSON(cJSON *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_propertiesJSON){

    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_t *com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps
    config_node_property_array_t *delete_path_regexps_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query
    config_node_property_string_t *delete_sql2_query_local_nonprim = NULL;

    // com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_path_regexps
    cJSON *delete_path_regexps = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_propertiesJSON, "delete.path.regexps");
    if (cJSON_IsNull(delete_path_regexps)) {
        delete_path_regexps = NULL;
    }
    if (delete_path_regexps) { 
    delete_path_regexps_local_nonprim = config_node_property_array_parseFromJSON(delete_path_regexps); //nonprimitive
    }

    // com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties->delete_sql2_query
    cJSON *delete_sql2_query = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_propertiesJSON, "delete.sql2.query");
    if (cJSON_IsNull(delete_sql2_query)) {
        delete_sql2_query = NULL;
    }
    if (delete_sql2_query) { 
    delete_sql2_query_local_nonprim = config_node_property_string_parseFromJSON(delete_sql2_query); //nonprimitive
    }



    com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var = com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_create_internal (
        delete_path_regexps ? delete_path_regexps_local_nonprim : NULL,
        delete_sql2_query ? delete_sql2_query_local_nonprim : NULL
        );

    if (!com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties_local_var;
end:
    if (delete_path_regexps_local_nonprim) {
        config_node_property_array_free(delete_path_regexps_local_nonprim);
        delete_path_regexps_local_nonprim = NULL;
    }
    if (delete_sql2_query_local_nonprim) {
        config_node_property_string_free(delete_sql2_query_local_nonprim);
        delete_sql2_query_local_nonprim = NULL;
    }
    return NULL;

}
