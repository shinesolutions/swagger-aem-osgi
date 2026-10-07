/*
 * com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_H_
#define _com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t;

#include "config_node_property_integer.h"



typedef struct com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t {
    struct config_node_property_integer_t *connection_timeout; //model
    struct config_node_property_integer_t *socket_timeout; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_create(
    config_node_property_integer_t *connection_timeout,
    config_node_property_integer_t *socket_timeout
);

void com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_free(com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties);

com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_propertiesJSON);

cJSON *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_convertToJSON(com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_t *com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties);

#endif /* _com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties_H_ */

