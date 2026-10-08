#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_aries_jmx_framework_state_config_properties.h"



static org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_create_internal(
    config_node_property_boolean_t *attribute_change_notification_enabled
    ) {
    org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_local_var = malloc(sizeof(org_apache_aries_jmx_framework_state_config_properties_t));
    if (!org_apache_aries_jmx_framework_state_config_properties_local_var) {
        return NULL;
    }
    memset(org_apache_aries_jmx_framework_state_config_properties_local_var, 0, sizeof(org_apache_aries_jmx_framework_state_config_properties_t));
    org_apache_aries_jmx_framework_state_config_properties_local_var->_library_owned = 1;
    org_apache_aries_jmx_framework_state_config_properties_local_var->attribute_change_notification_enabled = attribute_change_notification_enabled;
    return org_apache_aries_jmx_framework_state_config_properties_local_var;
}

__attribute__((deprecated)) org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_create(
    config_node_property_boolean_t *attribute_change_notification_enabled
    ) {
    org_apache_aries_jmx_framework_state_config_properties_t *result = org_apache_aries_jmx_framework_state_config_properties_create_internal (
        attribute_change_notification_enabled
        );
    if (!result) {
    }
    return result;
}

void org_apache_aries_jmx_framework_state_config_properties_free(org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties) {
    if(NULL == org_apache_aries_jmx_framework_state_config_properties){
        return ;
    }
    if(org_apache_aries_jmx_framework_state_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_aries_jmx_framework_state_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled) {
        config_node_property_boolean_free(org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled);
        org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled = NULL;
    }
    free(org_apache_aries_jmx_framework_state_config_properties);
}

cJSON *org_apache_aries_jmx_framework_state_config_properties_convertToJSON(org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled
    if(org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled) {
    cJSON *attribute_change_notification_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled);
    if(attribute_change_notification_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributeChangeNotificationEnabled", attribute_change_notification_enabled_local_JSON);
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

org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_parseFromJSON(cJSON *org_apache_aries_jmx_framework_state_config_propertiesJSON){

    org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_local_var = NULL;

    // define the local variable for org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled
    config_node_property_boolean_t *attribute_change_notification_enabled_local_nonprim = NULL;

    // org_apache_aries_jmx_framework_state_config_properties->attribute_change_notification_enabled
    cJSON *attribute_change_notification_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_aries_jmx_framework_state_config_propertiesJSON, "attributeChangeNotificationEnabled");
    if (cJSON_IsNull(attribute_change_notification_enabled)) {
        attribute_change_notification_enabled = NULL;
    }
    if (attribute_change_notification_enabled) { 
    attribute_change_notification_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(attribute_change_notification_enabled); //nonprimitive
    }



    org_apache_aries_jmx_framework_state_config_properties_local_var = org_apache_aries_jmx_framework_state_config_properties_create_internal (
        attribute_change_notification_enabled ? attribute_change_notification_enabled_local_nonprim : NULL
        );

    if (!org_apache_aries_jmx_framework_state_config_properties_local_var) {
        goto end;
    }

    return org_apache_aries_jmx_framework_state_config_properties_local_var;
end:
    if (attribute_change_notification_enabled_local_nonprim) {
        config_node_property_boolean_free(attribute_change_notification_enabled_local_nonprim);
        attribute_change_notification_enabled_local_nonprim = NULL;
    }
    return NULL;

}
