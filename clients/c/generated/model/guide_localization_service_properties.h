/*
 * guide_localization_service_properties.h
 *
 * 
 */

#ifndef _guide_localization_service_properties_H_
#define _guide_localization_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct guide_localization_service_properties_t guide_localization_service_properties_t;

#include "config_node_property_array.h"



typedef struct guide_localization_service_properties_t {
    struct config_node_property_array_t *supported_locales; //model
    struct config_node_property_array_t *localizable_properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} guide_localization_service_properties_t;

__attribute__((deprecated)) guide_localization_service_properties_t *guide_localization_service_properties_create(
    config_node_property_array_t *supported_locales,
    config_node_property_array_t *localizable_properties
);

void guide_localization_service_properties_free(guide_localization_service_properties_t *guide_localization_service_properties);

guide_localization_service_properties_t *guide_localization_service_properties_parseFromJSON(cJSON *guide_localization_service_propertiesJSON);

cJSON *guide_localization_service_properties_convertToJSON(guide_localization_service_properties_t *guide_localization_service_properties);

#endif /* _guide_localization_service_properties_H_ */

