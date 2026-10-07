#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_projects_impl_servlet_project_image_servlet_properties.h"



static com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_create_internal(
    config_node_property_string_t *image_quality,
    config_node_property_string_t *image_supported_resolutions
    ) {
    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t));
    if (!com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var, 0, sizeof(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t));
    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var->image_quality = image_quality;
    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var->image_supported_resolutions = image_supported_resolutions;
    return com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_create(
    config_node_property_string_t *image_quality,
    config_node_property_string_t *image_supported_resolutions
    ) {
    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *result = com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_create_internal (
        image_quality,
        image_supported_resolutions
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_free(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties) {
    if(NULL == com_adobe_cq_projects_impl_servlet_project_image_servlet_properties){
        return ;
    }
    if(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality) {
        config_node_property_string_free(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality);
        com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality = NULL;
    }
    if (com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions) {
        config_node_property_string_free(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions);
        com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions = NULL;
    }
    free(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties);
}

cJSON *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_convertToJSON(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality
    if(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality) {
    cJSON *image_quality_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality);
    if(image_quality_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image.quality", image_quality_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions
    if(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions) {
    cJSON *image_supported_resolutions_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions);
    if(image_supported_resolutions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image.supported.resolutions", image_supported_resolutions_local_JSON);
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

com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_projects_impl_servlet_project_image_servlet_propertiesJSON){

    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_t *com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality
    config_node_property_string_t *image_quality_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions
    config_node_property_string_t *image_supported_resolutions_local_nonprim = NULL;

    // com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_quality
    cJSON *image_quality = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_impl_servlet_project_image_servlet_propertiesJSON, "image.quality");
    if (cJSON_IsNull(image_quality)) {
        image_quality = NULL;
    }
    if (image_quality) { 
    image_quality_local_nonprim = config_node_property_string_parseFromJSON(image_quality); //nonprimitive
    }

    // com_adobe_cq_projects_impl_servlet_project_image_servlet_properties->image_supported_resolutions
    cJSON *image_supported_resolutions = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_impl_servlet_project_image_servlet_propertiesJSON, "image.supported.resolutions");
    if (cJSON_IsNull(image_supported_resolutions)) {
        image_supported_resolutions = NULL;
    }
    if (image_supported_resolutions) { 
    image_supported_resolutions_local_nonprim = config_node_property_string_parseFromJSON(image_supported_resolutions); //nonprimitive
    }



    com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var = com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_create_internal (
        image_quality ? image_quality_local_nonprim : NULL,
        image_supported_resolutions ? image_supported_resolutions_local_nonprim : NULL
        );

    if (!com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_projects_impl_servlet_project_image_servlet_properties_local_var;
end:
    if (image_quality_local_nonprim) {
        config_node_property_string_free(image_quality_local_nonprim);
        image_quality_local_nonprim = NULL;
    }
    if (image_supported_resolutions_local_nonprim) {
        config_node_property_string_free(image_supported_resolutions_local_nonprim);
        image_supported_resolutions_local_nonprim = NULL;
    }
    return NULL;

}
