/*
 * org_apache_felix_http_sslfilter_ssl_filter_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_http_sslfilter_ssl_filter_properties_H_
#define _org_apache_felix_http_sslfilter_ssl_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_http_sslfilter_ssl_filter_properties_t org_apache_felix_http_sslfilter_ssl_filter_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_http_sslfilter_ssl_filter_properties_t {
    struct config_node_property_string_t *ssl_forward_header; //model
    struct config_node_property_string_t *ssl_forward_value; //model
    struct config_node_property_string_t *ssl_forward_cert_header; //model
    struct config_node_property_boolean_t *rewrite_absolute_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_http_sslfilter_ssl_filter_properties_t;

__attribute__((deprecated)) org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_create(
    config_node_property_string_t *ssl_forward_header,
    config_node_property_string_t *ssl_forward_value,
    config_node_property_string_t *ssl_forward_cert_header,
    config_node_property_boolean_t *rewrite_absolute_urls
);

void org_apache_felix_http_sslfilter_ssl_filter_properties_free(org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties);

org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_parseFromJSON(cJSON *org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON);

cJSON *org_apache_felix_http_sslfilter_ssl_filter_properties_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties);

#endif /* _org_apache_felix_http_sslfilter_ssl_filter_properties_H_ */

