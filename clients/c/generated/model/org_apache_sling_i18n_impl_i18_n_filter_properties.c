#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_i18n_impl_i18_n_filter_properties.h"



static org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *sling_filter_scope
    ) {
    org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_local_var = malloc(sizeof(org_apache_sling_i18n_impl_i18_n_filter_properties_t));
    if (!org_apache_sling_i18n_impl_i18_n_filter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_i18n_impl_i18_n_filter_properties_local_var, 0, sizeof(org_apache_sling_i18n_impl_i18_n_filter_properties_t));
    org_apache_sling_i18n_impl_i18_n_filter_properties_local_var->_library_owned = 1;
    org_apache_sling_i18n_impl_i18_n_filter_properties_local_var->service_ranking = service_ranking;
    org_apache_sling_i18n_impl_i18_n_filter_properties_local_var->sling_filter_scope = sling_filter_scope;
    return org_apache_sling_i18n_impl_i18_n_filter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *sling_filter_scope
    ) {
    org_apache_sling_i18n_impl_i18_n_filter_properties_t *result = org_apache_sling_i18n_impl_i18_n_filter_properties_create_internal (
        service_ranking,
        sling_filter_scope
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_i18n_impl_i18_n_filter_properties_free(org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties) {
    if(NULL == org_apache_sling_i18n_impl_i18_n_filter_properties){
        return ;
    }
    if(org_apache_sling_i18n_impl_i18_n_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_i18n_impl_i18_n_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking) {
        config_node_property_integer_free(org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking);
        org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking = NULL;
    }
    if (org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope) {
        config_node_property_array_free(org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope);
        org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope = NULL;
    }
    free(org_apache_sling_i18n_impl_i18_n_filter_properties);
}

cJSON *org_apache_sling_i18n_impl_i18_n_filter_properties_convertToJSON(org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking
    if(org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope
    if(org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope) {
    cJSON *sling_filter_scope_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope);
    if(sling_filter_scope_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.filter.scope", sling_filter_scope_local_JSON);
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

org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_parseFromJSON(cJSON *org_apache_sling_i18n_impl_i18_n_filter_propertiesJSON){

    org_apache_sling_i18n_impl_i18_n_filter_properties_t *org_apache_sling_i18n_impl_i18_n_filter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope
    config_node_property_array_t *sling_filter_scope_local_nonprim = NULL;

    // org_apache_sling_i18n_impl_i18_n_filter_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_sling_i18n_impl_i18_n_filter_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // org_apache_sling_i18n_impl_i18_n_filter_properties->sling_filter_scope
    cJSON *sling_filter_scope = cJSON_GetObjectItemCaseSensitive(org_apache_sling_i18n_impl_i18_n_filter_propertiesJSON, "sling.filter.scope");
    if (cJSON_IsNull(sling_filter_scope)) {
        sling_filter_scope = NULL;
    }
    if (sling_filter_scope) { 
    sling_filter_scope_local_nonprim = config_node_property_array_parseFromJSON(sling_filter_scope); //nonprimitive
    }



    org_apache_sling_i18n_impl_i18_n_filter_properties_local_var = org_apache_sling_i18n_impl_i18_n_filter_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        sling_filter_scope ? sling_filter_scope_local_nonprim : NULL
        );

    if (!org_apache_sling_i18n_impl_i18_n_filter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_i18n_impl_i18_n_filter_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (sling_filter_scope_local_nonprim) {
        config_node_property_array_free(sling_filter_scope_local_nonprim);
        sling_filter_scope_local_nonprim = NULL;
    }
    return NULL;

}
