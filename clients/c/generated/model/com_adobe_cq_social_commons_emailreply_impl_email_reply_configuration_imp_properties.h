/*
 * com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_H_
#define _com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t {
    struct config_node_property_string_t *email_name; //model
    struct config_node_property_boolean_t *email_create_post_from_reply; //model
    struct config_node_property_drop_down_t *email_add_comment_id_to; //model
    struct config_node_property_integer_t *email_subject_maximum_length; //model
    struct config_node_property_string_t *email_reply_to_address; //model
    struct config_node_property_string_t *email_reply_to_delimiter; //model
    struct config_node_property_string_t *email_tracker_id_prefix_in_subject; //model
    struct config_node_property_string_t *email_tracker_id_prefix_in_body; //model
    struct config_node_property_boolean_t *email_as_html; //model
    struct config_node_property_string_t *email_default_user_name; //model
    struct config_node_property_string_t *email_templates_root_path; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_create(
    config_node_property_string_t *email_name,
    config_node_property_boolean_t *email_create_post_from_reply,
    config_node_property_drop_down_t *email_add_comment_id_to,
    config_node_property_integer_t *email_subject_maximum_length,
    config_node_property_string_t *email_reply_to_address,
    config_node_property_string_t *email_reply_to_delimiter,
    config_node_property_string_t *email_tracker_id_prefix_in_subject,
    config_node_property_string_t *email_tracker_id_prefix_in_body,
    config_node_property_boolean_t *email_as_html,
    config_node_property_string_t *email_default_user_name,
    config_node_property_string_t *email_templates_root_path
);

void com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties);

com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON);

cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties);

#endif /* _com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_H_ */

