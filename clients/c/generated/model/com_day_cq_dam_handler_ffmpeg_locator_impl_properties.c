#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_handler_ffmpeg_locator_impl_properties.h"



static com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_create_internal(
    config_node_property_array_t *executable_searchpath
    ) {
    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t));
    if (!com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var, 0, sizeof(com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t));
    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var->executable_searchpath = executable_searchpath;
    return com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_create(
    config_node_property_array_t *executable_searchpath
    ) {
    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *result = com_day_cq_dam_handler_ffmpeg_locator_impl_properties_create_internal (
        executable_searchpath
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_handler_ffmpeg_locator_impl_properties_free(com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties) {
    if(NULL == com_day_cq_dam_handler_ffmpeg_locator_impl_properties){
        return ;
    }
    if(com_day_cq_dam_handler_ffmpeg_locator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_handler_ffmpeg_locator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath) {
        config_node_property_array_free(com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath);
        com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath = NULL;
    }
    free(com_day_cq_dam_handler_ffmpeg_locator_impl_properties);
}

cJSON *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_convertToJSON(com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath
    if(com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath) {
    cJSON *executable_searchpath_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath);
    if(executable_searchpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "executable.searchpath", executable_searchpath_local_JSON);
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

com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_handler_ffmpeg_locator_impl_propertiesJSON){

    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_t *com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath
    config_node_property_array_t *executable_searchpath_local_nonprim = NULL;

    // com_day_cq_dam_handler_ffmpeg_locator_impl_properties->executable_searchpath
    cJSON *executable_searchpath = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_handler_ffmpeg_locator_impl_propertiesJSON, "executable.searchpath");
    if (cJSON_IsNull(executable_searchpath)) {
        executable_searchpath = NULL;
    }
    if (executable_searchpath) { 
    executable_searchpath_local_nonprim = config_node_property_array_parseFromJSON(executable_searchpath); //nonprimitive
    }



    com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var = com_day_cq_dam_handler_ffmpeg_locator_impl_properties_create_internal (
        executable_searchpath ? executable_searchpath_local_nonprim : NULL
        );

    if (!com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_handler_ffmpeg_locator_impl_properties_local_var;
end:
    if (executable_searchpath_local_nonprim) {
        config_node_property_array_free(executable_searchpath_local_nonprim);
        executable_searchpath_local_nonprim = NULL;
    }
    return NULL;

}
