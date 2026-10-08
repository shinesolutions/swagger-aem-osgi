#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adaptive_form_and_interactive_communication_web_channel_theme_configur_properties.h"



static adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_create_internal(
    config_node_property_array_t *font_list
    ) {
    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var = malloc(sizeof(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t));
    if (!adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var) {
        return NULL;
    }
    memset(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var, 0, sizeof(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t));
    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var->_library_owned = 1;
    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var->font_list = font_list;
    return adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var;
}

__attribute__((deprecated)) adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_create(
    config_node_property_array_t *font_list
    ) {
    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *result = adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_create_internal (
        font_list
        );
    if (!result) {
    }
    return result;
}

void adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_free(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties) {
    if(NULL == adaptive_form_and_interactive_communication_web_channel_theme_configur_properties){
        return ;
    }
    if(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list) {
        config_node_property_array_free(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list);
        adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list = NULL;
    }
    free(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties);
}

cJSON *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_convertToJSON(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties) {
    cJSON *item = cJSON_CreateObject();

    // adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list
    if(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list) {
    cJSON *font_list_local_JSON = config_node_property_array_convertToJSON(adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list);
    if(font_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fontList", font_list_local_JSON);
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

adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_parseFromJSON(cJSON *adaptive_form_and_interactive_communication_web_channel_theme_configur_propertiesJSON){

    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_t *adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list
    config_node_property_array_t *font_list_local_nonprim = NULL;

    // adaptive_form_and_interactive_communication_web_channel_theme_configur_properties->font_list
    cJSON *font_list = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_theme_configur_propertiesJSON, "fontList");
    if (cJSON_IsNull(font_list)) {
        font_list = NULL;
    }
    if (font_list) { 
    font_list_local_nonprim = config_node_property_array_parseFromJSON(font_list); //nonprimitive
    }



    adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var = adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_create_internal (
        font_list ? font_list_local_nonprim : NULL
        );

    if (!adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var) {
        goto end;
    }

    return adaptive_form_and_interactive_communication_web_channel_theme_configur_properties_local_var;
end:
    if (font_list_local_nonprim) {
        config_node_property_array_free(font_list_local_nonprim);
        font_list_local_nonprim = NULL;
    }
    return NULL;

}
