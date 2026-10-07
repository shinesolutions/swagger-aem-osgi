/*
 * com_adobe_granite_logging_impl_log_analyser_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_logging_impl_log_analyser_impl_properties_H_
#define _com_adobe_granite_logging_impl_log_analyser_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_logging_impl_log_analyser_impl_properties_t com_adobe_granite_logging_impl_log_analyser_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_granite_logging_impl_log_analyser_impl_properties_t {
    struct config_node_property_integer_t *messages_queue_size; //model
    struct config_node_property_array_t *logger_config; //model
    struct config_node_property_integer_t *messages_size; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_logging_impl_log_analyser_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_create(
    config_node_property_integer_t *messages_queue_size,
    config_node_property_array_t *logger_config,
    config_node_property_integer_t *messages_size
);

void com_adobe_granite_logging_impl_log_analyser_impl_properties_free(com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties);

com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_parseFromJSON(cJSON *com_adobe_granite_logging_impl_log_analyser_impl_propertiesJSON);

cJSON *com_adobe_granite_logging_impl_log_analyser_impl_properties_convertToJSON(com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties);

#endif /* _com_adobe_granite_logging_impl_log_analyser_impl_properties_H_ */

