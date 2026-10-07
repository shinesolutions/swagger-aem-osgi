#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_extwidget_servlets_image_sprite_servlet_properties.h"



static com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_create_internal(
    config_node_property_integer_t *max_width,
    config_node_property_integer_t *max_height
    ) {
    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var = malloc(sizeof(com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t));
    if (!com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var, 0, sizeof(com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t));
    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var->max_width = max_width;
    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var->max_height = max_height;
    return com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_create(
    config_node_property_integer_t *max_width,
    config_node_property_integer_t *max_height
    ) {
    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *result = com_day_cq_extwidget_servlets_image_sprite_servlet_properties_create_internal (
        max_width,
        max_height
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_extwidget_servlets_image_sprite_servlet_properties_free(com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties) {
    if(NULL == com_day_cq_extwidget_servlets_image_sprite_servlet_properties){
        return ;
    }
    if(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_extwidget_servlets_image_sprite_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width) {
        config_node_property_integer_free(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width);
        com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width = NULL;
    }
    if (com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height) {
        config_node_property_integer_free(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height);
        com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height = NULL;
    }
    free(com_day_cq_extwidget_servlets_image_sprite_servlet_properties);
}

cJSON *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_convertToJSON(com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width
    if(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width) {
    cJSON *max_width_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width);
    if(max_width_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxWidth", max_width_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height
    if(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height) {
    cJSON *max_height_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height);
    if(max_height_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxHeight", max_height_local_JSON);
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

com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_parseFromJSON(cJSON *com_day_cq_extwidget_servlets_image_sprite_servlet_propertiesJSON){

    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_t *com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width
    config_node_property_integer_t *max_width_local_nonprim = NULL;

    // define the local variable for com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height
    config_node_property_integer_t *max_height_local_nonprim = NULL;

    // com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_width
    cJSON *max_width = cJSON_GetObjectItemCaseSensitive(com_day_cq_extwidget_servlets_image_sprite_servlet_propertiesJSON, "maxWidth");
    if (cJSON_IsNull(max_width)) {
        max_width = NULL;
    }
    if (max_width) { 
    max_width_local_nonprim = config_node_property_integer_parseFromJSON(max_width); //nonprimitive
    }

    // com_day_cq_extwidget_servlets_image_sprite_servlet_properties->max_height
    cJSON *max_height = cJSON_GetObjectItemCaseSensitive(com_day_cq_extwidget_servlets_image_sprite_servlet_propertiesJSON, "maxHeight");
    if (cJSON_IsNull(max_height)) {
        max_height = NULL;
    }
    if (max_height) { 
    max_height_local_nonprim = config_node_property_integer_parseFromJSON(max_height); //nonprimitive
    }



    com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var = com_day_cq_extwidget_servlets_image_sprite_servlet_properties_create_internal (
        max_width ? max_width_local_nonprim : NULL,
        max_height ? max_height_local_nonprim : NULL
        );

    if (!com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_extwidget_servlets_image_sprite_servlet_properties_local_var;
end:
    if (max_width_local_nonprim) {
        config_node_property_integer_free(max_width_local_nonprim);
        max_width_local_nonprim = NULL;
    }
    if (max_height_local_nonprim) {
        config_node_property_integer_free(max_height_local_nonprim);
        max_height_local_nonprim = NULL;
    }
    return NULL;

}
