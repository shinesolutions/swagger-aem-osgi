#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties.h"



static com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_string_t *jmx_objectname
    ) {
    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var = malloc(sizeof(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t));
    if (!com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var, 0, sizeof(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t));
    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var->scheduler_expression = scheduler_expression;
    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var->jmx_objectname = jmx_objectname;
    return com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_string_t *jmx_objectname
    ) {
    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *result = com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_create_internal (
        scheduler_expression,
        jmx_objectname
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_free(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties) {
    if(NULL == com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties){
        return ;
    }
    if(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression) {
        config_node_property_string_free(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression);
        com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression = NULL;
    }
    if (com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname) {
        config_node_property_string_free(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname);
        com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname = NULL;
    }
    free(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties);
}

cJSON *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_convertToJSON(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression
    if(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname
    if(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname) {
    cJSON *jmx_objectname_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname);
    if(jmx_objectname_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jmx.objectname", jmx_objectname_local_JSON);
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

com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_parseFromJSON(cJSON *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_propertiesJSON){

    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_t *com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname
    config_node_property_string_t *jmx_objectname_local_nonprim = NULL;

    // com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties->jmx_objectname
    cJSON *jmx_objectname = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_propertiesJSON, "jmx.objectname");
    if (cJSON_IsNull(jmx_objectname)) {
        jmx_objectname = NULL;
    }
    if (jmx_objectname) { 
    jmx_objectname_local_nonprim = config_node_property_string_parseFromJSON(jmx_objectname); //nonprimitive
    }



    com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var = com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        jmx_objectname ? jmx_objectname_local_nonprim : NULL
        );

    if (!com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (jmx_objectname_local_nonprim) {
        config_node_property_string_free(jmx_objectname_local_nonprim);
        jmx_objectname_local_nonprim = NULL;
    }
    return NULL;

}
