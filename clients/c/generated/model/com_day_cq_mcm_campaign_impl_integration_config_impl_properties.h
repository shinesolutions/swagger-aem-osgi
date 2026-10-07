/*
 * com_day_cq_mcm_campaign_impl_integration_config_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_mcm_campaign_impl_integration_config_impl_properties_H_
#define _com_day_cq_mcm_campaign_impl_integration_config_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t {
    struct config_node_property_array_t *aem_mcm_campaign_form_constraints; //model
    struct config_node_property_string_t *aem_mcm_campaign_public_url; //model
    struct config_node_property_boolean_t *aem_mcm_campaign_relaxed_ssl; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t;

__attribute__((deprecated)) com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_create(
    config_node_property_array_t *aem_mcm_campaign_form_constraints,
    config_node_property_string_t *aem_mcm_campaign_public_url,
    config_node_property_boolean_t *aem_mcm_campaign_relaxed_ssl
);

void com_day_cq_mcm_campaign_impl_integration_config_impl_properties_free(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties);

com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_parseFromJSON(cJSON *com_day_cq_mcm_campaign_impl_integration_config_impl_propertiesJSON);

cJSON *com_day_cq_mcm_campaign_impl_integration_config_impl_properties_convertToJSON(com_day_cq_mcm_campaign_impl_integration_config_impl_properties_t *com_day_cq_mcm_campaign_impl_integration_config_impl_properties);

#endif /* _com_day_cq_mcm_campaign_impl_integration_config_impl_properties_H_ */

