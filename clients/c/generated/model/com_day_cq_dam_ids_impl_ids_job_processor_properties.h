/*
 * com_day_cq_dam_ids_impl_ids_job_processor_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_ids_impl_ids_job_processor_properties_H_
#define _com_day_cq_dam_ids_impl_ids_job_processor_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_ids_impl_ids_job_processor_properties_t com_day_cq_dam_ids_impl_ids_job_processor_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_ids_impl_ids_job_processor_properties_t {
    struct config_node_property_boolean_t *enable_multisession; //model
    struct config_node_property_boolean_t *ids_cc_enable; //model
    struct config_node_property_boolean_t *enable_retry; //model
    struct config_node_property_boolean_t *enable_retry_scripterror; //model
    struct config_node_property_string_t *externalizer_domain_cqhost; //model
    struct config_node_property_string_t *externalizer_domain_http; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_ids_impl_ids_job_processor_properties_t;

__attribute__((deprecated)) com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_create(
    config_node_property_boolean_t *enable_multisession,
    config_node_property_boolean_t *ids_cc_enable,
    config_node_property_boolean_t *enable_retry,
    config_node_property_boolean_t *enable_retry_scripterror,
    config_node_property_string_t *externalizer_domain_cqhost,
    config_node_property_string_t *externalizer_domain_http
);

void com_day_cq_dam_ids_impl_ids_job_processor_properties_free(com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties);

com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_parseFromJSON(cJSON *com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON);

cJSON *com_day_cq_dam_ids_impl_ids_job_processor_properties_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties);

#endif /* _com_day_cq_dam_ids_impl_ids_job_processor_properties_H_ */

