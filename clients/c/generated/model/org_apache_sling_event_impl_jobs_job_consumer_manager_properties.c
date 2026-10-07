#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_event_impl_jobs_job_consumer_manager_properties.h"



static org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_create_internal(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_array_t *job_consumermanager_whitelist,
    config_node_property_array_t *job_consumermanager_blacklist
    ) {
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var = malloc(sizeof(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t));
    if (!org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var, 0, sizeof(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t));
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var->_library_owned = 1;
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var->org_apache_sling_installer_configuration_persist = org_apache_sling_installer_configuration_persist;
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var->job_consumermanager_whitelist = job_consumermanager_whitelist;
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var->job_consumermanager_blacklist = job_consumermanager_blacklist;
    return org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_create(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_array_t *job_consumermanager_whitelist,
    config_node_property_array_t *job_consumermanager_blacklist
    ) {
    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *result = org_apache_sling_event_impl_jobs_job_consumer_manager_properties_create_internal (
        org_apache_sling_installer_configuration_persist,
        job_consumermanager_whitelist,
        job_consumermanager_blacklist
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_event_impl_jobs_job_consumer_manager_properties_free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties) {
    if(NULL == org_apache_sling_event_impl_jobs_job_consumer_manager_properties){
        return ;
    }
    if(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_event_impl_jobs_job_consumer_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist) {
        config_node_property_boolean_free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist);
        org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist = NULL;
    }
    if (org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist) {
        config_node_property_array_free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist);
        org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist = NULL;
    }
    if (org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist) {
        config_node_property_array_free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist);
        org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist = NULL;
    }
    free(org_apache_sling_event_impl_jobs_job_consumer_manager_properties);
}

cJSON *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_convertToJSON(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist
    if(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist) {
    cJSON *org_apache_sling_installer_configuration_persist_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist);
    if(org_apache_sling_installer_configuration_persist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.installer.configuration.persist", org_apache_sling_installer_configuration_persist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist
    if(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist) {
    cJSON *job_consumermanager_whitelist_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist);
    if(job_consumermanager_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.consumermanager.whitelist", job_consumermanager_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist
    if(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist) {
    cJSON *job_consumermanager_blacklist_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist);
    if(job_consumermanager_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.consumermanager.blacklist", job_consumermanager_blacklist_local_JSON);
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

org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_jobs_job_consumer_manager_propertiesJSON){

    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_t *org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist
    config_node_property_array_t *job_consumermanager_whitelist_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist
    config_node_property_array_t *job_consumermanager_blacklist_local_nonprim = NULL;

    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->org_apache_sling_installer_configuration_persist
    cJSON *org_apache_sling_installer_configuration_persist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_job_consumer_manager_propertiesJSON, "org.apache.sling.installer.configuration.persist");
    if (cJSON_IsNull(org_apache_sling_installer_configuration_persist)) {
        org_apache_sling_installer_configuration_persist = NULL;
    }
    if (org_apache_sling_installer_configuration_persist) { 
    org_apache_sling_installer_configuration_persist_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_installer_configuration_persist); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_whitelist
    cJSON *job_consumermanager_whitelist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_job_consumer_manager_propertiesJSON, "job.consumermanager.whitelist");
    if (cJSON_IsNull(job_consumermanager_whitelist)) {
        job_consumermanager_whitelist = NULL;
    }
    if (job_consumermanager_whitelist) { 
    job_consumermanager_whitelist_local_nonprim = config_node_property_array_parseFromJSON(job_consumermanager_whitelist); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_job_consumer_manager_properties->job_consumermanager_blacklist
    cJSON *job_consumermanager_blacklist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_job_consumer_manager_propertiesJSON, "job.consumermanager.blacklist");
    if (cJSON_IsNull(job_consumermanager_blacklist)) {
        job_consumermanager_blacklist = NULL;
    }
    if (job_consumermanager_blacklist) { 
    job_consumermanager_blacklist_local_nonprim = config_node_property_array_parseFromJSON(job_consumermanager_blacklist); //nonprimitive
    }



    org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var = org_apache_sling_event_impl_jobs_job_consumer_manager_properties_create_internal (
        org_apache_sling_installer_configuration_persist ? org_apache_sling_installer_configuration_persist_local_nonprim : NULL,
        job_consumermanager_whitelist ? job_consumermanager_whitelist_local_nonprim : NULL,
        job_consumermanager_blacklist ? job_consumermanager_blacklist_local_nonprim : NULL
        );

    if (!org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var) {
        goto end;
    }

    return org_apache_sling_event_impl_jobs_job_consumer_manager_properties_local_var;
end:
    if (org_apache_sling_installer_configuration_persist_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_installer_configuration_persist_local_nonprim);
        org_apache_sling_installer_configuration_persist_local_nonprim = NULL;
    }
    if (job_consumermanager_whitelist_local_nonprim) {
        config_node_property_array_free(job_consumermanager_whitelist_local_nonprim);
        job_consumermanager_whitelist_local_nonprim = NULL;
    }
    if (job_consumermanager_blacklist_local_nonprim) {
        config_node_property_array_free(job_consumermanager_blacklist_local_nonprim);
        job_consumermanager_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
