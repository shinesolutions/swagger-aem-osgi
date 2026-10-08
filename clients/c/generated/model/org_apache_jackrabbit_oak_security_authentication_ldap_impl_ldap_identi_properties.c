#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties.h"



static org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_create_internal(
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
    ) {
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t));
    if (!org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t));
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->provider_name = provider_name;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->host_name = host_name;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->host_port = host_port;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->host_ssl = host_ssl;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->host_tls = host_tls;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->host_no_cert_check = host_no_cert_check;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->bind_dn = bind_dn;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->bind_password = bind_password;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->search_timeout = search_timeout;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->admin_pool_max_active = admin_pool_max_active;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->admin_pool_lookup_on_validate = admin_pool_lookup_on_validate;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_pool_max_active = user_pool_max_active;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_pool_lookup_on_validate = user_pool_lookup_on_validate;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_base_dn = user_base_dn;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_objectclass = user_objectclass;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_id_attribute = user_id_attribute;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_extra_filter = user_extra_filter;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->user_make_dn_path = user_make_dn_path;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_base_dn = group_base_dn;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_objectclass = group_objectclass;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_name_attribute = group_name_attribute;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_extra_filter = group_extra_filter;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_make_dn_path = group_make_dn_path;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->group_member_attribute = group_member_attribute;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->use_uid_for_ext_id = use_uid_for_ext_id;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var->customattributes = customattributes;
    return org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var;
}

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
    ) {
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *result = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_create_internal (
        provider_name,
        host_name,
        host_port,
        host_ssl,
        host_tls,
        host_no_cert_check,
        bind_dn,
        bind_password,
        search_timeout,
        admin_pool_max_active,
        admin_pool_lookup_on_validate,
        user_pool_max_active,
        user_pool_lookup_on_validate,
        user_base_dn,
        user_objectclass,
        user_id_attribute,
        user_extra_filter,
        user_make_dn_path,
        group_base_dn,
        group_objectclass,
        group_name_attribute,
        group_extra_filter,
        group_make_dn_path,
        group_member_attribute,
        use_uid_for_ext_id,
        customattributes
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes) {
        config_node_property_array_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes = NULL;
    }
    free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties);
}

cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name) {
    cJSON *provider_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name);
    if(provider_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.name", provider_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name) {
    cJSON *host_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name);
    if(host_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.name", host_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port) {
    cJSON *host_port_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port);
    if(host_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.port", host_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl) {
    cJSON *host_ssl_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl);
    if(host_ssl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.ssl", host_ssl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls) {
    cJSON *host_tls_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls);
    if(host_tls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.tls", host_tls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check) {
    cJSON *host_no_cert_check_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check);
    if(host_no_cert_check_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host.noCertCheck", host_no_cert_check_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn) {
    cJSON *bind_dn_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn);
    if(bind_dn_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bind.dn", bind_dn_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password) {
    cJSON *bind_password_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password);
    if(bind_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bind.password", bind_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout) {
    cJSON *search_timeout_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout);
    if(search_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "searchTimeout", search_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active) {
    cJSON *admin_pool_max_active_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active);
    if(admin_pool_max_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "adminPool.maxActive", admin_pool_max_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate) {
    cJSON *admin_pool_lookup_on_validate_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate);
    if(admin_pool_lookup_on_validate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "adminPool.lookupOnValidate", admin_pool_lookup_on_validate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active) {
    cJSON *user_pool_max_active_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active);
    if(user_pool_max_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userPool.maxActive", user_pool_max_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate) {
    cJSON *user_pool_lookup_on_validate_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate);
    if(user_pool_lookup_on_validate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userPool.lookupOnValidate", user_pool_lookup_on_validate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn) {
    cJSON *user_base_dn_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn);
    if(user_base_dn_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.baseDN", user_base_dn_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass) {
    cJSON *user_objectclass_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass);
    if(user_objectclass_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.objectclass", user_objectclass_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute) {
    cJSON *user_id_attribute_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute);
    if(user_id_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.idAttribute", user_id_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter) {
    cJSON *user_extra_filter_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter);
    if(user_extra_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.extraFilter", user_extra_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path) {
    cJSON *user_make_dn_path_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path);
    if(user_make_dn_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.makeDnPath", user_make_dn_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn) {
    cJSON *group_base_dn_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn);
    if(group_base_dn_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.baseDN", group_base_dn_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass) {
    cJSON *group_objectclass_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass);
    if(group_objectclass_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.objectclass", group_objectclass_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute) {
    cJSON *group_name_attribute_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute);
    if(group_name_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.nameAttribute", group_name_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter) {
    cJSON *group_extra_filter_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter);
    if(group_extra_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.extraFilter", group_extra_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path) {
    cJSON *group_make_dn_path_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path);
    if(group_make_dn_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.makeDnPath", group_make_dn_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute) {
    cJSON *group_member_attribute_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute);
    if(group_member_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.memberAttribute", group_member_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id) {
    cJSON *use_uid_for_ext_id_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id);
    if(use_uid_for_ext_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useUidForExtId", use_uid_for_ext_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes) {
    cJSON *customattributes_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes);
    if(customattributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customattributes", customattributes_local_JSON);
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

org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON){

    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name
    config_node_property_string_t *provider_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name
    config_node_property_string_t *host_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port
    config_node_property_integer_t *host_port_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl
    config_node_property_boolean_t *host_ssl_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls
    config_node_property_boolean_t *host_tls_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check
    config_node_property_boolean_t *host_no_cert_check_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn
    config_node_property_string_t *bind_dn_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password
    config_node_property_string_t *bind_password_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout
    config_node_property_string_t *search_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active
    config_node_property_integer_t *admin_pool_max_active_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate
    config_node_property_boolean_t *admin_pool_lookup_on_validate_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active
    config_node_property_integer_t *user_pool_max_active_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate
    config_node_property_boolean_t *user_pool_lookup_on_validate_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn
    config_node_property_string_t *user_base_dn_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass
    config_node_property_array_t *user_objectclass_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute
    config_node_property_string_t *user_id_attribute_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter
    config_node_property_string_t *user_extra_filter_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path
    config_node_property_boolean_t *user_make_dn_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn
    config_node_property_string_t *group_base_dn_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass
    config_node_property_array_t *group_objectclass_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute
    config_node_property_string_t *group_name_attribute_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter
    config_node_property_string_t *group_extra_filter_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path
    config_node_property_boolean_t *group_make_dn_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute
    config_node_property_string_t *group_member_attribute_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id
    config_node_property_boolean_t *use_uid_for_ext_id_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes
    config_node_property_array_t *customattributes_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->provider_name
    cJSON *provider_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "provider.name");
    if (cJSON_IsNull(provider_name)) {
        provider_name = NULL;
    }
    if (provider_name) { 
    provider_name_local_nonprim = config_node_property_string_parseFromJSON(provider_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_name
    cJSON *host_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "host.name");
    if (cJSON_IsNull(host_name)) {
        host_name = NULL;
    }
    if (host_name) { 
    host_name_local_nonprim = config_node_property_string_parseFromJSON(host_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_port
    cJSON *host_port = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "host.port");
    if (cJSON_IsNull(host_port)) {
        host_port = NULL;
    }
    if (host_port) { 
    host_port_local_nonprim = config_node_property_integer_parseFromJSON(host_port); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_ssl
    cJSON *host_ssl = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "host.ssl");
    if (cJSON_IsNull(host_ssl)) {
        host_ssl = NULL;
    }
    if (host_ssl) { 
    host_ssl_local_nonprim = config_node_property_boolean_parseFromJSON(host_ssl); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_tls
    cJSON *host_tls = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "host.tls");
    if (cJSON_IsNull(host_tls)) {
        host_tls = NULL;
    }
    if (host_tls) { 
    host_tls_local_nonprim = config_node_property_boolean_parseFromJSON(host_tls); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->host_no_cert_check
    cJSON *host_no_cert_check = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "host.noCertCheck");
    if (cJSON_IsNull(host_no_cert_check)) {
        host_no_cert_check = NULL;
    }
    if (host_no_cert_check) { 
    host_no_cert_check_local_nonprim = config_node_property_boolean_parseFromJSON(host_no_cert_check); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_dn
    cJSON *bind_dn = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "bind.dn");
    if (cJSON_IsNull(bind_dn)) {
        bind_dn = NULL;
    }
    if (bind_dn) { 
    bind_dn_local_nonprim = config_node_property_string_parseFromJSON(bind_dn); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->bind_password
    cJSON *bind_password = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "bind.password");
    if (cJSON_IsNull(bind_password)) {
        bind_password = NULL;
    }
    if (bind_password) { 
    bind_password_local_nonprim = config_node_property_string_parseFromJSON(bind_password); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->search_timeout
    cJSON *search_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "searchTimeout");
    if (cJSON_IsNull(search_timeout)) {
        search_timeout = NULL;
    }
    if (search_timeout) { 
    search_timeout_local_nonprim = config_node_property_string_parseFromJSON(search_timeout); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_max_active
    cJSON *admin_pool_max_active = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "adminPool.maxActive");
    if (cJSON_IsNull(admin_pool_max_active)) {
        admin_pool_max_active = NULL;
    }
    if (admin_pool_max_active) { 
    admin_pool_max_active_local_nonprim = config_node_property_integer_parseFromJSON(admin_pool_max_active); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->admin_pool_lookup_on_validate
    cJSON *admin_pool_lookup_on_validate = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "adminPool.lookupOnValidate");
    if (cJSON_IsNull(admin_pool_lookup_on_validate)) {
        admin_pool_lookup_on_validate = NULL;
    }
    if (admin_pool_lookup_on_validate) { 
    admin_pool_lookup_on_validate_local_nonprim = config_node_property_boolean_parseFromJSON(admin_pool_lookup_on_validate); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_max_active
    cJSON *user_pool_max_active = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "userPool.maxActive");
    if (cJSON_IsNull(user_pool_max_active)) {
        user_pool_max_active = NULL;
    }
    if (user_pool_max_active) { 
    user_pool_max_active_local_nonprim = config_node_property_integer_parseFromJSON(user_pool_max_active); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_pool_lookup_on_validate
    cJSON *user_pool_lookup_on_validate = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "userPool.lookupOnValidate");
    if (cJSON_IsNull(user_pool_lookup_on_validate)) {
        user_pool_lookup_on_validate = NULL;
    }
    if (user_pool_lookup_on_validate) { 
    user_pool_lookup_on_validate_local_nonprim = config_node_property_boolean_parseFromJSON(user_pool_lookup_on_validate); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_base_dn
    cJSON *user_base_dn = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "user.baseDN");
    if (cJSON_IsNull(user_base_dn)) {
        user_base_dn = NULL;
    }
    if (user_base_dn) { 
    user_base_dn_local_nonprim = config_node_property_string_parseFromJSON(user_base_dn); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_objectclass
    cJSON *user_objectclass = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "user.objectclass");
    if (cJSON_IsNull(user_objectclass)) {
        user_objectclass = NULL;
    }
    if (user_objectclass) { 
    user_objectclass_local_nonprim = config_node_property_array_parseFromJSON(user_objectclass); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_id_attribute
    cJSON *user_id_attribute = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "user.idAttribute");
    if (cJSON_IsNull(user_id_attribute)) {
        user_id_attribute = NULL;
    }
    if (user_id_attribute) { 
    user_id_attribute_local_nonprim = config_node_property_string_parseFromJSON(user_id_attribute); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_extra_filter
    cJSON *user_extra_filter = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "user.extraFilter");
    if (cJSON_IsNull(user_extra_filter)) {
        user_extra_filter = NULL;
    }
    if (user_extra_filter) { 
    user_extra_filter_local_nonprim = config_node_property_string_parseFromJSON(user_extra_filter); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->user_make_dn_path
    cJSON *user_make_dn_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "user.makeDnPath");
    if (cJSON_IsNull(user_make_dn_path)) {
        user_make_dn_path = NULL;
    }
    if (user_make_dn_path) { 
    user_make_dn_path_local_nonprim = config_node_property_boolean_parseFromJSON(user_make_dn_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_base_dn
    cJSON *group_base_dn = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.baseDN");
    if (cJSON_IsNull(group_base_dn)) {
        group_base_dn = NULL;
    }
    if (group_base_dn) { 
    group_base_dn_local_nonprim = config_node_property_string_parseFromJSON(group_base_dn); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_objectclass
    cJSON *group_objectclass = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.objectclass");
    if (cJSON_IsNull(group_objectclass)) {
        group_objectclass = NULL;
    }
    if (group_objectclass) { 
    group_objectclass_local_nonprim = config_node_property_array_parseFromJSON(group_objectclass); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_name_attribute
    cJSON *group_name_attribute = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.nameAttribute");
    if (cJSON_IsNull(group_name_attribute)) {
        group_name_attribute = NULL;
    }
    if (group_name_attribute) { 
    group_name_attribute_local_nonprim = config_node_property_string_parseFromJSON(group_name_attribute); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_extra_filter
    cJSON *group_extra_filter = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.extraFilter");
    if (cJSON_IsNull(group_extra_filter)) {
        group_extra_filter = NULL;
    }
    if (group_extra_filter) { 
    group_extra_filter_local_nonprim = config_node_property_string_parseFromJSON(group_extra_filter); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_make_dn_path
    cJSON *group_make_dn_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.makeDnPath");
    if (cJSON_IsNull(group_make_dn_path)) {
        group_make_dn_path = NULL;
    }
    if (group_make_dn_path) { 
    group_make_dn_path_local_nonprim = config_node_property_boolean_parseFromJSON(group_make_dn_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->group_member_attribute
    cJSON *group_member_attribute = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "group.memberAttribute");
    if (cJSON_IsNull(group_member_attribute)) {
        group_member_attribute = NULL;
    }
    if (group_member_attribute) { 
    group_member_attribute_local_nonprim = config_node_property_string_parseFromJSON(group_member_attribute); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->use_uid_for_ext_id
    cJSON *use_uid_for_ext_id = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "useUidForExtId");
    if (cJSON_IsNull(use_uid_for_ext_id)) {
        use_uid_for_ext_id = NULL;
    }
    if (use_uid_for_ext_id) { 
    use_uid_for_ext_id_local_nonprim = config_node_property_boolean_parseFromJSON(use_uid_for_ext_id); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties->customattributes
    cJSON *customattributes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_propertiesJSON, "customattributes");
    if (cJSON_IsNull(customattributes)) {
        customattributes = NULL;
    }
    if (customattributes) { 
    customattributes_local_nonprim = config_node_property_array_parseFromJSON(customattributes); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_create_internal (
        provider_name ? provider_name_local_nonprim : NULL,
        host_name ? host_name_local_nonprim : NULL,
        host_port ? host_port_local_nonprim : NULL,
        host_ssl ? host_ssl_local_nonprim : NULL,
        host_tls ? host_tls_local_nonprim : NULL,
        host_no_cert_check ? host_no_cert_check_local_nonprim : NULL,
        bind_dn ? bind_dn_local_nonprim : NULL,
        bind_password ? bind_password_local_nonprim : NULL,
        search_timeout ? search_timeout_local_nonprim : NULL,
        admin_pool_max_active ? admin_pool_max_active_local_nonprim : NULL,
        admin_pool_lookup_on_validate ? admin_pool_lookup_on_validate_local_nonprim : NULL,
        user_pool_max_active ? user_pool_max_active_local_nonprim : NULL,
        user_pool_lookup_on_validate ? user_pool_lookup_on_validate_local_nonprim : NULL,
        user_base_dn ? user_base_dn_local_nonprim : NULL,
        user_objectclass ? user_objectclass_local_nonprim : NULL,
        user_id_attribute ? user_id_attribute_local_nonprim : NULL,
        user_extra_filter ? user_extra_filter_local_nonprim : NULL,
        user_make_dn_path ? user_make_dn_path_local_nonprim : NULL,
        group_base_dn ? group_base_dn_local_nonprim : NULL,
        group_objectclass ? group_objectclass_local_nonprim : NULL,
        group_name_attribute ? group_name_attribute_local_nonprim : NULL,
        group_extra_filter ? group_extra_filter_local_nonprim : NULL,
        group_make_dn_path ? group_make_dn_path_local_nonprim : NULL,
        group_member_attribute ? group_member_attribute_local_nonprim : NULL,
        use_uid_for_ext_id ? use_uid_for_ext_id_local_nonprim : NULL,
        customattributes ? customattributes_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_local_var;
end:
    if (provider_name_local_nonprim) {
        config_node_property_string_free(provider_name_local_nonprim);
        provider_name_local_nonprim = NULL;
    }
    if (host_name_local_nonprim) {
        config_node_property_string_free(host_name_local_nonprim);
        host_name_local_nonprim = NULL;
    }
    if (host_port_local_nonprim) {
        config_node_property_integer_free(host_port_local_nonprim);
        host_port_local_nonprim = NULL;
    }
    if (host_ssl_local_nonprim) {
        config_node_property_boolean_free(host_ssl_local_nonprim);
        host_ssl_local_nonprim = NULL;
    }
    if (host_tls_local_nonprim) {
        config_node_property_boolean_free(host_tls_local_nonprim);
        host_tls_local_nonprim = NULL;
    }
    if (host_no_cert_check_local_nonprim) {
        config_node_property_boolean_free(host_no_cert_check_local_nonprim);
        host_no_cert_check_local_nonprim = NULL;
    }
    if (bind_dn_local_nonprim) {
        config_node_property_string_free(bind_dn_local_nonprim);
        bind_dn_local_nonprim = NULL;
    }
    if (bind_password_local_nonprim) {
        config_node_property_string_free(bind_password_local_nonprim);
        bind_password_local_nonprim = NULL;
    }
    if (search_timeout_local_nonprim) {
        config_node_property_string_free(search_timeout_local_nonprim);
        search_timeout_local_nonprim = NULL;
    }
    if (admin_pool_max_active_local_nonprim) {
        config_node_property_integer_free(admin_pool_max_active_local_nonprim);
        admin_pool_max_active_local_nonprim = NULL;
    }
    if (admin_pool_lookup_on_validate_local_nonprim) {
        config_node_property_boolean_free(admin_pool_lookup_on_validate_local_nonprim);
        admin_pool_lookup_on_validate_local_nonprim = NULL;
    }
    if (user_pool_max_active_local_nonprim) {
        config_node_property_integer_free(user_pool_max_active_local_nonprim);
        user_pool_max_active_local_nonprim = NULL;
    }
    if (user_pool_lookup_on_validate_local_nonprim) {
        config_node_property_boolean_free(user_pool_lookup_on_validate_local_nonprim);
        user_pool_lookup_on_validate_local_nonprim = NULL;
    }
    if (user_base_dn_local_nonprim) {
        config_node_property_string_free(user_base_dn_local_nonprim);
        user_base_dn_local_nonprim = NULL;
    }
    if (user_objectclass_local_nonprim) {
        config_node_property_array_free(user_objectclass_local_nonprim);
        user_objectclass_local_nonprim = NULL;
    }
    if (user_id_attribute_local_nonprim) {
        config_node_property_string_free(user_id_attribute_local_nonprim);
        user_id_attribute_local_nonprim = NULL;
    }
    if (user_extra_filter_local_nonprim) {
        config_node_property_string_free(user_extra_filter_local_nonprim);
        user_extra_filter_local_nonprim = NULL;
    }
    if (user_make_dn_path_local_nonprim) {
        config_node_property_boolean_free(user_make_dn_path_local_nonprim);
        user_make_dn_path_local_nonprim = NULL;
    }
    if (group_base_dn_local_nonprim) {
        config_node_property_string_free(group_base_dn_local_nonprim);
        group_base_dn_local_nonprim = NULL;
    }
    if (group_objectclass_local_nonprim) {
        config_node_property_array_free(group_objectclass_local_nonprim);
        group_objectclass_local_nonprim = NULL;
    }
    if (group_name_attribute_local_nonprim) {
        config_node_property_string_free(group_name_attribute_local_nonprim);
        group_name_attribute_local_nonprim = NULL;
    }
    if (group_extra_filter_local_nonprim) {
        config_node_property_string_free(group_extra_filter_local_nonprim);
        group_extra_filter_local_nonprim = NULL;
    }
    if (group_make_dn_path_local_nonprim) {
        config_node_property_boolean_free(group_make_dn_path_local_nonprim);
        group_make_dn_path_local_nonprim = NULL;
    }
    if (group_member_attribute_local_nonprim) {
        config_node_property_string_free(group_member_attribute_local_nonprim);
        group_member_attribute_local_nonprim = NULL;
    }
    if (use_uid_for_ext_id_local_nonprim) {
        config_node_property_boolean_free(use_uid_for_ext_id_local_nonprim);
        use_uid_for_ext_id_local_nonprim = NULL;
    }
    if (customattributes_local_nonprim) {
        config_node_property_array_free(customattributes_local_nonprim);
        customattributes_local_nonprim = NULL;
    }
    return NULL;

}
