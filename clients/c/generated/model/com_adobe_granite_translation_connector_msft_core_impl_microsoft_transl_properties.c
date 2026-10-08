#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties.h"



static com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_create_internal(
    config_node_property_string_t *translation_factory,
    config_node_property_string_t *default_connector_label,
    config_node_property_string_t *default_connector_attribution,
    config_node_property_string_t *default_connector_workspace_id,
    config_node_property_string_t *default_connector_subscription_key,
    config_node_property_string_t *language_map_location,
    config_node_property_string_t *category_map_location,
    config_node_property_integer_t *retry_attempts,
    config_node_property_integer_t *timeout_count
    ) {
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var = malloc(sizeof(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t));
    if (!com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var, 0, sizeof(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t));
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->_library_owned = 1;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->translation_factory = translation_factory;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->default_connector_label = default_connector_label;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->default_connector_attribution = default_connector_attribution;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->default_connector_workspace_id = default_connector_workspace_id;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->default_connector_subscription_key = default_connector_subscription_key;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->language_map_location = language_map_location;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->category_map_location = category_map_location;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->retry_attempts = retry_attempts;
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var->timeout_count = timeout_count;
    return com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_create(
    config_node_property_string_t *translation_factory,
    config_node_property_string_t *default_connector_label,
    config_node_property_string_t *default_connector_attribution,
    config_node_property_string_t *default_connector_workspace_id,
    config_node_property_string_t *default_connector_subscription_key,
    config_node_property_string_t *language_map_location,
    config_node_property_string_t *category_map_location,
    config_node_property_integer_t *retry_attempts,
    config_node_property_integer_t *timeout_count
    ) {
    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *result = com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_create_internal (
        translation_factory,
        default_connector_label,
        default_connector_attribution,
        default_connector_workspace_id,
        default_connector_subscription_key,
        language_map_location,
        category_map_location,
        retry_attempts,
        timeout_count
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties) {
    if(NULL == com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties){
        return ;
    }
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location) {
        config_node_property_string_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts) {
        config_node_property_integer_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts = NULL;
    }
    if (com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count) {
        config_node_property_integer_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count);
        com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count = NULL;
    }
    free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties);
}

