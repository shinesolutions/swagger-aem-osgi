/*
 * com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_H_
#define _com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t;

#include "config_node_property_array.h"



typedef struct com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t {
    struct config_node_property_array_t *pseudo_patterns; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t;

__attribute__((deprecated)) com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_create(
    config_node_property_array_t *pseudo_patterns
);

void com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_free(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties);

com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_parseFromJSON(cJSON *com_adobe_granite_i18n_impl_bundle_pseudo_translations_propertiesJSON);

cJSON *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_convertToJSON(com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_t *com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties);

#endif /* _com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties_H_ */

