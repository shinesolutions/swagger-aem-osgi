#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties.h"



static org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_create_internal(
    config_node_property_string_t *java_naming_factory_initial,
    config_node_property_string_t *java_naming_provider_url
    ) {
    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var = malloc(sizeof(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t));
    if (!org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var, 0, sizeof(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t));
    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var->java_naming_factory_initial = java_naming_factory_initial;
    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var->java_naming_provider_url = java_naming_provider_url;
    return org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_create(
    config_node_property_string_t *java_naming_factory_initial,
    config_node_property_string_t *java_naming_provider_url
    ) {
    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *result = org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_create_internal (
        java_naming_factory_initial,
        java_naming_provider_url
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_free(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties) {
    if(NULL == org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties){
        return ;
    }
    if(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial) {
        config_node_property_string_free(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial);
        org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial = NULL;
    }
    if (org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url) {
        config_node_property_string_free(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url);
        org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url = NULL;
    }
    free(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties);
}

cJSON *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_convertToJSON(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial
    if(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial) {
    cJSON *java_naming_factory_initial_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial);
    if(java_naming_factory_initial_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.naming.factory.initial", java_naming_factory_initial_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url
    if(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url) {
    cJSON *java_naming_provider_url_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url);
    if(java_naming_provider_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.naming.provider.url", java_naming_provider_url_local_JSON);
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

org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_parseFromJSON(cJSON *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_propertiesJSON){

    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_t *org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial
    config_node_property_string_t *java_naming_factory_initial_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url
    config_node_property_string_t *java_naming_provider_url_local_nonprim = NULL;

    // org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_factory_initial
    cJSON *java_naming_factory_initial = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_propertiesJSON, "java.naming.factory.initial");
    if (cJSON_IsNull(java_naming_factory_initial)) {
        java_naming_factory_initial = NULL;
    }
    if (java_naming_factory_initial) { 
    java_naming_factory_initial_local_nonprim = config_node_property_string_parseFromJSON(java_naming_factory_initial); //nonprimitive
    }

    // org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties->java_naming_provider_url
    cJSON *java_naming_provider_url = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_propertiesJSON, "java.naming.provider.url");
    if (cJSON_IsNull(java_naming_provider_url)) {
        java_naming_provider_url = NULL;
    }
    if (java_naming_provider_url) { 
    java_naming_provider_url_local_nonprim = config_node_property_string_parseFromJSON(java_naming_provider_url); //nonprimitive
    }



    org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var = org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_create_internal (
        java_naming_factory_initial ? java_naming_factory_initial_local_nonprim : NULL,
        java_naming_provider_url ? java_naming_provider_url_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties_local_var;
end:
    if (java_naming_factory_initial_local_nonprim) {
        config_node_property_string_free(java_naming_factory_initial_local_nonprim);
        java_naming_factory_initial_local_nonprim = NULL;
    }
    if (java_naming_provider_url_local_nonprim) {
        config_node_property_string_free(java_naming_provider_url_local_nonprim);
        java_naming_provider_url_local_nonprim = NULL;
    }
    return NULL;

}
