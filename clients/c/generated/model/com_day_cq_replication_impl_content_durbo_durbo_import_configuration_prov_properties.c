#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties.h"



static com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_create_internal(
    config_node_property_boolean_t *preserve_hierarchy_nodes,
    config_node_property_boolean_t *ignore_versioning,
    config_node_property_boolean_t *import_acl,
    config_node_property_integer_t *save_threshold,
    config_node_property_boolean_t *preserve_user_paths,
    config_node_property_boolean_t *preserve_uuid,
    config_node_property_array_t *preserve_uuid_nodetypes,
    config_node_property_array_t *preserve_uuid_subtrees,
    config_node_property_boolean_t *auto_commit
    ) {
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t));
    if (!com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var, 0, sizeof(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t));
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->preserve_hierarchy_nodes = preserve_hierarchy_nodes;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->ignore_versioning = ignore_versioning;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->import_acl = import_acl;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->save_threshold = save_threshold;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->preserve_user_paths = preserve_user_paths;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->preserve_uuid = preserve_uuid;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->preserve_uuid_nodetypes = preserve_uuid_nodetypes;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->preserve_uuid_subtrees = preserve_uuid_subtrees;
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var->auto_commit = auto_commit;
    return com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_create(
    config_node_property_boolean_t *preserve_hierarchy_nodes,
    config_node_property_boolean_t *ignore_versioning,
    config_node_property_boolean_t *import_acl,
    config_node_property_integer_t *save_threshold,
    config_node_property_boolean_t *preserve_user_paths,
    config_node_property_boolean_t *preserve_uuid,
    config_node_property_array_t *preserve_uuid_nodetypes,
    config_node_property_array_t *preserve_uuid_subtrees,
    config_node_property_boolean_t *auto_commit
    ) {
    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *result = com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_create_internal (
        preserve_hierarchy_nodes,
        ignore_versioning,
        import_acl,
        save_threshold,
        preserve_user_paths,
        preserve_uuid,
        preserve_uuid_nodetypes,
        preserve_uuid_subtrees,
        auto_commit
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties) {
    if(NULL == com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties){
        return ;
    }
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold) {
        config_node_property_integer_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes) {
        config_node_property_array_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees) {
        config_node_property_array_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees = NULL;
    }
    if (com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit) {
        config_node_property_boolean_free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit);
        com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit = NULL;
    }
    free(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties);
}

