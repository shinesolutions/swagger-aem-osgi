/*
 * com_day_cq_dam_core_impl_unzip_unzip_config_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_unzip_unzip_config_properties_H_
#define _com_day_cq_dam_core_impl_unzip_unzip_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_unzip_unzip_config_properties_t com_day_cq_dam_core_impl_unzip_unzip_config_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_unzip_unzip_config_properties_t {
    struct config_node_property_integer_t *cq_dam_config_unzip_maxuncompressedsize; //model
    struct config_node_property_string_t *cq_dam_config_unzip_encoding; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_unzip_unzip_config_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_create(
    config_node_property_integer_t *cq_dam_config_unzip_maxuncompressedsize,
    config_node_property_string_t *cq_dam_config_unzip_encoding
);

void com_day_cq_dam_core_impl_unzip_unzip_config_properties_free(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties);

com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_unzip_unzip_config_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_unzip_unzip_config_properties_convertToJSON(com_day_cq_dam_core_impl_unzip_unzip_config_properties_t *com_day_cq_dam_core_impl_unzip_unzip_config_properties);

#endif /* _com_day_cq_dam_core_impl_unzip_unzip_config_properties_H_ */

