/*
 * com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_H_
#define _com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t;

#include "config_node_property_string.h"



typedef struct com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t {
    struct config_node_property_string_t *scene7_flash_templates_rti; //model
    struct config_node_property_string_t *scene7_flash_templates_rsi; //model
    struct config_node_property_string_t *scene7_flash_templates_rb; //model
    struct config_node_property_string_t *scene7_flash_templates_rurl; //model
    struct config_node_property_string_t *scene7_flash_template_url_format_parameter; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t;

__attribute__((deprecated)) com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_create(
    config_node_property_string_t *scene7_flash_templates_rti,
    config_node_property_string_t *scene7_flash_templates_rsi,
    config_node_property_string_t *scene7_flash_templates_rb,
    config_node_property_string_t *scene7_flash_templates_rurl,
    config_node_property_string_t *scene7_flash_template_url_format_parameter
);

void com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties);

com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON);

cJSON *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties);

#endif /* _com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_H_ */

