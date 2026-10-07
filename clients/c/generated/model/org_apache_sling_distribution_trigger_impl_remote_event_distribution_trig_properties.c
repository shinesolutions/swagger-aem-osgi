#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties.h"



static org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *endpoint,
    config_node_property_string_t *transport_secret_provider_target
    ) {
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var = malloc(sizeof(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t));
    if (!org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var, 0, sizeof(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t));
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var->name = name;
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var->endpoint = endpoint;
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var->transport_secret_provider_target = transport_secret_provider_target;
    return org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *endpoint,
    config_node_property_string_t *transport_secret_provider_target
    ) {
    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *result = org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_create_internal (
        name,
        endpoint,
        transport_secret_provider_target
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_free(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties) {
    if(NULL == org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties){
        return ;
    }
    if(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name);
        org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name = NULL;
    }
    if (org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint);
        org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint = NULL;
    }
    if (org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target) {
        config_node_property_string_free(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target);
        org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target = NULL;
    }
    free(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties);
}

cJSON *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_convertToJSON(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name
    if(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint
    if(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint) {
    cJSON *endpoint_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint);
    if(endpoint_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "endpoint", endpoint_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target
    if(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target) {
    cJSON *transport_secret_provider_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target);
    if(transport_secret_provider_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "transportSecretProvider.target", transport_secret_provider_target_local_JSON);
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

org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_parseFromJSON(cJSON *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_propertiesJSON){

    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_t *org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint
    config_node_property_string_t *endpoint_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target
    config_node_property_string_t *transport_secret_provider_target_local_nonprim = NULL;

    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->endpoint
    cJSON *endpoint = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_propertiesJSON, "endpoint");
    if (cJSON_IsNull(endpoint)) {
        endpoint = NULL;
    }
    if (endpoint) { 
    endpoint_local_nonprim = config_node_property_string_parseFromJSON(endpoint); //nonprimitive
    }

    // org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties->transport_secret_provider_target
    cJSON *transport_secret_provider_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_propertiesJSON, "transportSecretProvider.target");
    if (cJSON_IsNull(transport_secret_provider_target)) {
        transport_secret_provider_target = NULL;
    }
    if (transport_secret_provider_target) { 
    transport_secret_provider_target_local_nonprim = config_node_property_string_parseFromJSON(transport_secret_provider_target); //nonprimitive
    }



    org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var = org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_create_internal (
        name ? name_local_nonprim : NULL,
        endpoint ? endpoint_local_nonprim : NULL,
        transport_secret_provider_target ? transport_secret_provider_target_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (endpoint_local_nonprim) {
        config_node_property_string_free(endpoint_local_nonprim);
        endpoint_local_nonprim = NULL;
    }
    if (transport_secret_provider_target_local_nonprim) {
        config_node_property_string_free(transport_secret_provider_target_local_nonprim);
        transport_secret_provider_target_local_nonprim = NULL;
    }
    return NULL;

}
