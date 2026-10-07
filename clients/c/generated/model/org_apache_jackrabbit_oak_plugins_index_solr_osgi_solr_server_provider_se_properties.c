#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties.h"



static org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_create_internal(
    config_node_property_drop_down_t *server_type
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t));
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var->server_type = server_type;
    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_create(
    config_node_property_drop_down_t *server_type
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *result = org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_create_internal (
        server_type
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type) {
    cJSON *server_type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type);
    if(server_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "server.type", server_type_local_JSON);
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

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type
    config_node_property_drop_down_t *server_type_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties->server_type
    cJSON *server_type = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_propertiesJSON, "server.type");
    if (cJSON_IsNull(server_type)) {
        server_type = NULL;
    }
    if (server_type) { 
    server_type_local_nonprim = config_node_property_drop_down_parseFromJSON(server_type); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var = org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_create_internal (
        server_type ? server_type_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties_local_var;
end:
    if (server_type_local_nonprim) {
        config_node_property_drop_down_free(server_type_local_nonprim);
        server_type_local_nonprim = NULL;
    }
    return NULL;

}
