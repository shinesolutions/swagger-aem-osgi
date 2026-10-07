#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_contexthub_impl_context_hub_impl_properties.h"



static com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_create_internal(
    config_node_property_boolean_t *com_adobe_granite_contexthub_silent_mode,
    config_node_property_boolean_t *com_adobe_granite_contexthub_show_ui
    ) {
    com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var = malloc(sizeof(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t));
    if (!com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var, 0, sizeof(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t));
    com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var->com_adobe_granite_contexthub_silent_mode = com_adobe_granite_contexthub_silent_mode;
    com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var->com_adobe_granite_contexthub_show_ui = com_adobe_granite_contexthub_show_ui;
    return com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_create(
    config_node_property_boolean_t *com_adobe_granite_contexthub_silent_mode,
    config_node_property_boolean_t *com_adobe_granite_contexthub_show_ui
    ) {
    com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *result = com_adobe_granite_contexthub_impl_context_hub_impl_properties_create_internal (
        com_adobe_granite_contexthub_silent_mode,
        com_adobe_granite_contexthub_show_ui
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_contexthub_impl_context_hub_impl_properties_free(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties) {
    if(NULL == com_adobe_granite_contexthub_impl_context_hub_impl_properties){
        return ;
    }
    if(com_adobe_granite_contexthub_impl_context_hub_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_contexthub_impl_context_hub_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode) {
        config_node_property_boolean_free(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode);
        com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode = NULL;
    }
    if (com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui) {
        config_node_property_boolean_free(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui);
        com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui = NULL;
    }
    free(com_adobe_granite_contexthub_impl_context_hub_impl_properties);
}

cJSON *com_adobe_granite_contexthub_impl_context_hub_impl_properties_convertToJSON(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode
    if(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode) {
    cJSON *com_adobe_granite_contexthub_silent_mode_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode);
    if(com_adobe_granite_contexthub_silent_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.contexthub.silent_mode", com_adobe_granite_contexthub_silent_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui
    if(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui) {
    cJSON *com_adobe_granite_contexthub_show_ui_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui);
    if(com_adobe_granite_contexthub_show_ui_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.contexthub.show_ui", com_adobe_granite_contexthub_show_ui_local_JSON);
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

com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_parseFromJSON(cJSON *com_adobe_granite_contexthub_impl_context_hub_impl_propertiesJSON){

    com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode
    config_node_property_boolean_t *com_adobe_granite_contexthub_silent_mode_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui
    config_node_property_boolean_t *com_adobe_granite_contexthub_show_ui_local_nonprim = NULL;

    // com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_silent_mode
    cJSON *com_adobe_granite_contexthub_silent_mode = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_contexthub_impl_context_hub_impl_propertiesJSON, "com.adobe.granite.contexthub.silent_mode");
    if (cJSON_IsNull(com_adobe_granite_contexthub_silent_mode)) {
        com_adobe_granite_contexthub_silent_mode = NULL;
    }
    if (com_adobe_granite_contexthub_silent_mode) { 
    com_adobe_granite_contexthub_silent_mode_local_nonprim = config_node_property_boolean_parseFromJSON(com_adobe_granite_contexthub_silent_mode); //nonprimitive
    }

    // com_adobe_granite_contexthub_impl_context_hub_impl_properties->com_adobe_granite_contexthub_show_ui
    cJSON *com_adobe_granite_contexthub_show_ui = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_contexthub_impl_context_hub_impl_propertiesJSON, "com.adobe.granite.contexthub.show_ui");
    if (cJSON_IsNull(com_adobe_granite_contexthub_show_ui)) {
        com_adobe_granite_contexthub_show_ui = NULL;
    }
    if (com_adobe_granite_contexthub_show_ui) { 
    com_adobe_granite_contexthub_show_ui_local_nonprim = config_node_property_boolean_parseFromJSON(com_adobe_granite_contexthub_show_ui); //nonprimitive
    }



    com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var = com_adobe_granite_contexthub_impl_context_hub_impl_properties_create_internal (
        com_adobe_granite_contexthub_silent_mode ? com_adobe_granite_contexthub_silent_mode_local_nonprim : NULL,
        com_adobe_granite_contexthub_show_ui ? com_adobe_granite_contexthub_show_ui_local_nonprim : NULL
        );

    if (!com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_contexthub_impl_context_hub_impl_properties_local_var;
end:
    if (com_adobe_granite_contexthub_silent_mode_local_nonprim) {
        config_node_property_boolean_free(com_adobe_granite_contexthub_silent_mode_local_nonprim);
        com_adobe_granite_contexthub_silent_mode_local_nonprim = NULL;
    }
    if (com_adobe_granite_contexthub_show_ui_local_nonprim) {
        config_node_property_boolean_free(com_adobe_granite_contexthub_show_ui_local_nonprim);
        com_adobe_granite_contexthub_show_ui_local_nonprim = NULL;
    }
    return NULL;

}
