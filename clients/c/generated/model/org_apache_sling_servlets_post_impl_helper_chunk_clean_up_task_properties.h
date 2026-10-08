/*
 * org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_H_
#define _org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t {
    struct config_node_property_string_t *scheduler_expression; //model
    struct config_node_property_boolean_t *scheduler_concurrent; //model
    struct config_node_property_integer_t *chunk_cleanup_age; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t;

__attribute__((deprecated)) org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *chunk_cleanup_age
);

void org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties);

org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_parseFromJSON(cJSON *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_propertiesJSON);

cJSON *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_convertToJSON(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties);

#endif /* _org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_H_ */

