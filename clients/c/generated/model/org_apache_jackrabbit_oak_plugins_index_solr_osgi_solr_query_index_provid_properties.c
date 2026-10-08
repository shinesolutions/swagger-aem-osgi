#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties.h"



static org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_create_internal(
    config_node_property_boolean_t *query_aggregation
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t));
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var->query_aggregation = query_aggregation;
    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_create(
    config_node_property_boolean_t *query_aggregation
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *result = org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_create_internal (
        query_aggregation
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation) {
    cJSON *query_aggregation_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation);
    if(query_aggregation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "query.aggregation", query_aggregation_local_JSON);
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

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation
    config_node_property_boolean_t *query_aggregation_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties->query_aggregation
    cJSON *query_aggregation = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_propertiesJSON, "query.aggregation");
    if (cJSON_IsNull(query_aggregation)) {
        query_aggregation = NULL;
    }
    if (query_aggregation) { 
    query_aggregation_local_nonprim = config_node_property_boolean_parseFromJSON(query_aggregation); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var = org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_create_internal (
        query_aggregation ? query_aggregation_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties_local_var;
end:
    if (query_aggregation_local_nonprim) {
        config_node_property_boolean_free(query_aggregation_local_nonprim);
        query_aggregation_local_nonprim = NULL;
    }
    return NULL;

}
