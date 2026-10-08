#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties.h"



static org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_create_internal(
    config_node_property_boolean_t *job_consumermanager_disable_distribution,
    config_node_property_integer_t *startup_delay,
    config_node_property_integer_t *cleanup_period
    ) {
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var = malloc(sizeof(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t));
    if (!org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var, 0, sizeof(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t));
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var->_library_owned = 1;
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var->job_consumermanager_disable_distribution = job_consumermanager_disable_distribution;
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var->startup_delay = startup_delay;
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var->cleanup_period = cleanup_period;
    return org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_create(
    config_node_property_boolean_t *job_consumermanager_disable_distribution,
    config_node_property_integer_t *startup_delay,
    config_node_property_integer_t *cleanup_period
    ) {
    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *result = org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_create_internal (
        job_consumermanager_disable_distribution,
        startup_delay,
        cleanup_period
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties) {
    if(NULL == org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties){
        return ;
    }
    if(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution) {
        config_node_property_boolean_free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution);
        org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution = NULL;
    }
    if (org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay) {
        config_node_property_integer_free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay);
        org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay = NULL;
    }
    if (org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period) {
        config_node_property_integer_free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period);
        org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period = NULL;
    }
    free(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties);
}

cJSON *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_convertToJSON(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution
    if(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution) {
    cJSON *job_consumermanager_disable_distribution_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution);
    if(job_consumermanager_disable_distribution_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.consumermanager.disableDistribution", job_consumermanager_disable_distribution_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay
    if(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay) {
    cJSON *startup_delay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay);
    if(startup_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "startup.delay", startup_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period
    if(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period) {
    cJSON *cleanup_period_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period);
    if(cleanup_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cleanup.period", cleanup_period_local_JSON);
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

org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_jobs_jcr_persistence_handler_propertiesJSON){

    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_t *org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution
    config_node_property_boolean_t *job_consumermanager_disable_distribution_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay
    config_node_property_integer_t *startup_delay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period
    config_node_property_integer_t *cleanup_period_local_nonprim = NULL;

    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->job_consumermanager_disable_distribution
    cJSON *job_consumermanager_disable_distribution = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_jcr_persistence_handler_propertiesJSON, "job.consumermanager.disableDistribution");
    if (cJSON_IsNull(job_consumermanager_disable_distribution)) {
        job_consumermanager_disable_distribution = NULL;
    }
    if (job_consumermanager_disable_distribution) { 
    job_consumermanager_disable_distribution_local_nonprim = config_node_property_boolean_parseFromJSON(job_consumermanager_disable_distribution); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->startup_delay
    cJSON *startup_delay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_jcr_persistence_handler_propertiesJSON, "startup.delay");
    if (cJSON_IsNull(startup_delay)) {
        startup_delay = NULL;
    }
    if (startup_delay) { 
    startup_delay_local_nonprim = config_node_property_integer_parseFromJSON(startup_delay); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties->cleanup_period
    cJSON *cleanup_period = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_jcr_persistence_handler_propertiesJSON, "cleanup.period");
    if (cJSON_IsNull(cleanup_period)) {
        cleanup_period = NULL;
    }
    if (cleanup_period) { 
    cleanup_period_local_nonprim = config_node_property_integer_parseFromJSON(cleanup_period); //nonprimitive
    }



    org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var = org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_create_internal (
        job_consumermanager_disable_distribution ? job_consumermanager_disable_distribution_local_nonprim : NULL,
        startup_delay ? startup_delay_local_nonprim : NULL,
        cleanup_period ? cleanup_period_local_nonprim : NULL
        );

    if (!org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var) {
        goto end;
    }

    return org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_local_var;
end:
    if (job_consumermanager_disable_distribution_local_nonprim) {
        config_node_property_boolean_free(job_consumermanager_disable_distribution_local_nonprim);
        job_consumermanager_disable_distribution_local_nonprim = NULL;
    }
    if (startup_delay_local_nonprim) {
        config_node_property_integer_free(startup_delay_local_nonprim);
        startup_delay_local_nonprim = NULL;
    }
    if (cleanup_period_local_nonprim) {
        config_node_property_integer_free(cleanup_period_local_nonprim);
        cleanup_period_local_nonprim = NULL;
    }
    return NULL;

}
