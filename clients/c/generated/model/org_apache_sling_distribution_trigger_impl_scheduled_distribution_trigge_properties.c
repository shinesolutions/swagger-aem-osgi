#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties.h"



static org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *path,
    config_node_property_string_t *seconds,
    config_node_property_string_t *service_name
    ) {
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var = malloc(sizeof(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t));
    if (!org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var, 0, sizeof(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t));
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var->name = name;
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var->path = path;
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var->seconds = seconds;
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var->service_name = service_name;
    return org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *path,
    config_node_property_string_t *seconds,
    config_node_property_string_t *service_name
    ) {
    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *result = org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_create_internal (
        name,
        path,
        seconds,
        service_name
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties) {
    if(NULL == org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties){
        return ;
    }
    if(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name);
        org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name = NULL;
    }
    if (org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path);
        org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path = NULL;
    }
    if (org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds);
        org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds = NULL;
    }
    if (org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name);
        org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name = NULL;
    }
    free(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties);
}

cJSON *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_convertToJSON(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name
    if(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path
    if(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds
    if(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds) {
    cJSON *seconds_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds);
    if(seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "seconds", seconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name
    if(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
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

org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_parseFromJSON(cJSON *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_propertiesJSON){

    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_t *org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds
    config_node_property_string_t *seconds_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->seconds
    cJSON *seconds = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_propertiesJSON, "seconds");
    if (cJSON_IsNull(seconds)) {
        seconds = NULL;
    }
    if (seconds) { 
    seconds_local_nonprim = config_node_property_string_parseFromJSON(seconds); //nonprimitive
    }

    // org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }



    org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var = org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_create_internal (
        name ? name_local_nonprim : NULL,
        path ? path_local_nonprim : NULL,
        seconds ? seconds_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (seconds_local_nonprim) {
        config_node_property_string_free(seconds_local_nonprim);
        seconds_local_nonprim = NULL;
    }
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    return NULL;

}
