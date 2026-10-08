/*
 * com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info.h
 *
 * 
 */

#ifndef _com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_H_
#define _com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t;

#include "com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties.h"



typedef struct com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *properties; //model
    char *additional_properties; // string
    char *bundle_location; // string
    char *service_location; // string

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t;

__attribute__((deprecated)) com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_create(
    char *pid,
    char *title,
    char *description,
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *properties,
    char *additional_properties,
    char *bundle_location,
    char *service_location
);

void com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info);

com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_parseFromJSON(cJSON *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_infoJSON);

cJSON *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info);

#endif /* _com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info_H_ */

