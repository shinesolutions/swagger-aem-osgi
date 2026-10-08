/*
 * org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_H_
#define _org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t {
    struct config_node_property_string_t *provider_name; //model
    struct config_node_property_string_t *host_name; //model
    struct config_node_property_integer_t *host_port; //model
    struct config_node_property_boolean_t *host_ssl; //model
    struct config_node_property_boolean_t *host_tls; //model
    struct config_node_property_boolean_t *host_no_cert_check; //model
    struct config_node_property_string_t *bind_dn; //model
    struct config_node_property_string_t *bind_password; //model
    struct config_node_property_string_t *search_timeout; //model
    struct config_node_property_integer_t *admin_pool_max_active; //model
    struct config_node_property_boolean_t *admin_pool_lookup_on_validate; //model
    struct config_node_property_integer_t *user_pool_max_active; //model
    struct config_node_property_boolean_t *user_pool_lookup_on_validate; //model
    struct config_node_property_string_t *user_base_dn; //model
    struct config_node_property_array_t *user_objectclass; //model
    struct config_node_property_string_t *user_id_attribute; //model
    struct config_node_property_string_t *user_extra_filter; //model
    struct config_node_property_boolean_t *user_make_dn_path; //model
    struct config_node_property_string_t *group_base_dn; //model
    struct config_node_property_array_t *group_objectclass; //model
    struct config_node_property_string_t *group_name_attribute; //model
    struct config_node_property_string_t *group_extra_filter; //model
    struct config_node_property_boolean_t *group_make_dn_path; //model
    struct config_node_property_string_t *group_member_attribute; //model
    struct config_node_property_boolean_t *use_uid_for_ext_id; //model
    struct config_node_property_array_t *customattributes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_create(
    config_node_property_string_t *provider_name,
    config_node_property_string_t *host_name,
    config_node_property_integer_t *host_port,
    config_node_property_boolean_t *host_ssl,
    config_node_property_boolean_t *host_tls,
    config_node_property_boolean_t *host_no_cert_check,
    config_node_property_string_t *bind_dn,
    config_node_property_string_t *bind_password,
    config_node_property_string_t *search_timeout,
    config_node_property_integer_t *admin_pool_max_active,
    config_node_property_boolean_t *admin_pool_lookup_on_validate,
    config_node_property_integer_t *user_pool_max_active,
    config_node_property_boolean_t *user_pool_lookup_on_validate,
    config_node_property_string_t *user_base_dn,
    config_node_property_array_t *user_objectclass,
    config_node_property_string_t *user_id_attribute,
    config_node_property_string_t *user_extra_filter,
    config_node_property_boolean_t *user_make_dn_path,
    config_node_property_string_t *group_base_dn,
    config_node_property_array_t *group_objectclass,
    config_node_property_string_t *group_name_attribute,
    config_node_property_string_t *group_extra_filter,
    config_node_property_boolean_t *group_make_dn_path,
    config_node_property_string_t *group_member_attribute,
    config_node_property_boolean_t *use_uid_for_ext_id,
    config_node_property_array_t *customattributes
);

void org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties);

org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties);

#endif /* _org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_H_ */

