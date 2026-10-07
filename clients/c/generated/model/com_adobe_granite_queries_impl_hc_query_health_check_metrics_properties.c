#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties.h"



static com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_create_internal(
    config_node_property_integer_t *get_period
    ) {
    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var = malloc(sizeof(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t));
    if (!com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var, 0, sizeof(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t));
    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var->_library_owned = 1;
    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var->get_period = get_period;
    return com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_create(
    config_node_property_integer_t *get_period
    ) {
    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *result = com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_create_internal (
        get_period
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_free(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties) {
    if(NULL == com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties){
        return ;
    }
    if(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period) {
        config_node_property_integer_free(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period);
        com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period = NULL;
    }
    free(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties);
}

cJSON *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_convertToJSON(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period
    if(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period) {
    cJSON *get_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period);
    if(get_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "getPeriod", get_period_local_JSON);
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

com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_parseFromJSON(cJSON *com_adobe_granite_queries_impl_hc_query_health_check_metrics_propertiesJSON){

    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_t *com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period
    config_node_property_integer_t *get_period_local_nonprim = NULL;

    // com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties->get_period
    cJSON *get_period = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_queries_impl_hc_query_health_check_metrics_propertiesJSON, "getPeriod");
    if (cJSON_IsNull(get_period)) {
        get_period = NULL;
    }
    if (get_period) { 
    get_period_local_nonprim = config_node_property_integer_parseFromJSON(get_period); //nonprimitive
    }



    com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var = com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_create_internal (
        get_period ? get_period_local_nonprim : NULL
        );

    if (!com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties_local_var;
end:
    if (get_period_local_nonprim) {
        config_node_property_integer_free(get_period_local_nonprim);
        get_period_local_nonprim = NULL;
    }
    return NULL;

}
