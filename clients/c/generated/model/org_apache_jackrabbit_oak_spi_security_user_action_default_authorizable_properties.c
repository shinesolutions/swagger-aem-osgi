#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties.h"



static org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_create_internal(
    config_node_property_drop_down_t *enabled_actions,
    config_node_property_array_t *user_privilege_names,
    config_node_property_array_t *group_privilege_names,
    config_node_property_string_t *constraint
    ) {
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t));
    if (!org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t));
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var->enabled_actions = enabled_actions;
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var->user_privilege_names = user_privilege_names;
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var->group_privilege_names = group_privilege_names;
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var->constraint = constraint;
    return org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_create(
    config_node_property_drop_down_t *enabled_actions,
    config_node_property_array_t *user_privilege_names,
    config_node_property_array_t *group_privilege_names,
    config_node_property_string_t *constraint
    ) {
    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *result = org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_create_internal (
        enabled_actions,
        user_privilege_names,
        group_privilege_names,
        constraint
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties) {
    if(NULL == org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions);
        org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names);
        org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names);
        org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint);
        org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint = NULL;
    }
    free(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties);
}

cJSON *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_convertToJSON(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions
    if(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions) {
    cJSON *enabled_actions_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions);
    if(enabled_actions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabledActions", enabled_actions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names
    if(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names) {
    cJSON *user_privilege_names_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names);
    if(user_privilege_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userPrivilegeNames", user_privilege_names_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names
    if(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names) {
    cJSON *group_privilege_names_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names);
    if(group_privilege_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "groupPrivilegeNames", group_privilege_names_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint
    if(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint) {
    cJSON *constraint_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint);
    if(constraint_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "constraint", constraint_local_JSON);
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

org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_propertiesJSON){

    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_t *org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions
    config_node_property_drop_down_t *enabled_actions_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names
    config_node_property_array_t *user_privilege_names_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names
    config_node_property_array_t *group_privilege_names_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint
    config_node_property_string_t *constraint_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->enabled_actions
    cJSON *enabled_actions = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_propertiesJSON, "enabledActions");
    if (cJSON_IsNull(enabled_actions)) {
        enabled_actions = NULL;
    }
    if (enabled_actions) { 
    enabled_actions_local_nonprim = config_node_property_drop_down_parseFromJSON(enabled_actions); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->user_privilege_names
    cJSON *user_privilege_names = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_propertiesJSON, "userPrivilegeNames");
    if (cJSON_IsNull(user_privilege_names)) {
        user_privilege_names = NULL;
    }
    if (user_privilege_names) { 
    user_privilege_names_local_nonprim = config_node_property_array_parseFromJSON(user_privilege_names); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->group_privilege_names
    cJSON *group_privilege_names = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_propertiesJSON, "groupPrivilegeNames");
    if (cJSON_IsNull(group_privilege_names)) {
        group_privilege_names = NULL;
    }
    if (group_privilege_names) { 
    group_privilege_names_local_nonprim = config_node_property_array_parseFromJSON(group_privilege_names); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties->constraint
    cJSON *constraint = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_propertiesJSON, "constraint");
    if (cJSON_IsNull(constraint)) {
        constraint = NULL;
    }
    if (constraint) { 
    constraint_local_nonprim = config_node_property_string_parseFromJSON(constraint); //nonprimitive
    }



    org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var = org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_create_internal (
        enabled_actions ? enabled_actions_local_nonprim : NULL,
        user_privilege_names ? user_privilege_names_local_nonprim : NULL,
        group_privilege_names ? group_privilege_names_local_nonprim : NULL,
        constraint ? constraint_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_local_var;
end:
    if (enabled_actions_local_nonprim) {
        config_node_property_drop_down_free(enabled_actions_local_nonprim);
        enabled_actions_local_nonprim = NULL;
    }
    if (user_privilege_names_local_nonprim) {
        config_node_property_array_free(user_privilege_names_local_nonprim);
        user_privilege_names_local_nonprim = NULL;
    }
    if (group_privilege_names_local_nonprim) {
        config_node_property_array_free(group_privilege_names_local_nonprim);
        group_privilege_names_local_nonprim = NULL;
    }
    if (constraint_local_nonprim) {
        config_node_property_string_free(constraint_local_nonprim);
        constraint_local_nonprim = NULL;
    }
    return NULL;

}
