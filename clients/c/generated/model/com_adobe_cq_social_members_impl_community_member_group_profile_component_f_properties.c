#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties.h"



static com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_create_internal(
    config_node_property_integer_t *everyone_limit,
    config_node_property_integer_t *priority
    ) {
    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var = malloc(sizeof(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t));
    if (!com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var, 0, sizeof(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t));
    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var->everyone_limit = everyone_limit;
    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var->priority = priority;
    return com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_create(
    config_node_property_integer_t *everyone_limit,
    config_node_property_integer_t *priority
    ) {
    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *result = com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_create_internal (
        everyone_limit,
        priority
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_free(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties) {
    if(NULL == com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties){
        return ;
    }
    if(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit) {
        config_node_property_integer_free(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit);
        com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit = NULL;
    }
    if (com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority) {
        config_node_property_integer_free(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority);
        com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority = NULL;
    }
    free(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties);
}

cJSON *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_convertToJSON(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit
    if(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit) {
    cJSON *everyone_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit);
    if(everyone_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "everyoneLimit", everyone_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority
    if(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority) {
    cJSON *priority_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority);
    if(priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priority", priority_local_JSON);
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

com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_parseFromJSON(cJSON *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_propertiesJSON){

    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_t *com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit
    config_node_property_integer_t *everyone_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority
    config_node_property_integer_t *priority_local_nonprim = NULL;

    // com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->everyone_limit
    cJSON *everyone_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_propertiesJSON, "everyoneLimit");
    if (cJSON_IsNull(everyone_limit)) {
        everyone_limit = NULL;
    }
    if (everyone_limit) { 
    everyone_limit_local_nonprim = config_node_property_integer_parseFromJSON(everyone_limit); //nonprimitive
    }

    // com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties->priority
    cJSON *priority = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_members_impl_community_member_group_profile_component_f_propertiesJSON, "priority");
    if (cJSON_IsNull(priority)) {
        priority = NULL;
    }
    if (priority) { 
    priority_local_nonprim = config_node_property_integer_parseFromJSON(priority); //nonprimitive
    }



    com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var = com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_create_internal (
        everyone_limit ? everyone_limit_local_nonprim : NULL,
        priority ? priority_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties_local_var;
end:
    if (everyone_limit_local_nonprim) {
        config_node_property_integer_free(everyone_limit_local_nonprim);
        everyone_limit_local_nonprim = NULL;
    }
    if (priority_local_nonprim) {
        config_node_property_integer_free(priority_local_nonprim);
        priority_local_nonprim = NULL;
    }
    return NULL;

}
