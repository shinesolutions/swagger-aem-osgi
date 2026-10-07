#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties.h"



static com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_create_internal(
    config_node_property_array_t *default_attachment_type_blacklist,
    config_node_property_array_t *baseline_attachment_type_blacklist
    ) {
    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t));
    if (!com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t));
    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var->default_attachment_type_blacklist = default_attachment_type_blacklist;
    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var->baseline_attachment_type_blacklist = baseline_attachment_type_blacklist;
    return com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_create(
    config_node_property_array_t *default_attachment_type_blacklist,
    config_node_property_array_t *baseline_attachment_type_blacklist
    ) {
    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *result = com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_create_internal (
        default_attachment_type_blacklist,
        baseline_attachment_type_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_free(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist);
        com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist);
        com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist = NULL;
    }
    free(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties);
}

cJSON *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist
    if(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist) {
    cJSON *default_attachment_type_blacklist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist);
    if(default_attachment_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.attachment.type.blacklist", default_attachment_type_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist
    if(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist) {
    cJSON *baseline_attachment_type_blacklist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist);
    if(baseline_attachment_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "baseline.attachment.type.blacklist", baseline_attachment_type_blacklist_local_JSON);
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

com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_propertiesJSON){

    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_t *com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist
    config_node_property_array_t *default_attachment_type_blacklist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist
    config_node_property_array_t *baseline_attachment_type_blacklist_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->default_attachment_type_blacklist
    cJSON *default_attachment_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_propertiesJSON, "default.attachment.type.blacklist");
    if (cJSON_IsNull(default_attachment_type_blacklist)) {
        default_attachment_type_blacklist = NULL;
    }
    if (default_attachment_type_blacklist) { 
    default_attachment_type_blacklist_local_nonprim = config_node_property_array_parseFromJSON(default_attachment_type_blacklist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties->baseline_attachment_type_blacklist
    cJSON *baseline_attachment_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_propertiesJSON, "baseline.attachment.type.blacklist");
    if (cJSON_IsNull(baseline_attachment_type_blacklist)) {
        baseline_attachment_type_blacklist = NULL;
    }
    if (baseline_attachment_type_blacklist) { 
    baseline_attachment_type_blacklist_local_nonprim = config_node_property_array_parseFromJSON(baseline_attachment_type_blacklist); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var = com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_create_internal (
        default_attachment_type_blacklist ? default_attachment_type_blacklist_local_nonprim : NULL,
        baseline_attachment_type_blacklist ? baseline_attachment_type_blacklist_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties_local_var;
end:
    if (default_attachment_type_blacklist_local_nonprim) {
        config_node_property_array_free(default_attachment_type_blacklist_local_nonprim);
        default_attachment_type_blacklist_local_nonprim = NULL;
    }
    if (baseline_attachment_type_blacklist_local_nonprim) {
        config_node_property_array_free(baseline_attachment_type_blacklist_local_nonprim);
        baseline_attachment_type_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
