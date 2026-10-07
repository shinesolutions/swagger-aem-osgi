/*
 * org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_H_
#define _org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t {
    struct config_node_property_string_t *handler_name; //model
    struct config_node_property_string_t *user_expiration_time; //model
    struct config_node_property_array_t *user_auto_membership; //model
    struct config_node_property_array_t *user_property_mapping; //model
    struct config_node_property_string_t *user_path_prefix; //model
    struct config_node_property_string_t *user_membership_exp_time; //model
    struct config_node_property_integer_t *user_membership_nesting_depth; //model
    struct config_node_property_boolean_t *user_dynamic_membership; //model
    struct config_node_property_boolean_t *user_disable_missing; //model
    struct config_node_property_string_t *group_expiration_time; //model
    struct config_node_property_array_t *group_auto_membership; //model
    struct config_node_property_array_t *group_property_mapping; //model
    struct config_node_property_string_t *group_path_prefix; //model
    struct config_node_property_boolean_t *enable_rfc7613_usercase_mapped_profile; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t;

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
);

void org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties);

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties);

#endif /* _org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_H_ */

