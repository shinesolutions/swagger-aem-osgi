/*
 * com_day_cq_dam_core_impl_reports_report_purge_service_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_reports_report_purge_service_properties_H_
#define _com_day_cq_dam_core_impl_reports_report_purge_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_reports_report_purge_service_properties_t com_day_cq_dam_core_impl_reports_report_purge_service_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_reports_report_purge_service_properties_t {
    struct config_node_property_string_t *scheduler_expression; //model
    struct config_node_property_integer_t *max_saved_reports; //model
    struct config_node_property_integer_t *time_duration; //model
    struct config_node_property_boolean_t *enable_report_purge; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_reports_report_purge_service_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *max_saved_reports,
    config_node_property_integer_t *time_duration,
    config_node_property_boolean_t *enable_report_purge
);

void com_day_cq_dam_core_impl_reports_report_purge_service_properties_free(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties);

com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_reports_report_purge_service_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_reports_report_purge_service_properties_convertToJSON(com_day_cq_dam_core_impl_reports_report_purge_service_properties_t *com_day_cq_dam_core_impl_reports_report_purge_service_properties);

#endif /* _com_day_cq_dam_core_impl_reports_report_purge_service_properties_H_ */

