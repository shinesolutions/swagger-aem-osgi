#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_handler_standard_ps_post_script_handler_properties.h"



static com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_create_internal(
    config_node_property_boolean_t *raster_annotation
    ) {
    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t));
    if (!com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var, 0, sizeof(com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t));
    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var->raster_annotation = raster_annotation;
    return com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_create(
    config_node_property_boolean_t *raster_annotation
    ) {
    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *result = com_day_cq_dam_handler_standard_ps_post_script_handler_properties_create_internal (
        raster_annotation
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_handler_standard_ps_post_script_handler_properties_free(com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties) {
    if(NULL == com_day_cq_dam_handler_standard_ps_post_script_handler_properties){
        return ;
    }
    if(com_day_cq_dam_handler_standard_ps_post_script_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_handler_standard_ps_post_script_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation) {
        config_node_property_boolean_free(com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation);
        com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation = NULL;
    }
    free(com_day_cq_dam_handler_standard_ps_post_script_handler_properties);
}

cJSON *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_convertToJSON(com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation
    if(com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation) {
    cJSON *raster_annotation_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation);
    if(raster_annotation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "raster.annotation", raster_annotation_local_JSON);
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

com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_handler_standard_ps_post_script_handler_propertiesJSON){

    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_t *com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation
    config_node_property_boolean_t *raster_annotation_local_nonprim = NULL;

    // com_day_cq_dam_handler_standard_ps_post_script_handler_properties->raster_annotation
    cJSON *raster_annotation = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_standard_ps_post_script_handler_propertiesJSON, "raster.annotation");
    if (cJSON_IsNull(raster_annotation)) {
        raster_annotation = NULL;
    }
    if (raster_annotation) { 
    raster_annotation_local_nonprim = config_node_property_boolean_parseFromJSON(raster_annotation); //nonprimitive
    }



    com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var = com_day_cq_dam_handler_standard_ps_post_script_handler_properties_create_internal (
        raster_annotation ? raster_annotation_local_nonprim : NULL
        );

    if (!com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_handler_standard_ps_post_script_handler_properties_local_var;
end:
    if (raster_annotation_local_nonprim) {
        config_node_property_boolean_free(raster_annotation_local_nonprim);
        raster_annotation_local_nonprim = NULL;
    }
    return NULL;

}
