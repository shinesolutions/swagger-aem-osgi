#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_translation_impl_translation_service_config_manager_properties.h"



static com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_create_internal(
    config_node_property_drop_down_t *translate_language,
    config_node_property_drop_down_t *translate_display,
    config_node_property_boolean_t *translate_attribution,
    config_node_property_drop_down_t *translate_caching,
    config_node_property_drop_down_t *translate_smart_rendering,
    config_node_property_string_t *translate_caching_duration,
    config_node_property_string_t *translate_session_save_interval,
    config_node_property_string_t *translate_session_save_batch_limit
    ) {
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var = malloc(sizeof(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t));
    if (!com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var, 0, sizeof(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t));
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_language = translate_language;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_display = translate_display;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_attribution = translate_attribution;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_caching = translate_caching;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_smart_rendering = translate_smart_rendering;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_caching_duration = translate_caching_duration;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_session_save_interval = translate_session_save_interval;
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var->translate_session_save_batch_limit = translate_session_save_batch_limit;
    return com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_create(
    config_node_property_drop_down_t *translate_language,
    config_node_property_drop_down_t *translate_display,
    config_node_property_boolean_t *translate_attribution,
    config_node_property_drop_down_t *translate_caching,
    config_node_property_drop_down_t *translate_smart_rendering,
    config_node_property_string_t *translate_caching_duration,
    config_node_property_string_t *translate_session_save_interval,
    config_node_property_string_t *translate_session_save_batch_limit
    ) {
    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *result = com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_create_internal (
        translate_language,
        translate_display,
        translate_attribution,
        translate_caching,
        translate_smart_rendering,
        translate_caching_duration,
        translate_session_save_interval,
        translate_session_save_batch_limit
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties) {
    if(NULL == com_adobe_cq_social_translation_impl_translation_service_config_manager_properties){
        return ;
    }
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language) {
        config_node_property_drop_down_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display) {
        config_node_property_drop_down_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution) {
        config_node_property_boolean_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching) {
        config_node_property_drop_down_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering) {
        config_node_property_drop_down_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration) {
        config_node_property_string_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval) {
        config_node_property_string_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval = NULL;
    }
    if (com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit) {
        config_node_property_string_free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit);
        com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit = NULL;
    }
    free(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties);
}

