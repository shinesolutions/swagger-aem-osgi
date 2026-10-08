#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_audit_purge_pages_properties.h"



static com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties_create_internal(
    config_node_property_string_t *auditlog_rule_name,
    config_node_property_string_t *auditlog_rule_contentpath,
    config_node_property_integer_t *auditlog_rule_minimumage,
    config_node_property_drop_down_t *auditlog_rule_types
    ) {
    com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties_local_var = malloc(sizeof(com_adobe_cq_audit_purge_pages_properties_t));
    if (!com_adobe_cq_audit_purge_pages_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_audit_purge_pages_properties_local_var, 0, sizeof(com_adobe_cq_audit_purge_pages_properties_t));
    com_adobe_cq_audit_purge_pages_properties_local_var->_library_owned = 1;
    com_adobe_cq_audit_purge_pages_properties_local_var->auditlog_rule_name = auditlog_rule_name;
    com_adobe_cq_audit_purge_pages_properties_local_var->auditlog_rule_contentpath = auditlog_rule_contentpath;
    com_adobe_cq_audit_purge_pages_properties_local_var->auditlog_rule_minimumage = auditlog_rule_minimumage;
    com_adobe_cq_audit_purge_pages_properties_local_var->auditlog_rule_types = auditlog_rule_types;
    return com_adobe_cq_audit_purge_pages_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties_create(
    config_node_property_string_t *auditlog_rule_name,
    config_node_property_string_t *auditlog_rule_contentpath,
    config_node_property_integer_t *auditlog_rule_minimumage,
    config_node_property_drop_down_t *auditlog_rule_types
    ) {
    com_adobe_cq_audit_purge_pages_properties_t *result = com_adobe_cq_audit_purge_pages_properties_create_internal (
        auditlog_rule_name,
        auditlog_rule_contentpath,
        auditlog_rule_minimumage,
        auditlog_rule_types
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_audit_purge_pages_properties_free(com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties) {
    if(NULL == com_adobe_cq_audit_purge_pages_properties){
        return ;
    }
    if(com_adobe_cq_audit_purge_pages_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_audit_purge_pages_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name) {
        config_node_property_string_free(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name);
        com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name = NULL;
    }
    if (com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath) {
        config_node_property_string_free(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath);
        com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath = NULL;
    }
    if (com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage) {
        config_node_property_integer_free(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage);
        com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage = NULL;
    }
    if (com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types) {
        config_node_property_drop_down_free(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types);
        com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types = NULL;
    }
    free(com_adobe_cq_audit_purge_pages_properties);
}

cJSON *com_adobe_cq_audit_purge_pages_properties_convertToJSON(com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name
    if(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name) {
    cJSON *auditlog_rule_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name);
    if(auditlog_rule_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlog.rule.name", auditlog_rule_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath
    if(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath) {
    cJSON *auditlog_rule_contentpath_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath);
    if(auditlog_rule_contentpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlog.rule.contentpath", auditlog_rule_contentpath_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage
    if(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage) {
    cJSON *auditlog_rule_minimumage_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage);
    if(auditlog_rule_minimumage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlog.rule.minimumage", auditlog_rule_minimumage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types
    if(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types) {
    cJSON *auditlog_rule_types_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types);
    if(auditlog_rule_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlog.rule.types", auditlog_rule_types_local_JSON);
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

com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties_parseFromJSON(cJSON *com_adobe_cq_audit_purge_pages_propertiesJSON){

    com_adobe_cq_audit_purge_pages_properties_t *com_adobe_cq_audit_purge_pages_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name
    config_node_property_string_t *auditlog_rule_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath
    config_node_property_string_t *auditlog_rule_contentpath_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage
    config_node_property_integer_t *auditlog_rule_minimumage_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types
    config_node_property_drop_down_t *auditlog_rule_types_local_nonprim = NULL;

    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_name
    cJSON *auditlog_rule_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_audit_purge_pages_propertiesJSON, "auditlog.rule.name");
    if (cJSON_IsNull(auditlog_rule_name)) {
        auditlog_rule_name = NULL;
    }
    if (auditlog_rule_name) { 
    auditlog_rule_name_local_nonprim = config_node_property_string_parseFromJSON(auditlog_rule_name); //nonprimitive
    }

    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_contentpath
    cJSON *auditlog_rule_contentpath = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_audit_purge_pages_propertiesJSON, "auditlog.rule.contentpath");
    if (cJSON_IsNull(auditlog_rule_contentpath)) {
        auditlog_rule_contentpath = NULL;
    }
    if (auditlog_rule_contentpath) { 
    auditlog_rule_contentpath_local_nonprim = config_node_property_string_parseFromJSON(auditlog_rule_contentpath); //nonprimitive
    }

    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_minimumage
    cJSON *auditlog_rule_minimumage = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_audit_purge_pages_propertiesJSON, "auditlog.rule.minimumage");
    if (cJSON_IsNull(auditlog_rule_minimumage)) {
        auditlog_rule_minimumage = NULL;
    }
    if (auditlog_rule_minimumage) { 
    auditlog_rule_minimumage_local_nonprim = config_node_property_integer_parseFromJSON(auditlog_rule_minimumage); //nonprimitive
    }

    // com_adobe_cq_audit_purge_pages_properties->auditlog_rule_types
    cJSON *auditlog_rule_types = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_audit_purge_pages_propertiesJSON, "auditlog.rule.types");
    if (cJSON_IsNull(auditlog_rule_types)) {
        auditlog_rule_types = NULL;
    }
    if (auditlog_rule_types) { 
    auditlog_rule_types_local_nonprim = config_node_property_drop_down_parseFromJSON(auditlog_rule_types); //nonprimitive
    }



    com_adobe_cq_audit_purge_pages_properties_local_var = com_adobe_cq_audit_purge_pages_properties_create_internal (
        auditlog_rule_name ? auditlog_rule_name_local_nonprim : NULL,
        auditlog_rule_contentpath ? auditlog_rule_contentpath_local_nonprim : NULL,
        auditlog_rule_minimumage ? auditlog_rule_minimumage_local_nonprim : NULL,
        auditlog_rule_types ? auditlog_rule_types_local_nonprim : NULL
        );

    if (!com_adobe_cq_audit_purge_pages_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_audit_purge_pages_properties_local_var;
end:
    if (auditlog_rule_name_local_nonprim) {
        config_node_property_string_free(auditlog_rule_name_local_nonprim);
        auditlog_rule_name_local_nonprim = NULL;
    }
    if (auditlog_rule_contentpath_local_nonprim) {
        config_node_property_string_free(auditlog_rule_contentpath_local_nonprim);
        auditlog_rule_contentpath_local_nonprim = NULL;
    }
    if (auditlog_rule_minimumage_local_nonprim) {
        config_node_property_integer_free(auditlog_rule_minimumage_local_nonprim);
        auditlog_rule_minimumage_local_nonprim = NULL;
    }
    if (auditlog_rule_types_local_nonprim) {
        config_node_property_drop_down_free(auditlog_rule_types_local_nonprim);
        auditlog_rule_types_local_nonprim = NULL;
    }
    return NULL;

}
