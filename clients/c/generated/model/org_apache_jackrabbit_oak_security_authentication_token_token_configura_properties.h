/*
 * org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_H_
#define _org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t {
    struct config_node_property_string_t *token_expiration; //model
    struct config_node_property_string_t *token_length; //model
    struct config_node_property_boolean_t *token_refresh; //model
    struct config_node_property_integer_t *token_cleanup_threshold; //model
    struct config_node_property_string_t *password_hash_algorithm; //model
    struct config_node_property_integer_t *password_hash_iterations; //model
    struct config_node_property_integer_t *password_salt_size; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create(
    config_node_property_string_t *token_expiration,
    config_node_property_string_t *token_length,
    config_node_property_boolean_t *token_refresh,
    config_node_property_integer_t *token_cleanup_threshold,
    config_node_property_string_t *password_hash_algorithm,
    config_node_property_integer_t *password_hash_iterations,
    config_node_property_integer_t *password_salt_size
);

void org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_free(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties);

org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_token_token_configura_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t *org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties);

#endif /* _org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_H_ */

