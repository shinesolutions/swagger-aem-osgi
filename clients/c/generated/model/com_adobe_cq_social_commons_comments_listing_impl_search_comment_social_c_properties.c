#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties.h"



static com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_create_internal(
    config_node_property_integer_t *num_user_limit
    ) {
    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t));
    if (!com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t));
    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var->num_user_limit = num_user_limit;
    return com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_create(
    config_node_property_integer_t *num_user_limit
    ) {
    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *result = com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_create_internal (
        num_user_limit
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_free(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties) {
    if(NULL == com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit) {
        config_node_property_integer_free(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit);
        com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit = NULL;
    }
    free(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties);
}

cJSON *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_convertToJSON(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit
    if(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit) {
    cJSON *num_user_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit);
    if(num_user_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "numUserLimit", num_user_limit_local_JSON);
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

com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_propertiesJSON){

    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_t *com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit
    config_node_property_integer_t *num_user_limit_local_nonprim = NULL;

    // com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties->num_user_limit
    cJSON *num_user_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_propertiesJSON, "numUserLimit");
    if (cJSON_IsNull(num_user_limit)) {
        num_user_limit = NULL;
    }
    if (num_user_limit) { 
    num_user_limit_local_nonprim = config_node_property_integer_parseFromJSON(num_user_limit); //nonprimitive
    }



    com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var = com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_create_internal (
        num_user_limit ? num_user_limit_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties_local_var;
end:
    if (num_user_limit_local_nonprim) {
        config_node_property_integer_free(num_user_limit_local_nonprim);
        num_user_limit_local_nonprim = NULL;
    }
    return NULL;

}
