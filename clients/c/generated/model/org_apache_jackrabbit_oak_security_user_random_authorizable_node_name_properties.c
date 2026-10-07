#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties.h"



static org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_create_internal(
    config_node_property_integer_t *length
    ) {
    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t));
    if (!org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t));
    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var->length = length;
    return org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_create(
    config_node_property_integer_t *length
    ) {
    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *result = org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_create_internal (
        length
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_free(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length);
        org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length = NULL;
    }
    free(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties);
}

cJSON *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_convertToJSON(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length
    if(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length) {
    cJSON *length_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length);
    if(length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "length", length_local_JSON);
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

org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_propertiesJSON){

    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_t *org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length
    config_node_property_integer_t *length_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties->length
    cJSON *length = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_propertiesJSON, "length");
    if (cJSON_IsNull(length)) {
        length = NULL;
    }
    if (length) { 
    length_local_nonprim = config_node_property_integer_parseFromJSON(length); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var = org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_create_internal (
        length ? length_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties_local_var;
end:
    if (length_local_nonprim) {
        config_node_property_integer_free(length_local_nonprim);
        length_local_nonprim = NULL;
    }
    return NULL;

}
