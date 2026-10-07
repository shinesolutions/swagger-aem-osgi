#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_missing_metadata_notification_job_properties.h"



static com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_create_internal(
    config_node_property_boolean_t *cq_dam_missingmetadata_notification_scheduler_istimebased,
    config_node_property_string_t *cq_dam_missingmetadata_notification_scheduler_timebased_rule,
    config_node_property_integer_t *cq_dam_missingmetadata_notification_scheduler_period_rule,
    config_node_property_string_t *cq_dam_missingmetadata_notification_recipient
    ) {
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t));
    if (!com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t));
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var->cq_dam_missingmetadata_notification_scheduler_istimebased = cq_dam_missingmetadata_notification_scheduler_istimebased;
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var->cq_dam_missingmetadata_notification_scheduler_timebased_rule = cq_dam_missingmetadata_notification_scheduler_timebased_rule;
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var->cq_dam_missingmetadata_notification_scheduler_period_rule = cq_dam_missingmetadata_notification_scheduler_period_rule;
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var->cq_dam_missingmetadata_notification_recipient = cq_dam_missingmetadata_notification_recipient;
    return com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_create(
    config_node_property_boolean_t *cq_dam_missingmetadata_notification_scheduler_istimebased,
    config_node_property_string_t *cq_dam_missingmetadata_notification_scheduler_timebased_rule,
    config_node_property_integer_t *cq_dam_missingmetadata_notification_scheduler_period_rule,
    config_node_property_string_t *cq_dam_missingmetadata_notification_recipient
    ) {
    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *result = com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_create_internal (
        cq_dam_missingmetadata_notification_scheduler_istimebased,
        cq_dam_missingmetadata_notification_scheduler_timebased_rule,
        cq_dam_missingmetadata_notification_scheduler_period_rule,
        cq_dam_missingmetadata_notification_recipient
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties) {
    if(NULL == com_day_cq_dam_core_impl_missing_metadata_notification_job_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased);
        com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased = NULL;
    }
    if (com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule) {
        config_node_property_string_free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule);
        com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule = NULL;
    }
    if (com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule);
        com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule = NULL;
    }
    if (com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient) {
        config_node_property_string_free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient);
        com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient = NULL;
    }
    free(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties);
}

cJSON *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_convertToJSON(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased
    if(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased) {
    cJSON *cq_dam_missingmetadata_notification_scheduler_istimebased_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased);
    if(cq_dam_missingmetadata_notification_scheduler_istimebased_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.missingmetadata.notification.scheduler.istimebased", cq_dam_missingmetadata_notification_scheduler_istimebased_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule
    if(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule) {
    cJSON *cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule);
    if(cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.missingmetadata.notification.scheduler.timebased.rule", cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule
    if(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule) {
    cJSON *cq_dam_missingmetadata_notification_scheduler_period_rule_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule);
    if(cq_dam_missingmetadata_notification_scheduler_period_rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.missingmetadata.notification.scheduler.period.rule", cq_dam_missingmetadata_notification_scheduler_period_rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient
    if(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient) {
    cJSON *cq_dam_missingmetadata_notification_recipient_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient);
    if(cq_dam_missingmetadata_notification_recipient_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.missingmetadata.notification.recipient", cq_dam_missingmetadata_notification_recipient_local_JSON);
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

com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_missing_metadata_notification_job_propertiesJSON){

    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_t *com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased
    config_node_property_boolean_t *cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule
    config_node_property_string_t *cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule
    config_node_property_integer_t *cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient
    config_node_property_string_t *cq_dam_missingmetadata_notification_recipient_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_istimebased
    cJSON *cq_dam_missingmetadata_notification_scheduler_istimebased = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_missing_metadata_notification_job_propertiesJSON, "cq.dam.missingmetadata.notification.scheduler.istimebased");
    if (cJSON_IsNull(cq_dam_missingmetadata_notification_scheduler_istimebased)) {
        cq_dam_missingmetadata_notification_scheduler_istimebased = NULL;
    }
    if (cq_dam_missingmetadata_notification_scheduler_istimebased) { 
    cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_missingmetadata_notification_scheduler_istimebased); //nonprimitive
    }

    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_timebased_rule
    cJSON *cq_dam_missingmetadata_notification_scheduler_timebased_rule = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_missing_metadata_notification_job_propertiesJSON, "cq.dam.missingmetadata.notification.scheduler.timebased.rule");
    if (cJSON_IsNull(cq_dam_missingmetadata_notification_scheduler_timebased_rule)) {
        cq_dam_missingmetadata_notification_scheduler_timebased_rule = NULL;
    }
    if (cq_dam_missingmetadata_notification_scheduler_timebased_rule) { 
    cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_missingmetadata_notification_scheduler_timebased_rule); //nonprimitive
    }

    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_scheduler_period_rule
    cJSON *cq_dam_missingmetadata_notification_scheduler_period_rule = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_missing_metadata_notification_job_propertiesJSON, "cq.dam.missingmetadata.notification.scheduler.period.rule");
    if (cJSON_IsNull(cq_dam_missingmetadata_notification_scheduler_period_rule)) {
        cq_dam_missingmetadata_notification_scheduler_period_rule = NULL;
    }
    if (cq_dam_missingmetadata_notification_scheduler_period_rule) { 
    cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_missingmetadata_notification_scheduler_period_rule); //nonprimitive
    }

    // com_day_cq_dam_core_impl_missing_metadata_notification_job_properties->cq_dam_missingmetadata_notification_recipient
    cJSON *cq_dam_missingmetadata_notification_recipient = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_missing_metadata_notification_job_propertiesJSON, "cq.dam.missingmetadata.notification.recipient");
    if (cJSON_IsNull(cq_dam_missingmetadata_notification_recipient)) {
        cq_dam_missingmetadata_notification_recipient = NULL;
    }
    if (cq_dam_missingmetadata_notification_recipient) { 
    cq_dam_missingmetadata_notification_recipient_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_missingmetadata_notification_recipient); //nonprimitive
    }



    com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var = com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_create_internal (
        cq_dam_missingmetadata_notification_scheduler_istimebased ? cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim : NULL,
        cq_dam_missingmetadata_notification_scheduler_timebased_rule ? cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim : NULL,
        cq_dam_missingmetadata_notification_scheduler_period_rule ? cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim : NULL,
        cq_dam_missingmetadata_notification_recipient ? cq_dam_missingmetadata_notification_recipient_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_local_var;
end:
    if (cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim) {
        config_node_property_boolean_free(cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim);
        cq_dam_missingmetadata_notification_scheduler_istimebased_local_nonprim = NULL;
    }
    if (cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim) {
        config_node_property_string_free(cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim);
        cq_dam_missingmetadata_notification_scheduler_timebased_rule_local_nonprim = NULL;
    }
    if (cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim) {
        config_node_property_integer_free(cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim);
        cq_dam_missingmetadata_notification_scheduler_period_rule_local_nonprim = NULL;
    }
    if (cq_dam_missingmetadata_notification_recipient_local_nonprim) {
        config_node_property_string_free(cq_dam_missingmetadata_notification_recipient_local_nonprim);
        cq_dam_missingmetadata_notification_recipient_local_nonprim = NULL;
    }
    return NULL;

}
