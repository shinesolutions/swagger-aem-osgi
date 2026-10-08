/*
 * com_day_cq_polling_importer_impl_managed_poll_config_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_H_
#define _com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t {
    struct config_node_property_string_t *id; //model
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_boolean_t *reference; //model
    struct config_node_property_integer_t *interval; //model
    struct config_node_property_string_t *expression; //model
    struct config_node_property_string_t *source; //model
    struct config_node_property_string_t *target; //model
    struct config_node_property_string_t *login; //model
    struct config_node_property_string_t *password; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t;

__attribute__((deprecated)) com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_create(
    config_node_property_string_t *id,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *reference,
    config_node_property_integer_t *interval,
    config_node_property_string_t *expression,
    config_node_property_string_t *source,
    config_node_property_string_t *target,
    config_node_property_string_t *login,
    config_node_property_string_t *password
);

void com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties);

com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_parseFromJSON(cJSON *com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON);

cJSON *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties);

#endif /* _com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_H_ */

