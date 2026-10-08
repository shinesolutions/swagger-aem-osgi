#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties.h"



static com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_create_internal(
    config_node_property_array_t *watchwords_positive,
    config_node_property_array_t *watchwords_negative,
    config_node_property_string_t *watchwords_path,
    config_node_property_string_t *sentiment_path
    ) {
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t));
    if (!com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t));
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var->watchwords_positive = watchwords_positive;
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var->watchwords_negative = watchwords_negative;
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var->watchwords_path = watchwords_path;
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var->sentiment_path = sentiment_path;
    return com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_create(
    config_node_property_array_t *watchwords_positive,
    config_node_property_array_t *watchwords_negative,
    config_node_property_string_t *watchwords_path,
    config_node_property_string_t *sentiment_path
    ) {
    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *result = com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_create_internal (
        watchwords_positive,
        watchwords_negative,
        watchwords_path,
        sentiment_path
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive);
        com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive = NULL;
    }
    if (com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative);
        com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative = NULL;
    }
    if (com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path) {
        config_node_property_string_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path);
        com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path = NULL;
    }
    if (com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path) {
        config_node_property_string_free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path);
        com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path = NULL;
    }
    free(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties);
}

cJSON *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive
    if(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive) {
    cJSON *watchwords_positive_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive);
    if(watchwords_positive_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "watchwords.positive", watchwords_positive_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative
    if(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative) {
    cJSON *watchwords_negative_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative);
    if(watchwords_negative_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "watchwords.negative", watchwords_negative_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path
    if(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path) {
    cJSON *watchwords_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path);
    if(watchwords_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "watchwords.path", watchwords_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path
    if(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path) {
    cJSON *sentiment_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path);
    if(sentiment_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sentiment.path", sentiment_path_local_JSON);
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

com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON){

    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive
    config_node_property_array_t *watchwords_positive_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative
    config_node_property_array_t *watchwords_negative_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path
    config_node_property_string_t *watchwords_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path
    config_node_property_string_t *sentiment_path_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_positive
    cJSON *watchwords_positive = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON, "watchwords.positive");
    if (cJSON_IsNull(watchwords_positive)) {
        watchwords_positive = NULL;
    }
    if (watchwords_positive) { 
    watchwords_positive_local_nonprim = config_node_property_array_parseFromJSON(watchwords_positive); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_negative
    cJSON *watchwords_negative = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON, "watchwords.negative");
    if (cJSON_IsNull(watchwords_negative)) {
        watchwords_negative = NULL;
    }
    if (watchwords_negative) { 
    watchwords_negative_local_nonprim = config_node_property_array_parseFromJSON(watchwords_negative); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->watchwords_path
    cJSON *watchwords_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON, "watchwords.path");
    if (cJSON_IsNull(watchwords_path)) {
        watchwords_path = NULL;
    }
    if (watchwords_path) { 
    watchwords_path_local_nonprim = config_node_property_string_parseFromJSON(watchwords_path); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties->sentiment_path
    cJSON *sentiment_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_propertiesJSON, "sentiment.path");
    if (cJSON_IsNull(sentiment_path)) {
        sentiment_path = NULL;
    }
    if (sentiment_path) { 
    sentiment_path_local_nonprim = config_node_property_string_parseFromJSON(sentiment_path); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var = com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_create_internal (
        watchwords_positive ? watchwords_positive_local_nonprim : NULL,
        watchwords_negative ? watchwords_negative_local_nonprim : NULL,
        watchwords_path ? watchwords_path_local_nonprim : NULL,
        sentiment_path ? sentiment_path_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_local_var;
end:
    if (watchwords_positive_local_nonprim) {
        config_node_property_array_free(watchwords_positive_local_nonprim);
        watchwords_positive_local_nonprim = NULL;
    }
    if (watchwords_negative_local_nonprim) {
        config_node_property_array_free(watchwords_negative_local_nonprim);
        watchwords_negative_local_nonprim = NULL;
    }
    if (watchwords_path_local_nonprim) {
        config_node_property_string_free(watchwords_path_local_nonprim);
        watchwords_path_local_nonprim = NULL;
    }
    if (sentiment_path_local_nonprim) {
        config_node_property_string_free(sentiment_path_local_nonprim);
        sentiment_path_local_nonprim = NULL;
    }
    return NULL;

}
