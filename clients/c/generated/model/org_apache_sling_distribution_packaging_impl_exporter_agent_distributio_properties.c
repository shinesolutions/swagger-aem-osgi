#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties.h"



static org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *queue,
    config_node_property_boolean_t *drop_invalid_items,
    config_node_property_string_t *agent_target
    ) {
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var = malloc(sizeof(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t));
    if (!org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var, 0, sizeof(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t));
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var->name = name;
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var->queue = queue;
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var->drop_invalid_items = drop_invalid_items;
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var->agent_target = agent_target;
    return org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *queue,
    config_node_property_boolean_t *drop_invalid_items,
    config_node_property_string_t *agent_target
    ) {
    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *result = org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_create_internal (
        name,
        queue,
        drop_invalid_items,
        agent_target
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties) {
    if(NULL == org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties){
        return ;
    }
    if(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name);
        org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name = NULL;
    }
    if (org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue) {
        config_node_property_string_free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue);
        org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue = NULL;
    }
    if (org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items) {
        config_node_property_boolean_free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items);
        org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items = NULL;
    }
    if (org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target) {
        config_node_property_string_free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target);
        org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target = NULL;
    }
    free(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties);
}

cJSON *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_convertToJSON(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name
    if(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue
    if(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue) {
    cJSON *queue_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue);
    if(queue_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue", queue_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items
    if(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items) {
    cJSON *drop_invalid_items_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items);
    if(drop_invalid_items_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "drop.invalid.items", drop_invalid_items_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target
    if(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target) {
    cJSON *agent_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target);
    if(agent_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agent.target", agent_target_local_JSON);
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

org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_parseFromJSON(cJSON *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_propertiesJSON){

    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_t *org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue
    config_node_property_string_t *queue_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items
    config_node_property_boolean_t *drop_invalid_items_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target
    config_node_property_string_t *agent_target_local_nonprim = NULL;

    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->queue
    cJSON *queue = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_propertiesJSON, "queue");
    if (cJSON_IsNull(queue)) {
        queue = NULL;
    }
    if (queue) { 
    queue_local_nonprim = config_node_property_string_parseFromJSON(queue); //nonprimitive
    }

    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->drop_invalid_items
    cJSON *drop_invalid_items = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_propertiesJSON, "drop.invalid.items");
    if (cJSON_IsNull(drop_invalid_items)) {
        drop_invalid_items = NULL;
    }
    if (drop_invalid_items) { 
    drop_invalid_items_local_nonprim = config_node_property_boolean_parseFromJSON(drop_invalid_items); //nonprimitive
    }

    // org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties->agent_target
    cJSON *agent_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_propertiesJSON, "agent.target");
    if (cJSON_IsNull(agent_target)) {
        agent_target = NULL;
    }
    if (agent_target) { 
    agent_target_local_nonprim = config_node_property_string_parseFromJSON(agent_target); //nonprimitive
    }



    org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var = org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_create_internal (
        name ? name_local_nonprim : NULL,
        queue ? queue_local_nonprim : NULL,
        drop_invalid_items ? drop_invalid_items_local_nonprim : NULL,
        agent_target ? agent_target_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (queue_local_nonprim) {
        config_node_property_string_free(queue_local_nonprim);
        queue_local_nonprim = NULL;
    }
    if (drop_invalid_items_local_nonprim) {
        config_node_property_boolean_free(drop_invalid_items_local_nonprim);
        drop_invalid_items_local_nonprim = NULL;
    }
    if (agent_target_local_nonprim) {
        config_node_property_string_free(agent_target_local_nonprim);
        agent_target_local_nonprim = NULL;
    }
    return NULL;

}
