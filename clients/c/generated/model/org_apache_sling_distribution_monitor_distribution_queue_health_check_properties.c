#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_monitor_distribution_queue_health_check_properties.h"



static org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_create_internal(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name,
    config_node_property_integer_t *number_of_retries_allowed
    ) {
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var = malloc(sizeof(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t));
    if (!org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var, 0, sizeof(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t));
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var->hc_name = hc_name;
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var->hc_tags = hc_tags;
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var->hc_mbean_name = hc_mbean_name;
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var->number_of_retries_allowed = number_of_retries_allowed;
    return org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_create(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name,
    config_node_property_integer_t *number_of_retries_allowed
    ) {
    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *result = org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_create_internal (
        hc_name,
        hc_tags,
        hc_mbean_name,
        number_of_retries_allowed
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties) {
    if(NULL == org_apache_sling_distribution_monitor_distribution_queue_health_check_properties){
        return ;
    }
    if(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name) {
        config_node_property_string_free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name);
        org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name = NULL;
    }
    if (org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags) {
        config_node_property_array_free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags);
        org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags = NULL;
    }
    if (org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name) {
        config_node_property_string_free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name);
        org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name = NULL;
    }
    if (org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed) {
        config_node_property_integer_free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed);
        org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed = NULL;
    }
    free(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties);
}

cJSON *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_convertToJSON(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name
    if(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name) {
    cJSON *hc_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name);
    if(hc_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.name", hc_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags
    if(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name
    if(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name) {
    cJSON *hc_mbean_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name);
    if(hc_mbean_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.mbean.name", hc_mbean_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed
    if(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed) {
    cJSON *number_of_retries_allowed_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed);
    if(number_of_retries_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "numberOfRetriesAllowed", number_of_retries_allowed_local_JSON);
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

org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_parseFromJSON(cJSON *org_apache_sling_distribution_monitor_distribution_queue_health_check_propertiesJSON){

    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_t *org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name
    config_node_property_string_t *hc_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name
    config_node_property_string_t *hc_mbean_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed
    config_node_property_integer_t *number_of_retries_allowed_local_nonprim = NULL;

    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_name
    cJSON *hc_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_monitor_distribution_queue_health_check_propertiesJSON, "hc.name");
    if (cJSON_IsNull(hc_name)) {
        hc_name = NULL;
    }
    if (hc_name) { 
    hc_name_local_nonprim = config_node_property_string_parseFromJSON(hc_name); //nonprimitive
    }

    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_monitor_distribution_queue_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->hc_mbean_name
    cJSON *hc_mbean_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_monitor_distribution_queue_health_check_propertiesJSON, "hc.mbean.name");
    if (cJSON_IsNull(hc_mbean_name)) {
        hc_mbean_name = NULL;
    }
    if (hc_mbean_name) { 
    hc_mbean_name_local_nonprim = config_node_property_string_parseFromJSON(hc_mbean_name); //nonprimitive
    }

    // org_apache_sling_distribution_monitor_distribution_queue_health_check_properties->number_of_retries_allowed
    cJSON *number_of_retries_allowed = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_monitor_distribution_queue_health_check_propertiesJSON, "numberOfRetriesAllowed");
    if (cJSON_IsNull(number_of_retries_allowed)) {
        number_of_retries_allowed = NULL;
    }
    if (number_of_retries_allowed) { 
    number_of_retries_allowed_local_nonprim = config_node_property_integer_parseFromJSON(number_of_retries_allowed); //nonprimitive
    }



    org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var = org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_create_internal (
        hc_name ? hc_name_local_nonprim : NULL,
        hc_tags ? hc_tags_local_nonprim : NULL,
        hc_mbean_name ? hc_mbean_name_local_nonprim : NULL,
        number_of_retries_allowed ? number_of_retries_allowed_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_local_var;
end:
    if (hc_name_local_nonprim) {
        config_node_property_string_free(hc_name_local_nonprim);
        hc_name_local_nonprim = NULL;
    }
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (hc_mbean_name_local_nonprim) {
        config_node_property_string_free(hc_mbean_name_local_nonprim);
        hc_mbean_name_local_nonprim = NULL;
    }
    if (number_of_retries_allowed_local_nonprim) {
        config_node_property_integer_free(number_of_retries_allowed_local_nonprim);
        number_of_retries_allowed_local_nonprim = NULL;
    }
    return NULL;

}
