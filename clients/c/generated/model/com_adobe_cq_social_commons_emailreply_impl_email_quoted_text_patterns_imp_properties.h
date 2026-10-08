/*
 * com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_H_
#define _com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t {
    struct config_node_property_string_t *pattern_time; //model
    struct config_node_property_string_t *pattern_newline; //model
    struct config_node_property_string_t *pattern_day_of_month; //model
    struct config_node_property_string_t *pattern_month; //model
    struct config_node_property_string_t *pattern_year; //model
    struct config_node_property_string_t *pattern_date; //model
    struct config_node_property_string_t *pattern_date_time; //model
    struct config_node_property_string_t *pattern_email; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_create(
    config_node_property_string_t *pattern_time,
    config_node_property_string_t *pattern_newline,
    config_node_property_string_t *pattern_day_of_month,
    config_node_property_string_t *pattern_month,
    config_node_property_string_t *pattern_year,
    config_node_property_string_t *pattern_date,
    config_node_property_string_t *pattern_date_time,
    config_node_property_string_t *pattern_email
);

void com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties);

com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON);

cJSON *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties);

#endif /* _com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_H_ */

