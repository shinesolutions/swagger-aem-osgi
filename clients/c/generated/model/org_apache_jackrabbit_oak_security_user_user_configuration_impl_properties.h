/*
 * org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_H_
#define _org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t {
    struct config_node_property_string_t *users_path; //model
    struct config_node_property_string_t *groups_path; //model
    struct config_node_property_string_t *system_relative_path; //model
    struct config_node_property_integer_t *default_depth; //model
    struct config_node_property_drop_down_t *import_behavior; //model
    struct config_node_property_string_t *password_hash_algorithm; //model
    struct config_node_property_integer_t *password_hash_iterations; //model
    struct config_node_property_integer_t *password_salt_size; //model
    struct config_node_property_boolean_t *omit_admin_pw; //model
    struct config_node_property_boolean_t *support_auto_save; //model
    struct config_node_property_integer_t *password_max_age; //model
    struct config_node_property_boolean_t *initial_password_change; //model
    struct config_node_property_integer_t *password_history_size; //model
    struct config_node_property_boolean_t *password_expiry_for_admin; //model
    struct config_node_property_integer_t *cache_expiration; //model
    struct config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t;

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
);

void org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_free(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties);

org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_user_user_configuration_impl_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_convertToJSON(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_t *org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties);

#endif /* _org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_H_ */

