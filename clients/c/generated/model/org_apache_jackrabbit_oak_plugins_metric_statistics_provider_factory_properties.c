#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties.h"



static org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_create_internal(
    config_node_property_drop_down_t *provider_type
    ) {
    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t));
    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var->provider_type = provider_type;
    return org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_create(
    config_node_property_drop_down_t *provider_type
    ) {
    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *result = org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_create_internal (
        provider_type
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_free(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type);
        org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type
    if(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type) {
    cJSON *provider_type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type);
    if(provider_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "providerType", provider_type_local_JSON);
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

org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_t *org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type
    config_node_property_drop_down_t *provider_type_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties->provider_type
    cJSON *provider_type = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_propertiesJSON, "providerType");
    if (cJSON_IsNull(provider_type)) {
        provider_type = NULL;
    }
    if (provider_type) { 
    provider_type_local_nonprim = config_node_property_drop_down_parseFromJSON(provider_type); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var = org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_create_internal (
        provider_type ? provider_type_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties_local_var;
end:
    if (provider_type_local_nonprim) {
        config_node_property_drop_down_free(provider_type_local_nonprim);
        provider_type_local_nonprim = NULL;
    }
    return NULL;

}
