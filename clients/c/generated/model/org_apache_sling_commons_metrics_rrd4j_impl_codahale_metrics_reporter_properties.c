#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties.h"



static org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_create_internal(
    config_node_property_array_t *datasources,
    config_node_property_integer_t *step,
    config_node_property_array_t *archives,
    config_node_property_string_t *path
    ) {
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var = malloc(sizeof(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t));
    if (!org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var, 0, sizeof(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t));
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var->datasources = datasources;
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var->step = step;
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var->archives = archives;
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var->path = path;
    return org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_create(
    config_node_property_array_t *datasources,
    config_node_property_integer_t *step,
    config_node_property_array_t *archives,
    config_node_property_string_t *path
    ) {
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *result = org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_create_internal (
        datasources,
        step,
        archives,
        path
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties) {
    if(NULL == org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties){
        return ;
    }
    if(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources) {
        config_node_property_array_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources);
        org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources = NULL;
    }
    if (org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step) {
        config_node_property_integer_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step);
        org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step = NULL;
    }
    if (org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives) {
        config_node_property_array_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives);
        org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives = NULL;
    }
    if (org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path) {
        config_node_property_string_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path);
        org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path = NULL;
    }
    free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties);
}

cJSON *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources
    if(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources) {
    cJSON *datasources_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources);
    if(datasources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasources", datasources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step
    if(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step) {
    cJSON *step_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step);
    if(step_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "step", step_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives
    if(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives) {
    cJSON *archives_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives);
    if(archives_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "archives", archives_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path
    if(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
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

org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_parseFromJSON(cJSON *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_propertiesJSON){

    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources
    config_node_property_array_t *datasources_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step
    config_node_property_integer_t *step_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives
    config_node_property_array_t *archives_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->datasources
    cJSON *datasources = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_propertiesJSON, "datasources");
    if (cJSON_IsNull(datasources)) {
        datasources = NULL;
    }
    if (datasources) { 
    datasources_local_nonprim = config_node_property_array_parseFromJSON(datasources); //nonprimitive
    }

    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->step
    cJSON *step = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_propertiesJSON, "step");
    if (cJSON_IsNull(step)) {
        step = NULL;
    }
    if (step) { 
    step_local_nonprim = config_node_property_integer_parseFromJSON(step); //nonprimitive
    }

    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->archives
    cJSON *archives = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_propertiesJSON, "archives");
    if (cJSON_IsNull(archives)) {
        archives = NULL;
    }
    if (archives) { 
    archives_local_nonprim = config_node_property_array_parseFromJSON(archives); //nonprimitive
    }

    // org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }



    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var = org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_create_internal (
        datasources ? datasources_local_nonprim : NULL,
        step ? step_local_nonprim : NULL,
        archives ? archives_local_nonprim : NULL,
        path ? path_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_local_var;
end:
    if (datasources_local_nonprim) {
        config_node_property_array_free(datasources_local_nonprim);
        datasources_local_nonprim = NULL;
    }
    if (step_local_nonprim) {
        config_node_property_integer_free(step_local_nonprim);
        step_local_nonprim = NULL;
    }
    if (archives_local_nonprim) {
        config_node_property_array_free(archives_local_nonprim);
        archives_local_nonprim = NULL;
    }
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    return NULL;

}
