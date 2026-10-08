#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties.h"



static org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *chunk_cleanup_age
    ) {
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var = malloc(sizeof(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t));
    if (!org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var, 0, sizeof(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t));
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var->_library_owned = 1;
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var->scheduler_expression = scheduler_expression;
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var->scheduler_concurrent = scheduler_concurrent;
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var->chunk_cleanup_age = chunk_cleanup_age;
    return org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *chunk_cleanup_age
    ) {
    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *result = org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_create_internal (
        scheduler_expression,
        scheduler_concurrent,
        chunk_cleanup_age
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties) {
    if(NULL == org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties){
        return ;
    }
    if(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression) {
        config_node_property_string_free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression);
        org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression = NULL;
    }
    if (org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent) {
        config_node_property_boolean_free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent);
        org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent = NULL;
    }
    if (org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age) {
        config_node_property_integer_free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age);
        org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age = NULL;
    }
    free(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties);
}

cJSON *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_convertToJSON(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression
    if(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent
    if(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent) {
    cJSON *scheduler_concurrent_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent);
    if(scheduler_concurrent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.concurrent", scheduler_concurrent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age
    if(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age) {
    cJSON *chunk_cleanup_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age);
    if(chunk_cleanup_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chunk.cleanup.age", chunk_cleanup_age_local_JSON);
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

org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_parseFromJSON(cJSON *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_propertiesJSON){

    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_t *org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent
    config_node_property_boolean_t *scheduler_concurrent_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age
    config_node_property_integer_t *chunk_cleanup_age_local_nonprim = NULL;

    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->scheduler_concurrent
    cJSON *scheduler_concurrent = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_propertiesJSON, "scheduler.concurrent");
    if (cJSON_IsNull(scheduler_concurrent)) {
        scheduler_concurrent = NULL;
    }
    if (scheduler_concurrent) { 
    scheduler_concurrent_local_nonprim = config_node_property_boolean_parseFromJSON(scheduler_concurrent); //nonprimitive
    }

    // org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties->chunk_cleanup_age
    cJSON *chunk_cleanup_age = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_propertiesJSON, "chunk.cleanup.age");
    if (cJSON_IsNull(chunk_cleanup_age)) {
        chunk_cleanup_age = NULL;
    }
    if (chunk_cleanup_age) { 
    chunk_cleanup_age_local_nonprim = config_node_property_integer_parseFromJSON(chunk_cleanup_age); //nonprimitive
    }



    org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var = org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        scheduler_concurrent ? scheduler_concurrent_local_nonprim : NULL,
        chunk_cleanup_age ? chunk_cleanup_age_local_nonprim : NULL
        );

    if (!org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var) {
        goto end;
    }

    return org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (scheduler_concurrent_local_nonprim) {
        config_node_property_boolean_free(scheduler_concurrent_local_nonprim);
        scheduler_concurrent_local_nonprim = NULL;
    }
    if (chunk_cleanup_age_local_nonprim) {
        config_node_property_integer_free(chunk_cleanup_age_local_nonprim);
        chunk_cleanup_age_local_nonprim = NULL;
    }
    return NULL;

}
