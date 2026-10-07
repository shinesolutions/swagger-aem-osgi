#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties.h"



static org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_create_internal(
    config_node_property_integer_t *max_quartz_job_duration_acceptable
    ) {
    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var = malloc(sizeof(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t));
    if (!org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var, 0, sizeof(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t));
    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var->max_quartz_job_duration_acceptable = max_quartz_job_duration_acceptable;
    return org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_create(
    config_node_property_integer_t *max_quartz_job_duration_acceptable
    ) {
    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *result = org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_create_internal (
        max_quartz_job_duration_acceptable
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_free(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties) {
    if(NULL == org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties){
        return ;
    }
    if(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable) {
        config_node_property_integer_free(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable);
        org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable = NULL;
    }
    free(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties);
}

cJSON *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_convertToJSON(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable
    if(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable) {
    cJSON *max_quartz_job_duration_acceptable_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable);
    if(max_quartz_job_duration_acceptable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.quartzJob.duration.acceptable", max_quartz_job_duration_acceptable_local_JSON);
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

org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_parseFromJSON(cJSON *org_apache_sling_commons_scheduler_impl_scheduler_health_check_propertiesJSON){

    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_t *org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable
    config_node_property_integer_t *max_quartz_job_duration_acceptable_local_nonprim = NULL;

    // org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties->max_quartz_job_duration_acceptable
    cJSON *max_quartz_job_duration_acceptable = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_scheduler_health_check_propertiesJSON, "max.quartzJob.duration.acceptable");
    if (cJSON_IsNull(max_quartz_job_duration_acceptable)) {
        max_quartz_job_duration_acceptable = NULL;
    }
    if (max_quartz_job_duration_acceptable) { 
    max_quartz_job_duration_acceptable_local_nonprim = config_node_property_integer_parseFromJSON(max_quartz_job_duration_acceptable); //nonprimitive
    }



    org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var = org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_create_internal (
        max_quartz_job_duration_acceptable ? max_quartz_job_duration_acceptable_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties_local_var;
end:
    if (max_quartz_job_duration_acceptable_local_nonprim) {
        config_node_property_integer_free(max_quartz_job_duration_acceptable_local_nonprim);
        max_quartz_job_duration_acceptable_local_nonprim = NULL;
    }
    return NULL;

}
