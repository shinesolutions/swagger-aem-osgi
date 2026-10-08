/*
 * com_day_cq_image_internal_font_font_helper_properties.h
 *
 * 
 */

#ifndef _com_day_cq_image_internal_font_font_helper_properties_H_
#define _com_day_cq_image_internal_font_font_helper_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_image_internal_font_font_helper_properties_t com_day_cq_image_internal_font_font_helper_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"



typedef struct com_day_cq_image_internal_font_font_helper_properties_t {
    struct config_node_property_array_t *fontpath; //model
    struct config_node_property_integer_t *oversampling_factor; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_image_internal_font_font_helper_properties_t;

__attribute__((deprecated)) com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_create(
    config_node_property_array_t *fontpath,
    config_node_property_integer_t *oversampling_factor
);

void com_day_cq_image_internal_font_font_helper_properties_free(com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties);

com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties_parseFromJSON(cJSON *com_day_cq_image_internal_font_font_helper_propertiesJSON);

cJSON *com_day_cq_image_internal_font_font_helper_properties_convertToJSON(com_day_cq_image_internal_font_font_helper_properties_t *com_day_cq_image_internal_font_font_helper_properties);

#endif /* _com_day_cq_image_internal_font_font_helper_properties_H_ */

