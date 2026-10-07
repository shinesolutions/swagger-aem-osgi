/*
 * com_adobe_cq_social_translation_impl_ugc_language_detector_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_translation_impl_ugc_language_detector_properties_H_
#define _com_adobe_cq_social_translation_impl_ugc_language_detector_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t {
    struct config_node_property_string_t *event_topics; //model
    struct config_node_property_string_t *event_filter; //model
    struct config_node_property_array_t *translate_listener_type; //model
    struct config_node_property_array_t *translate_property_list; //model
    struct config_node_property_integer_t *pool_size; //model
    struct config_node_property_integer_t *max_pool_size; //model
    struct config_node_property_integer_t *queue_size; //model
    struct config_node_property_integer_t *keep_alive_time; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_create(
    config_node_property_string_t *event_topics,
    config_node_property_string_t *event_filter,
    config_node_property_array_t *translate_listener_type,
    config_node_property_array_t *translate_property_list,
    config_node_property_integer_t *pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *keep_alive_time
);

void com_adobe_cq_social_translation_impl_ugc_language_detector_properties_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties);

com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_parseFromJSON(cJSON *com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON);

cJSON *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties);

#endif /* _com_adobe_cq_social_translation_impl_ugc_language_detector_properties_H_ */

