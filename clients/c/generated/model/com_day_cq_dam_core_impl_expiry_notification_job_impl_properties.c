#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_expiry_notification_job_impl_properties.h"



static com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_create_internal(
    config_node_property_boolean_t *cq_dam_expiry_notification_scheduler_istimebased,
    config_node_property_string_t *cq_dam_expiry_notification_scheduler_timebased_rule,
    config_node_property_integer_t *cq_dam_expiry_notification_scheduler_period_rule,
    config_node_property_boolean_t *send_email,
    config_node_property_integer_t *asset_expired_limit,
    config_node_property_integer_t *prior_notification_seconds,
    config_node_property_string_t *cq_dam_expiry_notification_url_protocol
    ) {
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t));
    if (!com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t));
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->cq_dam_expiry_notification_scheduler_istimebased = cq_dam_expiry_notification_scheduler_istimebased;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->cq_dam_expiry_notification_scheduler_timebased_rule = cq_dam_expiry_notification_scheduler_timebased_rule;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->cq_dam_expiry_notification_scheduler_period_rule = cq_dam_expiry_notification_scheduler_period_rule;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->send_email = send_email;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->asset_expired_limit = asset_expired_limit;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->prior_notification_seconds = prior_notification_seconds;
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var->cq_dam_expiry_notification_url_protocol = cq_dam_expiry_notification_url_protocol;
    return com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_create(
    config_node_property_boolean_t *cq_dam_expiry_notification_scheduler_istimebased,
    config_node_property_string_t *cq_dam_expiry_notification_scheduler_timebased_rule,
    config_node_property_integer_t *cq_dam_expiry_notification_scheduler_period_rule,
    config_node_property_boolean_t *send_email,
    config_node_property_integer_t *asset_expired_limit,
    config_node_property_integer_t *prior_notification_seconds,
    config_node_property_string_t *cq_dam_expiry_notification_url_protocol
    ) {
    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *result = com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_create_internal (
        cq_dam_expiry_notification_scheduler_istimebased,
        cq_dam_expiry_notification_scheduler_timebased_rule,
        cq_dam_expiry_notification_scheduler_period_rule,
        send_email,
        asset_expired_limit,
        prior_notification_seconds,
        cq_dam_expiry_notification_url_protocol
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties) {
    if(NULL == com_day_cq_dam_core_impl_expiry_notification_job_impl_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule) {
        config_node_property_string_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds = NULL;
    }
    if (com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol) {
        config_node_property_string_free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol);
        com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol = NULL;
    }
    free(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties);
}

