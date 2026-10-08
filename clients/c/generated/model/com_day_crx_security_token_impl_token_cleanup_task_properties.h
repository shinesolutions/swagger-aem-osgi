/*
 * com_day_crx_security_token_impl_token_cleanup_task_properties.h
 *
 * 
 */

#ifndef _com_day_crx_security_token_impl_token_cleanup_task_properties_H_
#define _com_day_crx_security_token_impl_token_cleanup_task_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_crx_security_token_impl_token_cleanup_task_properties_t com_day_crx_security_token_impl_token_cleanup_task_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_crx_security_token_impl_token_cleanup_task_properties_t {
    struct config_node_property_boolean_t *enable_token_cleanup_task; //model
    struct config_node_property_string_t *scheduler_expression; //model
    struct config_node_property_integer_t *batch_size; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_crx_security_token_impl_token_cleanup_task_properties_t;

__attribute__((deprecated)) com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_create(
    config_node_property_boolean_t *enable_token_cleanup_task,
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *batch_size
);

void com_day_crx_security_token_impl_token_cleanup_task_properties_free(com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties);

com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_parseFromJSON(cJSON *com_day_crx_security_token_impl_token_cleanup_task_propertiesJSON);

cJSON *com_day_crx_security_token_impl_token_cleanup_task_properties_convertToJSON(com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties);

#endif /* _com_day_crx_security_token_impl_token_cleanup_task_properties_H_ */