cJSON *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory) {
    cJSON *translation_factory_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory);
    if(translation_factory_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translationFactory", translation_factory_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label) {
    cJSON *default_connector_label_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label);
    if(default_connector_label_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultConnectorLabel", default_connector_label_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution) {
    cJSON *default_connector_attribution_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution);
    if(default_connector_attribution_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultConnectorAttribution", default_connector_attribution_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id) {
    cJSON *default_connector_workspace_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id);
    if(default_connector_workspace_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultConnectorWorkspaceId", default_connector_workspace_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key) {
    cJSON *default_connector_subscription_key_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key);
    if(default_connector_subscription_key_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultConnectorSubscriptionKey", default_connector_subscription_key_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location) {
    cJSON *language_map_location_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location);
    if(language_map_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "languageMapLocation", language_map_location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location) {
    cJSON *category_map_location_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location);
    if(category_map_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "categoryMapLocation", category_map_location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts) {
    cJSON *retry_attempts_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts);
    if(retry_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retryAttempts", retry_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count
    if(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count) {
    cJSON *timeout_count_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count);
    if(timeout_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeoutCount", timeout_count_local_JSON);
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

com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_parseFromJSON(cJSON *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON){

    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory
    config_node_property_string_t *translation_factory_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label
    config_node_property_string_t *default_connector_label_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution
    config_node_property_string_t *default_connector_attribution_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id
    config_node_property_string_t *default_connector_workspace_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key
    config_node_property_string_t *default_connector_subscription_key_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location
    config_node_property_string_t *language_map_location_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location
    config_node_property_string_t *category_map_location_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts
    config_node_property_integer_t *retry_attempts_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count
    config_node_property_integer_t *timeout_count_local_nonprim = NULL;

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->translation_factory
    cJSON *translation_factory = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "translationFactory");
    if (cJSON_IsNull(translation_factory)) {
        translation_factory = NULL;
    }
    if (translation_factory) { 
    translation_factory_local_nonprim = config_node_property_string_parseFromJSON(translation_factory); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_label
    cJSON *default_connector_label = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "defaultConnectorLabel");
    if (cJSON_IsNull(default_connector_label)) {
        default_connector_label = NULL;
    }
    if (default_connector_label) { 
    default_connector_label_local_nonprim = config_node_property_string_parseFromJSON(default_connector_label); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_attribution
    cJSON *default_connector_attribution = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "defaultConnectorAttribution");
    if (cJSON_IsNull(default_connector_attribution)) {
        default_connector_attribution = NULL;
    }
    if (default_connector_attribution) { 
    default_connector_attribution_local_nonprim = config_node_property_string_parseFromJSON(default_connector_attribution); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_workspace_id
    cJSON *default_connector_workspace_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "defaultConnectorWorkspaceId");
    if (cJSON_IsNull(default_connector_workspace_id)) {
        default_connector_workspace_id = NULL;
    }
    if (default_connector_workspace_id) { 
    default_connector_workspace_id_local_nonprim = config_node_property_string_parseFromJSON(default_connector_workspace_id); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->default_connector_subscription_key
    cJSON *default_connector_subscription_key = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "defaultConnectorSubscriptionKey");
    if (cJSON_IsNull(default_connector_subscription_key)) {
        default_connector_subscription_key = NULL;
    }
    if (default_connector_subscription_key) { 
    default_connector_subscription_key_local_nonprim = config_node_property_string_parseFromJSON(default_connector_subscription_key); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->language_map_location
    cJSON *language_map_location = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "languageMapLocation");
    if (cJSON_IsNull(language_map_location)) {
        language_map_location = NULL;
    }
    if (language_map_location) { 
    language_map_location_local_nonprim = config_node_property_string_parseFromJSON(language_map_location); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->category_map_location
    cJSON *category_map_location = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "categoryMapLocation");
    if (cJSON_IsNull(category_map_location)) {
        category_map_location = NULL;
    }
    if (category_map_location) { 
    category_map_location_local_nonprim = config_node_property_string_parseFromJSON(category_map_location); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->retry_attempts
    cJSON *retry_attempts = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "retryAttempts");
    if (cJSON_IsNull(retry_attempts)) {
        retry_attempts = NULL;
    }
    if (retry_attempts) { 
    retry_attempts_local_nonprim = config_node_property_integer_parseFromJSON(retry_attempts); //nonprimitive
    }

    // com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties->timeout_count
    cJSON *timeout_count = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON, "timeoutCount");
    if (cJSON_IsNull(timeout_count)) {
        timeout_count = NULL;
    }
    if (timeout_count) { 
    timeout_count_local_nonprim = config_node_property_integer_parseFromJSON(timeout_count); //nonprimitive
    }



    com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var = com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_create_internal (
        translation_factory ? translation_factory_local_nonprim : NULL,
        default_connector_label ? default_connector_label_local_nonprim : NULL,
        default_connector_attribution ? default_connector_attribution_local_nonprim : NULL,
        default_connector_workspace_id ? default_connector_workspace_id_local_nonprim : NULL,
        default_connector_subscription_key ? default_connector_subscription_key_local_nonprim : NULL,
        language_map_location ? language_map_location_local_nonprim : NULL,
        category_map_location ? category_map_location_local_nonprim : NULL,
        retry_attempts ? retry_attempts_local_nonprim : NULL,
        timeout_count ? timeout_count_local_nonprim : NULL
        );

    if (!com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_local_var;
end:
    if (translation_factory_local_nonprim) {
        config_node_property_string_free(translation_factory_local_nonprim);
        translation_factory_local_nonprim = NULL;
    }
    if (default_connector_label_local_nonprim) {
        config_node_property_string_free(default_connector_label_local_nonprim);
        default_connector_label_local_nonprim = NULL;
    }
    if (default_connector_attribution_local_nonprim) {
        config_node_property_string_free(default_connector_attribution_local_nonprim);
        default_connector_attribution_local_nonprim = NULL;
    }
    if (default_connector_workspace_id_local_nonprim) {
        config_node_property_string_free(default_connector_workspace_id_local_nonprim);
        default_connector_workspace_id_local_nonprim = NULL;
    }
    if (default_connector_subscription_key_local_nonprim) {
        config_node_property_string_free(default_connector_subscription_key_local_nonprim);
        default_connector_subscription_key_local_nonprim = NULL;
    }
    if (language_map_location_local_nonprim) {
        config_node_property_string_free(language_map_location_local_nonprim);
        language_map_location_local_nonprim = NULL;
    }
    if (category_map_location_local_nonprim) {
        config_node_property_string_free(category_map_location_local_nonprim);
        category_map_location_local_nonprim = NULL;
    }
    if (retry_attempts_local_nonprim) {
        config_node_property_integer_free(retry_attempts_local_nonprim);
        retry_attempts_local_nonprim = NULL;
    }
    if (timeout_count_local_nonprim) {
        config_node_property_integer_free(timeout_count_local_nonprim);
        timeout_count_local_nonprim = NULL;
    }
    return NULL;

}
