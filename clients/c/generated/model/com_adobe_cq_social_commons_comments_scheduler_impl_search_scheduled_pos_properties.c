#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties.h"



static com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_create_internal(
    config_node_property_boolean_t *enable_scheduled_posts_search,
    config_node_property_integer_t *number_of_minutes,
    config_node_property_integer_t *max_search_limit
    ) {
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t));
    if (!com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t));
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var->enable_scheduled_posts_search = enable_scheduled_posts_search;
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var->number_of_minutes = number_of_minutes;
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var->max_search_limit = max_search_limit;
    return com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_create(
    config_node_property_boolean_t *enable_scheduled_posts_search,
    config_node_property_integer_t *number_of_minutes,
    config_node_property_integer_t *max_search_limit
    ) {
    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *result = com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_create_internal (
        enable_scheduled_posts_search,
        number_of_minutes,
        max_search_limit
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_free(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties) {
    if(NULL == com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search) {
        config_node_property_boolean_free(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search);
        com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search = NULL;
    }
    if (com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes) {
        config_node_property_integer_free(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes);
        com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes = NULL;
    }
    if (com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit) {
        config_node_property_integer_free(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit);
        com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit = NULL;
    }
    free(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties);
}

cJSON *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_convertToJSON(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search
    if(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search) {
    cJSON *enable_scheduled_posts_search_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search);
    if(enable_scheduled_posts_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableScheduledPostsSearch", enable_scheduled_posts_search_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes
    if(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes) {
    cJSON *number_of_minutes_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes);
    if(number_of_minutes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "numberOfMinutes", number_of_minutes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit
    if(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit) {
    cJSON *max_search_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit);
    if(max_search_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxSearchLimit", max_search_limit_local_JSON);
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

com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_propertiesJSON){

    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_t *com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search
    config_node_property_boolean_t *enable_scheduled_posts_search_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes
    config_node_property_integer_t *number_of_minutes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit
    config_node_property_integer_t *max_search_limit_local_nonprim = NULL;

    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->enable_scheduled_posts_search
    cJSON *enable_scheduled_posts_search = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_propertiesJSON, "enableScheduledPostsSearch");
    if (cJSON_IsNull(enable_scheduled_posts_search)) {
        enable_scheduled_posts_search = NULL;
    }
    if (enable_scheduled_posts_search) { 
    enable_scheduled_posts_search_local_nonprim = config_node_property_boolean_parseFromJSON(enable_scheduled_posts_search); //nonprimitive
    }

    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->number_of_minutes
    cJSON *number_of_minutes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_propertiesJSON, "numberOfMinutes");
    if (cJSON_IsNull(number_of_minutes)) {
        number_of_minutes = NULL;
    }
    if (number_of_minutes) { 
    number_of_minutes_local_nonprim = config_node_property_integer_parseFromJSON(number_of_minutes); //nonprimitive
    }

    // com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties->max_search_limit
    cJSON *max_search_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_propertiesJSON, "maxSearchLimit");
    if (cJSON_IsNull(max_search_limit)) {
        max_search_limit = NULL;
    }
    if (max_search_limit) { 
    max_search_limit_local_nonprim = config_node_property_integer_parseFromJSON(max_search_limit); //nonprimitive
    }



    com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var = com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_create_internal (
        enable_scheduled_posts_search ? enable_scheduled_posts_search_local_nonprim : NULL,
        number_of_minutes ? number_of_minutes_local_nonprim : NULL,
        max_search_limit ? max_search_limit_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties_local_var;
end:
    if (enable_scheduled_posts_search_local_nonprim) {
        config_node_property_boolean_free(enable_scheduled_posts_search_local_nonprim);
        enable_scheduled_posts_search_local_nonprim = NULL;
    }
    if (number_of_minutes_local_nonprim) {
        config_node_property_integer_free(number_of_minutes_local_nonprim);
        number_of_minutes_local_nonprim = NULL;
    }
    if (max_search_limit_local_nonprim) {
        config_node_property_integer_free(max_search_limit_local_nonprim);
        max_search_limit_local_nonprim = NULL;
    }
    return NULL;

}
