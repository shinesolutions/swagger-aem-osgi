/*
 * org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_H_
#define _org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t;

#include "org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties.h"



typedef struct org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *properties; //model
    char *bundle_location; // string
    char *service_location; // string

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t;

__attribute__((deprecated)) org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_create(
    char *pid,
    char *title,
    char *description,
    org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties_t *properties,
    char *bundle_location,
    char *service_location
);

void org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_free(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info);

org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_parseFromJSON(cJSON *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_infoJSON);

cJSON *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_convertToJSON(org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_t *org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info);

#endif /* _org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info_H_ */

