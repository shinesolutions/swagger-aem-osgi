#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties.h"



static org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_create_internal(
    config_node_property_string_t *users_path,
    config_node_property_string_t *groups_path,
    config_node_property_string_t *system_relative_path,
    config_node_property_integer_t *default_depth,
    config_node_property_drop_down_t *import_behavior,
    config_node_property_string_t *password_hash_algorithm,
    config_node_property_integer_t *password_hash_iterations,
    config_node_property_integer_t *password_salt_size,
    config_node_property_boolean_t *omit_admin_pw,
    config_node_property_boolean_t *support_auto_save,
    config_node_property_integer_t *password_max_age,
    config_node_property_boolean_t *initial_password_change,
    config_node_property_integer_t *password_history_size,
    config_node_property_boolean_t *password_expiry_for_admin,
    config_node_property_integer_t *cache_expiration,
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile
    ) {
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t));
    if (!org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t));
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->users_path = users_path;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->groups_path = groups_path;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->system_relative_path = system_relative_path;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->default_depth = default_depth;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->import_behavior = import_behavior;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_hash_algorithm = password_hash_algorithm;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_hash_iterations = password_hash_iterations;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_salt_size = password_salt_size;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->omit_admin_pw = omit_admin_pw;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->support_auto_save = support_auto_save;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_max_age = password_max_age;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->initial_password_change = initial_password_change;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_history_size = password_history_size;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->password_expiry_for_admin = password_expiry_for_admin;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->cache_expiration = cache_expiration;
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var->enable_rfc7613_usercase_mapped_profile = enable_rfc7613_usercase_mapped_profile;
    return org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_create(
    config_node_property_string_t *users_path,
    config_node_property_string_t *groups_path,
    config_node_property_string_t *system_relative_path,
    config_node_property_integer_t *default_depth,
    config_node_property_drop_down_t *import_behavior,
    config_node_property_string_t *password_hash_algorithm,
    config_node_property_integer_t *password_hash_iterations,
    config_node_property_integer_t *password_salt_size,
    config_node_property_boolean_t *omit_admin_pw,
    config_node_property_boolean_t *support_auto_save,
    config_node_property_integer_t *password_max_age,
    config_node_property_boolean_t *initial_password_change,
    config_node_property_integer_t *password_history_size,
    config_node_property_boolean_t *password_expiry_for_admin,
    config_node_property_integer_t *cache_expiration,
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile
    ) {
    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *result = org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_create_internal (
        users_path,
        groups_path,
        system_relative_path,
        default_depth,
        import_behavior,
        password_hash_algorithm,
        password_hash_iterations,
        password_salt_size,
        omit_admin_pw,
        support_auto_save,
        password_max_age,
        initial_password_change,
        password_history_size,
        password_expiry_for_admin,
        cache_expiration,
        enable_rfc7613_usercase_mapped_profile
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration = NULL;
    }
    if (org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile);
        org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile = NULL;
    }
    free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties);
}

