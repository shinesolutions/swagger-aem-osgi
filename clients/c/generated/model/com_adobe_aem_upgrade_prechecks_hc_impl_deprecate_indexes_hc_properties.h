/*
 * com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties.h
 *
 * 
 */

#ifndef _com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_H_
#define _com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t {
    struct config_node_property_string_t *hc_name; //model
    struct config_node_property_array_t *hc_tags; //model
    struct config_node_property_string_t *hc_mbean_name; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t;

__attribute__((deprecated)) com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_create(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name
);

void com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_free(com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties);

com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_parseFromJSON(cJSON *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_propertiesJSON);

cJSON *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_convertToJSON(com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_t *com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties);

#endif /* _com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties_H_ */

