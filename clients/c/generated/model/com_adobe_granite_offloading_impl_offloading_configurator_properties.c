#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_offloading_impl_offloading_configurator_properties.h"



static com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties_create_internal(
    config_node_property_string_t *offloading_transporter,
    config_node_property_boolean_t *offloading_cleanup_payload
    ) {
    com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var = malloc(sizeof(com_adobe_granite_offloading_impl_offloading_configurator_properties_t));
    if (!com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var, 0, sizeof(com_adobe_granite_offloading_impl_offloading_configurator_properties_t));
    com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var->_library_owned = 1;
    com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var->offloading_transporter = offloading_transporter;
    com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var->offloading_cleanup_payload = offloading_cleanup_payload;
    return com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties_create(
    config_node_property_string_t *offloading_transporter,
    config_node_property_boolean_t *offloading_cleanup_payload
    ) {
    com_adobe_granite_offloading_impl_offloading_configurator_properties_t *result = com_adobe_granite_offloading_impl_offloading_configurator_properties_create_internal (
        offloading_transporter,
        offloading_cleanup_payload
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_offloading_impl_offloading_configurator_properties_free(com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties) {
    if(NULL == com_adobe_granite_offloading_impl_offloading_configurator_properties){
        return ;
    }
    if(com_adobe_granite_offloading_impl_offloading_configurator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_offloading_impl_offloading_configurator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter) {
        config_node_property_string_free(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter);
        com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter = NULL;
    }
    if (com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload) {
        config_node_property_boolean_free(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload);
        com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload = NULL;
    }
    free(com_adobe_granite_offloading_impl_offloading_configurator_properties);
}

cJSON *com_adobe_granite_offloading_impl_offloading_configurator_properties_convertToJSON(com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter
    if(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter) {
    cJSON *offloading_transporter_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter);
    if(offloading_transporter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offloading.transporter", offloading_transporter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload
    if(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload) {
    cJSON *offloading_cleanup_payload_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload);
    if(offloading_cleanup_payload_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offloading.cleanup.payload", offloading_cleanup_payload_local_JSON);
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

com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties_parseFromJSON(cJSON *com_adobe_granite_offloading_impl_offloading_configurator_propertiesJSON){

    com_adobe_granite_offloading_impl_offloading_configurator_properties_t *com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter
    config_node_property_string_t *offloading_transporter_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload
    config_node_property_boolean_t *offloading_cleanup_payload_local_nonprim = NULL;

    // com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_transporter
    cJSON *offloading_transporter = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_offloading_configurator_propertiesJSON, "offloading.transporter");
    if (cJSON_IsNull(offloading_transporter)) {
        offloading_transporter = NULL;
    }
    if (offloading_transporter) { 
    offloading_transporter_local_nonprim = config_node_property_string_parseFromJSON(offloading_transporter); //nonprimitive
    }

    // com_adobe_granite_offloading_impl_offloading_configurator_properties->offloading_cleanup_payload
    cJSON *offloading_cleanup_payload = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_offloading_configurator_propertiesJSON, "offloading.cleanup.payload");
    if (cJSON_IsNull(offloading_cleanup_payload)) {
        offloading_cleanup_payload = NULL;
    }
    if (offloading_cleanup_payload) { 
    offloading_cleanup_payload_local_nonprim = config_node_property_boolean_parseFromJSON(offloading_cleanup_payload); //nonprimitive
    }



    com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var = com_adobe_granite_offloading_impl_offloading_configurator_properties_create_internal (
        offloading_transporter ? offloading_transporter_local_nonprim : NULL,
        offloading_cleanup_payload ? offloading_cleanup_payload_local_nonprim : NULL
        );

    if (!com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_offloading_impl_offloading_configurator_properties_local_var;
end:
    if (offloading_transporter_local_nonprim) {
        config_node_property_string_free(offloading_transporter_local_nonprim);
        offloading_transporter_local_nonprim = NULL;
    }
    if (offloading_cleanup_payload_local_nonprim) {
        config_node_property_boolean_free(offloading_cleanup_payload_local_nonprim);
        offloading_cleanup_payload_local_nonprim = NULL;
    }
    return NULL;

}
