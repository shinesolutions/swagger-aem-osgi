#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties.h"



static com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_create_internal(
    config_node_property_boolean_t *dmreplicateonmodify_enabled,
    config_node_property_boolean_t *dmreplicateonmodify_forcesyncdeletes
    ) {
    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var = malloc(sizeof(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t));
    if (!com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var, 0, sizeof(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t));
    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var->dmreplicateonmodify_enabled = dmreplicateonmodify_enabled;
    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var->dmreplicateonmodify_forcesyncdeletes = dmreplicateonmodify_forcesyncdeletes;
    return com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_create(
    config_node_property_boolean_t *dmreplicateonmodify_enabled,
    config_node_property_boolean_t *dmreplicateonmodify_forcesyncdeletes
    ) {
    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *result = com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_create_internal (
        dmreplicateonmodify_enabled,
        dmreplicateonmodify_forcesyncdeletes
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_free(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties) {
    if(NULL == com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties){
        return ;
    }
    if(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled) {
        config_node_property_boolean_free(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled);
        com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled = NULL;
    }
    if (com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes) {
        config_node_property_boolean_free(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes);
        com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes = NULL;
    }
    free(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties);
}

cJSON *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_convertToJSON(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled
    if(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled) {
    cJSON *dmreplicateonmodify_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled);
    if(dmreplicateonmodify_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dmreplicateonmodify.enabled", dmreplicateonmodify_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes
    if(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes) {
    cJSON *dmreplicateonmodify_forcesyncdeletes_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes);
    if(dmreplicateonmodify_forcesyncdeletes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dmreplicateonmodify.forcesyncdeletes", dmreplicateonmodify_forcesyncdeletes_local_JSON);
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

com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_parseFromJSON(cJSON *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_propertiesJSON){

    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_t *com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled
    config_node_property_boolean_t *dmreplicateonmodify_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes
    config_node_property_boolean_t *dmreplicateonmodify_forcesyncdeletes_local_nonprim = NULL;

    // com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_enabled
    cJSON *dmreplicateonmodify_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_propertiesJSON, "dmreplicateonmodify.enabled");
    if (cJSON_IsNull(dmreplicateonmodify_enabled)) {
        dmreplicateonmodify_enabled = NULL;
    }
    if (dmreplicateonmodify_enabled) { 
    dmreplicateonmodify_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(dmreplicateonmodify_enabled); //nonprimitive
    }

    // com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties->dmreplicateonmodify_forcesyncdeletes
    cJSON *dmreplicateonmodify_forcesyncdeletes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_propertiesJSON, "dmreplicateonmodify.forcesyncdeletes");
    if (cJSON_IsNull(dmreplicateonmodify_forcesyncdeletes)) {
        dmreplicateonmodify_forcesyncdeletes = NULL;
    }
    if (dmreplicateonmodify_forcesyncdeletes) { 
    dmreplicateonmodify_forcesyncdeletes_local_nonprim = config_node_property_boolean_parseFromJSON(dmreplicateonmodify_forcesyncdeletes); //nonprimitive
    }



    com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var = com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_create_internal (
        dmreplicateonmodify_enabled ? dmreplicateonmodify_enabled_local_nonprim : NULL,
        dmreplicateonmodify_forcesyncdeletes ? dmreplicateonmodify_forcesyncdeletes_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties_local_var;
end:
    if (dmreplicateonmodify_enabled_local_nonprim) {
        config_node_property_boolean_free(dmreplicateonmodify_enabled_local_nonprim);
        dmreplicateonmodify_enabled_local_nonprim = NULL;
    }
    if (dmreplicateonmodify_forcesyncdeletes_local_nonprim) {
        config_node_property_boolean_free(dmreplicateonmodify_forcesyncdeletes_local_nonprim);
        dmreplicateonmodify_forcesyncdeletes_local_nonprim = NULL;
    }
    return NULL;

}
