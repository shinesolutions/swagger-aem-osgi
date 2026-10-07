#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties.h"



static org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_create_internal(
    config_node_property_string_t *alias,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_protectedhandlers
    ) {
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var = malloc(sizeof(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t));
    if (!org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var, 0, sizeof(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t));
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var->alias = alias;
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var->dav_create_absolute_uri = dav_create_absolute_uri;
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var->dav_protectedhandlers = dav_protectedhandlers;
    return org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_create(
    config_node_property_string_t *alias,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_protectedhandlers
    ) {
    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *result = org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_create_internal (
        alias,
        dav_create_absolute_uri,
        dav_protectedhandlers
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties) {
    if(NULL == org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties){
        return ;
    }
    if(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias) {
        config_node_property_string_free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias);
        org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias = NULL;
    }
    if (org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri) {
        config_node_property_boolean_free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri);
        org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri = NULL;
    }
    if (org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers) {
        config_node_property_string_free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers);
        org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers = NULL;
    }
    free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties);
}

cJSON *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_convertToJSON(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias
    if(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias) {
    cJSON *alias_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias);
    if(alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "alias", alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri
    if(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri) {
    cJSON *dav_create_absolute_uri_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri);
    if(dav_create_absolute_uri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dav.create-absolute-uri", dav_create_absolute_uri_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers
    if(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers) {
    cJSON *dav_protectedhandlers_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers);
    if(dav_protectedhandlers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dav.protectedhandlers", dav_protectedhandlers_local_JSON);
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

org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_parseFromJSON(cJSON *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_propertiesJSON){

    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias
    config_node_property_string_t *alias_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri
    config_node_property_boolean_t *dav_create_absolute_uri_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers
    config_node_property_string_t *dav_protectedhandlers_local_nonprim = NULL;

    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->alias
    cJSON *alias = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_propertiesJSON, "alias");
    if (cJSON_IsNull(alias)) {
        alias = NULL;
    }
    if (alias) { 
    alias_local_nonprim = config_node_property_string_parseFromJSON(alias); //nonprimitive
    }

    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_create_absolute_uri
    cJSON *dav_create_absolute_uri = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_propertiesJSON, "dav.create-absolute-uri");
    if (cJSON_IsNull(dav_create_absolute_uri)) {
        dav_create_absolute_uri = NULL;
    }
    if (dav_create_absolute_uri) { 
    dav_create_absolute_uri_local_nonprim = config_node_property_boolean_parseFromJSON(dav_create_absolute_uri); //nonprimitive
    }

    // org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties->dav_protectedhandlers
    cJSON *dav_protectedhandlers = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_propertiesJSON, "dav.protectedhandlers");
    if (cJSON_IsNull(dav_protectedhandlers)) {
        dav_protectedhandlers = NULL;
    }
    if (dav_protectedhandlers) { 
    dav_protectedhandlers_local_nonprim = config_node_property_string_parseFromJSON(dav_protectedhandlers); //nonprimitive
    }



    org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var = org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_create_internal (
        alias ? alias_local_nonprim : NULL,
        dav_create_absolute_uri ? dav_create_absolute_uri_local_nonprim : NULL,
        dav_protectedhandlers ? dav_protectedhandlers_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_local_var;
end:
    if (alias_local_nonprim) {
        config_node_property_string_free(alias_local_nonprim);
        alias_local_nonprim = NULL;
    }
    if (dav_create_absolute_uri_local_nonprim) {
        config_node_property_boolean_free(dav_create_absolute_uri_local_nonprim);
        dav_create_absolute_uri_local_nonprim = NULL;
    }
    if (dav_protectedhandlers_local_nonprim) {
        config_node_property_string_free(dav_protectedhandlers_local_nonprim);
        dav_protectedhandlers_local_nonprim = NULL;
    }
    return NULL;

}
