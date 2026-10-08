#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties.h"



static com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_create_internal(
    config_node_property_array_t *automoderation_sequence,
    config_node_property_boolean_t *automoderation_onfailurestop
    ) {
    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t));
    if (!com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t));
    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var->automoderation_sequence = automoderation_sequence;
    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var->automoderation_onfailurestop = automoderation_onfailurestop;
    return com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_create(
    config_node_property_array_t *automoderation_sequence,
    config_node_property_boolean_t *automoderation_onfailurestop
    ) {
    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *result = com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_create_internal (
        automoderation_sequence,
        automoderation_onfailurestop
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_free(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence);
        com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence = NULL;
    }
    if (com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop) {
        config_node_property_boolean_free(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop);
        com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop = NULL;
    }
    free(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties);
}

cJSON *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence
    if(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence) {
    cJSON *automoderation_sequence_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence);
    if(automoderation_sequence_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "automoderation.sequence", automoderation_sequence_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop
    if(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop) {
    cJSON *automoderation_onfailurestop_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop);
    if(automoderation_onfailurestop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "automoderation.onfailurestop", automoderation_onfailurestop_local_JSON);
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

com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_propertiesJSON){

    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_t *com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence
    config_node_property_array_t *automoderation_sequence_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop
    config_node_property_boolean_t *automoderation_onfailurestop_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_sequence
    cJSON *automoderation_sequence = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_propertiesJSON, "automoderation.sequence");
    if (cJSON_IsNull(automoderation_sequence)) {
        automoderation_sequence = NULL;
    }
    if (automoderation_sequence) { 
    automoderation_sequence_local_nonprim = config_node_property_array_parseFromJSON(automoderation_sequence); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties->automoderation_onfailurestop
    cJSON *automoderation_onfailurestop = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_propertiesJSON, "automoderation.onfailurestop");
    if (cJSON_IsNull(automoderation_onfailurestop)) {
        automoderation_onfailurestop = NULL;
    }
    if (automoderation_onfailurestop) { 
    automoderation_onfailurestop_local_nonprim = config_node_property_boolean_parseFromJSON(automoderation_onfailurestop); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var = com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_create_internal (
        automoderation_sequence ? automoderation_sequence_local_nonprim : NULL,
        automoderation_onfailurestop ? automoderation_onfailurestop_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties_local_var;
end:
    if (automoderation_sequence_local_nonprim) {
        config_node_property_array_free(automoderation_sequence_local_nonprim);
        automoderation_sequence_local_nonprim = NULL;
    }
    if (automoderation_onfailurestop_local_nonprim) {
        config_node_property_boolean_free(automoderation_onfailurestop_local_nonprim);
        automoderation_onfailurestop_local_nonprim = NULL;
    }
    return NULL;

}
