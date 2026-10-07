/*
 * apache_sling_health_check_result_html_serializer_info.h
 *
 * 
 */

#ifndef _apache_sling_health_check_result_html_serializer_info_H_
#define _apache_sling_health_check_result_html_serializer_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct apache_sling_health_check_result_html_serializer_info_t apache_sling_health_check_result_html_serializer_info_t;

#include "apache_sling_health_check_result_html_serializer_properties.h"



typedef struct apache_sling_health_check_result_html_serializer_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct apache_sling_health_check_result_html_serializer_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} apache_sling_health_check_result_html_serializer_info_t;

__attribute__((deprecated)) apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_create(
    char *pid,
    char *title,
    char *description,
    apache_sling_health_check_result_html_serializer_properties_t *properties
);

void apache_sling_health_check_result_html_serializer_info_free(apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info);

apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_parseFromJSON(cJSON *apache_sling_health_check_result_html_serializer_infoJSON);

cJSON *apache_sling_health_check_result_html_serializer_info_convertToJSON(apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info);

#endif /* _apache_sling_health_check_result_html_serializer_info_H_ */

