#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties.h"



static com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_create_internal(
    config_node_property_array_t *allowed_paths,
    config_node_property_integer_t *cq_analytics_saint_exporter_pagesize
    ) {
    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var = malloc(sizeof(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t));
    if (!com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var, 0, sizeof(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t));
    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var->_library_owned = 1;
    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var->allowed_paths = allowed_paths;
    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var->cq_analytics_saint_exporter_pagesize = cq_analytics_saint_exporter_pagesize;
    return com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_create(
    config_node_property_array_t *allowed_paths,
    config_node_property_integer_t *cq_analytics_saint_exporter_pagesize
    ) {
    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *result = com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_create_internal (
        allowed_paths,
        cq_analytics_saint_exporter_pagesize
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_free(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties) {
    if(NULL == com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties){
        return ;
    }
    if(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths) {
        config_node_property_array_free(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths);
        com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths = NULL;
    }
    if (com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize) {
        config_node_property_integer_free(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize);
        com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize = NULL;
    }
    free(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties);
}

cJSON *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths
    if(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths) {
    cJSON *allowed_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths);
    if(allowed_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowed.paths", allowed_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize
    if(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize) {
    cJSON *cq_analytics_saint_exporter_pagesize_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize);
    if(cq_analytics_saint_exporter_pagesize_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.saint.exporter.pagesize", cq_analytics_saint_exporter_pagesize_local_JSON);
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

com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_parseFromJSON(cJSON *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_propertiesJSON){

    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_t *com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths
    config_node_property_array_t *allowed_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize
    config_node_property_integer_t *cq_analytics_saint_exporter_pagesize_local_nonprim = NULL;

    // com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->allowed_paths
    cJSON *allowed_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_propertiesJSON, "allowed.paths");
    if (cJSON_IsNull(allowed_paths)) {
        allowed_paths = NULL;
    }
    if (allowed_paths) { 
    allowed_paths_local_nonprim = config_node_property_array_parseFromJSON(allowed_paths); //nonprimitive
    }

    // com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties->cq_analytics_saint_exporter_pagesize
    cJSON *cq_analytics_saint_exporter_pagesize = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_propertiesJSON, "cq.analytics.saint.exporter.pagesize");
    if (cJSON_IsNull(cq_analytics_saint_exporter_pagesize)) {
        cq_analytics_saint_exporter_pagesize = NULL;
    }
    if (cq_analytics_saint_exporter_pagesize) { 
    cq_analytics_saint_exporter_pagesize_local_nonprim = config_node_property_integer_parseFromJSON(cq_analytics_saint_exporter_pagesize); //nonprimitive
    }



    com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var = com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_create_internal (
        allowed_paths ? allowed_paths_local_nonprim : NULL,
        cq_analytics_saint_exporter_pagesize ? cq_analytics_saint_exporter_pagesize_local_nonprim : NULL
        );

    if (!com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var) {
        goto end;
    }

    return com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties_local_var;
end:
    if (allowed_paths_local_nonprim) {
        config_node_property_array_free(allowed_paths_local_nonprim);
        allowed_paths_local_nonprim = NULL;
    }
    if (cq_analytics_saint_exporter_pagesize_local_nonprim) {
        config_node_property_integer_free(cq_analytics_saint_exporter_pagesize_local_nonprim);
        cq_analytics_saint_exporter_pagesize_local_nonprim = NULL;
    }
    return NULL;

}
