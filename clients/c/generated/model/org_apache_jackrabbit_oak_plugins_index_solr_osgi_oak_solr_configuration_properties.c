#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties.h"



static org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_create_internal(
    config_node_property_string_t *path_desc_field,
    config_node_property_string_t *path_child_field,
    config_node_property_string_t *path_parent_field,
    config_node_property_string_t *path_exact_field,
    config_node_property_string_t *catch_all_field,
    config_node_property_string_t *collapsed_path_field,
    config_node_property_string_t *path_depth_field,
    config_node_property_drop_down_t *commit_policy,
    config_node_property_integer_t *rows,
    config_node_property_boolean_t *path_restrictions,
    config_node_property_boolean_t *property_restrictions,
    config_node_property_boolean_t *primarytypes_restrictions,
    config_node_property_array_t *ignored_properties,
    config_node_property_array_t *used_properties,
    config_node_property_array_t *type_mappings,
    config_node_property_array_t *property_mappings,
    config_node_property_boolean_t *collapse_jcrcontent_nodes
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t));
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_desc_field = path_desc_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_child_field = path_child_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_parent_field = path_parent_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_exact_field = path_exact_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->catch_all_field = catch_all_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->collapsed_path_field = collapsed_path_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_depth_field = path_depth_field;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->commit_policy = commit_policy;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->rows = rows;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->path_restrictions = path_restrictions;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->property_restrictions = property_restrictions;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->primarytypes_restrictions = primarytypes_restrictions;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->ignored_properties = ignored_properties;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->used_properties = used_properties;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->type_mappings = type_mappings;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->property_mappings = property_mappings;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var->collapse_jcrcontent_nodes = collapse_jcrcontent_nodes;
    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_create(
    config_node_property_string_t *path_desc_field,
    config_node_property_string_t *path_child_field,
    config_node_property_string_t *path_parent_field,
    config_node_property_string_t *path_exact_field,
    config_node_property_string_t *catch_all_field,
    config_node_property_string_t *collapsed_path_field,
    config_node_property_string_t *path_depth_field,
    config_node_property_drop_down_t *commit_policy,
    config_node_property_integer_t *rows,
    config_node_property_boolean_t *path_restrictions,
    config_node_property_boolean_t *property_restrictions,
    config_node_property_boolean_t *primarytypes_restrictions,
    config_node_property_array_t *ignored_properties,
    config_node_property_array_t *used_properties,
    config_node_property_array_t *type_mappings,
    config_node_property_array_t *property_mappings,
    config_node_property_boolean_t *collapse_jcrcontent_nodes
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *result = org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_create_internal (
        path_desc_field,
        path_child_field,
        path_parent_field,
        path_exact_field,
        catch_all_field,
        collapsed_path_field,
        path_depth_field,
        commit_policy,
        rows,
        path_restrictions,
        property_restrictions,
        primarytypes_restrictions,
        ignored_properties,
        used_properties,
        type_mappings,
        property_mappings,
        collapse_jcrcontent_nodes
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field) {
    cJSON *path_desc_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field);
    if(path_desc_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.desc.field", path_desc_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field) {
    cJSON *path_child_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field);
    if(path_child_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.child.field", path_child_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field) {
    cJSON *path_parent_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field);
    if(path_parent_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.parent.field", path_parent_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field) {
    cJSON *path_exact_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field);
    if(path_exact_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.exact.field", path_exact_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field) {
    cJSON *catch_all_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field);
    if(catch_all_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "catch.all.field", catch_all_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field) {
    cJSON *collapsed_path_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field);
    if(collapsed_path_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "collapsed.path.field", collapsed_path_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field) {
    cJSON *path_depth_field_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field);
    if(path_depth_field_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.depth.field", path_depth_field_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy) {
    cJSON *commit_policy_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy);
    if(commit_policy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "commit.policy", commit_policy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows) {
    cJSON *rows_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows);
    if(rows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rows", rows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions) {
    cJSON *path_restrictions_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions);
    if(path_restrictions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path.restrictions", path_restrictions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions) {
    cJSON *property_restrictions_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions);
    if(property_restrictions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.restrictions", property_restrictions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions) {
    cJSON *primarytypes_restrictions_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions);
    if(primarytypes_restrictions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "primarytypes.restrictions", primarytypes_restrictions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties) {
    cJSON *ignored_properties_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties);
    if(ignored_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignored.properties", ignored_properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties) {
    cJSON *used_properties_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties);
    if(used_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "used.properties", used_properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings) {
    cJSON *type_mappings_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings);
    if(type_mappings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.mappings", type_mappings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings) {
    cJSON *property_mappings_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings);
    if(property_mappings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.mappings", property_mappings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes) {
    cJSON *collapse_jcrcontent_nodes_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes);
    if(collapse_jcrcontent_nodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "collapse.jcrcontent.nodes", collapse_jcrcontent_nodes_local_JSON);
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

org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field
    config_node_property_string_t *path_desc_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field
    config_node_property_string_t *path_child_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field
    config_node_property_string_t *path_parent_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field
    config_node_property_string_t *path_exact_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field
    config_node_property_string_t *catch_all_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field
    config_node_property_string_t *collapsed_path_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field
    config_node_property_string_t *path_depth_field_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy
    config_node_property_drop_down_t *commit_policy_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows
    config_node_property_integer_t *rows_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions
    config_node_property_boolean_t *path_restrictions_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions
    config_node_property_boolean_t *property_restrictions_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions
    config_node_property_boolean_t *primarytypes_restrictions_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties
    config_node_property_array_t *ignored_properties_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties
    config_node_property_array_t *used_properties_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings
    config_node_property_array_t *type_mappings_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings
    config_node_property_array_t *property_mappings_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes
    config_node_property_boolean_t *collapse_jcrcontent_nodes_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_desc_field
    cJSON *path_desc_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.desc.field");
    if (cJSON_IsNull(path_desc_field)) {
        path_desc_field = NULL;
    }
    if (path_desc_field) { 
    path_desc_field_local_nonprim = config_node_property_string_parseFromJSON(path_desc_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_child_field
    cJSON *path_child_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.child.field");
    if (cJSON_IsNull(path_child_field)) {
        path_child_field = NULL;
    }
    if (path_child_field) { 
    path_child_field_local_nonprim = config_node_property_string_parseFromJSON(path_child_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_parent_field
    cJSON *path_parent_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.parent.field");
    if (cJSON_IsNull(path_parent_field)) {
        path_parent_field = NULL;
    }
    if (path_parent_field) { 
    path_parent_field_local_nonprim = config_node_property_string_parseFromJSON(path_parent_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_exact_field
    cJSON *path_exact_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.exact.field");
    if (cJSON_IsNull(path_exact_field)) {
        path_exact_field = NULL;
    }
    if (path_exact_field) { 
    path_exact_field_local_nonprim = config_node_property_string_parseFromJSON(path_exact_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->catch_all_field
    cJSON *catch_all_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "catch.all.field");
    if (cJSON_IsNull(catch_all_field)) {
        catch_all_field = NULL;
    }
    if (catch_all_field) { 
    catch_all_field_local_nonprim = config_node_property_string_parseFromJSON(catch_all_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapsed_path_field
    cJSON *collapsed_path_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "collapsed.path.field");
    if (cJSON_IsNull(collapsed_path_field)) {
        collapsed_path_field = NULL;
    }
    if (collapsed_path_field) { 
    collapsed_path_field_local_nonprim = config_node_property_string_parseFromJSON(collapsed_path_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_depth_field
    cJSON *path_depth_field = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.depth.field");
    if (cJSON_IsNull(path_depth_field)) {
        path_depth_field = NULL;
    }
    if (path_depth_field) { 
    path_depth_field_local_nonprim = config_node_property_string_parseFromJSON(path_depth_field); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->commit_policy
    cJSON *commit_policy = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "commit.policy");
    if (cJSON_IsNull(commit_policy)) {
        commit_policy = NULL;
    }
    if (commit_policy) { 
    commit_policy_local_nonprim = config_node_property_drop_down_parseFromJSON(commit_policy); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->rows
    cJSON *rows = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "rows");
    if (cJSON_IsNull(rows)) {
        rows = NULL;
    }
    if (rows) { 
    rows_local_nonprim = config_node_property_integer_parseFromJSON(rows); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->path_restrictions
    cJSON *path_restrictions = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "path.restrictions");
    if (cJSON_IsNull(path_restrictions)) {
        path_restrictions = NULL;
    }
    if (path_restrictions) { 
    path_restrictions_local_nonprim = config_node_property_boolean_parseFromJSON(path_restrictions); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_restrictions
    cJSON *property_restrictions = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "property.restrictions");
    if (cJSON_IsNull(property_restrictions)) {
        property_restrictions = NULL;
    }
    if (property_restrictions) { 
    property_restrictions_local_nonprim = config_node_property_boolean_parseFromJSON(property_restrictions); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->primarytypes_restrictions
    cJSON *primarytypes_restrictions = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "primarytypes.restrictions");
    if (cJSON_IsNull(primarytypes_restrictions)) {
        primarytypes_restrictions = NULL;
    }
    if (primarytypes_restrictions) { 
    primarytypes_restrictions_local_nonprim = config_node_property_boolean_parseFromJSON(primarytypes_restrictions); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->ignored_properties
    cJSON *ignored_properties = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "ignored.properties");
    if (cJSON_IsNull(ignored_properties)) {
        ignored_properties = NULL;
    }
    if (ignored_properties) { 
    ignored_properties_local_nonprim = config_node_property_array_parseFromJSON(ignored_properties); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->used_properties
    cJSON *used_properties = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "used.properties");
    if (cJSON_IsNull(used_properties)) {
        used_properties = NULL;
    }
    if (used_properties) { 
    used_properties_local_nonprim = config_node_property_array_parseFromJSON(used_properties); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->type_mappings
    cJSON *type_mappings = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "type.mappings");
    if (cJSON_IsNull(type_mappings)) {
        type_mappings = NULL;
    }
    if (type_mappings) { 
    type_mappings_local_nonprim = config_node_property_array_parseFromJSON(type_mappings); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->property_mappings
    cJSON *property_mappings = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "property.mappings");
    if (cJSON_IsNull(property_mappings)) {
        property_mappings = NULL;
    }
    if (property_mappings) { 
    property_mappings_local_nonprim = config_node_property_array_parseFromJSON(property_mappings); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties->collapse_jcrcontent_nodes
    cJSON *collapse_jcrcontent_nodes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON, "collapse.jcrcontent.nodes");
    if (cJSON_IsNull(collapse_jcrcontent_nodes)) {
        collapse_jcrcontent_nodes = NULL;
    }
    if (collapse_jcrcontent_nodes) { 
    collapse_jcrcontent_nodes_local_nonprim = config_node_property_boolean_parseFromJSON(collapse_jcrcontent_nodes); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var = org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_create_internal (
        path_desc_field ? path_desc_field_local_nonprim : NULL,
        path_child_field ? path_child_field_local_nonprim : NULL,
        path_parent_field ? path_parent_field_local_nonprim : NULL,
        path_exact_field ? path_exact_field_local_nonprim : NULL,
        catch_all_field ? catch_all_field_local_nonprim : NULL,
        collapsed_path_field ? collapsed_path_field_local_nonprim : NULL,
        path_depth_field ? path_depth_field_local_nonprim : NULL,
        commit_policy ? commit_policy_local_nonprim : NULL,
        rows ? rows_local_nonprim : NULL,
        path_restrictions ? path_restrictions_local_nonprim : NULL,
        property_restrictions ? property_restrictions_local_nonprim : NULL,
        primarytypes_restrictions ? primarytypes_restrictions_local_nonprim : NULL,
        ignored_properties ? ignored_properties_local_nonprim : NULL,
        used_properties ? used_properties_local_nonprim : NULL,
        type_mappings ? type_mappings_local_nonprim : NULL,
        property_mappings ? property_mappings_local_nonprim : NULL,
        collapse_jcrcontent_nodes ? collapse_jcrcontent_nodes_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_local_var;
end:
    if (path_desc_field_local_nonprim) {
        config_node_property_string_free(path_desc_field_local_nonprim);
        path_desc_field_local_nonprim = NULL;
    }
    if (path_child_field_local_nonprim) {
        config_node_property_string_free(path_child_field_local_nonprim);
        path_child_field_local_nonprim = NULL;
    }
    if (path_parent_field_local_nonprim) {
        config_node_property_string_free(path_parent_field_local_nonprim);
        path_parent_field_local_nonprim = NULL;
    }
    if (path_exact_field_local_nonprim) {
        config_node_property_string_free(path_exact_field_local_nonprim);
        path_exact_field_local_nonprim = NULL;
    }
    if (catch_all_field_local_nonprim) {
        config_node_property_string_free(catch_all_field_local_nonprim);
        catch_all_field_local_nonprim = NULL;
    }
    if (collapsed_path_field_local_nonprim) {
        config_node_property_string_free(collapsed_path_field_local_nonprim);
        collapsed_path_field_local_nonprim = NULL;
    }
    if (path_depth_field_local_nonprim) {
        config_node_property_string_free(path_depth_field_local_nonprim);
        path_depth_field_local_nonprim = NULL;
    }
    if (commit_policy_local_nonprim) {
        config_node_property_drop_down_free(commit_policy_local_nonprim);
        commit_policy_local_nonprim = NULL;
    }
    if (rows_local_nonprim) {
        config_node_property_integer_free(rows_local_nonprim);
        rows_local_nonprim = NULL;
    }
    if (path_restrictions_local_nonprim) {
        config_node_property_boolean_free(path_restrictions_local_nonprim);
        path_restrictions_local_nonprim = NULL;
    }
    if (property_restrictions_local_nonprim) {
        config_node_property_boolean_free(property_restrictions_local_nonprim);
        property_restrictions_local_nonprim = NULL;
    }
    if (primarytypes_restrictions_local_nonprim) {
        config_node_property_boolean_free(primarytypes_restrictions_local_nonprim);
        primarytypes_restrictions_local_nonprim = NULL;
    }
    if (ignored_properties_local_nonprim) {
        config_node_property_array_free(ignored_properties_local_nonprim);
        ignored_properties_local_nonprim = NULL;
    }
    if (used_properties_local_nonprim) {
        config_node_property_array_free(used_properties_local_nonprim);
        used_properties_local_nonprim = NULL;
    }
    if (type_mappings_local_nonprim) {
        config_node_property_array_free(type_mappings_local_nonprim);
        type_mappings_local_nonprim = NULL;
    }
    if (property_mappings_local_nonprim) {
        config_node_property_array_free(property_mappings_local_nonprim);
        property_mappings_local_nonprim = NULL;
    }
    if (collapse_jcrcontent_nodes_local_nonprim) {
        config_node_property_boolean_free(collapse_jcrcontent_nodes_local_nonprim);
        collapse_jcrcontent_nodes_local_nonprim = NULL;
    }
    return NULL;

}
