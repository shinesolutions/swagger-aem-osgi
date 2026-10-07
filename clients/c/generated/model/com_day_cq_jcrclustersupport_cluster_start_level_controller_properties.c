#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_jcrclustersupport_cluster_start_level_controller_properties.h"



static com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_create_internal(
    config_node_property_boolean_t *cluster_level_enable,
    config_node_property_integer_t *cluster_master_level,
    config_node_property_integer_t *cluster_slave_level
    ) {
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var = malloc(sizeof(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t));
    if (!com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var, 0, sizeof(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t));
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var->_library_owned = 1;
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var->cluster_level_enable = cluster_level_enable;
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var->cluster_master_level = cluster_master_level;
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var->cluster_slave_level = cluster_slave_level;
    return com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_create(
    config_node_property_boolean_t *cluster_level_enable,
    config_node_property_integer_t *cluster_master_level,
    config_node_property_integer_t *cluster_slave_level
    ) {
    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *result = com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_create_internal (
        cluster_level_enable,
        cluster_master_level,
        cluster_slave_level
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_free(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties) {
    if(NULL == com_day_cq_jcrclustersupport_cluster_start_level_controller_properties){
        return ;
    }
    if(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable) {
        config_node_property_boolean_free(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable);
        com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable = NULL;
    }
    if (com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level) {
        config_node_property_integer_free(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level);
        com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level = NULL;
    }
    if (com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level) {
        config_node_property_integer_free(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level);
        com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level = NULL;
    }
    free(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties);
}

cJSON *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_convertToJSON(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable
    if(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable) {
    cJSON *cluster_level_enable_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable);
    if(cluster_level_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.level.enable", cluster_level_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level
    if(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level) {
    cJSON *cluster_master_level_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level);
    if(cluster_master_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.master.level", cluster_master_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level
    if(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level) {
    cJSON *cluster_slave_level_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level);
    if(cluster_slave_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.slave.level", cluster_slave_level_local_JSON);
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

com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_parseFromJSON(cJSON *com_day_cq_jcrclustersupport_cluster_start_level_controller_propertiesJSON){

    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_t *com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var = NULL;

    // define the local variable for com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable
    config_node_property_boolean_t *cluster_level_enable_local_nonprim = NULL;

    // define the local variable for com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level
    config_node_property_integer_t *cluster_master_level_local_nonprim = NULL;

    // define the local variable for com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level
    config_node_property_integer_t *cluster_slave_level_local_nonprim = NULL;

    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_level_enable
    cJSON *cluster_level_enable = cJSON_GetObjectItemCaseSensitive(com_day_cq_jcrclustersupport_cluster_start_level_controller_propertiesJSON, "cluster.level.enable");
    if (cJSON_IsNull(cluster_level_enable)) {
        cluster_level_enable = NULL;
    }
    if (cluster_level_enable) { 
    cluster_level_enable_local_nonprim = config_node_property_boolean_parseFromJSON(cluster_level_enable); //nonprimitive
    }

    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_master_level
    cJSON *cluster_master_level = cJSON_GetObjectItemCaseSensitive(com_day_cq_jcrclustersupport_cluster_start_level_controller_propertiesJSON, "cluster.master.level");
    if (cJSON_IsNull(cluster_master_level)) {
        cluster_master_level = NULL;
    }
    if (cluster_master_level) { 
    cluster_master_level_local_nonprim = config_node_property_integer_parseFromJSON(cluster_master_level); //nonprimitive
    }

    // com_day_cq_jcrclustersupport_cluster_start_level_controller_properties->cluster_slave_level
    cJSON *cluster_slave_level = cJSON_GetObjectItemCaseSensitive(com_day_cq_jcrclustersupport_cluster_start_level_controller_propertiesJSON, "cluster.slave.level");
    if (cJSON_IsNull(cluster_slave_level)) {
        cluster_slave_level = NULL;
    }
    if (cluster_slave_level) { 
    cluster_slave_level_local_nonprim = config_node_property_integer_parseFromJSON(cluster_slave_level); //nonprimitive
    }



    com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var = com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_create_internal (
        cluster_level_enable ? cluster_level_enable_local_nonprim : NULL,
        cluster_master_level ? cluster_master_level_local_nonprim : NULL,
        cluster_slave_level ? cluster_slave_level_local_nonprim : NULL
        );

    if (!com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var) {
        goto end;
    }

    return com_day_cq_jcrclustersupport_cluster_start_level_controller_properties_local_var;
end:
    if (cluster_level_enable_local_nonprim) {
        config_node_property_boolean_free(cluster_level_enable_local_nonprim);
        cluster_level_enable_local_nonprim = NULL;
    }
    if (cluster_master_level_local_nonprim) {
        config_node_property_integer_free(cluster_master_level_local_nonprim);
        cluster_master_level_local_nonprim = NULL;
    }
    if (cluster_slave_level_local_nonprim) {
        config_node_property_integer_free(cluster_slave_level_local_nonprim);
        cluster_slave_level_local_nonprim = NULL;
    }
    return NULL;

}
