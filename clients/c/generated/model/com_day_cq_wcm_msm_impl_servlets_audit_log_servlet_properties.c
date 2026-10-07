#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties.h"



static com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_create_internal(
    config_node_property_integer_t *auditlogservlet_default_events_count,
    config_node_property_string_t *auditlogservlet_default_path
    ) {
    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t));
    if (!com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t));
    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var->auditlogservlet_default_events_count = auditlogservlet_default_events_count;
    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var->auditlogservlet_default_path = auditlogservlet_default_path;
    return com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_create(
    config_node_property_integer_t *auditlogservlet_default_events_count,
    config_node_property_string_t *auditlogservlet_default_path
    ) {
    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *result = com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_create_internal (
        auditlogservlet_default_events_count,
        auditlogservlet_default_path
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_free(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties) {
    if(NULL == com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count) {
        config_node_property_integer_free(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count);
        com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count = NULL;
    }
    if (com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path) {
        config_node_property_string_free(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path);
        com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path = NULL;
    }
    free(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties);
}

cJSON *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_convertToJSON(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count
    if(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count) {
    cJSON *auditlogservlet_default_events_count_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count);
    if(auditlogservlet_default_events_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlogservlet.default.events.count", auditlogservlet_default_events_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path
    if(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path) {
    cJSON *auditlogservlet_default_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path);
    if(auditlogservlet_default_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auditlogservlet.default.path", auditlogservlet_default_path_local_JSON);
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

com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_propertiesJSON){

    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_t *com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count
    config_node_property_integer_t *auditlogservlet_default_events_count_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path
    config_node_property_string_t *auditlogservlet_default_path_local_nonprim = NULL;

    // com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_events_count
    cJSON *auditlogservlet_default_events_count = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_propertiesJSON, "auditlogservlet.default.events.count");
    if (cJSON_IsNull(auditlogservlet_default_events_count)) {
        auditlogservlet_default_events_count = NULL;
    }
    if (auditlogservlet_default_events_count) { 
    auditlogservlet_default_events_count_local_nonprim = config_node_property_integer_parseFromJSON(auditlogservlet_default_events_count); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties->auditlogservlet_default_path
    cJSON *auditlogservlet_default_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_propertiesJSON, "auditlogservlet.default.path");
    if (cJSON_IsNull(auditlogservlet_default_path)) {
        auditlogservlet_default_path = NULL;
    }
    if (auditlogservlet_default_path) { 
    auditlogservlet_default_path_local_nonprim = config_node_property_string_parseFromJSON(auditlogservlet_default_path); //nonprimitive
    }



    com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var = com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_create_internal (
        auditlogservlet_default_events_count ? auditlogservlet_default_events_count_local_nonprim : NULL,
        auditlogservlet_default_path ? auditlogservlet_default_path_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties_local_var;
end:
    if (auditlogservlet_default_events_count_local_nonprim) {
        config_node_property_integer_free(auditlogservlet_default_events_count_local_nonprim);
        auditlogservlet_default_events_count_local_nonprim = NULL;
    }
    if (auditlogservlet_default_path_local_nonprim) {
        config_node_property_string_free(auditlogservlet_default_path_local_nonprim);
        auditlogservlet_default_path_local_nonprim = NULL;
    }
    return NULL;

}
