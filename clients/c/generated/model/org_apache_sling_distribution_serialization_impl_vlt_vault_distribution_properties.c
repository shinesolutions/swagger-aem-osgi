#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties.h"



static org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_drop_down_t *type,
    config_node_property_string_t *import_mode,
    config_node_property_string_t *acl_handling,
    config_node_property_string_t *package_roots,
    config_node_property_array_t *package_filters,
    config_node_property_array_t *property_filters,
    config_node_property_string_t *temp_fs_folder,
    config_node_property_boolean_t *use_binary_references,
    config_node_property_integer_t *auto_save_threshold,
    config_node_property_integer_t *cleanup_delay,
    config_node_property_integer_t *file_threshold,
    config_node_property_drop_down_t *mega_bytes,
    config_node_property_boolean_t *use_off_heap_memory,
    config_node_property_drop_down_t *digest_algorithm,
    config_node_property_integer_t *monitoring_queue_size,
    config_node_property_array_t *paths_mapping,
    config_node_property_boolean_t *strict_import
    ) {
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var = malloc(sizeof(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t));
    if (!org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var, 0, sizeof(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t));
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->name = name;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->type = type;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->import_mode = import_mode;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->acl_handling = acl_handling;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->package_roots = package_roots;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->package_filters = package_filters;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->property_filters = property_filters;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->temp_fs_folder = temp_fs_folder;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->use_binary_references = use_binary_references;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->auto_save_threshold = auto_save_threshold;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->cleanup_delay = cleanup_delay;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->file_threshold = file_threshold;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->mega_bytes = mega_bytes;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->use_off_heap_memory = use_off_heap_memory;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->digest_algorithm = digest_algorithm;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->monitoring_queue_size = monitoring_queue_size;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->paths_mapping = paths_mapping;
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var->strict_import = strict_import;
    return org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_create(
    config_node_property_string_t *name,
    config_node_property_drop_down_t *type,
    config_node_property_string_t *import_mode,
    config_node_property_string_t *acl_handling,
    config_node_property_string_t *package_roots,
    config_node_property_array_t *package_filters,
    config_node_property_array_t *property_filters,
    config_node_property_string_t *temp_fs_folder,
    config_node_property_boolean_t *use_binary_references,
    config_node_property_integer_t *auto_save_threshold,
    config_node_property_integer_t *cleanup_delay,
    config_node_property_integer_t *file_threshold,
    config_node_property_drop_down_t *mega_bytes,
    config_node_property_boolean_t *use_off_heap_memory,
    config_node_property_drop_down_t *digest_algorithm,
    config_node_property_integer_t *monitoring_queue_size,
    config_node_property_array_t *paths_mapping,
    config_node_property_boolean_t *strict_import
    ) {
    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *result = org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_create_internal (
        name,
        type,
        import_mode,
        acl_handling,
        package_roots,
        package_filters,
        property_filters,
        temp_fs_folder,
        use_binary_references,
        auto_save_threshold,
        cleanup_delay,
        file_threshold,
        mega_bytes,
        use_off_heap_memory,
        digest_algorithm,
        monitoring_queue_size,
        paths_mapping,
        strict_import
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties) {
    if(NULL == org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties){
        return ;
    }
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters) {
        config_node_property_array_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters) {
        config_node_property_array_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references) {
        config_node_property_boolean_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory) {
        config_node_property_boolean_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping) {
        config_node_property_array_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import) {
        config_node_property_boolean_free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import);
        org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import = NULL;
    }
    free(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties);
}

