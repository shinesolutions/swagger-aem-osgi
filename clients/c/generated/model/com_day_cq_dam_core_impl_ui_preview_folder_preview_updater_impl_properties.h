/*
 * com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_H_
#define _com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t {
    struct config_node_property_boolean_t *create_preview_enabled; //model
    struct config_node_property_boolean_t *update_preview_enabled; //model
    struct config_node_property_integer_t *queue_size; //model
    struct config_node_property_string_t *folder_preview_rendition_regex; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_create(
    config_node_property_boolean_t *create_preview_enabled,
    config_node_property_boolean_t *update_preview_enabled,
    config_node_property_integer_t *queue_size,
    config_node_property_string_t *folder_preview_rendition_regex
);

void com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties);

com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties);

#endif /* _com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_H_ */

