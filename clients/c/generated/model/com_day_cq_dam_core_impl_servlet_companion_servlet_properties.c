#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_companion_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_create_internal(
    config_node_property_string_t *more_info,
    config_node_property_string_t *_mnt_overlay_dam_gui_content_assets_moreinfo_html_path
    ) {
    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var->more_info = more_info;
    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path = _mnt_overlay_dam_gui_content_assets_moreinfo_html_path;
    return com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_create(
    config_node_property_string_t *more_info,
    config_node_property_string_t *_mnt_overlay_dam_gui_content_assets_moreinfo_html_path
    ) {
    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_companion_servlet_properties_create_internal (
        more_info,
        _mnt_overlay_dam_gui_content_assets_moreinfo_html_path
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_companion_servlet_properties_free(com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_companion_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_companion_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info);
        com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path);
        com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_companion_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info
    if(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info) {
    cJSON *more_info_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info);
    if(more_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "More Info", more_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path
    if(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path) {
    cJSON *_mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path);
    if(_mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}", _mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_JSON);
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

com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_companion_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_t *com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info
    config_node_property_string_t *more_info_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path
    config_node_property_string_t *_mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_companion_servlet_properties->more_info
    cJSON *more_info = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_companion_servlet_propertiesJSON, "More Info");
    if (cJSON_IsNull(more_info)) {
        more_info = NULL;
    }
    if (more_info) { 
    more_info_local_nonprim = config_node_property_string_parseFromJSON(more_info); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_companion_servlet_properties->_mnt_overlay_dam_gui_content_assets_moreinfo_html_path
    cJSON *_mnt_overlay_dam_gui_content_assets_moreinfo_html_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_companion_servlet_propertiesJSON, "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}");
    if (cJSON_IsNull(_mnt_overlay_dam_gui_content_assets_moreinfo_html_path)) {
        _mnt_overlay_dam_gui_content_assets_moreinfo_html_path = NULL;
    }
    if (_mnt_overlay_dam_gui_content_assets_moreinfo_html_path) { 
    _mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim = config_node_property_string_parseFromJSON(_mnt_overlay_dam_gui_content_assets_moreinfo_html_path); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_companion_servlet_properties_create_internal (
        more_info ? more_info_local_nonprim : NULL,
        _mnt_overlay_dam_gui_content_assets_moreinfo_html_path ? _mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_companion_servlet_properties_local_var;
end:
    if (more_info_local_nonprim) {
        config_node_property_string_free(more_info_local_nonprim);
        more_info_local_nonprim = NULL;
    }
    if (_mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim) {
        config_node_property_string_free(_mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim);
        _mnt_overlay_dam_gui_content_assets_moreinfo_html_path_local_nonprim = NULL;
    }
    return NULL;

}
