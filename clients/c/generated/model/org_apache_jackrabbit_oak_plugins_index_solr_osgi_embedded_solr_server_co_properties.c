#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties.h"



static org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_create_internal(
    config_node_property_string_t *solr_home_path,
    config_node_property_string_t *solr_core_name
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t));
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var->solr_home_path = solr_home_path;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var->solr_core_name = solr_core_name;
    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_create(
    config_node_property_string_t *solr_home_path,
    config_node_property_string_t *solr_core_name
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *result = org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_create_internal (
        solr_home_path,
        solr_core_name
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path) {
    cJSON *solr_home_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path);
    if(solr_home_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.home.path", solr_home_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name) {
    cJSON *solr_core_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name);
    if(solr_core_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.core.name", solr_core_name_local_JSON);
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

org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path
    config_node_property_string_t *solr_home_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name
    config_node_property_string_t *solr_core_name_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_home_path
    cJSON *solr_home_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_propertiesJSON, "solr.home.path");
    if (cJSON_IsNull(solr_home_path)) {
        solr_home_path = NULL;
    }
    if (solr_home_path) { 
    solr_home_path_local_nonprim = config_node_property_string_parseFromJSON(solr_home_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties->solr_core_name
    cJSON *solr_core_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_propertiesJSON, "solr.core.name");
    if (cJSON_IsNull(solr_core_name)) {
        solr_core_name = NULL;
    }
    if (solr_core_name) { 
    solr_core_name_local_nonprim = config_node_property_string_parseFromJSON(solr_core_name); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var = org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_create_internal (
        solr_home_path ? solr_home_path_local_nonprim : NULL,
        solr_core_name ? solr_core_name_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties_local_var;
end:
    if (solr_home_path_local_nonprim) {
        config_node_property_string_free(solr_home_path_local_nonprim);
        solr_home_path_local_nonprim = NULL;
    }
    if (solr_core_name_local_nonprim) {
        config_node_property_string_free(solr_core_name_local_nonprim);
        solr_core_name_local_nonprim = NULL;
    }
    return NULL;

}
