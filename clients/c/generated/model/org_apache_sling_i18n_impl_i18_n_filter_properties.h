/*
 * org_apache_sling_i18n_impl_i18_n_filter_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_i18n_impl_i18_n_filter_properties_H_
#define _org_apache_sling_i18n_impl_i18_n_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_i18n_impl_i18_n_filter_properties_t org_apache_sling_i18n_impl_i18_n_filter_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"



typedef struct org_apache_sling_i18n_impl_i18_n_filter_properties_t {
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_array_t *sling_filter_scope; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_i18n_impl_i18_n_filter_properties_t;

__attribute__((deprecated)) org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *sling_filter_scope
);

void org_apache_sling_i18n_impl_i18_n_filter_properties_free(org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties);

org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_parseFromJSON(cJSON *org_apache_sling_i18n_impl_i18_n_filter_propertiesJSON);

cJSON *org_apache_sling_i18n_impl_i18_n_filter_properties_convertToJSON(org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties);

#endif /* _org_apache_sling_i18n_impl_i18_n_filter_properties_H_ */

