#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_image_internal_font_font_helper_properties.h"



static com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_create_internal(
    config_node_property_array_t *fontpath,
    config_node_property_integer_t *oversampling_factor
    ) {
    com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_local_var = malloc(sizeof(com_day_cq_image_internal_font_font_helper_properties_t));
    if (!com_day_cq_image_internal_font_font_helper_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_image_internal_font_font_helper_properties_local_var, 0, sizeof(com_day_cq_image_internal_font_font_helper_properties_t));
    com_day_cq_image_internal_font_font_helper_properties_local_var->_library_owned = 1;
    com_day_cq_image_internal_font_font_helper_properties_local_var->fontpath = fontpath;
    com_day_cq_image_internal_font_font_helper_properties_local_var->oversampling_factor = oversampling_factor;
    return com_day_cq_image_internal_font_font_helper_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_create(
    config_node_property_array_t *fontpath,
    config_node_property_integer_t *oversampling_factor
    ) {
    com_day_cq_image_internal_font_font_helper_properties_t *result = com_day_cq_image_internal_font_font_helper_properties_create_internal (
        fontpath,
        oversampling_factor
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_image_internal_font_font_helper_properties_free(com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties) {
    if(NULL == com_day_cq_image_internal_font_font_helper_properties){
        return ;
    }
    if(com_day_cq_image_internal_font_font_helper_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_image_internal_font_font_helper_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_image_internal_font_font_helper_properties->fontpath) {
        config_node_property_array_free(com_day_cq_image_internal_font_font_helper_properties->fontpath);
        com_day_cq_image_internal_font_font_helper_properties->fontpath = NULL;
    }
    if (com_day_cq_image_internal_font_font_helper_properties->oversampling_factor) {
        config_node_property_integer_free(com_day_cq_image_internal_font_font_helper_properties->oversampling_factor);
        com_day_cq_image_internal_font_font_helper_properties->oversampling_factor = NULL;
    }
    free(com_day_cq_image_internal_font_font_helper_properties);
}

cJSON *com_day_cq_image_internal_font_font_helper_properties_convertToJSON(com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_image_internal_font_font_helper_properties->fontpath
    if(com_day_cq_image_internal_font_font_helper_properties->fontpath) {
    cJSON *fontpath_local_JSON = config_node_property_array_convertToJSON(com_day_cq_image_internal_font_font_helper_properties->fontpath);
    if(fontpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fontpath", fontpath_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_image_internal_font_font_helper_properties->oversampling_factor
    if(com_day_cq_image_internal_font_font_helper_properties->oversampling_factor) {
    cJSON *oversampling_factor_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_image_internal_font_font_helper_properties->oversampling_factor);
    if(oversampling_factor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oversamplingFactor", oversampling_factor_local_JSON);
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

com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_parseFromJSON(cJSON *com_day_cq_image_internal_font_font_helper_propertiesJSON){

    com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_local_var = NULL;

    // define the local variable for com_day_cq_image_internal_font_font_helper_properties->fontpath
    config_node_property_array_t *fontpath_local_nonprim = NULL;

    // define the local variable for com_day_cq_image_internal_font_font_helper_properties->oversampling_factor
    config_node_property_integer_t *oversampling_factor_local_nonprim = NULL;

    // com_day_cq_image_internal_font_font_helper_properties->fontpath
    cJSON *fontpath = cJSON_GetObjectItemCaseSensitive(com_day_cq_image_internal_font_font_helper_propertiesJSON, "fontpath");
    if (cJSON_IsNull(fontpath)) {
        fontpath = NULL;
    }
    if (fontpath) { 
    fontpath_local_nonprim = config_node_property_array_parseFromJSON(fontpath); //nonprimitive
    }

    // com_day_cq_image_internal_font_font_helper_properties->oversampling_factor
    cJSON *oversampling_factor = cJSON_GetObjectItemCaseSensitive(com_day_cq_image_internal_font_font_helper_propertiesJSON, "oversamplingFactor");
    if (cJSON_IsNull(oversampling_factor)) {
        oversampling_factor = NULL;
    }
    if (oversampling_factor) { 
    oversampling_factor_local_nonprim = config_node_property_integer_parseFromJSON(oversampling_factor); //nonprimitive
    }



    com_day_cq_image_internal_font_font_helper_properties_local_var = com_day_cq_image_internal_font_font_helper_properties_create_internal (
        fontpath ? fontpath_local_nonprim : NULL,
        oversampling_factor ? oversampling_factor_local_nonprim : NULL
        );

    if (!com_day_cq_image_internal_font_font_helper_properties_local_var) {
        goto end;
    }

    return com_day_cq_image_internal_font_font_helper_properties_local_var;
end:
    if (fontpath_local_nonprim) {
        config_node_property_array_free(fontpath_local_nonprim);
        fontpath_local_nonprim = NULL;
    }
    if (oversampling_factor_local_nonprim) {
        config_node_property_integer_free(oversampling_factor_local_nonprim);
        oversampling_factor_local_nonprim = NULL;
    }
    return NULL;

}
