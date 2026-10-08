#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties.h"



static org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_create_internal(
    config_node_property_drop_down_t *permissions_jr2,
    config_node_property_drop_down_t *import_behavior,
    config_node_property_array_t *read_paths,
    config_node_property_array_t *administrative_principals,
    config_node_property_integer_t *configuration_ranking
    ) {
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t));
    if (!org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t));
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->permissions_jr2 = permissions_jr2;
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->import_behavior = import_behavior;
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->read_paths = read_paths;
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->administrative_principals = administrative_principals;
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var->configuration_ranking = configuration_ranking;
    return org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_create(
    config_node_property_drop_down_t *permissions_jr2,
    config_node_property_drop_down_t *import_behavior,
    config_node_property_array_t *read_paths,
    config_node_property_array_t *administrative_principals,
    config_node_property_integer_t *configuration_ranking
    ) {
    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *result = org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_create_internal (
        permissions_jr2,
        import_behavior,
        read_paths,
        administrative_principals,
        configuration_ranking
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2);
        org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2 = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior);
        org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths);
        org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals);
        org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking);
        org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking = NULL;
    }
    free(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties);
}

cJSON *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2) {
    cJSON *permissions_jr2_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2);
    if(permissions_jr2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "permissionsJr2", permissions_jr2_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior) {
    cJSON *import_behavior_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior);
    if(import_behavior_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importBehavior", import_behavior_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths) {
    cJSON *read_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths);
    if(read_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "readPaths", read_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals) {
    cJSON *administrative_principals_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals);
    if(administrative_principals_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "administrativePrincipals", administrative_principals_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking
    if(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking) {
    cJSON *configuration_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking);
    if(configuration_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configurationRanking", configuration_ranking_local_JSON);
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

org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON){

    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_t *org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2
    config_node_property_drop_down_t *permissions_jr2_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior
    config_node_property_drop_down_t *import_behavior_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths
    config_node_property_array_t *read_paths_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals
    config_node_property_array_t *administrative_principals_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking
    config_node_property_integer_t *configuration_ranking_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->permissions_jr2
    cJSON *permissions_jr2 = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON, "permissionsJr2");
    if (cJSON_IsNull(permissions_jr2)) {
        permissions_jr2 = NULL;
    }
    if (permissions_jr2) { 
    permissions_jr2_local_nonprim = config_node_property_drop_down_parseFromJSON(permissions_jr2); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->import_behavior
    cJSON *import_behavior = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON, "importBehavior");
    if (cJSON_IsNull(import_behavior)) {
        import_behavior = NULL;
    }
    if (import_behavior) { 
    import_behavior_local_nonprim = config_node_property_drop_down_parseFromJSON(import_behavior); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->read_paths
    cJSON *read_paths = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON, "readPaths");
    if (cJSON_IsNull(read_paths)) {
        read_paths = NULL;
    }
    if (read_paths) { 
    read_paths_local_nonprim = config_node_property_array_parseFromJSON(read_paths); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->administrative_principals
    cJSON *administrative_principals = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON, "administrativePrincipals");
    if (cJSON_IsNull(administrative_principals)) {
        administrative_principals = NULL;
    }
    if (administrative_principals) { 
    administrative_principals_local_nonprim = config_node_property_array_parseFromJSON(administrative_principals); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties->configuration_ranking
    cJSON *configuration_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authorization_authorization_configur_propertiesJSON, "configurationRanking");
    if (cJSON_IsNull(configuration_ranking)) {
        configuration_ranking = NULL;
    }
    if (configuration_ranking) { 
    configuration_ranking_local_nonprim = config_node_property_integer_parseFromJSON(configuration_ranking); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var = org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_create_internal (
        permissions_jr2 ? permissions_jr2_local_nonprim : NULL,
        import_behavior ? import_behavior_local_nonprim : NULL,
        read_paths ? read_paths_local_nonprim : NULL,
        administrative_principals ? administrative_principals_local_nonprim : NULL,
        configuration_ranking ? configuration_ranking_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_local_var;
end:
    if (permissions_jr2_local_nonprim) {
        config_node_property_drop_down_free(permissions_jr2_local_nonprim);
        permissions_jr2_local_nonprim = NULL;
    }
    if (import_behavior_local_nonprim) {
        config_node_property_drop_down_free(import_behavior_local_nonprim);
        import_behavior_local_nonprim = NULL;
    }
    if (read_paths_local_nonprim) {
        config_node_property_array_free(read_paths_local_nonprim);
        read_paths_local_nonprim = NULL;
    }
    if (administrative_principals_local_nonprim) {
        config_node_property_array_free(administrative_principals_local_nonprim);
        administrative_principals_local_nonprim = NULL;
    }
    if (configuration_ranking_local_nonprim) {
        config_node_property_integer_free(configuration_ranking_local_nonprim);
        configuration_ranking_local_nonprim = NULL;
    }
    return NULL;

}
