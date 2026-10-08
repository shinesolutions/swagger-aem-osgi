#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties.h"



static com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_create_internal(
    config_node_property_boolean_t *enable,
    config_node_property_integer_t *ugc_limit,
    config_node_property_integer_t *ugc_limit_duration,
    config_node_property_array_t *domains,
    config_node_property_array_t *to_list
    ) {
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t));
    if (!com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t));
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->enable = enable;
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->ugc_limit = ugc_limit;
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->ugc_limit_duration = ugc_limit_duration;
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->domains = domains;
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var->to_list = to_list;
    return com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_create(
    config_node_property_boolean_t *enable,
    config_node_property_integer_t *ugc_limit,
    config_node_property_integer_t *ugc_limit_duration,
    config_node_property_array_t *domains,
    config_node_property_array_t *to_list
    ) {
    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *result = com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_create_internal (
        enable,
        ugc_limit,
        ugc_limit_duration,
        domains,
        to_list
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties) {
    if(NULL == com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable) {
        config_node_property_boolean_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable);
        com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit) {
        config_node_property_integer_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit);
        com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration) {
        config_node_property_integer_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration);
        com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains) {
        config_node_property_array_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains);
        com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains = NULL;
    }
    if (com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list) {
        config_node_property_array_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list);
        com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list = NULL;
    }
    free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties);
}

cJSON *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable) {
    cJSON *enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable);
    if(enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable", enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit) {
    cJSON *ugc_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit);
    if(ugc_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "UGCLimit", ugc_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration) {
    cJSON *ugc_limit_duration_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration);
    if(ugc_limit_duration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ugcLimitDuration", ugc_limit_duration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains) {
    cJSON *domains_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains);
    if(domains_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "domains", domains_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list
    if(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list) {
    cJSON *to_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list);
    if(to_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "toList", to_list_local_JSON);
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

com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON){

    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable
    config_node_property_boolean_t *enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit
    config_node_property_integer_t *ugc_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration
    config_node_property_integer_t *ugc_limit_duration_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains
    config_node_property_array_t *domains_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list
    config_node_property_array_t *to_list_local_nonprim = NULL;

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->enable
    cJSON *enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON, "enable");
    if (cJSON_IsNull(enable)) {
        enable = NULL;
    }
    if (enable) { 
    enable_local_nonprim = config_node_property_boolean_parseFromJSON(enable); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit
    cJSON *ugc_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON, "UGCLimit");
    if (cJSON_IsNull(ugc_limit)) {
        ugc_limit = NULL;
    }
    if (ugc_limit) { 
    ugc_limit_local_nonprim = config_node_property_integer_parseFromJSON(ugc_limit); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->ugc_limit_duration
    cJSON *ugc_limit_duration = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON, "ugcLimitDuration");
    if (cJSON_IsNull(ugc_limit_duration)) {
        ugc_limit_duration = NULL;
    }
    if (ugc_limit_duration) { 
    ugc_limit_duration_local_nonprim = config_node_property_integer_parseFromJSON(ugc_limit_duration); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->domains
    cJSON *domains = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON, "domains");
    if (cJSON_IsNull(domains)) {
        domains = NULL;
    }
    if (domains) { 
    domains_local_nonprim = config_node_property_array_parseFromJSON(domains); //nonprimitive
    }

    // com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties->to_list
    cJSON *to_list = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON, "toList");
    if (cJSON_IsNull(to_list)) {
        to_list = NULL;
    }
    if (to_list) { 
    to_list_local_nonprim = config_node_property_array_parseFromJSON(to_list); //nonprimitive
    }



    com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var = com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_create_internal (
        enable ? enable_local_nonprim : NULL,
        ugc_limit ? ugc_limit_local_nonprim : NULL,
        ugc_limit_duration ? ugc_limit_duration_local_nonprim : NULL,
        domains ? domains_local_nonprim : NULL,
        to_list ? to_list_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_local_var;
end:
    if (enable_local_nonprim) {
        config_node_property_boolean_free(enable_local_nonprim);
        enable_local_nonprim = NULL;
    }
    if (ugc_limit_local_nonprim) {
        config_node_property_integer_free(ugc_limit_local_nonprim);
        ugc_limit_local_nonprim = NULL;
    }
    if (ugc_limit_duration_local_nonprim) {
        config_node_property_integer_free(ugc_limit_duration_local_nonprim);
        ugc_limit_duration_local_nonprim = NULL;
    }
    if (domains_local_nonprim) {
        config_node_property_array_free(domains_local_nonprim);
        domains_local_nonprim = NULL;
    }
    if (to_list_local_nonprim) {
        config_node_property_array_free(to_list_local_nonprim);
        to_list_local_nonprim = NULL;
    }
    return NULL;

}
