/*
 * com_day_cq_dam_indd_process_indd_media_extract_process_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_indd_process_indd_media_extract_process_properties_H_
#define _com_day_cq_dam_indd_process_indd_media_extract_process_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_indd_process_indd_media_extract_process_properties_t com_day_cq_dam_indd_process_indd_media_extract_process_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_indd_process_indd_media_extract_process_properties_t {
    struct config_node_property_string_t *process_label; //model
    struct config_node_property_string_t *cq_dam_indd_pages_regex; //model
    struct config_node_property_boolean_t *ids_job_decoupled; //model
    struct config_node_property_string_t *ids_job_workflow_model; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_indd_process_indd_media_extract_process_properties_t;

__attribute__((deprecated)) com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_create(
    config_node_property_string_t *process_label,
    config_node_property_string_t *cq_dam_indd_pages_regex,
    config_node_property_boolean_t *ids_job_decoupled,
    config_node_property_string_t *ids_job_workflow_model
);

void com_day_cq_dam_indd_process_indd_media_extract_process_properties_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties);

com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_parseFromJSON(cJSON *com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON);

cJSON *com_day_cq_dam_indd_process_indd_media_extract_process_properties_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties);

#endif /* _com_day_cq_dam_indd_process_indd_media_extract_process_properties_H_ */

