/*
 * com_day_cq_tagging_impl_tag_garbage_collector_properties.h
 *
 * 
 */

#ifndef _com_day_cq_tagging_impl_tag_garbage_collector_properties_H_
#define _com_day_cq_tagging_impl_tag_garbage_collector_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_tagging_impl_tag_garbage_collector_properties_t com_day_cq_tagging_impl_tag_garbage_collector_properties_t;

#include "config_node_property_string.h"



typedef struct com_day_cq_tagging_impl_tag_garbage_collector_properties_t {
    struct config_node_property_string_t *scheduler_expression; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_tagging_impl_tag_garbage_collector_properties_t;

__attribute__((deprecated)) com_day_cq_tagging_impl_tag_garbage_collector_properties_t *com_day_cq_tagging_impl_tag_garbage_collector_properties_create(
    config_node_property_string_t *scheduler_expression
);

void com_day_cq_tagging_impl_tag_garbage_collector_properties_free(com_day_cq_tagging_impl_tag_garbage_collector_properties_t *com_day_cq_tagging_impl_tag_garbage_collector_properties);

com_day_cq_tagging_impl_tag_garbage_collector_properties_t *com_day_cq_tagging_impl_tag_garbage_collector_properties_parseFromJSON(cJSON *com_day_cq_tagging_impl_tag_garbage_collector_propertiesJSON);

cJSON *com_day_cq_tagging_impl_tag_garbage_collector_properties_convertToJSON(com_day_cq_tagging_impl_tag_garbage_collector_properties_t *com_day_cq_tagging_impl_tag_garbage_collector_properties);

#endif /* _com_day_cq_tagging_impl_tag_garbage_collector_properties_H_ */

