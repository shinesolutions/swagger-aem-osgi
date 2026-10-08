#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties.h"



static org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_create_internal(
    config_node_property_array_t *commits_tracker_writer_groups
    ) {
    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t));
    if (!org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t));
    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var->commits_tracker_writer_groups = commits_tracker_writer_groups;
    return org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_create(
    config_node_property_array_t *commits_tracker_writer_groups
    ) {
    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *result = org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_create_internal (
        commits_tracker_writer_groups
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_free(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups) {
        config_node_property_array_free(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups);
        org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups = NULL;
    }
    free(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties);
}

cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups
    if(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups) {
    cJSON *commits_tracker_writer_groups_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups);
    if(commits_tracker_writer_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "commitsTrackerWriterGroups", commits_tracker_writer_groups_local_JSON);
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

org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_propertiesJSON){

    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups
    config_node_property_array_t *commits_tracker_writer_groups_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties->commits_tracker_writer_groups
    cJSON *commits_tracker_writer_groups = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_propertiesJSON, "commitsTrackerWriterGroups");
    if (cJSON_IsNull(commits_tracker_writer_groups)) {
        commits_tracker_writer_groups = NULL;
    }
    if (commits_tracker_writer_groups) { 
    commits_tracker_writer_groups_local_nonprim = config_node_property_array_parseFromJSON(commits_tracker_writer_groups); //nonprimitive
    }



    org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var = org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_create_internal (
        commits_tracker_writer_groups ? commits_tracker_writer_groups_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties_local_var;
end:
    if (commits_tracker_writer_groups_local_nonprim) {
        config_node_property_array_free(commits_tracker_writer_groups_local_nonprim);
        commits_tracker_writer_groups_local_nonprim = NULL;
    }
    return NULL;

}
