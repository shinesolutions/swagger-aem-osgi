#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties.h"



static com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_create_internal(
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
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t));
    if (!com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t));
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_name = email_name;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_create_post_from_reply = email_create_post_from_reply;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_add_comment_id_to = email_add_comment_id_to;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_subject_maximum_length = email_subject_maximum_length;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_reply_to_address = email_reply_to_address;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_reply_to_delimiter = email_reply_to_delimiter;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_tracker_id_prefix_in_subject = email_tracker_id_prefix_in_subject;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_tracker_id_prefix_in_body = email_tracker_id_prefix_in_body;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_as_html = email_as_html;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_default_user_name = email_default_user_name;
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var->email_templates_root_path = email_templates_root_path;
    return com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var;
}

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
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *result = com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_create_internal (
        email_name,
        email_create_post_from_reply,
        email_add_comment_id_to,
        email_subject_maximum_length,
        email_reply_to_address,
        email_reply_to_delimiter,
        email_tracker_id_prefix_in_subject,
        email_tracker_id_prefix_in_body,
        email_as_html,
        email_default_user_name,
        email_templates_root_path
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties) {
    if(NULL == com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply) {
        config_node_property_boolean_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to) {
        config_node_property_drop_down_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length) {
        config_node_property_integer_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html) {
        config_node_property_boolean_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path);
        com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path = NULL;
    }
    free(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties);
}

cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name) {
    cJSON *email_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name);
    if(email_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.name", email_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply) {
    cJSON *email_create_post_from_reply_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply);
    if(email_create_post_from_reply_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.createPostFromReply", email_create_post_from_reply_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to) {
    cJSON *email_add_comment_id_to_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to);
    if(email_add_comment_id_to_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.addCommentIdTo", email_add_comment_id_to_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length) {
    cJSON *email_subject_maximum_length_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length);
    if(email_subject_maximum_length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.subjectMaximumLength", email_subject_maximum_length_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address) {
    cJSON *email_reply_to_address_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address);
    if(email_reply_to_address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.replyToAddress", email_reply_to_address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter) {
    cJSON *email_reply_to_delimiter_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter);
    if(email_reply_to_delimiter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.replyToDelimiter", email_reply_to_delimiter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject) {
    cJSON *email_tracker_id_prefix_in_subject_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject);
    if(email_tracker_id_prefix_in_subject_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.trackerIdPrefixInSubject", email_tracker_id_prefix_in_subject_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body) {
    cJSON *email_tracker_id_prefix_in_body_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body);
    if(email_tracker_id_prefix_in_body_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.trackerIdPrefixInBody", email_tracker_id_prefix_in_body_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html) {
    cJSON *email_as_html_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html);
    if(email_as_html_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.asHTML", email_as_html_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name) {
    cJSON *email_default_user_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name);
    if(email_default_user_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.defaultUserName", email_default_user_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path
    if(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path) {
    cJSON *email_templates_root_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path);
    if(email_templates_root_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "email.templates.rootPath", email_templates_root_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON){

    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name
    config_node_property_string_t *email_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply
    config_node_property_boolean_t *email_create_post_from_reply_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to
    config_node_property_drop_down_t *email_add_comment_id_to_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length
    config_node_property_integer_t *email_subject_maximum_length_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address
    config_node_property_string_t *email_reply_to_address_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter
    config_node_property_string_t *email_reply_to_delimiter_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject
    config_node_property_string_t *email_tracker_id_prefix_in_subject_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body
    config_node_property_string_t *email_tracker_id_prefix_in_body_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html
    config_node_property_boolean_t *email_as_html_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name
    config_node_property_string_t *email_default_user_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path
    config_node_property_string_t *email_templates_root_path_local_nonprim = NULL;

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_name
    cJSON *email_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.name");
    if (cJSON_IsNull(email_name)) {
        email_name = NULL;
    }
    if (email_name) { 
    email_name_local_nonprim = config_node_property_string_parseFromJSON(email_name); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_create_post_from_reply
    cJSON *email_create_post_from_reply = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.createPostFromReply");
    if (cJSON_IsNull(email_create_post_from_reply)) {
        email_create_post_from_reply = NULL;
    }
    if (email_create_post_from_reply) { 
    email_create_post_from_reply_local_nonprim = config_node_property_boolean_parseFromJSON(email_create_post_from_reply); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_add_comment_id_to
    cJSON *email_add_comment_id_to = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.addCommentIdTo");
    if (cJSON_IsNull(email_add_comment_id_to)) {
        email_add_comment_id_to = NULL;
    }
    if (email_add_comment_id_to) { 
    email_add_comment_id_to_local_nonprim = config_node_property_drop_down_parseFromJSON(email_add_comment_id_to); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_subject_maximum_length
    cJSON *email_subject_maximum_length = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.subjectMaximumLength");
    if (cJSON_IsNull(email_subject_maximum_length)) {
        email_subject_maximum_length = NULL;
    }
    if (email_subject_maximum_length) { 
    email_subject_maximum_length_local_nonprim = config_node_property_integer_parseFromJSON(email_subject_maximum_length); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_address
    cJSON *email_reply_to_address = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.replyToAddress");
    if (cJSON_IsNull(email_reply_to_address)) {
        email_reply_to_address = NULL;
    }
    if (email_reply_to_address) { 
    email_reply_to_address_local_nonprim = config_node_property_string_parseFromJSON(email_reply_to_address); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_reply_to_delimiter
    cJSON *email_reply_to_delimiter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.replyToDelimiter");
    if (cJSON_IsNull(email_reply_to_delimiter)) {
        email_reply_to_delimiter = NULL;
    }
    if (email_reply_to_delimiter) { 
    email_reply_to_delimiter_local_nonprim = config_node_property_string_parseFromJSON(email_reply_to_delimiter); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_subject
    cJSON *email_tracker_id_prefix_in_subject = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.trackerIdPrefixInSubject");
    if (cJSON_IsNull(email_tracker_id_prefix_in_subject)) {
        email_tracker_id_prefix_in_subject = NULL;
    }
    if (email_tracker_id_prefix_in_subject) { 
    email_tracker_id_prefix_in_subject_local_nonprim = config_node_property_string_parseFromJSON(email_tracker_id_prefix_in_subject); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_tracker_id_prefix_in_body
    cJSON *email_tracker_id_prefix_in_body = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.trackerIdPrefixInBody");
    if (cJSON_IsNull(email_tracker_id_prefix_in_body)) {
        email_tracker_id_prefix_in_body = NULL;
    }
    if (email_tracker_id_prefix_in_body) { 
    email_tracker_id_prefix_in_body_local_nonprim = config_node_property_string_parseFromJSON(email_tracker_id_prefix_in_body); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_as_html
    cJSON *email_as_html = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.asHTML");
    if (cJSON_IsNull(email_as_html)) {
        email_as_html = NULL;
    }
    if (email_as_html) { 
    email_as_html_local_nonprim = config_node_property_boolean_parseFromJSON(email_as_html); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_default_user_name
    cJSON *email_default_user_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.defaultUserName");
    if (cJSON_IsNull(email_default_user_name)) {
        email_default_user_name = NULL;
    }
    if (email_default_user_name) { 
    email_default_user_name_local_nonprim = config_node_property_string_parseFromJSON(email_default_user_name); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties->email_templates_root_path
    cJSON *email_templates_root_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_propertiesJSON, "email.templates.rootPath");
    if (cJSON_IsNull(email_templates_root_path)) {
        email_templates_root_path = NULL;
    }
    if (email_templates_root_path) { 
    email_templates_root_path_local_nonprim = config_node_property_string_parseFromJSON(email_templates_root_path); //nonprimitive
    }



    com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var = com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_create_internal (
        email_name ? email_name_local_nonprim : NULL,
        email_create_post_from_reply ? email_create_post_from_reply_local_nonprim : NULL,
        email_add_comment_id_to ? email_add_comment_id_to_local_nonprim : NULL,
        email_subject_maximum_length ? email_subject_maximum_length_local_nonprim : NULL,
        email_reply_to_address ? email_reply_to_address_local_nonprim : NULL,
        email_reply_to_delimiter ? email_reply_to_delimiter_local_nonprim : NULL,
        email_tracker_id_prefix_in_subject ? email_tracker_id_prefix_in_subject_local_nonprim : NULL,
        email_tracker_id_prefix_in_body ? email_tracker_id_prefix_in_body_local_nonprim : NULL,
        email_as_html ? email_as_html_local_nonprim : NULL,
        email_default_user_name ? email_default_user_name_local_nonprim : NULL,
        email_templates_root_path ? email_templates_root_path_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_local_var;
end:
    if (email_name_local_nonprim) {
        config_node_property_string_free(email_name_local_nonprim);
        email_name_local_nonprim = NULL;
    }
    if (email_create_post_from_reply_local_nonprim) {
        config_node_property_boolean_free(email_create_post_from_reply_local_nonprim);
        email_create_post_from_reply_local_nonprim = NULL;
    }
    if (email_add_comment_id_to_local_nonprim) {
        config_node_property_drop_down_free(email_add_comment_id_to_local_nonprim);
        email_add_comment_id_to_local_nonprim = NULL;
    }
    if (email_subject_maximum_length_local_nonprim) {
        config_node_property_integer_free(email_subject_maximum_length_local_nonprim);
        email_subject_maximum_length_local_nonprim = NULL;
    }
    if (email_reply_to_address_local_nonprim) {
        config_node_property_string_free(email_reply_to_address_local_nonprim);
        email_reply_to_address_local_nonprim = NULL;
    }
    if (email_reply_to_delimiter_local_nonprim) {
        config_node_property_string_free(email_reply_to_delimiter_local_nonprim);
        email_reply_to_delimiter_local_nonprim = NULL;
    }
    if (email_tracker_id_prefix_in_subject_local_nonprim) {
        config_node_property_string_free(email_tracker_id_prefix_in_subject_local_nonprim);
        email_tracker_id_prefix_in_subject_local_nonprim = NULL;
    }
    if (email_tracker_id_prefix_in_body_local_nonprim) {
        config_node_property_string_free(email_tracker_id_prefix_in_body_local_nonprim);
        email_tracker_id_prefix_in_body_local_nonprim = NULL;
    }
    if (email_as_html_local_nonprim) {
        config_node_property_boolean_free(email_as_html_local_nonprim);
        email_as_html_local_nonprim = NULL;
    }
    if (email_default_user_name_local_nonprim) {
        config_node_property_string_free(email_default_user_name_local_nonprim);
        email_default_user_name_local_nonprim = NULL;
    }
    if (email_templates_root_path_local_nonprim) {
        config_node_property_string_free(email_templates_root_path_local_nonprim);
        email_templates_root_path_local_nonprim = NULL;
    }
    return NULL;

}
