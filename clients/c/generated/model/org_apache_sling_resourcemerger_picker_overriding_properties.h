/*
 * org_apache_sling_resourcemerger_picker_overriding_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_resourcemerger_picker_overriding_properties_H_
#define _org_apache_sling_resourcemerger_picker_overriding_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_resourcemerger_picker_overriding_properties_t org_apache_sling_resourcemerger_picker_overriding_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_resourcemerger_picker_overriding_properties_t {
    struct config_node_property_string_t *merge_root; //model
    struct config_node_property_boolean_t *merge_read_only; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_resourcemerger_picker_overriding_properties_t;

__attribute__((deprecated)) org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_create(
    config_node_property_string_t *merge_root,
    config_node_property_boolean_t *merge_read_only
);

void org_apache_sling_resourcemerger_picker_overriding_properties_free(org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties);

org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties_parseFromJSON(cJSON *org_apache_sling_resourcemerger_picker_overriding_propertiesJSON);

cJSON *org_apache_sling_resourcemerger_picker_overriding_properties_convertToJSON(org_apache_sling_resourcemerger_picker_overriding_properties_t *org_apache_sling_resourcemerger_picker_overriding_properties);

#endif /* _org_apache_sling_resourcemerger_picker_overriding_properties_H_ */

