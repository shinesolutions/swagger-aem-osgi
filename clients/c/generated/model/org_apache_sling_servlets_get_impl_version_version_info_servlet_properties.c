#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_servlets_get_impl_version_version_info_servlet_properties.h"



static org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_create_internal(
    config_node_property_array_t *sling_servlet_selectors,
    config_node_property_boolean_t *ecma_suport
    ) {
    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var = malloc(sizeof(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t));
    if (!org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var, 0, sizeof(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t));
    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var->sling_servlet_selectors = sling_servlet_selectors;
    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var->ecma_suport = ecma_suport;
    return org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_create(
    config_node_property_array_t *sling_servlet_selectors,
    config_node_property_boolean_t *ecma_suport
    ) {
    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *result = org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_create_internal (
        sling_servlet_selectors,
        ecma_suport
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_free(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties) {
    if(NULL == org_apache_sling_servlets_get_impl_version_version_info_servlet_properties){
        return ;
    }
    if(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors) {
        config_node_property_array_free(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors);
        org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors = NULL;
    }
    if (org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport);
        org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport = NULL;
    }
    free(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties);
}

cJSON *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_convertToJSON(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors
    if(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors) {
    cJSON *sling_servlet_selectors_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors);
    if(sling_servlet_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.selectors", sling_servlet_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport
    if(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport) {
    cJSON *ecma_suport_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport);
    if(ecma_suport_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ecmaSuport", ecma_suport_local_JSON);
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

org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_parseFromJSON(cJSON *org_apache_sling_servlets_get_impl_version_version_info_servlet_propertiesJSON){

    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_t *org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors
    config_node_property_array_t *sling_servlet_selectors_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport
    config_node_property_boolean_t *ecma_suport_local_nonprim = NULL;

    // org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->sling_servlet_selectors
    cJSON *sling_servlet_selectors = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_impl_version_version_info_servlet_propertiesJSON, "sling.servlet.selectors");
    if (cJSON_IsNull(sling_servlet_selectors)) {
        sling_servlet_selectors = NULL;
    }
    if (sling_servlet_selectors) { 
    sling_servlet_selectors_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_selectors); //nonprimitive
    }

    // org_apache_sling_servlets_get_impl_version_version_info_servlet_properties->ecma_suport
    cJSON *ecma_suport = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_impl_version_version_info_servlet_propertiesJSON, "ecmaSuport");
    if (cJSON_IsNull(ecma_suport)) {
        ecma_suport = NULL;
    }
    if (ecma_suport) { 
    ecma_suport_local_nonprim = config_node_property_boolean_parseFromJSON(ecma_suport); //nonprimitive
    }



    org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var = org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_create_internal (
        sling_servlet_selectors ? sling_servlet_selectors_local_nonprim : NULL,
        ecma_suport ? ecma_suport_local_nonprim : NULL
        );

    if (!org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_servlets_get_impl_version_version_info_servlet_properties_local_var;
end:
    if (sling_servlet_selectors_local_nonprim) {
        config_node_property_array_free(sling_servlet_selectors_local_nonprim);
        sling_servlet_selectors_local_nonprim = NULL;
    }
    if (ecma_suport_local_nonprim) {
        config_node_property_boolean_free(ecma_suport_local_nonprim);
        ecma_suport_local_nonprim = NULL;
    }
    return NULL;

}
