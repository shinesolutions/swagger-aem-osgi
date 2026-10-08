#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties.h"



static com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_create_internal(
    config_node_property_string_t *default_transport_agent_to_worker_prefix,
    config_node_property_string_t *default_transport_agent_to_master_prefix,
    config_node_property_string_t *default_transport_input_package,
    config_node_property_string_t *default_transport_output_package,
    config_node_property_boolean_t *default_transport_replication_synchronous,
    config_node_property_boolean_t *default_transport_contentpackage,
    config_node_property_boolean_t *offloading_transporter_default_enabled
    ) {
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var = malloc(sizeof(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t));
    if (!com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var, 0, sizeof(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t));
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->_library_owned = 1;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_agent_to_worker_prefix = default_transport_agent_to_worker_prefix;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_agent_to_master_prefix = default_transport_agent_to_master_prefix;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_input_package = default_transport_input_package;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_output_package = default_transport_output_package;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_replication_synchronous = default_transport_replication_synchronous;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->default_transport_contentpackage = default_transport_contentpackage;
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var->offloading_transporter_default_enabled = offloading_transporter_default_enabled;
    return com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_create(
    config_node_property_string_t *default_transport_agent_to_worker_prefix,
    config_node_property_string_t *default_transport_agent_to_master_prefix,
    config_node_property_string_t *default_transport_input_package,
    config_node_property_string_t *default_transport_output_package,
    config_node_property_boolean_t *default_transport_replication_synchronous,
    config_node_property_boolean_t *default_transport_contentpackage,
    config_node_property_boolean_t *offloading_transporter_default_enabled
    ) {
    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *result = com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_create_internal (
        default_transport_agent_to_worker_prefix,
        default_transport_agent_to_master_prefix,
        default_transport_input_package,
        default_transport_output_package,
        default_transport_replication_synchronous,
        default_transport_contentpackage,
        offloading_transporter_default_enabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties) {
    if(NULL == com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties){
        return ;
    }
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix) {
        config_node_property_string_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix) {
        config_node_property_string_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package) {
        config_node_property_string_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package) {
        config_node_property_string_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous) {
        config_node_property_boolean_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage) {
        config_node_property_boolean_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage = NULL;
    }
    if (com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled) {
        config_node_property_boolean_free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled);
        com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled = NULL;
    }
    free(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties);
}

