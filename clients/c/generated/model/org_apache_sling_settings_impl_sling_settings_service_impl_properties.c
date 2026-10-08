#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_settings_impl_sling_settings_service_impl_properties.h"



static org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties_create_internal(
    config_node_property_string_t *sling_name,
    config_node_property_string_t *sling_description
    ) {
    org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var = malloc(sizeof(org_apache_sling_settings_impl_sling_settings_service_impl_properties_t));
    if (!org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var, 0, sizeof(org_apache_sling_settings_impl_sling_settings_service_impl_properties_t));
    org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var->sling_name = sling_name;
    org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var->sling_description = sling_description;
    return org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties_create(
    config_node_property_string_t *sling_name,
    config_node_property_string_t *sling_description
    ) {
    org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *result = org_apache_sling_settings_impl_sling_settings_service_impl_properties_create_internal (
        sling_name,
        sling_description
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_settings_impl_sling_settings_service_impl_properties_free(org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties) {
    if(NULL == org_apache_sling_settings_impl_sling_settings_service_impl_properties){
        return ;
    }
    if(org_apache_sling_settings_impl_sling_settings_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_settings_impl_sling_settings_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name) {
        config_node_property_string_free(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name);
        org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name = NULL;
    }
    if (org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description) {
        config_node_property_string_free(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description);
        org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description = NULL;
    }
    free(org_apache_sling_settings_impl_sling_settings_service_impl_properties);
}

cJSON *org_apache_sling_settings_impl_sling_settings_service_impl_properties_convertToJSON(org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name
    if(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name) {
    cJSON *sling_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name);
    if(sling_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.name", sling_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description
    if(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description) {
    cJSON *sling_description_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description);
    if(sling_description_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.description", sling_description_local_JSON);
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

org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties_parseFromJSON(cJSON *org_apache_sling_settings_impl_sling_settings_service_impl_propertiesJSON){

    org_apache_sling_settings_impl_sling_settings_service_impl_properties_t *org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name
    config_node_property_string_t *sling_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description
    config_node_property_string_t *sling_description_local_nonprim = NULL;

    // org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_name
    cJSON *sling_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_settings_impl_sling_settings_service_impl_propertiesJSON, "sling.name");
    if (cJSON_IsNull(sling_name)) {
        sling_name = NULL;
    }
    if (sling_name) { 
    sling_name_local_nonprim = config_node_property_string_parseFromJSON(sling_name); //nonprimitive
    }

    // org_apache_sling_settings_impl_sling_settings_service_impl_properties->sling_description
    cJSON *sling_description = cJSON_GetObjectItemCaseSensitive(org_apache_sling_settings_impl_sling_settings_service_impl_propertiesJSON, "sling.description");
    if (cJSON_IsNull(sling_description)) {
        sling_description = NULL;
    }
    if (sling_description) { 
    sling_description_local_nonprim = config_node_property_string_parseFromJSON(sling_description); //nonprimitive
    }



    org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var = org_apache_sling_settings_impl_sling_settings_service_impl_properties_create_internal (
        sling_name ? sling_name_local_nonprim : NULL,
        sling_description ? sling_description_local_nonprim : NULL
        );

    if (!org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_settings_impl_sling_settings_service_impl_properties_local_var;
end:
    if (sling_name_local_nonprim) {
        config_node_property_string_free(sling_name_local_nonprim);
        sling_name_local_nonprim = NULL;
    }
    if (sling_description_local_nonprim) {
        config_node_property_string_free(sling_description_local_nonprim);
        sling_description_local_nonprim = NULL;
    }
    return NULL;

}
