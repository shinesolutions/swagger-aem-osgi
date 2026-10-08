#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_featureflags_feature_properties.h"



static org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *description,
    config_node_property_boolean_t *enabled
    ) {
    org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_local_var = malloc(sizeof(org_apache_sling_featureflags_feature_properties_t));
    if (!org_apache_sling_featureflags_feature_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_featureflags_feature_properties_local_var, 0, sizeof(org_apache_sling_featureflags_feature_properties_t));
    org_apache_sling_featureflags_feature_properties_local_var->_library_owned = 1;
    org_apache_sling_featureflags_feature_properties_local_var->name = name;
    org_apache_sling_featureflags_feature_properties_local_var->description = description;
    org_apache_sling_featureflags_feature_properties_local_var->enabled = enabled;
    return org_apache_sling_featureflags_feature_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *description,
    config_node_property_boolean_t *enabled
    ) {
    org_apache_sling_featureflags_feature_properties_t *result = org_apache_sling_featureflags_feature_properties_create_internal (
        name,
        description,
        enabled
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_featureflags_feature_properties_free(org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties) {
    if(NULL == org_apache_sling_featureflags_feature_properties){
        return ;
    }
    if(org_apache_sling_featureflags_feature_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_featureflags_feature_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_featureflags_feature_properties->name) {
        config_node_property_string_free(org_apache_sling_featureflags_feature_properties->name);
        org_apache_sling_featureflags_feature_properties->name = NULL;
    }
    if (org_apache_sling_featureflags_feature_properties->description) {
        config_node_property_string_free(org_apache_sling_featureflags_feature_properties->description);
        org_apache_sling_featureflags_feature_properties->description = NULL;
    }
    if (org_apache_sling_featureflags_feature_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_featureflags_feature_properties->enabled);
        org_apache_sling_featureflags_feature_properties->enabled = NULL;
    }
    free(org_apache_sling_featureflags_feature_properties);
}

cJSON *org_apache_sling_featureflags_feature_properties_convertToJSON(org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_featureflags_feature_properties->name
    if(org_apache_sling_featureflags_feature_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_featureflags_feature_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_featureflags_feature_properties->description
    if(org_apache_sling_featureflags_feature_properties->description) {
    cJSON *description_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_featureflags_feature_properties->description);
    if(description_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "description", description_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_featureflags_feature_properties->enabled
    if(org_apache_sling_featureflags_feature_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_featureflags_feature_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
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

org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_parseFromJSON(cJSON *org_apache_sling_featureflags_feature_propertiesJSON){

    org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_local_var = NULL;

    // define the local variable for org_apache_sling_featureflags_feature_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_featureflags_feature_properties->description
    config_node_property_string_t *description_local_nonprim = NULL;

    // define the local variable for org_apache_sling_featureflags_feature_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // org_apache_sling_featureflags_feature_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_featureflags_feature_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_featureflags_feature_properties->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(org_apache_sling_featureflags_feature_propertiesJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    description_local_nonprim = config_node_property_string_parseFromJSON(description); //nonprimitive
    }

    // org_apache_sling_featureflags_feature_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_featureflags_feature_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }



    org_apache_sling_featureflags_feature_properties_local_var = org_apache_sling_featureflags_feature_properties_create_internal (
        name ? name_local_nonprim : NULL,
        description ? description_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL
        );

    if (!org_apache_sling_featureflags_feature_properties_local_var) {
        goto end;
    }

    return org_apache_sling_featureflags_feature_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (description_local_nonprim) {
        config_node_property_string_free(description_local_nonprim);
        description_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    return NULL;

}