cJSON *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type) {
    cJSON *type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode) {
    cJSON *import_mode_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode);
    if(import_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "importMode", import_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling) {
    cJSON *acl_handling_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling);
    if(acl_handling_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aclHandling", acl_handling_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots) {
    cJSON *package_roots_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots);
    if(package_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "package.roots", package_roots_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters) {
    cJSON *package_filters_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters);
    if(package_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "package.filters", package_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters) {
    cJSON *property_filters_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters);
    if(property_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.filters", property_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder) {
    cJSON *temp_fs_folder_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder);
    if(temp_fs_folder_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tempFsFolder", temp_fs_folder_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references) {
    cJSON *use_binary_references_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references);
    if(use_binary_references_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useBinaryReferences", use_binary_references_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold) {
    cJSON *auto_save_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold);
    if(auto_save_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "autoSaveThreshold", auto_save_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay) {
    cJSON *cleanup_delay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay);
    if(cleanup_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cleanupDelay", cleanup_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold) {
    cJSON *file_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold);
    if(file_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fileThreshold", file_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes) {
    cJSON *mega_bytes_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes);
    if(mega_bytes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEGA_BYTES", mega_bytes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory) {
    cJSON *use_off_heap_memory_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory);
    if(use_off_heap_memory_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useOffHeapMemory", use_off_heap_memory_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm) {
    cJSON *digest_algorithm_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm);
    if(digest_algorithm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "digestAlgorithm", digest_algorithm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size) {
    cJSON *monitoring_queue_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size);
    if(monitoring_queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "monitoringQueueSize", monitoring_queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping) {
    cJSON *paths_mapping_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping);
    if(paths_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pathsMapping", paths_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import
    if(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import) {
    cJSON *strict_import_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import);
    if(strict_import_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "strictImport", strict_import_local_JSON);
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

org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_parseFromJSON(cJSON *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON){

    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_t *org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type
    config_node_property_drop_down_t *type_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode
    config_node_property_string_t *import_mode_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling
    config_node_property_string_t *acl_handling_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots
    config_node_property_string_t *package_roots_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters
    config_node_property_array_t *package_filters_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters
    config_node_property_array_t *property_filters_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder
    config_node_property_string_t *temp_fs_folder_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references
    config_node_property_boolean_t *use_binary_references_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold
    config_node_property_integer_t *auto_save_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay
    config_node_property_integer_t *cleanup_delay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold
    config_node_property_integer_t *file_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes
    config_node_property_drop_down_t *mega_bytes_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory
    config_node_property_boolean_t *use_off_heap_memory_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm
    config_node_property_drop_down_t *digest_algorithm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size
    config_node_property_integer_t *monitoring_queue_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping
    config_node_property_array_t *paths_mapping_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import
    config_node_property_boolean_t *strict_import_local_nonprim = NULL;

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = config_node_property_drop_down_parseFromJSON(type); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->import_mode
    cJSON *import_mode = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "importMode");
    if (cJSON_IsNull(import_mode)) {
        import_mode = NULL;
    }
    if (import_mode) { 
    import_mode_local_nonprim = config_node_property_string_parseFromJSON(import_mode); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->acl_handling
    cJSON *acl_handling = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "aclHandling");
    if (cJSON_IsNull(acl_handling)) {
        acl_handling = NULL;
    }
    if (acl_handling) { 
    acl_handling_local_nonprim = config_node_property_string_parseFromJSON(acl_handling); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_roots
    cJSON *package_roots = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "package.roots");
    if (cJSON_IsNull(package_roots)) {
        package_roots = NULL;
    }
    if (package_roots) { 
    package_roots_local_nonprim = config_node_property_string_parseFromJSON(package_roots); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->package_filters
    cJSON *package_filters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "package.filters");
    if (cJSON_IsNull(package_filters)) {
        package_filters = NULL;
    }
    if (package_filters) { 
    package_filters_local_nonprim = config_node_property_array_parseFromJSON(package_filters); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->property_filters
    cJSON *property_filters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "property.filters");
    if (cJSON_IsNull(property_filters)) {
        property_filters = NULL;
    }
    if (property_filters) { 
    property_filters_local_nonprim = config_node_property_array_parseFromJSON(property_filters); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->temp_fs_folder
    cJSON *temp_fs_folder = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "tempFsFolder");
    if (cJSON_IsNull(temp_fs_folder)) {
        temp_fs_folder = NULL;
    }
    if (temp_fs_folder) { 
    temp_fs_folder_local_nonprim = config_node_property_string_parseFromJSON(temp_fs_folder); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_binary_references
    cJSON *use_binary_references = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "useBinaryReferences");
    if (cJSON_IsNull(use_binary_references)) {
        use_binary_references = NULL;
    }
    if (use_binary_references) { 
    use_binary_references_local_nonprim = config_node_property_boolean_parseFromJSON(use_binary_references); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->auto_save_threshold
    cJSON *auto_save_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "autoSaveThreshold");
    if (cJSON_IsNull(auto_save_threshold)) {
        auto_save_threshold = NULL;
    }
    if (auto_save_threshold) { 
    auto_save_threshold_local_nonprim = config_node_property_integer_parseFromJSON(auto_save_threshold); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->cleanup_delay
    cJSON *cleanup_delay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "cleanupDelay");
    if (cJSON_IsNull(cleanup_delay)) {
        cleanup_delay = NULL;
    }
    if (cleanup_delay) { 
    cleanup_delay_local_nonprim = config_node_property_integer_parseFromJSON(cleanup_delay); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->file_threshold
    cJSON *file_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "fileThreshold");
    if (cJSON_IsNull(file_threshold)) {
        file_threshold = NULL;
    }
    if (file_threshold) { 
    file_threshold_local_nonprim = config_node_property_integer_parseFromJSON(file_threshold); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->mega_bytes
    cJSON *mega_bytes = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "MEGA_BYTES");
    if (cJSON_IsNull(mega_bytes)) {
        mega_bytes = NULL;
    }
    if (mega_bytes) { 
    mega_bytes_local_nonprim = config_node_property_drop_down_parseFromJSON(mega_bytes); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->use_off_heap_memory
    cJSON *use_off_heap_memory = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "useOffHeapMemory");
    if (cJSON_IsNull(use_off_heap_memory)) {
        use_off_heap_memory = NULL;
    }
    if (use_off_heap_memory) { 
    use_off_heap_memory_local_nonprim = config_node_property_boolean_parseFromJSON(use_off_heap_memory); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->digest_algorithm
    cJSON *digest_algorithm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "digestAlgorithm");
    if (cJSON_IsNull(digest_algorithm)) {
        digest_algorithm = NULL;
    }
    if (digest_algorithm) { 
    digest_algorithm_local_nonprim = config_node_property_drop_down_parseFromJSON(digest_algorithm); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->monitoring_queue_size
    cJSON *monitoring_queue_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "monitoringQueueSize");
    if (cJSON_IsNull(monitoring_queue_size)) {
        monitoring_queue_size = NULL;
    }
    if (monitoring_queue_size) { 
    monitoring_queue_size_local_nonprim = config_node_property_integer_parseFromJSON(monitoring_queue_size); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->paths_mapping
    cJSON *paths_mapping = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "pathsMapping");
    if (cJSON_IsNull(paths_mapping)) {
        paths_mapping = NULL;
    }
    if (paths_mapping) { 
    paths_mapping_local_nonprim = config_node_property_array_parseFromJSON(paths_mapping); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties->strict_import
    cJSON *strict_import = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_propertiesJSON, "strictImport");
    if (cJSON_IsNull(strict_import)) {
        strict_import = NULL;
    }
    if (strict_import) { 
    strict_import_local_nonprim = config_node_property_boolean_parseFromJSON(strict_import); //nonprimitive
    }



    org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var = org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_create_internal (
        name ? name_local_nonprim : NULL,
        type ? type_local_nonprim : NULL,
        import_mode ? import_mode_local_nonprim : NULL,
        acl_handling ? acl_handling_local_nonprim : NULL,
        package_roots ? package_roots_local_nonprim : NULL,
        package_filters ? package_filters_local_nonprim : NULL,
        property_filters ? property_filters_local_nonprim : NULL,
        temp_fs_folder ? temp_fs_folder_local_nonprim : NULL,
        use_binary_references ? use_binary_references_local_nonprim : NULL,
        auto_save_threshold ? auto_save_threshold_local_nonprim : NULL,
        cleanup_delay ? cleanup_delay_local_nonprim : NULL,
        file_threshold ? file_threshold_local_nonprim : NULL,
        mega_bytes ? mega_bytes_local_nonprim : NULL,
        use_off_heap_memory ? use_off_heap_memory_local_nonprim : NULL,
        digest_algorithm ? digest_algorithm_local_nonprim : NULL,
        monitoring_queue_size ? monitoring_queue_size_local_nonprim : NULL,
        paths_mapping ? paths_mapping_local_nonprim : NULL,
        strict_import ? strict_import_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        config_node_property_drop_down_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (import_mode_local_nonprim) {
        config_node_property_string_free(import_mode_local_nonprim);
        import_mode_local_nonprim = NULL;
    }
    if (acl_handling_local_nonprim) {
        config_node_property_string_free(acl_handling_local_nonprim);
        acl_handling_local_nonprim = NULL;
    }
    if (package_roots_local_nonprim) {
        config_node_property_string_free(package_roots_local_nonprim);
        package_roots_local_nonprim = NULL;
    }
    if (package_filters_local_nonprim) {
        config_node_property_array_free(package_filters_local_nonprim);
        package_filters_local_nonprim = NULL;
    }
    if (property_filters_local_nonprim) {
        config_node_property_array_free(property_filters_local_nonprim);
        property_filters_local_nonprim = NULL;
    }
    if (temp_fs_folder_local_nonprim) {
        config_node_property_string_free(temp_fs_folder_local_nonprim);
        temp_fs_folder_local_nonprim = NULL;
    }
    if (use_binary_references_local_nonprim) {
        config_node_property_boolean_free(use_binary_references_local_nonprim);
        use_binary_references_local_nonprim = NULL;
    }
    if (auto_save_threshold_local_nonprim) {
        config_node_property_integer_free(auto_save_threshold_local_nonprim);
        auto_save_threshold_local_nonprim = NULL;
    }
    if (cleanup_delay_local_nonprim) {
        config_node_property_integer_free(cleanup_delay_local_nonprim);
        cleanup_delay_local_nonprim = NULL;
    }
    if (file_threshold_local_nonprim) {
        config_node_property_integer_free(file_threshold_local_nonprim);
        file_threshold_local_nonprim = NULL;
    }
    if (mega_bytes_local_nonprim) {
        config_node_property_drop_down_free(mega_bytes_local_nonprim);
        mega_bytes_local_nonprim = NULL;
    }
    if (use_off_heap_memory_local_nonprim) {
        config_node_property_boolean_free(use_off_heap_memory_local_nonprim);
        use_off_heap_memory_local_nonprim = NULL;
    }
    if (digest_algorithm_local_nonprim) {
        config_node_property_drop_down_free(digest_algorithm_local_nonprim);
        digest_algorithm_local_nonprim = NULL;
    }
    if (monitoring_queue_size_local_nonprim) {
        config_node_property_integer_free(monitoring_queue_size_local_nonprim);
        monitoring_queue_size_local_nonprim = NULL;
    }
    if (paths_mapping_local_nonprim) {
        config_node_property_array_free(paths_mapping_local_nonprim);
        paths_mapping_local_nonprim = NULL;
    }
    if (strict_import_local_nonprim) {
        config_node_property_boolean_free(strict_import_local_nonprim);
        strict_import_local_nonprim = NULL;
    }
    return NULL;

}
