#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_systemready_system_ready_monitor_properties.h"



static org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties_create_internal(
    config_node_property_integer_t *poll_interval
    ) {
    org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties_local_var = malloc(sizeof(org_apache_felix_systemready_system_ready_monitor_properties_t));
    if (!org_apache_felix_systemready_system_ready_monitor_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_systemready_system_ready_monitor_properties_local_var, 0, sizeof(org_apache_felix_systemready_system_ready_monitor_properties_t));
    org_apache_felix_systemready_system_ready_monitor_properties_local_var->_library_owned = 1;
    org_apache_felix_systemready_system_ready_monitor_properties_local_var->poll_interval = poll_interval;
    return org_apache_felix_systemready_system_ready_monitor_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties_create(
    config_node_property_integer_t *poll_interval
    ) {
    org_apache_felix_systemready_system_ready_monitor_properties_t *result = org_apache_felix_systemready_system_ready_monitor_properties_create_internal (
        poll_interval
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_systemready_system_ready_monitor_properties_free(org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties) {
    if(NULL == org_apache_felix_systemready_system_ready_monitor_properties){
        return ;
    }
    if(org_apache_felix_systemready_system_ready_monitor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_systemready_system_ready_monitor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_systemready_system_ready_monitor_properties->poll_interval) {
        config_node_property_integer_free(org_apache_felix_systemready_system_ready_monitor_properties->poll_interval);
        org_apache_felix_systemready_system_ready_monitor_properties->poll_interval = NULL;
    }
    free(org_apache_felix_systemready_system_ready_monitor_properties);
}

cJSON *org_apache_felix_systemready_system_ready_monitor_properties_convertToJSON(org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_systemready_system_ready_monitor_properties->poll_interval
    if(org_apache_felix_systemready_system_ready_monitor_properties->poll_interval) {
    cJSON *poll_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_systemready_system_ready_monitor_properties->poll_interval);
    if(poll_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "poll.interval", poll_interval_local_JSON);
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

org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties_parseFromJSON(cJSON *org_apache_felix_systemready_system_ready_monitor_propertiesJSON){

    org_apache_felix_systemready_system_ready_monitor_properties_t *org_apache_felix_systemready_system_ready_monitor_properties_local_var = NULL;

    // define the local variable for org_apache_felix_systemready_system_ready_monitor_properties->poll_interval
    config_node_property_integer_t *poll_interval_local_nonprim = NULL;

    // org_apache_felix_systemready_system_ready_monitor_properties->poll_interval
    cJSON *poll_interval = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_system_ready_monitor_propertiesJSON, "poll.interval");
    if (cJSON_IsNull(poll_interval)) {
        poll_interval = NULL;
    }
    if (poll_interval) { 
    poll_interval_local_nonprim = config_node_property_integer_parseFromJSON(poll_interval); //nonprimitive
    }



    org_apache_felix_systemready_system_ready_monitor_properties_local_var = org_apache_felix_systemready_system_ready_monitor_properties_create_internal (
        poll_interval ? poll_interval_local_nonprim : NULL
        );

    if (!org_apache_felix_systemready_system_ready_monitor_properties_local_var) {
        goto end;
    }

    return org_apache_felix_systemready_system_ready_monitor_properties_local_var;
end:
    if (poll_interval_local_nonprim) {
        config_node_property_integer_free(poll_interval_local_nonprim);
        poll_interval_local_nonprim = NULL;
    }
    return NULL;

}
