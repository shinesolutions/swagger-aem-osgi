#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messaging_user_component_factory_properties.h"



static messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_create_internal(
    config_node_property_integer_t *priority
    ) {
    messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_local_var = malloc(sizeof(messaging_user_component_factory_properties_t));
    if (!messaging_user_component_factory_properties_local_var) {
        return NULL;
    }
    memset(messaging_user_component_factory_properties_local_var, 0, sizeof(messaging_user_component_factory_properties_t));
    messaging_user_component_factory_properties_local_var->_library_owned = 1;
    messaging_user_component_factory_properties_local_var->priority = priority;
    return messaging_user_component_factory_properties_local_var;
}

__attribute__((deprecated)) messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_create(
    config_node_property_integer_t *priority
    ) {
    messaging_user_component_factory_properties_t *result = messaging_user_component_factory_properties_create_internal (
        priority
        );
    if (!result) {
    }
    return result;
}

void messaging_user_component_factory_properties_free(messaging_user_component_factory_properties_t *messaging_user_component_factory_properties) {
    if(NULL == messaging_user_component_factory_properties){
        return ;
    }
    if(messaging_user_component_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "messaging_user_component_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (messaging_user_component_factory_properties->priority) {
        config_node_property_integer_free(messaging_user_component_factory_properties->priority);
        messaging_user_component_factory_properties->priority = NULL;
    }
    free(messaging_user_component_factory_properties);
}

cJSON *messaging_user_component_factory_properties_convertToJSON(messaging_user_component_factory_properties_t *messaging_user_component_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // messaging_user_component_factory_properties->priority
    if(messaging_user_component_factory_properties->priority) {
    cJSON *priority_local_JSON = config_node_property_integer_convertToJSON(messaging_user_component_factory_properties->priority);
    if(priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priority", priority_local_JSON);
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

messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_parseFromJSON(cJSON *messaging_user_component_factory_propertiesJSON){

    messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_local_var = NULL;

    // define the local variable for messaging_user_component_factory_properties->priority
    config_node_property_integer_t *priority_local_nonprim = NULL;

    // messaging_user_component_factory_properties->priority
    cJSON *priority = cJSON_GetObjectItemCaseSensitive(messaging_user_component_factory_propertiesJSON, "priority");
    if (cJSON_IsNull(priority)) {
        priority = NULL;
    }
    if (priority) { 
    priority_local_nonprim = config_node_property_integer_parseFromJSON(priority); //nonprimitive
    }



    messaging_user_component_factory_properties_local_var = messaging_user_component_factory_properties_create_internal (
        priority ? priority_local_nonprim : NULL
        );

    if (!messaging_user_component_factory_properties_local_var) {
        goto end;
    }

    return messaging_user_component_factory_properties_local_var;
end:
    if (priority_local_nonprim) {
        config_node_property_integer_free(priority_local_nonprim);
        priority_local_nonprim = NULL;
    }
    return NULL;

}