cJSON *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes) {
    cJSON *preserve_hierarchy_nodes_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes);
    if(preserve_hierarchy_nodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preserve.hierarchy.nodes", preserve_hierarchy_nodes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning) {
    cJSON *ignore_versioning_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning);
    if(ignore_versioning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignore.versioning", ignore_versioning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl) {
    cJSON *import_acl_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl);
    if(import_acl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "import.acl", import_acl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold) {
    cJSON *save_threshold_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold);
    if(save_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "save.threshold", save_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths) {
    cJSON *preserve_user_paths_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths);
    if(preserve_user_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preserve.user.paths", preserve_user_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid) {
    cJSON *preserve_uuid_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid);
    if(preserve_uuid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preserve.uuid", preserve_uuid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes) {
    cJSON *preserve_uuid_nodetypes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes);
    if(preserve_uuid_nodetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preserve.uuid.nodetypes", preserve_uuid_nodetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees) {
    cJSON *preserve_uuid_subtrees_local_JSON = config_node_property_array_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees);
    if(preserve_uuid_subtrees_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preserve.uuid.subtrees", preserve_uuid_subtrees_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit
    if(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit) {
    cJSON *auto_commit_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit);
    if(auto_commit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auto.commit", auto_commit_local_JSON);
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

com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON){

    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_t *com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes
    config_node_property_boolean_t *preserve_hierarchy_nodes_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning
    config_node_property_boolean_t *ignore_versioning_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl
    config_node_property_boolean_t *import_acl_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold
    config_node_property_integer_t *save_threshold_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths
    config_node_property_boolean_t *preserve_user_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid
    config_node_property_boolean_t *preserve_uuid_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes
    config_node_property_array_t *preserve_uuid_nodetypes_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees
    config_node_property_array_t *preserve_uuid_subtrees_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit
    config_node_property_boolean_t *auto_commit_local_nonprim = NULL;

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_hierarchy_nodes
    cJSON *preserve_hierarchy_nodes = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "preserve.hierarchy.nodes");
    if (cJSON_IsNull(preserve_hierarchy_nodes)) {
        preserve_hierarchy_nodes = NULL;
    }
    if (preserve_hierarchy_nodes) { 
    preserve_hierarchy_nodes_local_nonprim = config_node_property_boolean_parseFromJSON(preserve_hierarchy_nodes); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->ignore_versioning
    cJSON *ignore_versioning = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "ignore.versioning");
    if (cJSON_IsNull(ignore_versioning)) {
        ignore_versioning = NULL;
    }
    if (ignore_versioning) { 
    ignore_versioning_local_nonprim = config_node_property_boolean_parseFromJSON(ignore_versioning); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->import_acl
    cJSON *import_acl = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "import.acl");
    if (cJSON_IsNull(import_acl)) {
        import_acl = NULL;
    }
    if (import_acl) { 
    import_acl_local_nonprim = config_node_property_boolean_parseFromJSON(import_acl); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->save_threshold
    cJSON *save_threshold = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "save.threshold");
    if (cJSON_IsNull(save_threshold)) {
        save_threshold = NULL;
    }
    if (save_threshold) { 
    save_threshold_local_nonprim = config_node_property_integer_parseFromJSON(save_threshold); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_user_paths
    cJSON *preserve_user_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "preserve.user.paths");
    if (cJSON_IsNull(preserve_user_paths)) {
        preserve_user_paths = NULL;
    }
    if (preserve_user_paths) { 
    preserve_user_paths_local_nonprim = config_node_property_boolean_parseFromJSON(preserve_user_paths); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid
    cJSON *preserve_uuid = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "preserve.uuid");
    if (cJSON_IsNull(preserve_uuid)) {
        preserve_uuid = NULL;
    }
    if (preserve_uuid) { 
    preserve_uuid_local_nonprim = config_node_property_boolean_parseFromJSON(preserve_uuid); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_nodetypes
    cJSON *preserve_uuid_nodetypes = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "preserve.uuid.nodetypes");
    if (cJSON_IsNull(preserve_uuid_nodetypes)) {
        preserve_uuid_nodetypes = NULL;
    }
    if (preserve_uuid_nodetypes) { 
    preserve_uuid_nodetypes_local_nonprim = config_node_property_array_parseFromJSON(preserve_uuid_nodetypes); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->preserve_uuid_subtrees
    cJSON *preserve_uuid_subtrees = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "preserve.uuid.subtrees");
    if (cJSON_IsNull(preserve_uuid_subtrees)) {
        preserve_uuid_subtrees = NULL;
    }
    if (preserve_uuid_subtrees) { 
    preserve_uuid_subtrees_local_nonprim = config_node_property_array_parseFromJSON(preserve_uuid_subtrees); //nonprimitive
    }

    // com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties->auto_commit
    cJSON *auto_commit = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_propertiesJSON, "auto.commit");
    if (cJSON_IsNull(auto_commit)) {
        auto_commit = NULL;
    }
    if (auto_commit) { 
    auto_commit_local_nonprim = config_node_property_boolean_parseFromJSON(auto_commit); //nonprimitive
    }



    com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var = com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_create_internal (
        preserve_hierarchy_nodes ? preserve_hierarchy_nodes_local_nonprim : NULL,
        ignore_versioning ? ignore_versioning_local_nonprim : NULL,
        import_acl ? import_acl_local_nonprim : NULL,
        save_threshold ? save_threshold_local_nonprim : NULL,
        preserve_user_paths ? preserve_user_paths_local_nonprim : NULL,
        preserve_uuid ? preserve_uuid_local_nonprim : NULL,
        preserve_uuid_nodetypes ? preserve_uuid_nodetypes_local_nonprim : NULL,
        preserve_uuid_subtrees ? preserve_uuid_subtrees_local_nonprim : NULL,
        auto_commit ? auto_commit_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_local_var;
end:
    if (preserve_hierarchy_nodes_local_nonprim) {
        config_node_property_boolean_free(preserve_hierarchy_nodes_local_nonprim);
        preserve_hierarchy_nodes_local_nonprim = NULL;
    }
    if (ignore_versioning_local_nonprim) {
        config_node_property_boolean_free(ignore_versioning_local_nonprim);
        ignore_versioning_local_nonprim = NULL;
    }
    if (import_acl_local_nonprim) {
        config_node_property_boolean_free(import_acl_local_nonprim);
        import_acl_local_nonprim = NULL;
    }
    if (save_threshold_local_nonprim) {
        config_node_property_integer_free(save_threshold_local_nonprim);
        save_threshold_local_nonprim = NULL;
    }
    if (preserve_user_paths_local_nonprim) {
        config_node_property_boolean_free(preserve_user_paths_local_nonprim);
        preserve_user_paths_local_nonprim = NULL;
    }
    if (preserve_uuid_local_nonprim) {
        config_node_property_boolean_free(preserve_uuid_local_nonprim);
        preserve_uuid_local_nonprim = NULL;
    }
    if (preserve_uuid_nodetypes_local_nonprim) {
        config_node_property_array_free(preserve_uuid_nodetypes_local_nonprim);
        preserve_uuid_nodetypes_local_nonprim = NULL;
    }
    if (preserve_uuid_subtrees_local_nonprim) {
        config_node_property_array_free(preserve_uuid_subtrees_local_nonprim);
        preserve_uuid_subtrees_local_nonprim = NULL;
    }
    if (auto_commit_local_nonprim) {
        config_node_property_boolean_free(auto_commit_local_nonprim);
        auto_commit_local_nonprim = NULL;
    }
    return NULL;

}