cJSON *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix) {
    cJSON *default_transport_agent_to_worker_prefix_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix);
    if(default_transport_agent_to_worker_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.agent-to-worker.prefix", default_transport_agent_to_worker_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix) {
    cJSON *default_transport_agent_to_master_prefix_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix);
    if(default_transport_agent_to_master_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.agent-to-master.prefix", default_transport_agent_to_master_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package) {
    cJSON *default_transport_input_package_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package);
    if(default_transport_input_package_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.input.package", default_transport_input_package_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package) {
    cJSON *default_transport_output_package_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package);
    if(default_transport_output_package_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.output.package", default_transport_output_package_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous) {
    cJSON *default_transport_replication_synchronous_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous);
    if(default_transport_replication_synchronous_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.replication.synchronous", default_transport_replication_synchronous_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage) {
    cJSON *default_transport_contentpackage_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage);
    if(default_transport_contentpackage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.transport.contentpackage", default_transport_contentpackage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled
    if(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled) {
    cJSON *offloading_transporter_default_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled);
    if(offloading_transporter_default_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offloading.transporter.default.enabled", offloading_transporter_default_enabled_local_JSON);
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

com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_parseFromJSON(cJSON *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON){

    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix
    config_node_property_string_t *default_transport_agent_to_worker_prefix_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix
    config_node_property_string_t *default_transport_agent_to_master_prefix_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package
    config_node_property_string_t *default_transport_input_package_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package
    config_node_property_string_t *default_transport_output_package_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous
    config_node_property_boolean_t *default_transport_replication_synchronous_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage
    config_node_property_boolean_t *default_transport_contentpackage_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled
    config_node_property_boolean_t *offloading_transporter_default_enabled_local_nonprim = NULL;

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_worker_prefix
    cJSON *default_transport_agent_to_worker_prefix = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.agent-to-worker.prefix");
    if (cJSON_IsNull(default_transport_agent_to_worker_prefix)) {
        default_transport_agent_to_worker_prefix = NULL;
    }
    if (default_transport_agent_to_worker_prefix) { 
    default_transport_agent_to_worker_prefix_local_nonprim = config_node_property_string_parseFromJSON(default_transport_agent_to_worker_prefix); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_agent_to_master_prefix
    cJSON *default_transport_agent_to_master_prefix = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.agent-to-master.prefix");
    if (cJSON_IsNull(default_transport_agent_to_master_prefix)) {
        default_transport_agent_to_master_prefix = NULL;
    }
    if (default_transport_agent_to_master_prefix) { 
    default_transport_agent_to_master_prefix_local_nonprim = config_node_property_string_parseFromJSON(default_transport_agent_to_master_prefix); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_input_package
    cJSON *default_transport_input_package = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.input.package");
    if (cJSON_IsNull(default_transport_input_package)) {
        default_transport_input_package = NULL;
    }
    if (default_transport_input_package) { 
    default_transport_input_package_local_nonprim = config_node_property_string_parseFromJSON(default_transport_input_package); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_output_package
    cJSON *default_transport_output_package = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.output.package");
    if (cJSON_IsNull(default_transport_output_package)) {
        default_transport_output_package = NULL;
    }
    if (default_transport_output_package) { 
    default_transport_output_package_local_nonprim = config_node_property_string_parseFromJSON(default_transport_output_package); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_replication_synchronous
    cJSON *default_transport_replication_synchronous = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.replication.synchronous");
    if (cJSON_IsNull(default_transport_replication_synchronous)) {
        default_transport_replication_synchronous = NULL;
    }
    if (default_transport_replication_synchronous) { 
    default_transport_replication_synchronous_local_nonprim = config_node_property_boolean_parseFromJSON(default_transport_replication_synchronous); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->default_transport_contentpackage
    cJSON *default_transport_contentpackage = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "default.transport.contentpackage");
    if (cJSON_IsNull(default_transport_contentpackage)) {
        default_transport_contentpackage = NULL;
    }
    if (default_transport_contentpackage) { 
    default_transport_contentpackage_local_nonprim = config_node_property_boolean_parseFromJSON(default_transport_contentpackage); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties->offloading_transporter_default_enabled
    cJSON *offloading_transporter_default_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_propertiesJSON, "offloading.transporter.default.enabled");
    if (cJSON_IsNull(offloading_transporter_default_enabled)) {
        offloading_transporter_default_enabled = NULL;
    }
    if (offloading_transporter_default_enabled) { 
    offloading_transporter_default_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(offloading_transporter_default_enabled); //nonprimitive
    }



    com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var = com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_create_internal (
        default_transport_agent_to_worker_prefix ? default_transport_agent_to_worker_prefix_local_nonprim : NULL,
        default_transport_agent_to_master_prefix ? default_transport_agent_to_master_prefix_local_nonprim : NULL,
        default_transport_input_package ? default_transport_input_package_local_nonprim : NULL,
        default_transport_output_package ? default_transport_output_package_local_nonprim : NULL,
        default_transport_replication_synchronous ? default_transport_replication_synchronous_local_nonprim : NULL,
        default_transport_contentpackage ? default_transport_contentpackage_local_nonprim : NULL,
        offloading_transporter_default_enabled ? offloading_transporter_default_enabled_local_nonprim : NULL
        );

    if (!com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_local_var;
end:
    if (default_transport_agent_to_worker_prefix_local_nonprim) {
        config_node_property_string_free(default_transport_agent_to_worker_prefix_local_nonprim);
        default_transport_agent_to_worker_prefix_local_nonprim = NULL;
    }
    if (default_transport_agent_to_master_prefix_local_nonprim) {
        config_node_property_string_free(default_transport_agent_to_master_prefix_local_nonprim);
        default_transport_agent_to_master_prefix_local_nonprim = NULL;
    }
    if (default_transport_input_package_local_nonprim) {
        config_node_property_string_free(default_transport_input_package_local_nonprim);
        default_transport_input_package_local_nonprim = NULL;
    }
    if (default_transport_output_package_local_nonprim) {
        config_node_property_string_free(default_transport_output_package_local_nonprim);
        default_transport_output_package_local_nonprim = NULL;
    }
    if (default_transport_replication_synchronous_local_nonprim) {
        config_node_property_boolean_free(default_transport_replication_synchronous_local_nonprim);
        default_transport_replication_synchronous_local_nonprim = NULL;
    }
    if (default_transport_contentpackage_local_nonprim) {
        config_node_property_boolean_free(default_transport_contentpackage_local_nonprim);
        default_transport_contentpackage_local_nonprim = NULL;
    }
    if (offloading_transporter_default_enabled_local_nonprim) {
        config_node_property_boolean_free(offloading_transporter_default_enabled_local_nonprim);
        offloading_transporter_default_enabled_local_nonprim = NULL;
    }
    return NULL;

}
