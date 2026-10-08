#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties.h"



static org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_create_internal(
    config_node_property_string_t *handler_name,
    config_node_property_string_t *user_expiration_time,
    config_node_property_array_t *user_auto_membership,
    config_node_property_array_t *user_property_mapping,
    config_node_property_string_t *user_path_prefix,
    config_node_property_string_t *user_membership_exp_time,
    config_node_property_integer_t *user_membership_nesting_depth,
    config_node_property_boolean_t *user_dynamic_membership,
    config_node_property_boolean_t *user_disable_missing,
    config_node_property_string_t *group_expiration_time,
    config_node_property_array_t *group_auto_membership,
    config_node_property_array_t *group_property_mapping,
    config_node_property_string_t *group_path_prefix,
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile
    ) {
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t));
    if (!org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t));
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->handler_name = handler_name;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_expiration_time = user_expiration_time;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_auto_membership = user_auto_membership;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_property_mapping = user_property_mapping;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_path_prefix = user_path_prefix;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_membership_exp_time = user_membership_exp_time;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_membership_nesting_depth = user_membership_nesting_depth;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_dynamic_membership = user_dynamic_membership;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->user_disable_missing = user_disable_missing;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->group_expiration_time = group_expiration_time;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->group_auto_membership = group_auto_membership;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->group_property_mapping = group_property_mapping;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->group_path_prefix = group_path_prefix;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var->enable_rfc7613_usercase_mapped_profile = enable_rfc7613_usercase_mapped_profile;
    return org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_create(
    config_node_property_string_t *handler_name,
    config_node_property_string_t *user_expiration_time,
    config_node_property_array_t *user_auto_membership,
    config_node_property_array_t *user_property_mapping,
    config_node_property_string_t *user_path_prefix,
    config_node_property_string_t *user_membership_exp_time,
    config_node_property_integer_t *user_membership_nesting_depth,
    config_node_property_boolean_t *user_dynamic_membership,
    config_node_property_boolean_t *user_disable_missing,
    config_node_property_string_t *group_expiration_time,
    config_node_property_array_t *group_auto_membership,
    config_node_property_array_t *group_property_mapping,
    config_node_property_string_t *group_path_prefix,
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile
    ) {
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *result = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_create_internal (
        handler_name,
        user_expiration_time,
        user_auto_membership,
        user_property_mapping,
        user_path_prefix,
        user_membership_exp_time,
        user_membership_nesting_depth,
        user_dynamic_membership,
        user_disable_missing,
        group_expiration_time,
        group_auto_membership,
        group_property_mapping,
        group_path_prefix,
        enable_rfc7613_usercase_mapped_profile
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties) {
    if(NULL == org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile = NULL;
    }
    free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties);
}

cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name) {
    cJSON *handler_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name);
    if(handler_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "handler.name", handler_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time) {
    cJSON *user_expiration_time_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time);
    if(user_expiration_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.expirationTime", user_expiration_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership) {
    cJSON *user_auto_membership_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership);
    if(user_auto_membership_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.autoMembership", user_auto_membership_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping) {
    cJSON *user_property_mapping_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping);
    if(user_property_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.propertyMapping", user_property_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix) {
    cJSON *user_path_prefix_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix);
    if(user_path_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.pathPrefix", user_path_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time) {
    cJSON *user_membership_exp_time_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time);
    if(user_membership_exp_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.membershipExpTime", user_membership_exp_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth) {
    cJSON *user_membership_nesting_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth);
    if(user_membership_nesting_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.membershipNestingDepth", user_membership_nesting_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership) {
    cJSON *user_dynamic_membership_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership);
    if(user_dynamic_membership_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.dynamicMembership", user_dynamic_membership_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing) {
    cJSON *user_disable_missing_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing);
    if(user_disable_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.disableMissing", user_disable_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time) {
    cJSON *group_expiration_time_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time);
    if(group_expiration_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.expirationTime", group_expiration_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership) {
    cJSON *group_auto_membership_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership);
    if(group_auto_membership_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.autoMembership", group_auto_membership_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping) {
    cJSON *group_property_mapping_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping);
    if(group_property_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.propertyMapping", group_property_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix) {
    cJSON *group_path_prefix_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix);
    if(group_path_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.pathPrefix", group_path_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile) {
    cJSON *enable_rfc7613_usercase_mapped_profile_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile);
    if(enable_rfc7613_usercase_mapped_profile_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableRFC7613UsercaseMappedProfile", enable_rfc7613_usercase_mapped_profile_local_JSON);
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

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON){

    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name
    config_node_property_string_t *handler_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time
    config_node_property_string_t *user_expiration_time_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership
    config_node_property_array_t *user_auto_membership_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping
    config_node_property_array_t *user_property_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix
    config_node_property_string_t *user_path_prefix_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time
    config_node_property_string_t *user_membership_exp_time_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth
    config_node_property_integer_t *user_membership_nesting_depth_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership
    config_node_property_boolean_t *user_dynamic_membership_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing
    config_node_property_boolean_t *user_disable_missing_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time
    config_node_property_string_t *group_expiration_time_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership
    config_node_property_array_t *group_auto_membership_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping
    config_node_property_array_t *group_property_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix
    config_node_property_string_t *group_path_prefix_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->handler_name
    cJSON *handler_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "handler.name");
    if (cJSON_IsNull(handler_name)) {
        handler_name = NULL;
    }
    if (handler_name) { 
    handler_name_local_nonprim = config_node_property_string_parseFromJSON(handler_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_expiration_time
    cJSON *user_expiration_time = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.expirationTime");
    if (cJSON_IsNull(user_expiration_time)) {
        user_expiration_time = NULL;
    }
    if (user_expiration_time) { 
    user_expiration_time_local_nonprim = config_node_property_string_parseFromJSON(user_expiration_time); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_auto_membership
    cJSON *user_auto_membership = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.autoMembership");
    if (cJSON_IsNull(user_auto_membership)) {
        user_auto_membership = NULL;
    }
    if (user_auto_membership) { 
    user_auto_membership_local_nonprim = config_node_property_array_parseFromJSON(user_auto_membership); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_property_mapping
    cJSON *user_property_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.propertyMapping");
    if (cJSON_IsNull(user_property_mapping)) {
        user_property_mapping = NULL;
    }
    if (user_property_mapping) { 
    user_property_mapping_local_nonprim = config_node_property_array_parseFromJSON(user_property_mapping); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_path_prefix
    cJSON *user_path_prefix = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.pathPrefix");
    if (cJSON_IsNull(user_path_prefix)) {
        user_path_prefix = NULL;
    }
    if (user_path_prefix) { 
    user_path_prefix_local_nonprim = config_node_property_string_parseFromJSON(user_path_prefix); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_exp_time
    cJSON *user_membership_exp_time = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.membershipExpTime");
    if (cJSON_IsNull(user_membership_exp_time)) {
        user_membership_exp_time = NULL;
    }
    if (user_membership_exp_time) { 
    user_membership_exp_time_local_nonprim = config_node_property_string_parseFromJSON(user_membership_exp_time); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_membership_nesting_depth
    cJSON *user_membership_nesting_depth = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.membershipNestingDepth");
    if (cJSON_IsNull(user_membership_nesting_depth)) {
        user_membership_nesting_depth = NULL;
    }
    if (user_membership_nesting_depth) { 
    user_membership_nesting_depth_local_nonprim = config_node_property_integer_parseFromJSON(user_membership_nesting_depth); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_dynamic_membership
    cJSON *user_dynamic_membership = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.dynamicMembership");
    if (cJSON_IsNull(user_dynamic_membership)) {
        user_dynamic_membership = NULL;
    }
    if (user_dynamic_membership) { 
    user_dynamic_membership_local_nonprim = config_node_property_boolean_parseFromJSON(user_dynamic_membership); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->user_disable_missing
    cJSON *user_disable_missing = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "user.disableMissing");
    if (cJSON_IsNull(user_disable_missing)) {
        user_disable_missing = NULL;
    }
    if (user_disable_missing) { 
    user_disable_missing_local_nonprim = config_node_property_boolean_parseFromJSON(user_disable_missing); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_expiration_time
    cJSON *group_expiration_time = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "group.expirationTime");
    if (cJSON_IsNull(group_expiration_time)) {
        group_expiration_time = NULL;
    }
    if (group_expiration_time) { 
    group_expiration_time_local_nonprim = config_node_property_string_parseFromJSON(group_expiration_time); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_auto_membership
    cJSON *group_auto_membership = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "group.autoMembership");
    if (cJSON_IsNull(group_auto_membership)) {
        group_auto_membership = NULL;
    }
    if (group_auto_membership) { 
    group_auto_membership_local_nonprim = config_node_property_array_parseFromJSON(group_auto_membership); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_property_mapping
    cJSON *group_property_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "group.propertyMapping");
    if (cJSON_IsNull(group_property_mapping)) {
        group_property_mapping = NULL;
    }
    if (group_property_mapping) { 
    group_property_mapping_local_nonprim = config_node_property_array_parseFromJSON(group_property_mapping); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->group_path_prefix
    cJSON *group_path_prefix = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "group.pathPrefix");
    if (cJSON_IsNull(group_path_prefix)) {
        group_path_prefix = NULL;
    }
    if (group_path_prefix) { 
    group_path_prefix_local_nonprim = config_node_property_string_parseFromJSON(group_path_prefix); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties->enable_rfc7613_usercase_mapped_profile
    cJSON *enable_rfc7613_usercase_mapped_profile = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON, "enableRFC7613UsercaseMappedProfile");
    if (cJSON_IsNull(enable_rfc7613_usercase_mapped_profile)) {
        enable_rfc7613_usercase_mapped_profile = NULL;
    }
    if (enable_rfc7613_usercase_mapped_profile) { 
    enable_rfc7613_usercase_mapped_profile_local_nonprim = config_node_property_boolean_parseFromJSON(enable_rfc7613_usercase_mapped_profile); //nonprimitive
    }



    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_create_internal (
        handler_name ? handler_name_local_nonprim : NULL,
        user_expiration_time ? user_expiration_time_local_nonprim : NULL,
        user_auto_membership ? user_auto_membership_local_nonprim : NULL,
        user_property_mapping ? user_property_mapping_local_nonprim : NULL,
        user_path_prefix ? user_path_prefix_local_nonprim : NULL,
        user_membership_exp_time ? user_membership_exp_time_local_nonprim : NULL,
        user_membership_nesting_depth ? user_membership_nesting_depth_local_nonprim : NULL,
        user_dynamic_membership ? user_dynamic_membership_local_nonprim : NULL,
        user_disable_missing ? user_disable_missing_local_nonprim : NULL,
        group_expiration_time ? group_expiration_time_local_nonprim : NULL,
        group_auto_membership ? group_auto_membership_local_nonprim : NULL,
        group_property_mapping ? group_property_mapping_local_nonprim : NULL,
        group_path_prefix ? group_path_prefix_local_nonprim : NULL,
        enable_rfc7613_usercase_mapped_profile ? enable_rfc7613_usercase_mapped_profile_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_local_var;
end:
    if (handler_name_local_nonprim) {
        config_node_property_string_free(handler_name_local_nonprim);
        handler_name_local_nonprim = NULL;
    }
    if (user_expiration_time_local_nonprim) {
        config_node_property_string_free(user_expiration_time_local_nonprim);
        user_expiration_time_local_nonprim = NULL;
    }
    if (user_auto_membership_local_nonprim) {
        config_node_property_array_free(user_auto_membership_local_nonprim);
        user_auto_membership_local_nonprim = NULL;
    }
    if (user_property_mapping_local_nonprim) {
        config_node_property_array_free(user_property_mapping_local_nonprim);
        user_property_mapping_local_nonprim = NULL;
    }
    if (user_path_prefix_local_nonprim) {
        config_node_property_string_free(user_path_prefix_local_nonprim);
        user_path_prefix_local_nonprim = NULL;
    }
    if (user_membership_exp_time_local_nonprim) {
        config_node_property_string_free(user_membership_exp_time_local_nonprim);
        user_membership_exp_time_local_nonprim = NULL;
    }
    if (user_membership_nesting_depth_local_nonprim) {
        config_node_property_integer_free(user_membership_nesting_depth_local_nonprim);
        user_membership_nesting_depth_local_nonprim = NULL;
    }
    if (user_dynamic_membership_local_nonprim) {
        config_node_property_boolean_free(user_dynamic_membership_local_nonprim);
        user_dynamic_membership_local_nonprim = NULL;
    }
    if (user_disable_missing_local_nonprim) {
        config_node_property_boolean_free(user_disable_missing_local_nonprim);
        user_disable_missing_local_nonprim = NULL;
    }
    if (group_expiration_time_local_nonprim) {
        config_node_property_string_free(group_expiration_time_local_nonprim);
        group_expiration_time_local_nonprim = NULL;
    }
    if (group_auto_membership_local_nonprim) {
        config_node_property_array_free(group_auto_membership_local_nonprim);
        group_auto_membership_local_nonprim = NULL;
    }
    if (group_property_mapping_local_nonprim) {
        config_node_property_array_free(group_property_mapping_local_nonprim);
        group_property_mapping_local_nonprim = NULL;
    }
    if (group_path_prefix_local_nonprim) {
        config_node_property_string_free(group_path_prefix_local_nonprim);
        group_path_prefix_local_nonprim = NULL;
    }
    if (enable_rfc7613_usercase_mapped_profile_local_nonprim) {
        config_node_property_boolean_free(enable_rfc7613_usercase_mapped_profile_local_nonprim);
        enable_rfc7613_usercase_mapped_profile_local_nonprim = NULL;
    }
    return NULL;

}
