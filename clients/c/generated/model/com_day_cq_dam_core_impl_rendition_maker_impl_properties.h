/*
 * com_day_cq_dam_core_impl_rendition_maker_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_rendition_maker_impl_properties_H_
#define _com_day_cq_dam_core_impl_rendition_maker_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_rendition_maker_impl_properties_t com_day_cq_dam_core_impl_rendition_maker_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct com_day_cq_dam_core_impl_rendition_maker_impl_properties_t {
    struct config_node_property_boolean_t *xmp_propagate; //model
    struct config_node_property_array_t *xmp_excludes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_rendition_maker_impl_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_create(
    config_node_property_boolean_t *xmp_propagate,
    config_node_property_array_t *xmp_excludes
);

void com_day_cq_dam_core_impl_rendition_maker_impl_properties_free(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties);

com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_rendition_maker_impl_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_rendition_maker_impl_properties_convertToJSON(com_day_cq_dam_core_impl_rendition_maker_impl_properties_t *com_day_cq_dam_core_impl_rendition_maker_impl_properties);

#endif /* _com_day_cq_dam_core_impl_rendition_maker_impl_properties_H_ */

