/*
 * com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_H_
#define _com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t {
    struct config_node_property_integer_t *scheduler_period; //model
    struct config_node_property_boolean_t *scheduler_concurrent; //model
    struct config_node_property_integer_t *service_bad_link_tolerance_interval; //model
    struct config_node_property_array_t *service_check_override_patterns; //model
    struct config_node_property_boolean_t *service_cache_broken_internal_links; //model
    struct config_node_property_array_t *service_special_link_prefix; //model
    struct config_node_property_array_t *service_special_link_patterns; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t;

__attribute__((deprecated)) com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *service_bad_link_tolerance_interval,
    config_node_property_array_t *service_check_override_patterns,
    config_node_property_boolean_t *service_cache_broken_internal_links,
    config_node_property_array_t *service_special_link_prefix,
    config_node_property_array_t *service_special_link_patterns
);

void com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties);

com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_parseFromJSON(cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON);

cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties);

#endif /* _com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_H_ */

