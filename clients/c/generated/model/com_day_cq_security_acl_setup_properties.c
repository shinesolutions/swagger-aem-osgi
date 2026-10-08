#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_security_acl_setup_properties.h"



static com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties_create_internal(
    config_node_property_array_t *cq_aclsetup_rules
    ) {
    com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties_local_var = malloc(sizeof(com_day_cq_security_acl_setup_properties_t));
    if (!com_day_cq_security_acl_setup_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_security_acl_setup_properties_local_var, 0, sizeof(com_day_cq_security_acl_setup_properties_t));
    com_day_cq_security_acl_setup_properties_local_var->_library_owned = 1;
    com_day_cq_security_acl_setup_properties_local_var->cq_aclsetup_rules = cq_aclsetup_rules;
    return com_day_cq_security_acl_setup_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties_create(
    config_node_property_array_t *cq_aclsetup_rules
    ) {
    com_day_cq_security_acl_setup_properties_t *result = com_day_cq_security_acl_setup_properties_create_internal (
        cq_aclsetup_rules
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_security_acl_setup_properties_free(com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties) {
    if(NULL == com_day_cq_security_acl_setup_properties){
        return ;
    }
    if(com_day_cq_security_acl_setup_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_security_acl_setup_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_security_acl_setup_properties->cq_aclsetup_rules) {
        config_node_property_array_free(com_day_cq_security_acl_setup_properties->cq_aclsetup_rules);
        com_day_cq_security_acl_setup_properties->cq_aclsetup_rules = NULL;
    }
    free(com_day_cq_security_acl_setup_properties);
}

cJSON *com_day_cq_security_acl_setup_properties_convertToJSON(com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_security_acl_setup_properties->cq_aclsetup_rules
    if(com_day_cq_security_acl_setup_properties->cq_aclsetup_rules) {
    cJSON *cq_aclsetup_rules_local_JSON = config_node_property_array_convertToJSON(com_day_cq_security_acl_setup_properties->cq_aclsetup_rules);
    if(cq_aclsetup_rules_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.aclsetup.rules", cq_aclsetup_rules_local_JSON);
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

com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties_parseFromJSON(cJSON *com_day_cq_security_acl_setup_propertiesJSON){

    com_day_cq_security_acl_setup_properties_t *com_day_cq_security_acl_setup_properties_local_var = NULL;

    // define the local variable for com_day_cq_security_acl_setup_properties->cq_aclsetup_rules
    config_node_property_array_t *cq_aclsetup_rules_local_nonprim = NULL;

    // com_day_cq_security_acl_setup_properties->cq_aclsetup_rules
    cJSON *cq_aclsetup_rules = cJSON_GetObjectItemCaseSensitive(com_day_cq_security_acl_setup_propertiesJSON, "cq.aclsetup.rules");
    if (cJSON_IsNull(cq_aclsetup_rules)) {
        cq_aclsetup_rules = NULL;
    }
    if (cq_aclsetup_rules) { 
    cq_aclsetup_rules_local_nonprim = config_node_property_array_parseFromJSON(cq_aclsetup_rules); //nonprimitive
    }



    com_day_cq_security_acl_setup_properties_local_var = com_day_cq_security_acl_setup_properties_create_internal (
        cq_aclsetup_rules ? cq_aclsetup_rules_local_nonprim : NULL
        );

    if (!com_day_cq_security_acl_setup_properties_local_var) {
        goto end;
    }

    return com_day_cq_security_acl_setup_properties_local_var;
end:
    if (cq_aclsetup_rules_local_nonprim) {
        config_node_property_array_free(cq_aclsetup_rules_local_nonprim);
        cq_aclsetup_rules_local_nonprim = NULL;
    }
    return NULL;

}
