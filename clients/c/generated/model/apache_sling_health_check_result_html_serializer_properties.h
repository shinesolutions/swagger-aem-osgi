/*
 * apache_sling_health_check_result_html_serializer_properties.h
 *
 * 
 */

#ifndef _apache_sling_health_check_result_html_serializer_properties_H_
#define _apache_sling_health_check_result_html_serializer_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct apache_sling_health_check_result_html_serializer_properties_t apache_sling_health_check_result_html_serializer_properties_t;

#include "config_node_property_string.h"



typedef struct apache_sling_health_check_result_html_serializer_properties_t {
    struct config_node_property_string_t *style_string; //model

    int _library_owned; // Is the library responsible for freeing this object?
} apache_sling_health_check_result_html_serializer_properties_t;

__attribute__((deprecated)) apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_create(
    config_node_property_string_t *style_string
);

void apache_sling_health_check_result_html_serializer_properties_free(apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties);

apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties_parseFromJSON(cJSON *apache_sling_health_check_result_html_serializer_propertiesJSON);

cJSON *apache_sling_health_check_result_html_serializer_properties_convertToJSON(apache_sling_health_check_result_html_serializer_properties_t *apache_sling_health_check_result_html_serializer_properties);

#endif /* _apache_sling_health_check_result_html_serializer_properties_H_ */

