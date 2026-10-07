/*
 * com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_H_
#define _com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t {
    struct config_node_property_integer_t *max_errors_to_blacklist; //model
    struct config_node_property_integer_t *retry_interval_to_whitelist; //model
    struct config_node_property_integer_t *connect_timeout; //model
    struct config_node_property_integer_t *socket_timeout; //model
    struct config_node_property_string_t *process_label; //model
    struct config_node_property_integer_t *connection_use_max; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t;

__attribute__((deprecated)) com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_create(
    config_node_property_integer_t *max_errors_to_blacklist,
    config_node_property_integer_t *retry_interval_to_whitelist,
    config_node_property_integer_t *connect_timeout,
    config_node_property_integer_t *socket_timeout,
    config_node_property_string_t *process_label,
    config_node_property_integer_t *connection_use_max
);

void com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties);

com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON);

cJSON *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties);

#endif /* _com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_H_ */

