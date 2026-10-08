/*
 * com_day_cq_dam_core_impl_expiry_notification_job_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_H_
#define _com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t {
    struct config_node_property_boolean_t *cq_dam_expiry_notification_scheduler_istimebased; //model
    struct config_node_property_string_t *cq_dam_expiry_notification_scheduler_timebased_rule; //model
    struct config_node_property_integer_t *cq_dam_expiry_notification_scheduler_period_rule; //model
    struct config_node_property_boolean_t *send_email; //model
    struct config_node_property_integer_t *asset_expired_limit; //model
    struct config_node_property_integer_t *prior_notification_seconds; //model
    struct config_node_property_string_t *cq_dam_expiry_notification_url_protocol; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_create(
    config_node_property_boolean_t *cq_dam_expiry_notification_scheduler_istimebased,
    config_node_property_string_t *cq_dam_expiry_notification_scheduler_timebased_rule,
    config_node_property_integer_t *cq_dam_expiry_notification_scheduler_period_rule,
    config_node_property_boolean_t *send_email,
    config_node_property_integer_t *asset_expired_limit,
    config_node_property_integer_t *prior_notification_seconds,
    config_node_property_string_t *cq_dam_expiry_notification_url_protocol
);

void com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties);

com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties);

#endif /* _com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_H_ */