cJSON *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased) {
    cJSON *cq_dam_expiry_notification_scheduler_istimebased_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased);
    if(cq_dam_expiry_notification_scheduler_istimebased_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.expiry.notification.scheduler.istimebased", cq_dam_expiry_notification_scheduler_istimebased_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule) {
    cJSON *cq_dam_expiry_notification_scheduler_timebased_rule_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule);
    if(cq_dam_expiry_notification_scheduler_timebased_rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.expiry.notification.scheduler.timebased.rule", cq_dam_expiry_notification_scheduler_timebased_rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule) {
    cJSON *cq_dam_expiry_notification_scheduler_period_rule_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule);
    if(cq_dam_expiry_notification_scheduler_period_rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.expiry.notification.scheduler.period.rule", cq_dam_expiry_notification_scheduler_period_rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email) {
    cJSON *send_email_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email);
    if(send_email_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "send_email", send_email_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit) {
    cJSON *asset_expired_limit_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit);
    if(asset_expired_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_expired_limit", asset_expired_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds) {
    cJSON *prior_notification_seconds_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds);
    if(prior_notification_seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prior_notification_seconds", prior_notification_seconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol
    if(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol) {
    cJSON *cq_dam_expiry_notification_url_protocol_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol);
    if(cq_dam_expiry_notification_url_protocol_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.expiry.notification.url.protocol", cq_dam_expiry_notification_url_protocol_local_JSON);
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

com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON){

    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_t *com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased
    config_node_property_boolean_t *cq_dam_expiry_notification_scheduler_istimebased_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule
    config_node_property_string_t *cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule
    config_node_property_integer_t *cq_dam_expiry_notification_scheduler_period_rule_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email
    config_node_property_boolean_t *send_email_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit
    config_node_property_integer_t *asset_expired_limit_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds
    config_node_property_integer_t *prior_notification_seconds_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol
    config_node_property_string_t *cq_dam_expiry_notification_url_protocol_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_istimebased
    cJSON *cq_dam_expiry_notification_scheduler_istimebased = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "cq.dam.expiry.notification.scheduler.istimebased");
    if (cJSON_IsNull(cq_dam_expiry_notification_scheduler_istimebased)) {
        cq_dam_expiry_notification_scheduler_istimebased = NULL;
    }
    if (cq_dam_expiry_notification_scheduler_istimebased) { 
    cq_dam_expiry_notification_scheduler_istimebased_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_expiry_notification_scheduler_istimebased); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_timebased_rule
    cJSON *cq_dam_expiry_notification_scheduler_timebased_rule = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "cq.dam.expiry.notification.scheduler.timebased.rule");
    if (cJSON_IsNull(cq_dam_expiry_notification_scheduler_timebased_rule)) {
        cq_dam_expiry_notification_scheduler_timebased_rule = NULL;
    }
    if (cq_dam_expiry_notification_scheduler_timebased_rule) { 
    cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_expiry_notification_scheduler_timebased_rule); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_scheduler_period_rule
    cJSON *cq_dam_expiry_notification_scheduler_period_rule = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "cq.dam.expiry.notification.scheduler.period.rule");
    if (cJSON_IsNull(cq_dam_expiry_notification_scheduler_period_rule)) {
        cq_dam_expiry_notification_scheduler_period_rule = NULL;
    }
    if (cq_dam_expiry_notification_scheduler_period_rule) { 
    cq_dam_expiry_notification_scheduler_period_rule_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_expiry_notification_scheduler_period_rule); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->send_email
    cJSON *send_email = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "send_email");
    if (cJSON_IsNull(send_email)) {
        send_email = NULL;
    }
    if (send_email) { 
    send_email_local_nonprim = config_node_property_boolean_parseFromJSON(send_email); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->asset_expired_limit
    cJSON *asset_expired_limit = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "asset_expired_limit");
    if (cJSON_IsNull(asset_expired_limit)) {
        asset_expired_limit = NULL;
    }
    if (asset_expired_limit) { 
    asset_expired_limit_local_nonprim = config_node_property_integer_parseFromJSON(asset_expired_limit); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->prior_notification_seconds
    cJSON *prior_notification_seconds = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "prior_notification_seconds");
    if (cJSON_IsNull(prior_notification_seconds)) {
        prior_notification_seconds = NULL;
    }
    if (prior_notification_seconds) { 
    prior_notification_seconds_local_nonprim = config_node_property_integer_parseFromJSON(prior_notification_seconds); //nonprimitive
    }

    // com_day_cq_dam_core_impl_expiry_notification_job_impl_properties->cq_dam_expiry_notification_url_protocol
    cJSON *cq_dam_expiry_notification_url_protocol = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_expiry_notification_job_impl_propertiesJSON, "cq.dam.expiry.notification.url.protocol");
    if (cJSON_IsNull(cq_dam_expiry_notification_url_protocol)) {
        cq_dam_expiry_notification_url_protocol = NULL;
    }
    if (cq_dam_expiry_notification_url_protocol) { 
    cq_dam_expiry_notification_url_protocol_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_expiry_notification_url_protocol); //nonprimitive
    }



    com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var = com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_create_internal (
        cq_dam_expiry_notification_scheduler_istimebased ? cq_dam_expiry_notification_scheduler_istimebased_local_nonprim : NULL,
        cq_dam_expiry_notification_scheduler_timebased_rule ? cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim : NULL,
        cq_dam_expiry_notification_scheduler_period_rule ? cq_dam_expiry_notification_scheduler_period_rule_local_nonprim : NULL,
        send_email ? send_email_local_nonprim : NULL,
        asset_expired_limit ? asset_expired_limit_local_nonprim : NULL,
        prior_notification_seconds ? prior_notification_seconds_local_nonprim : NULL,
        cq_dam_expiry_notification_url_protocol ? cq_dam_expiry_notification_url_protocol_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_local_var;
end:
    if (cq_dam_expiry_notification_scheduler_istimebased_local_nonprim) {
        config_node_property_boolean_free(cq_dam_expiry_notification_scheduler_istimebased_local_nonprim);
        cq_dam_expiry_notification_scheduler_istimebased_local_nonprim = NULL;
    }
    if (cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim) {
        config_node_property_string_free(cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim);
        cq_dam_expiry_notification_scheduler_timebased_rule_local_nonprim = NULL;
    }
    if (cq_dam_expiry_notification_scheduler_period_rule_local_nonprim) {
        config_node_property_integer_free(cq_dam_expiry_notification_scheduler_period_rule_local_nonprim);
        cq_dam_expiry_notification_scheduler_period_rule_local_nonprim = NULL;
    }
    if (send_email_local_nonprim) {
        config_node_property_boolean_free(send_email_local_nonprim);
        send_email_local_nonprim = NULL;
    }
    if (asset_expired_limit_local_nonprim) {
        config_node_property_integer_free(asset_expired_limit_local_nonprim);
        asset_expired_limit_local_nonprim = NULL;
    }
    if (prior_notification_seconds_local_nonprim) {
        config_node_property_integer_free(prior_notification_seconds_local_nonprim);
        prior_notification_seconds_local_nonprim = NULL;
    }
    if (cq_dam_expiry_notification_url_protocol_local_nonprim) {
        config_node_property_string_free(cq_dam_expiry_notification_url_protocol_local_nonprim);
        cq_dam_expiry_notification_url_protocol_local_nonprim = NULL;
    }
    return NULL;

}