cJSON *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path) {
    cJSON *users_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path);
    if(users_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usersPath", users_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path) {
    cJSON *groups_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path);
    if(groups_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "groupsPath", groups_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path) {
    cJSON *system_relative_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path);
    if(system_relative_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "systemRelativePath", system_relative_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth) {
    cJSON *default_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth);
    if(default_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultDepth", default_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior) {
    cJSON *import_behavior_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior);
    if(import_behavior_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importBehavior", import_behavior_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm) {
    cJSON *password_hash_algorithm_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm);
    if(password_hash_algorithm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordHashAlgorithm", password_hash_algorithm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations) {
    cJSON *password_hash_iterations_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations);
    if(password_hash_iterations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordHashIterations", password_hash_iterations_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size) {
    cJSON *password_salt_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size);
    if(password_salt_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordSaltSize", password_salt_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw) {
    cJSON *omit_admin_pw_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw);
    if(omit_admin_pw_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "omitAdminPw", omit_admin_pw_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save) {
    cJSON *support_auto_save_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save);
    if(support_auto_save_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportAutoSave", support_auto_save_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age) {
    cJSON *password_max_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age);
    if(password_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordMaxAge", password_max_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change) {
    cJSON *initial_password_change_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change);
    if(initial_password_change_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "initialPasswordChange", initial_password_change_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size) {
    cJSON *password_history_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size);
    if(password_history_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordHistorySize", password_history_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin) {
    cJSON *password_expiry_for_admin_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin);
    if(password_expiry_for_admin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passwordExpiryForAdmin", password_expiry_for_admin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration) {
    cJSON *cache_expiration_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration);
    if(cache_expiration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cacheExpiration", cache_expiration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile
    if(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile) {
    cJSON *enable_rfc7613_usercase_mapped_profile_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile);
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

org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON){

    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path
    config_node_property_string_t *users_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path
    config_node_property_string_t *groups_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path
    config_node_property_string_t *system_relative_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth
    config_node_property_integer_t *default_depth_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior
    config_node_property_drop_down_t *import_behavior_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm
    config_node_property_string_t *password_hash_algorithm_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations
    config_node_property_integer_t *password_hash_iterations_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size
    config_node_property_integer_t *password_salt_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw
    config_node_property_boolean_t *omit_admin_pw_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save
    config_node_property_boolean_t *support_auto_save_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age
    config_node_property_integer_t *password_max_age_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change
    config_node_property_boolean_t *initial_password_change_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size
    config_node_property_integer_t *password_history_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin
    config_node_property_boolean_t *password_expiry_for_admin_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration
    config_node_property_integer_t *cache_expiration_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile
    config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->users_path
    cJSON *users_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "usersPath");
    if (cJSON_IsNull(users_path)) {
        users_path = NULL;
    }
    if (users_path) { 
    users_path_local_nonprim = config_node_property_string_parseFromJSON(users_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->groups_path
    cJSON *groups_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "groupsPath");
    if (cJSON_IsNull(groups_path)) {
        groups_path = NULL;
    }
    if (groups_path) { 
    groups_path_local_nonprim = config_node_property_string_parseFromJSON(groups_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->system_relative_path
    cJSON *system_relative_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "systemRelativePath");
    if (cJSON_IsNull(system_relative_path)) {
        system_relative_path = NULL;
    }
    if (system_relative_path) { 
    system_relative_path_local_nonprim = config_node_property_string_parseFromJSON(system_relative_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->default_depth
    cJSON *default_depth = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "defaultDepth");
    if (cJSON_IsNull(default_depth)) {
        default_depth = NULL;
    }
    if (default_depth) { 
    default_depth_local_nonprim = config_node_property_integer_parseFromJSON(default_depth); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->import_behavior
    cJSON *import_behavior = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "importBehavior");
    if (cJSON_IsNull(import_behavior)) {
        import_behavior = NULL;
    }
    if (import_behavior) { 
    import_behavior_local_nonprim = config_node_property_drop_down_parseFromJSON(import_behavior); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_algorithm
    cJSON *password_hash_algorithm = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordHashAlgorithm");
    if (cJSON_IsNull(password_hash_algorithm)) {
        password_hash_algorithm = NULL;
    }
    if (password_hash_algorithm) { 
    password_hash_algorithm_local_nonprim = config_node_property_string_parseFromJSON(password_hash_algorithm); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_hash_iterations
    cJSON *password_hash_iterations = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordHashIterations");
    if (cJSON_IsNull(password_hash_iterations)) {
        password_hash_iterations = NULL;
    }
    if (password_hash_iterations) { 
    password_hash_iterations_local_nonprim = config_node_property_integer_parseFromJSON(password_hash_iterations); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_salt_size
    cJSON *password_salt_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordSaltSize");
    if (cJSON_IsNull(password_salt_size)) {
        password_salt_size = NULL;
    }
    if (password_salt_size) { 
    password_salt_size_local_nonprim = config_node_property_integer_parseFromJSON(password_salt_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->omit_admin_pw
    cJSON *omit_admin_pw = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "omitAdminPw");
    if (cJSON_IsNull(omit_admin_pw)) {
        omit_admin_pw = NULL;
    }
    if (omit_admin_pw) { 
    omit_admin_pw_local_nonprim = config_node_property_boolean_parseFromJSON(omit_admin_pw); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->support_auto_save
    cJSON *support_auto_save = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "supportAutoSave");
    if (cJSON_IsNull(support_auto_save)) {
        support_auto_save = NULL;
    }
    if (support_auto_save) { 
    support_auto_save_local_nonprim = config_node_property_boolean_parseFromJSON(support_auto_save); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_max_age
    cJSON *password_max_age = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordMaxAge");
    if (cJSON_IsNull(password_max_age)) {
        password_max_age = NULL;
    }
    if (password_max_age) { 
    password_max_age_local_nonprim = config_node_property_integer_parseFromJSON(password_max_age); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->initial_password_change
    cJSON *initial_password_change = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "initialPasswordChange");
    if (cJSON_IsNull(initial_password_change)) {
        initial_password_change = NULL;
    }
    if (initial_password_change) { 
    initial_password_change_local_nonprim = config_node_property_boolean_parseFromJSON(initial_password_change); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_history_size
    cJSON *password_history_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordHistorySize");
    if (cJSON_IsNull(password_history_size)) {
        password_history_size = NULL;
    }
    if (password_history_size) { 
    password_history_size_local_nonprim = config_node_property_integer_parseFromJSON(password_history_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->password_expiry_for_admin
    cJSON *password_expiry_for_admin = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "passwordExpiryForAdmin");
    if (cJSON_IsNull(password_expiry_for_admin)) {
        password_expiry_for_admin = NULL;
    }
    if (password_expiry_for_admin) { 
    password_expiry_for_admin_local_nonprim = config_node_property_boolean_parseFromJSON(password_expiry_for_admin); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->cache_expiration
    cJSON *cache_expiration = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "cacheExpiration");
    if (cJSON_IsNull(cache_expiration)) {
        cache_expiration = NULL;
    }
    if (cache_expiration) { 
    cache_expiration_local_nonprim = config_node_property_integer_parseFromJSON(cache_expiration); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties->enable_rfc7613_usercase_mapped_profile
    cJSON *enable_rfc7613_usercase_mapped_profile = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON, "enableRFC7613UsercaseMappedProfile");
    if (cJSON_IsNull(enable_rfc7613_usercase_mapped_profile)) {
        enable_rfc7613_usercase_mapped_profile = NULL;
    }
    if (enable_rfc7613_usercase_mapped_profile) { 
    enable_rfc7613_usercase_mapped_profile_local_nonprim = config_node_property_boolean_parseFromJSON(enable_rfc7613_usercase_mapped_profile); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var = org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_create_internal (
        users_path ? users_path_local_nonprim : NULL,
        groups_path ? groups_path_local_nonprim : NULL,
        system_relative_path ? system_relative_path_local_nonprim : NULL,
        default_depth ? default_depth_local_nonprim : NULL,
        import_behavior ? import_behavior_local_nonprim : NULL,
        password_hash_algorithm ? password_hash_algorithm_local_nonprim : NULL,
        password_hash_iterations ? password_hash_iterations_local_nonprim : NULL,
        password_salt_size ? password_salt_size_local_nonprim : NULL,
        omit_admin_pw ? omit_admin_pw_local_nonprim : NULL,
        support_auto_save ? support_auto_save_local_nonprim : NULL,
        password_max_age ? password_max_age_local_nonprim : NULL,
        initial_password_change ? initial_password_change_local_nonprim : NULL,
        password_history_size ? password_history_size_local_nonprim : NULL,
        password_expiry_for_admin ? password_expiry_for_admin_local_nonprim : NULL,
        cache_expiration ? cache_expiration_local_nonprim : NULL,
        enable_rfc7613_usercase_mapped_profile ? enable_rfc7613_usercase_mapped_profile_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_local_var;
end:
    if (users_path_local_nonprim) {
        config_node_property_string_free(users_path_local_nonprim);
        users_path_local_nonprim = NULL;
    }
    if (groups_path_local_nonprim) {
        config_node_property_string_free(groups_path_local_nonprim);
        groups_path_local_nonprim = NULL;
    }
    if (system_relative_path_local_nonprim) {
        config_node_property_string_free(system_relative_path_local_nonprim);
        system_relative_path_local_nonprim = NULL;
    }
    if (default_depth_local_nonprim) {
        config_node_property_integer_free(default_depth_local_nonprim);
        default_depth_local_nonprim = NULL;
    }
    if (import_behavior_local_nonprim) {
        config_node_property_drop_down_free(import_behavior_local_nonprim);
        import_behavior_local_nonprim = NULL;
    }
    if (password_hash_algorithm_local_nonprim) {
        config_node_property_string_free(password_hash_algorithm_local_nonprim);
        password_hash_algorithm_local_nonprim = NULL;
    }
    if (password_hash_iterations_local_nonprim) {
        config_node_property_integer_free(password_hash_iterations_local_nonprim);
        password_hash_iterations_local_nonprim = NULL;
    }
    if (password_salt_size_local_nonprim) {
        config_node_property_integer_free(password_salt_size_local_nonprim);
        password_salt_size_local_nonprim = NULL;
    }
    if (omit_admin_pw_local_nonprim) {
        config_node_property_boolean_free(omit_admin_pw_local_nonprim);
        omit_admin_pw_local_nonprim = NULL;
    }
    if (support_auto_save_local_nonprim) {
        config_node_property_boolean_free(support_auto_save_local_nonprim);
        support_auto_save_local_nonprim = NULL;
    }
    if (password_max_age_local_nonprim) {
        config_node_property_integer_free(password_max_age_local_nonprim);
        password_max_age_local_nonprim = NULL;
    }
    if (initial_password_change_local_nonprim) {
        config_node_property_boolean_free(initial_password_change_local_nonprim);
        initial_password_change_local_nonprim = NULL;
    }
    if (password_history_size_local_nonprim) {
        config_node_property_integer_free(password_history_size_local_nonprim);
        password_history_size_local_nonprim = NULL;
    }
    if (password_expiry_for_admin_local_nonprim) {
        config_node_property_boolean_free(password_expiry_for_admin_local_nonprim);
        password_expiry_for_admin_local_nonprim = NULL;
    }
    if (cache_expiration_local_nonprim) {
        config_node_property_integer_free(cache_expiration_local_nonprim);
        cache_expiration_local_nonprim = NULL;
    }
    if (enable_rfc7613_usercase_mapped_profile_local_nonprim) {
        config_node_property_boolean_free(enable_rfc7613_usercase_mapped_profile_local_nonprim);
        enable_rfc7613_usercase_mapped_profile_local_nonprim = NULL;
    }
    return NULL;

}
