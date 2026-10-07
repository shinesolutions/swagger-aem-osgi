#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_widget_impl_widget_extension_provider_impl_properties.h"



static com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_create_internal(
    config_node_property_array_t *extendable_widgets,
    config_node_property_boolean_t *widgetextensionprovider_debug
    ) {
    com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var = malloc(sizeof(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t));
    if (!com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var, 0, sizeof(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t));
    com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var->_library_owned = 1;
    com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var->extendable_widgets = extendable_widgets;
    com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var->widgetextensionprovider_debug = widgetextensionprovider_debug;
    return com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_create(
    config_node_property_array_t *extendable_widgets,
    config_node_property_boolean_t *widgetextensionprovider_debug
    ) {
    com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *result = com_day_cq_widget_impl_widget_extension_provider_impl_properties_create_internal (
        extendable_widgets,
        widgetextensionprovider_debug
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_widget_impl_widget_extension_provider_impl_properties_free(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties) {
    if(NULL == com_day_cq_widget_impl_widget_extension_provider_impl_properties){
        return ;
    }
    if(com_day_cq_widget_impl_widget_extension_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_widget_impl_widget_extension_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets) {
        config_node_property_array_free(com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets);
        com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets = NULL;
    }
    if (com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug) {
        config_node_property_boolean_free(com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug);
        com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug = NULL;
    }
    free(com_day_cq_widget_impl_widget_extension_provider_impl_properties);
}

cJSON *com_day_cq_widget_impl_widget_extension_provider_impl_properties_convertToJSON(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets
    if(com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets) {
    cJSON *extendable_widgets_local_JSON = config_node_property_array_convertToJSON(com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets);
    if(extendable_widgets_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extendable.widgets", extendable_widgets_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug
    if(com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug) {
    cJSON *widgetextensionprovider_debug_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug);
    if(widgetextensionprovider_debug_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "widgetextensionprovider.debug", widgetextensionprovider_debug_local_JSON);
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

com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_parseFromJSON(cJSON *com_day_cq_widget_impl_widget_extension_provider_impl_propertiesJSON){

    com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets
    config_node_property_array_t *extendable_widgets_local_nonprim = NULL;

    // define the local variable for com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug
    config_node_property_boolean_t *widgetextensionprovider_debug_local_nonprim = NULL;

    // com_day_cq_widget_impl_widget_extension_provider_impl_properties->extendable_widgets
    cJSON *extendable_widgets = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_widget_extension_provider_impl_propertiesJSON, "extendable.widgets");
    if (cJSON_IsNull(extendable_widgets)) {
        extendable_widgets = NULL;
    }
    if (extendable_widgets) { 
    extendable_widgets_local_nonprim = config_node_property_array_parseFromJSON(extendable_widgets); //nonprimitive
    }

    // com_day_cq_widget_impl_widget_extension_provider_impl_properties->widgetextensionprovider_debug
    cJSON *widgetextensionprovider_debug = cJSON_GetObjectItemCaseSensitive(com_day_cq_widget_impl_widget_extension_provider_impl_propertiesJSON, "widgetextensionprovider.debug");
    if (cJSON_IsNull(widgetextensionprovider_debug)) {
        widgetextensionprovider_debug = NULL;
    }
    if (widgetextensionprovider_debug) { 
    widgetextensionprovider_debug_local_nonprim = config_node_property_boolean_parseFromJSON(widgetextensionprovider_debug); //nonprimitive
    }



    com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var = com_day_cq_widget_impl_widget_extension_provider_impl_properties_create_internal (
        extendable_widgets ? extendable_widgets_local_nonprim : NULL,
        widgetextensionprovider_debug ? widgetextensionprovider_debug_local_nonprim : NULL
        );

    if (!com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_widget_impl_widget_extension_provider_impl_properties_local_var;
end:
    if (extendable_widgets_local_nonprim) {
        config_node_property_array_free(extendable_widgets_local_nonprim);
        extendable_widgets_local_nonprim = NULL;
    }
    if (widgetextensionprovider_debug_local_nonprim) {
        config_node_property_boolean_free(widgetextensionprovider_debug_local_nonprim);
        widgetextensionprovider_debug_local_nonprim = NULL;
    }
    return NULL;

}
