#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_startupfilter_impl_startup_filter_impl_properties.h"



static org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_create_internal(
    config_node_property_boolean_t *active_by_default,
    config_node_property_string_t *default_message
    ) {
    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var = malloc(sizeof(org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t));
    if (!org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var, 0, sizeof(org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t));
    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var->active_by_default = active_by_default;
    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var->default_message = default_message;
    return org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_create(
    config_node_property_boolean_t *active_by_default,
    config_node_property_string_t *default_message
    ) {
    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *result = org_apache_sling_startupfilter_impl_startup_filter_impl_properties_create_internal (
        active_by_default,
        default_message
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_startupfilter_impl_startup_filter_impl_properties_free(org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties) {
    if(NULL == org_apache_sling_startupfilter_impl_startup_filter_impl_properties){
        return ;
    }
    if(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_startupfilter_impl_startup_filter_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default) {
        config_node_property_boolean_free(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default);
        org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default = NULL;
    }
    if (org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message) {
        config_node_property_string_free(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message);
        org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message = NULL;
    }
    free(org_apache_sling_startupfilter_impl_startup_filter_impl_properties);
}

cJSON *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_convertToJSON(org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default
    if(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default) {
    cJSON *active_by_default_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default);
    if(active_by_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "active.by.default", active_by_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message
    if(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message) {
    cJSON *default_message_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message);
    if(default_message_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.message", default_message_local_JSON);
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

org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_parseFromJSON(cJSON *org_apache_sling_startupfilter_impl_startup_filter_impl_propertiesJSON){

    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_t *org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default
    config_node_property_boolean_t *active_by_default_local_nonprim = NULL;

    // define the local variable for org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message
    config_node_property_string_t *default_message_local_nonprim = NULL;

    // org_apache_sling_startupfilter_impl_startup_filter_impl_properties->active_by_default
    cJSON *active_by_default = cJSON_GetObjectItemCaseSensitive(org_apache_sling_startupfilter_impl_startup_filter_impl_propertiesJSON, "active.by.default");
    if (cJSON_IsNull(active_by_default)) {
        active_by_default = NULL;
    }
    if (active_by_default) { 
    active_by_default_local_nonprim = config_node_property_boolean_parseFromJSON(active_by_default); //nonprimitive
    }

    // org_apache_sling_startupfilter_impl_startup_filter_impl_properties->default_message
    cJSON *default_message = cJSON_GetObjectItemCaseSensitive(org_apache_sling_startupfilter_impl_startup_filter_impl_propertiesJSON, "default.message");
    if (cJSON_IsNull(default_message)) {
        default_message = NULL;
    }
    if (default_message) { 
    default_message_local_nonprim = config_node_property_string_parseFromJSON(default_message); //nonprimitive
    }



    org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var = org_apache_sling_startupfilter_impl_startup_filter_impl_properties_create_internal (
        active_by_default ? active_by_default_local_nonprim : NULL,
        default_message ? default_message_local_nonprim : NULL
        );

    if (!org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_startupfilter_impl_startup_filter_impl_properties_local_var;
end:
    if (active_by_default_local_nonprim) {
        config_node_property_boolean_free(active_by_default_local_nonprim);
        active_by_default_local_nonprim = NULL;
    }
    if (default_message_local_nonprim) {
        config_node_property_string_free(default_message_local_nonprim);
        default_message_local_nonprim = NULL;
    }
    return NULL;

}
