#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties.h"



static org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_create_internal(
    config_node_property_array_t *users,
    config_node_property_array_t *groups
    ) {
    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var = malloc(sizeof(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t));
    if (!org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var, 0, sizeof(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t));
    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var->_library_owned = 1;
    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var->users = users;
    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var->groups = groups;
    return org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_create(
    config_node_property_array_t *users,
    config_node_property_array_t *groups
    ) {
    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *result = org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_create_internal (
        users,
        groups
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_free(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties) {
    if(NULL == org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties){
        return ;
    }
    if(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users) {
        config_node_property_array_free(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users);
        org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users = NULL;
    }
    if (org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups) {
        config_node_property_array_free(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups);
        org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups = NULL;
    }
    free(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties);
}

cJSON *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_convertToJSON(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users
    if(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users) {
    cJSON *users_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users);
    if(users_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "users", users_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups
    if(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups) {
    cJSON *groups_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups);
    if(groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "groups", groups_local_JSON);
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

org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_parseFromJSON(cJSON *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_propertiesJSON){

    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_t *org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var = NULL;

    // define the local variable for org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users
    config_node_property_array_t *users_local_nonprim = NULL;

    // define the local variable for org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups
    config_node_property_array_t *groups_local_nonprim = NULL;

    // org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->users
    cJSON *users = cJSON_GetObjectItemCaseSensitive(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_propertiesJSON, "users");
    if (cJSON_IsNull(users)) {
        users = NULL;
    }
    if (users) { 
    users_local_nonprim = config_node_property_array_parseFromJSON(users); //nonprimitive
    }

    // org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties->groups
    cJSON *groups = cJSON_GetObjectItemCaseSensitive(org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_propertiesJSON, "groups");
    if (cJSON_IsNull(groups)) {
        groups = NULL;
    }
    if (groups) { 
    groups_local_nonprim = config_node_property_array_parseFromJSON(groups); //nonprimitive
    }



    org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var = org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_create_internal (
        users ? users_local_nonprim : NULL,
        groups ? groups_local_nonprim : NULL
        );

    if (!org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var) {
        goto end;
    }

    return org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties_local_var;
end:
    if (users_local_nonprim) {
        config_node_property_array_free(users_local_nonprim);
        users_local_nonprim = NULL;
    }
    if (groups_local_nonprim) {
        config_node_property_array_free(groups_local_nonprim);
        groups_local_nonprim = NULL;
    }
    return NULL;

}
