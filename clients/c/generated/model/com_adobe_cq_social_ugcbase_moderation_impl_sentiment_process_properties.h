/*
 * com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_H_
#define _com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t {
    struct config_node_property_array_t *watchwords_positive; //model
    struct config_node_property_array_t *watchwords_negative; //model
    struct config_node_property_string_t *watchwords_path; //model
    struct config_node_property_string_t *sentiment_path; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_create(
    config_node_property_array_t *watchwords_positive,
    config_node_property_array_t *watchwords_negative,
    config_node_property_string_t *watchwords_path,
    config_node_property_string_t *sentiment_path
);

void com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties);

com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON);

cJSON *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties);

#endif /* _com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_H_ */

