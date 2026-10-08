#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_device_impl_device_service_properties.h"



static com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_create_internal(
    config_node_property_integer_t *com_adobe_aem_screens_player_pingfrequency,
    config_node_property_string_t *com_adobe_aem_screens_device_pasword_specialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlowercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minuppercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minnumberchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minspecialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlength
    ) {
    com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_local_var = malloc(sizeof(com_adobe_cq_screens_device_impl_device_service_properties_t));
    if (!com_adobe_cq_screens_device_impl_device_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_device_impl_device_service_properties_local_var, 0, sizeof(com_adobe_cq_screens_device_impl_device_service_properties_t));
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_player_pingfrequency = com_adobe_aem_screens_player_pingfrequency;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_specialchars = com_adobe_aem_screens_device_pasword_specialchars;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_minlowercasechars = com_adobe_aem_screens_device_pasword_minlowercasechars;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_minuppercasechars = com_adobe_aem_screens_device_pasword_minuppercasechars;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_minnumberchars = com_adobe_aem_screens_device_pasword_minnumberchars;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_minspecialchars = com_adobe_aem_screens_device_pasword_minspecialchars;
    com_adobe_cq_screens_device_impl_device_service_properties_local_var->com_adobe_aem_screens_device_pasword_minlength = com_adobe_aem_screens_device_pasword_minlength;
    return com_adobe_cq_screens_device_impl_device_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_create(
    config_node_property_integer_t *com_adobe_aem_screens_player_pingfrequency,
    config_node_property_string_t *com_adobe_aem_screens_device_pasword_specialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlowercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minuppercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minnumberchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minspecialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlength
    ) {
    com_adobe_cq_screens_device_impl_device_service_properties_t *result = com_adobe_cq_screens_device_impl_device_service_properties_create_internal (
        com_adobe_aem_screens_player_pingfrequency,
        com_adobe_aem_screens_device_pasword_specialchars,
        com_adobe_aem_screens_device_pasword_minlowercasechars,
        com_adobe_aem_screens_device_pasword_minuppercasechars,
        com_adobe_aem_screens_device_pasword_minnumberchars,
        com_adobe_aem_screens_device_pasword_minspecialchars,
        com_adobe_aem_screens_device_pasword_minlength
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_device_impl_device_service_properties_free(com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties) {
    if(NULL == com_adobe_cq_screens_device_impl_device_service_properties){
        return ;
    }
    if(com_adobe_cq_screens_device_impl_device_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_device_impl_device_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars) {
        config_node_property_string_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars = NULL;
    }
    if (com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength) {
        config_node_property_integer_free(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength);
        com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength = NULL;
    }
    free(com_adobe_cq_screens_device_impl_device_service_properties);
}

cJSON *com_adobe_cq_screens_device_impl_device_service_properties_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency) {
    cJSON *com_adobe_aem_screens_player_pingfrequency_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency);
    if(com_adobe_aem_screens_player_pingfrequency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.player.pingfrequency", com_adobe_aem_screens_player_pingfrequency_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars) {
    cJSON *com_adobe_aem_screens_device_pasword_specialchars_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars);
    if(com_adobe_aem_screens_device_pasword_specialchars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.specialchars", com_adobe_aem_screens_device_pasword_specialchars_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars) {
    cJSON *com_adobe_aem_screens_device_pasword_minlowercasechars_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars);
    if(com_adobe_aem_screens_device_pasword_minlowercasechars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.minlowercasechars", com_adobe_aem_screens_device_pasword_minlowercasechars_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars) {
    cJSON *com_adobe_aem_screens_device_pasword_minuppercasechars_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars);
    if(com_adobe_aem_screens_device_pasword_minuppercasechars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.minuppercasechars", com_adobe_aem_screens_device_pasword_minuppercasechars_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars) {
    cJSON *com_adobe_aem_screens_device_pasword_minnumberchars_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars);
    if(com_adobe_aem_screens_device_pasword_minnumberchars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.minnumberchars", com_adobe_aem_screens_device_pasword_minnumberchars_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars) {
    cJSON *com_adobe_aem_screens_device_pasword_minspecialchars_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars);
    if(com_adobe_aem_screens_device_pasword_minspecialchars_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.minspecialchars", com_adobe_aem_screens_device_pasword_minspecialchars_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength
    if(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength) {
    cJSON *com_adobe_aem_screens_device_pasword_minlength_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength);
    if(com_adobe_aem_screens_device_pasword_minlength_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.aem.screens.device.pasword.minlength", com_adobe_aem_screens_device_pasword_minlength_local_JSON);
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

com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_parseFromJSON(cJSON *com_adobe_cq_screens_device_impl_device_service_propertiesJSON){

    com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency
    config_node_property_integer_t *com_adobe_aem_screens_player_pingfrequency_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars
    config_node_property_string_t *com_adobe_aem_screens_device_pasword_specialchars_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlength_local_nonprim = NULL;

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_player_pingfrequency
    cJSON *com_adobe_aem_screens_player_pingfrequency = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.player.pingfrequency");
    if (cJSON_IsNull(com_adobe_aem_screens_player_pingfrequency)) {
        com_adobe_aem_screens_player_pingfrequency = NULL;
    }
    if (com_adobe_aem_screens_player_pingfrequency) { 
    com_adobe_aem_screens_player_pingfrequency_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_player_pingfrequency); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_specialchars
    cJSON *com_adobe_aem_screens_device_pasword_specialchars = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.specialchars");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_specialchars)) {
        com_adobe_aem_screens_device_pasword_specialchars = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_specialchars) { 
    com_adobe_aem_screens_device_pasword_specialchars_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_aem_screens_device_pasword_specialchars); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlowercasechars
    cJSON *com_adobe_aem_screens_device_pasword_minlowercasechars = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.minlowercasechars");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_minlowercasechars)) {
        com_adobe_aem_screens_device_pasword_minlowercasechars = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minlowercasechars) { 
    com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_device_pasword_minlowercasechars); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minuppercasechars
    cJSON *com_adobe_aem_screens_device_pasword_minuppercasechars = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.minuppercasechars");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_minuppercasechars)) {
        com_adobe_aem_screens_device_pasword_minuppercasechars = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minuppercasechars) { 
    com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_device_pasword_minuppercasechars); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minnumberchars
    cJSON *com_adobe_aem_screens_device_pasword_minnumberchars = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.minnumberchars");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_minnumberchars)) {
        com_adobe_aem_screens_device_pasword_minnumberchars = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minnumberchars) { 
    com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_device_pasword_minnumberchars); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minspecialchars
    cJSON *com_adobe_aem_screens_device_pasword_minspecialchars = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.minspecialchars");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_minspecialchars)) {
        com_adobe_aem_screens_device_pasword_minspecialchars = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minspecialchars) { 
    com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_device_pasword_minspecialchars); //nonprimitive
    }

    // com_adobe_cq_screens_device_impl_device_service_properties->com_adobe_aem_screens_device_pasword_minlength
    cJSON *com_adobe_aem_screens_device_pasword_minlength = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_device_impl_device_service_propertiesJSON, "com.adobe.aem.screens.device.pasword.minlength");
    if (cJSON_IsNull(com_adobe_aem_screens_device_pasword_minlength)) {
        com_adobe_aem_screens_device_pasword_minlength = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minlength) { 
    com_adobe_aem_screens_device_pasword_minlength_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_aem_screens_device_pasword_minlength); //nonprimitive
    }



    com_adobe_cq_screens_device_impl_device_service_properties_local_var = com_adobe_cq_screens_device_impl_device_service_properties_create_internal (
        com_adobe_aem_screens_player_pingfrequency ? com_adobe_aem_screens_player_pingfrequency_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_specialchars ? com_adobe_aem_screens_device_pasword_specialchars_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_minlowercasechars ? com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_minuppercasechars ? com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_minnumberchars ? com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_minspecialchars ? com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim : NULL,
        com_adobe_aem_screens_device_pasword_minlength ? com_adobe_aem_screens_device_pasword_minlength_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_device_impl_device_service_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_device_impl_device_service_properties_local_var;
end:
    if (com_adobe_aem_screens_player_pingfrequency_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_player_pingfrequency_local_nonprim);
        com_adobe_aem_screens_player_pingfrequency_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_specialchars_local_nonprim) {
        config_node_property_string_free(com_adobe_aem_screens_device_pasword_specialchars_local_nonprim);
        com_adobe_aem_screens_device_pasword_specialchars_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim);
        com_adobe_aem_screens_device_pasword_minlowercasechars_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim);
        com_adobe_aem_screens_device_pasword_minuppercasechars_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim);
        com_adobe_aem_screens_device_pasword_minnumberchars_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim);
        com_adobe_aem_screens_device_pasword_minspecialchars_local_nonprim = NULL;
    }
    if (com_adobe_aem_screens_device_pasword_minlength_local_nonprim) {
        config_node_property_integer_free(com_adobe_aem_screens_device_pasword_minlength_local_nonprim);
        com_adobe_aem_screens_device_pasword_minlength_local_nonprim = NULL;
    }
    return NULL;

}
