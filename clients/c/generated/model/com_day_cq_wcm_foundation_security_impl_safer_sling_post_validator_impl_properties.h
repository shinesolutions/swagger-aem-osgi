/*
 * com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_H_
#define _com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t;

#include "config_node_property_array.h"



typedef struct com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t {
    struct config_node_property_array_t *parameter_whitelist; //model
    struct config_node_property_array_t *parameter_whitelist_prefixes; //model
    struct config_node_property_array_t *binary_parameter_whitelist; //model
    struct config_node_property_array_t *modifier_whitelist; //model
    struct config_node_property_array_t *operation_whitelist; //model
    struct config_node_property_array_t *operation_whitelist_prefixes; //model
    struct config_node_property_array_t *typehint_whitelist; //model
    struct config_node_property_array_t *resourcetype_whitelist; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_create(
    config_node_property_array_t *parameter_whitelist,
    config_node_property_array_t *parameter_whitelist_prefixes,
    config_node_property_array_t *binary_parameter_whitelist,
    config_node_property_array_t *modifier_whitelist,
    config_node_property_array_t *operation_whitelist,
    config_node_property_array_t *operation_whitelist_prefixes,
    config_node_property_array_t *typehint_whitelist,
    config_node_property_array_t *resourcetype_whitelist
);

void com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_free(com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties);

com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_propertiesJSON);

cJSON *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_convertToJSON(com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_t *com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties);

#endif /* _com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties_H_ */

