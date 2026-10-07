#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties.h"



static com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_array_t *fontmgr_system_font_dir,
    config_node_property_string_t *fontmgr_adobe_font_dir,
    config_node_property_string_t *fontmgr_customer_font_dir
    ) {
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t));
    if (!com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var, 0, sizeof(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t));
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var->event_filter = event_filter;
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var->fontmgr_system_font_dir = fontmgr_system_font_dir;
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var->fontmgr_adobe_font_dir = fontmgr_adobe_font_dir;
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var->fontmgr_customer_font_dir = fontmgr_customer_font_dir;
    return com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_array_t *fontmgr_system_font_dir,
    config_node_property_string_t *fontmgr_adobe_font_dir,
    config_node_property_string_t *fontmgr_customer_font_dir
    ) {
    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *result = com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_create_internal (
        event_filter,
        fontmgr_system_font_dir,
        fontmgr_adobe_font_dir,
        fontmgr_customer_font_dir
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties) {
    if(NULL == com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties){
        return ;
    }
    if(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter) {
        config_node_property_string_free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter);
        com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter = NULL;
    }
    if (com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir) {
        config_node_property_array_free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir);
        com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir = NULL;
    }
    if (com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir) {
        config_node_property_string_free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir);
        com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir = NULL;
    }
    if (com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir) {
        config_node_property_string_free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir);
        com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir = NULL;
    }
    free(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties);
}

cJSON *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_convertToJSON(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter
    if(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir
    if(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir) {
    cJSON *fontmgr_system_font_dir_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir);
    if(fontmgr_system_font_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fontmgr.system.font.dir", fontmgr_system_font_dir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir
    if(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir) {
    cJSON *fontmgr_adobe_font_dir_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir);
    if(fontmgr_adobe_font_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fontmgr.adobe.font.dir", fontmgr_adobe_font_dir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir
    if(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir) {
    cJSON *fontmgr_customer_font_dir_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir);
    if(fontmgr_customer_font_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fontmgr.customer.font.dir", fontmgr_customer_font_dir_local_JSON);
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

com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_propertiesJSON){

    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_t *com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir
    config_node_property_array_t *fontmgr_system_font_dir_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir
    config_node_property_string_t *fontmgr_adobe_font_dir_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir
    config_node_property_string_t *fontmgr_customer_font_dir_local_nonprim = NULL;

    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_system_font_dir
    cJSON *fontmgr_system_font_dir = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_propertiesJSON, "fontmgr.system.font.dir");
    if (cJSON_IsNull(fontmgr_system_font_dir)) {
        fontmgr_system_font_dir = NULL;
    }
    if (fontmgr_system_font_dir) { 
    fontmgr_system_font_dir_local_nonprim = config_node_property_array_parseFromJSON(fontmgr_system_font_dir); //nonprimitive
    }

    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_adobe_font_dir
    cJSON *fontmgr_adobe_font_dir = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_propertiesJSON, "fontmgr.adobe.font.dir");
    if (cJSON_IsNull(fontmgr_adobe_font_dir)) {
        fontmgr_adobe_font_dir = NULL;
    }
    if (fontmgr_adobe_font_dir) { 
    fontmgr_adobe_font_dir_local_nonprim = config_node_property_string_parseFromJSON(fontmgr_adobe_font_dir); //nonprimitive
    }

    // com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties->fontmgr_customer_font_dir
    cJSON *fontmgr_customer_font_dir = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_propertiesJSON, "fontmgr.customer.font.dir");
    if (cJSON_IsNull(fontmgr_customer_font_dir)) {
        fontmgr_customer_font_dir = NULL;
    }
    if (fontmgr_customer_font_dir) { 
    fontmgr_customer_font_dir_local_nonprim = config_node_property_string_parseFromJSON(fontmgr_customer_font_dir); //nonprimitive
    }



    com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var = com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        fontmgr_system_font_dir ? fontmgr_system_font_dir_local_nonprim : NULL,
        fontmgr_adobe_font_dir ? fontmgr_adobe_font_dir_local_nonprim : NULL,
        fontmgr_customer_font_dir ? fontmgr_customer_font_dir_local_nonprim : NULL
        );

    if (!com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (fontmgr_system_font_dir_local_nonprim) {
        config_node_property_array_free(fontmgr_system_font_dir_local_nonprim);
        fontmgr_system_font_dir_local_nonprim = NULL;
    }
    if (fontmgr_adobe_font_dir_local_nonprim) {
        config_node_property_string_free(fontmgr_adobe_font_dir_local_nonprim);
        fontmgr_adobe_font_dir_local_nonprim = NULL;
    }
    if (fontmgr_customer_font_dir_local_nonprim) {
        config_node_property_string_free(fontmgr_customer_font_dir_local_nonprim);
        fontmgr_customer_font_dir_local_nonprim = NULL;
    }
    return NULL;

}
