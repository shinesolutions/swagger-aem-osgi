#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties.h"



static org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *jcr_privilege
    ) {
    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var = malloc(sizeof(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t));
    if (!org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var, 0, sizeof(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t));
    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var->name = name;
    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var->jcr_privilege = jcr_privilege;
    return org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *jcr_privilege
    ) {
    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *result = org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_create_internal (
        name,
        jcr_privilege
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_free(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties) {
    if(NULL == org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties){
        return ;
    }
    if(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name);
        org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege);
        org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege = NULL;
    }
    free(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties);
}

cJSON *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_convertToJSON(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name
    if(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege
    if(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege) {
    cJSON *jcr_privilege_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege);
    if(jcr_privilege_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jcrPrivilege", jcr_privilege_local_JSON);
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

org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_parseFromJSON(cJSON *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_propertiesJSON){

    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_t *org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege
    config_node_property_string_t *jcr_privilege_local_nonprim = NULL;

    // org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties->jcr_privilege
    cJSON *jcr_privilege = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_propertiesJSON, "jcrPrivilege");
    if (cJSON_IsNull(jcr_privilege)) {
        jcr_privilege = NULL;
    }
    if (jcr_privilege) { 
    jcr_privilege_local_nonprim = config_node_property_string_parseFromJSON(jcr_privilege); //nonprimitive
    }



    org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var = org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_create_internal (
        name ? name_local_nonprim : NULL,
        jcr_privilege ? jcr_privilege_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (jcr_privilege_local_nonprim) {
        config_node_property_string_free(jcr_privilege_local_nonprim);
        jcr_privilege_local_nonprim = NULL;
    }
    return NULL;

}
