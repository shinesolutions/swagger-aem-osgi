/*
 * com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_H_
#define _com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t {
    struct config_node_property_string_t *cdn_config_distribution_domain; //model
    struct config_node_property_boolean_t *cdn_config_enable_rewriting; //model
    struct config_node_property_array_t *cdn_config_path_prefixes; //model
    struct config_node_property_integer_t *cdn_config_cdnttl; //model
    struct config_node_property_string_t *cdn_config_application_protocol; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_create(
    config_node_property_string_t *cdn_config_distribution_domain,
    config_node_property_boolean_t *cdn_config_enable_rewriting,
    config_node_property_array_t *cdn_config_path_prefixes,
    config_node_property_integer_t *cdn_config_cdnttl,
    config_node_property_string_t *cdn_config_application_protocol
);

void com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_free(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties);

com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_propertiesJSON);

cJSON *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_convertToJSON(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_t *com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties);

#endif /* _com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_H_ */

