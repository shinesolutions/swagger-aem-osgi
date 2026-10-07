#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties.h"



static org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_create_internal(
    config_node_property_integer_t *felix_memoryusage_dump_threshold,
    config_node_property_integer_t *felix_memoryusage_dump_interval,
    config_node_property_string_t *felix_memoryusage_dump_location
    ) {
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var = malloc(sizeof(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t));
    if (!org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var, 0, sizeof(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t));
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var->_library_owned = 1;
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var->felix_memoryusage_dump_threshold = felix_memoryusage_dump_threshold;
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var->felix_memoryusage_dump_interval = felix_memoryusage_dump_interval;
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var->felix_memoryusage_dump_location = felix_memoryusage_dump_location;
    return org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_create(
    config_node_property_integer_t *felix_memoryusage_dump_threshold,
    config_node_property_integer_t *felix_memoryusage_dump_interval,
    config_node_property_string_t *felix_memoryusage_dump_location
    ) {
    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *result = org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_create_internal (
        felix_memoryusage_dump_threshold,
        felix_memoryusage_dump_interval,
        felix_memoryusage_dump_location
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_free(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties) {
    if(NULL == org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties){
        return ;
    }
    if(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold) {
        config_node_property_integer_free(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold);
        org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold = NULL;
    }
    if (org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval) {
        config_node_property_integer_free(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval);
        org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval = NULL;
    }
    if (org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location) {
        config_node_property_string_free(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location);
        org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location = NULL;
    }
    free(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties);
}

cJSON *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_convertToJSON(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold
    if(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold) {
    cJSON *felix_memoryusage_dump_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold);
    if(felix_memoryusage_dump_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "felix.memoryusage.dump.threshold", felix_memoryusage_dump_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval
    if(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval) {
    cJSON *felix_memoryusage_dump_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval);
    if(felix_memoryusage_dump_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "felix.memoryusage.dump.interval", felix_memoryusage_dump_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location
    if(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location) {
    cJSON *felix_memoryusage_dump_location_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location);
    if(felix_memoryusage_dump_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "felix.memoryusage.dump.location", felix_memoryusage_dump_location_local_JSON);
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

org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_parseFromJSON(cJSON *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_propertiesJSON){

    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_t *org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var = NULL;

    // define the local variable for org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold
    config_node_property_integer_t *felix_memoryusage_dump_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval
    config_node_property_integer_t *felix_memoryusage_dump_interval_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location
    config_node_property_string_t *felix_memoryusage_dump_location_local_nonprim = NULL;

    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_threshold
    cJSON *felix_memoryusage_dump_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_propertiesJSON, "felix.memoryusage.dump.threshold");
    if (cJSON_IsNull(felix_memoryusage_dump_threshold)) {
        felix_memoryusage_dump_threshold = NULL;
    }
    if (felix_memoryusage_dump_threshold) { 
    felix_memoryusage_dump_threshold_local_nonprim = config_node_property_integer_parseFromJSON(felix_memoryusage_dump_threshold); //nonprimitive
    }

    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_interval
    cJSON *felix_memoryusage_dump_interval = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_propertiesJSON, "felix.memoryusage.dump.interval");
    if (cJSON_IsNull(felix_memoryusage_dump_interval)) {
        felix_memoryusage_dump_interval = NULL;
    }
    if (felix_memoryusage_dump_interval) { 
    felix_memoryusage_dump_interval_local_nonprim = config_node_property_integer_parseFromJSON(felix_memoryusage_dump_interval); //nonprimitive
    }

    // org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties->felix_memoryusage_dump_location
    cJSON *felix_memoryusage_dump_location = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_propertiesJSON, "felix.memoryusage.dump.location");
    if (cJSON_IsNull(felix_memoryusage_dump_location)) {
        felix_memoryusage_dump_location = NULL;
    }
    if (felix_memoryusage_dump_location) { 
    felix_memoryusage_dump_location_local_nonprim = config_node_property_string_parseFromJSON(felix_memoryusage_dump_location); //nonprimitive
    }



    org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var = org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_create_internal (
        felix_memoryusage_dump_threshold ? felix_memoryusage_dump_threshold_local_nonprim : NULL,
        felix_memoryusage_dump_interval ? felix_memoryusage_dump_interval_local_nonprim : NULL,
        felix_memoryusage_dump_location ? felix_memoryusage_dump_location_local_nonprim : NULL
        );

    if (!org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var) {
        goto end;
    }

    return org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties_local_var;
end:
    if (felix_memoryusage_dump_threshold_local_nonprim) {
        config_node_property_integer_free(felix_memoryusage_dump_threshold_local_nonprim);
        felix_memoryusage_dump_threshold_local_nonprim = NULL;
    }
    if (felix_memoryusage_dump_interval_local_nonprim) {
        config_node_property_integer_free(felix_memoryusage_dump_interval_local_nonprim);
        felix_memoryusage_dump_interval_local_nonprim = NULL;
    }
    if (felix_memoryusage_dump_location_local_nonprim) {
        config_node_property_string_free(felix_memoryusage_dump_location_local_nonprim);
        felix_memoryusage_dump_location_local_nonprim = NULL;
    }
    return NULL;

}