cJSON *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language) {
    cJSON *translate_language_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language);
    if(translate_language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.language", translate_language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display) {
    cJSON *translate_display_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display);
    if(translate_display_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.display", translate_display_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution) {
    cJSON *translate_attribution_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution);
    if(translate_attribution_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.attribution", translate_attribution_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching) {
    cJSON *translate_caching_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching);
    if(translate_caching_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.caching", translate_caching_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering) {
    cJSON *translate_smart_rendering_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering);
    if(translate_smart_rendering_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.smart.rendering", translate_smart_rendering_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration) {
    cJSON *translate_caching_duration_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration);
    if(translate_caching_duration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.caching.duration", translate_caching_duration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval) {
    cJSON *translate_session_save_interval_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval);
    if(translate_session_save_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.session.save.interval", translate_session_save_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit
    if(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit) {
    cJSON *translate_session_save_batch_limit_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit);
    if(translate_session_save_batch_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.session.save.batchLimit", translate_session_save_batch_limit_local_JSON);
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

com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_parseFromJSON(cJSON *com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON){

    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_t *com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language
    config_node_property_drop_down_t *translate_language_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display
    config_node_property_drop_down_t *translate_display_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution
    config_node_property_boolean_t *translate_attribution_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching
    config_node_property_drop_down_t *translate_caching_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering
    config_node_property_drop_down_t *translate_smart_rendering_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration
    config_node_property_string_t *translate_caching_duration_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval
    config_node_property_string_t *translate_session_save_interval_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit
    config_node_property_string_t *translate_session_save_batch_limit_local_nonprim = NULL;

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_language
    cJSON *translate_language = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.language");
    if (cJSON_IsNull(translate_language)) {
        translate_language = NULL;
    }
    if (translate_language) { 
    translate_language_local_nonprim = config_node_property_drop_down_parseFromJSON(translate_language); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_display
    cJSON *translate_display = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.display");
    if (cJSON_IsNull(translate_display)) {
        translate_display = NULL;
    }
    if (translate_display) { 
    translate_display_local_nonprim = config_node_property_drop_down_parseFromJSON(translate_display); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_attribution
    cJSON *translate_attribution = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.attribution");
    if (cJSON_IsNull(translate_attribution)) {
        translate_attribution = NULL;
    }
    if (translate_attribution) { 
    translate_attribution_local_nonprim = config_node_property_boolean_parseFromJSON(translate_attribution); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching
    cJSON *translate_caching = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.caching");
    if (cJSON_IsNull(translate_caching)) {
        translate_caching = NULL;
    }
    if (translate_caching) { 
    translate_caching_local_nonprim = config_node_property_drop_down_parseFromJSON(translate_caching); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_smart_rendering
    cJSON *translate_smart_rendering = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.smart.rendering");
    if (cJSON_IsNull(translate_smart_rendering)) {
        translate_smart_rendering = NULL;
    }
    if (translate_smart_rendering) { 
    translate_smart_rendering_local_nonprim = config_node_property_drop_down_parseFromJSON(translate_smart_rendering); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_caching_duration
    cJSON *translate_caching_duration = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.caching.duration");
    if (cJSON_IsNull(translate_caching_duration)) {
        translate_caching_duration = NULL;
    }
    if (translate_caching_duration) { 
    translate_caching_duration_local_nonprim = config_node_property_string_parseFromJSON(translate_caching_duration); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_interval
    cJSON *translate_session_save_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.session.save.interval");
    if (cJSON_IsNull(translate_session_save_interval)) {
        translate_session_save_interval = NULL;
    }
    if (translate_session_save_interval) { 
    translate_session_save_interval_local_nonprim = config_node_property_string_parseFromJSON(translate_session_save_interval); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_translation_service_config_manager_properties->translate_session_save_batch_limit
    cJSON *translate_session_save_batch_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_translation_service_config_manager_propertiesJSON, "translate.session.save.batchLimit");
    if (cJSON_IsNull(translate_session_save_batch_limit)) {
        translate_session_save_batch_limit = NULL;
    }
    if (translate_session_save_batch_limit) { 
    translate_session_save_batch_limit_local_nonprim = config_node_property_string_parseFromJSON(translate_session_save_batch_limit); //nonprimitive
    }



    com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var = com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_create_internal (
        translate_language ? translate_language_local_nonprim : NULL,
        translate_display ? translate_display_local_nonprim : NULL,
        translate_attribution ? translate_attribution_local_nonprim : NULL,
        translate_caching ? translate_caching_local_nonprim : NULL,
        translate_smart_rendering ? translate_smart_rendering_local_nonprim : NULL,
        translate_caching_duration ? translate_caching_duration_local_nonprim : NULL,
        translate_session_save_interval ? translate_session_save_interval_local_nonprim : NULL,
        translate_session_save_batch_limit ? translate_session_save_batch_limit_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_local_var;
end:
    if (translate_language_local_nonprim) {
        config_node_property_drop_down_free(translate_language_local_nonprim);
        translate_language_local_nonprim = NULL;
    }
    if (translate_display_local_nonprim) {
        config_node_property_drop_down_free(translate_display_local_nonprim);
        translate_display_local_nonprim = NULL;
    }
    if (translate_attribution_local_nonprim) {
        config_node_property_boolean_free(translate_attribution_local_nonprim);
        translate_attribution_local_nonprim = NULL;
    }
    if (translate_caching_local_nonprim) {
        config_node_property_drop_down_free(translate_caching_local_nonprim);
        translate_caching_local_nonprim = NULL;
    }
    if (translate_smart_rendering_local_nonprim) {
        config_node_property_drop_down_free(translate_smart_rendering_local_nonprim);
        translate_smart_rendering_local_nonprim = NULL;
    }
    if (translate_caching_duration_local_nonprim) {
        config_node_property_string_free(translate_caching_duration_local_nonprim);
        translate_caching_duration_local_nonprim = NULL;
    }
    if (translate_session_save_interval_local_nonprim) {
        config_node_property_string_free(translate_session_save_interval_local_nonprim);
        translate_session_save_interval_local_nonprim = NULL;
    }
    if (translate_session_save_batch_limit_local_nonprim) {
        config_node_property_string_free(translate_session_save_batch_limit_local_nonprim);
        translate_session_save_batch_limit_local_nonprim = NULL;
    }
    return NULL;

}
