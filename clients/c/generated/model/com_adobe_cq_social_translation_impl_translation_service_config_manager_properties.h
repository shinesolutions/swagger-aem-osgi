/*
 * com_adobe_cq_social_translation_impl_translation_service_config_manager_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_H_
#define _com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t {
    struct config_node_property_drop_down_t *translate_language; //model
    struct config_node_property_drop_down_t *translate_display; //model
    struct config_node_property_boolean_t *translate_attribution; //model
    struct config_node_property_drop_down_t *translate_caching; //model
    struct config_node_property_drop_down_t *translate_smart_rendering; //model
    struct config_node_property_string_t *translate_caching_duration; //model
    struct config_node_property_string_t *translate_session_save_interval; //model
    struct config_node_property_string_t *translate_session_save_batch_limit; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_create(
    config_node_property_drop_down_t *translate_language,
    config_node_property_drop_down_t *translate_display,
    config_node_property_boolean_t *translate_attribution,
    config_node_property_drop_down_t *translate_caching,
    config_node_property_drop_down_t *translate_smart_rendering,
    config_node_property_string_t *translate_caching_duration,
    config_node_property_string_t *translate_session_save_interval,
    config_node_property_string_t *translate_session_save_batch_limit
);

void com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties);

com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_parseFromJSON(cJSON *com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON);

cJSON *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties);

#endif /* _com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_H_ */

