#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties.h"



static org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var = malloc(sizeof(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t));
    if (!org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var, 0, sizeof(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t));
    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var->_library_owned = 1;
    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var->enabled = enabled;
    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var->service_ranking = service_ranking;
    return org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *result = org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_create_internal (
        enabled,
        service_ranking
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_free(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties) {
    if(NULL == org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties){
        return ;
    }
    if(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled);
        org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled = NULL;
    }
    if (org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking) {
        config_node_property_integer_free(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking);
        org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking = NULL;
    }
    free(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties);
}

cJSON *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_convertToJSON(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled
    if(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking
    if(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
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

org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_parseFromJSON(cJSON *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_propertiesJSON){

    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_t *org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var = NULL;

    // define the local variable for org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_impl_override_system_property_configuration_ove_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }



    org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var = org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL
        );

    if (!org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var) {
        goto end;
    }

    return org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    return NULL;

}
