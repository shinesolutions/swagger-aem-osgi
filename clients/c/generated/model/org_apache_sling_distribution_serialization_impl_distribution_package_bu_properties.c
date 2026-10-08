#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties.h"



static org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_drop_down_t *type,
    config_node_property_string_t *format_target,
    config_node_property_string_t *temp_fs_folder,
    config_node_property_integer_t *file_threshold,
    config_node_property_drop_down_t *memory_unit,
    config_node_property_boolean_t *use_off_heap_memory,
    config_node_property_drop_down_t *digest_algorithm,
    config_node_property_integer_t *monitoring_queue_size,
    config_node_property_integer_t *cleanup_delay,
    config_node_property_array_t *package_filters,
    config_node_property_array_t *property_filters
    ) {
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var = malloc(sizeof(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t));
    if (!org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var, 0, sizeof(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t));
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->name = name;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->type = type;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->format_target = format_target;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->temp_fs_folder = temp_fs_folder;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->file_threshold = file_threshold;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->memory_unit = memory_unit;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->use_off_heap_memory = use_off_heap_memory;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->digest_algorithm = digest_algorithm;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->monitoring_queue_size = monitoring_queue_size;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->cleanup_delay = cleanup_delay;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->package_filters = package_filters;
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var->property_filters = property_filters;
    return org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_create(
    config_node_property_string_t *name,
    config_node_property_drop_down_t *type,
    config_node_property_string_t *format_target,
    config_node_property_string_t *temp_fs_folder,
    config_node_property_integer_t *file_threshold,
    config_node_property_drop_down_t *memory_unit,
    config_node_property_boolean_t *use_off_heap_memory,
    config_node_property_drop_down_t *digest_algorithm,
    config_node_property_integer_t *monitoring_queue_size,
    config_node_property_integer_t *cleanup_delay,
    config_node_property_array_t *package_filters,
    config_node_property_array_t *property_filters
    ) {
    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *result = org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_create_internal (
        name,
        type,
        format_target,
        temp_fs_folder,
        file_threshold,
        memory_unit,
        use_off_heap_memory,
        digest_algorithm,
        monitoring_queue_size,
        cleanup_delay,
        package_filters,
        property_filters
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties) {
    if(NULL == org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties){
        return ;
    }
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder) {
        config_node_property_string_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory) {
        config_node_property_boolean_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm) {
        config_node_property_drop_down_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay) {
        config_node_property_integer_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters) {
        config_node_property_array_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters = NULL;
    }
    if (org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters) {
        config_node_property_array_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters);
        org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters = NULL;
    }
    free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties);
}

cJSON *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type) {
    cJSON *type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target) {
    cJSON *format_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target);
    if(format_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "format.target", format_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder) {
    cJSON *temp_fs_folder_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder);
    if(temp_fs_folder_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tempFsFolder", temp_fs_folder_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold) {
    cJSON *file_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold);
    if(file_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fileThreshold", file_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit) {
    cJSON *memory_unit_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit);
    if(memory_unit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "memoryUnit", memory_unit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory) {
    cJSON *use_off_heap_memory_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory);
    if(use_off_heap_memory_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useOffHeapMemory", use_off_heap_memory_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm) {
    cJSON *digest_algorithm_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm);
    if(digest_algorithm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "digestAlgorithm", digest_algorithm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size) {
    cJSON *monitoring_queue_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size);
    if(monitoring_queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "monitoringQueueSize", monitoring_queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay) {
    cJSON *cleanup_delay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay);
    if(cleanup_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cleanupDelay", cleanup_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters) {
    cJSON *package_filters_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters);
    if(package_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "package.filters", package_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters
    if(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters) {
    cJSON *property_filters_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters);
    if(property_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "property.filters", property_filters_local_JSON);
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

org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_parseFromJSON(cJSON *org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON){

    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type
    config_node_property_drop_down_t *type_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target
    config_node_property_string_t *format_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder
    config_node_property_string_t *temp_fs_folder_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold
    config_node_property_integer_t *file_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit
    config_node_property_drop_down_t *memory_unit_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory
    config_node_property_boolean_t *use_off_heap_memory_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm
    config_node_property_drop_down_t *digest_algorithm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size
    config_node_property_integer_t *monitoring_queue_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay
    config_node_property_integer_t *cleanup_delay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters
    config_node_property_array_t *package_filters_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters
    config_node_property_array_t *property_filters_local_nonprim = NULL;

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = config_node_property_drop_down_parseFromJSON(type); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->format_target
    cJSON *format_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "format.target");
    if (cJSON_IsNull(format_target)) {
        format_target = NULL;
    }
    if (format_target) { 
    format_target_local_nonprim = config_node_property_string_parseFromJSON(format_target); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->temp_fs_folder
    cJSON *temp_fs_folder = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "tempFsFolder");
    if (cJSON_IsNull(temp_fs_folder)) {
        temp_fs_folder = NULL;
    }
    if (temp_fs_folder) { 
    temp_fs_folder_local_nonprim = config_node_property_string_parseFromJSON(temp_fs_folder); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->file_threshold
    cJSON *file_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "fileThreshold");
    if (cJSON_IsNull(file_threshold)) {
        file_threshold = NULL;
    }
    if (file_threshold) { 
    file_threshold_local_nonprim = config_node_property_integer_parseFromJSON(file_threshold); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->memory_unit
    cJSON *memory_unit = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "memoryUnit");
    if (cJSON_IsNull(memory_unit)) {
        memory_unit = NULL;
    }
    if (memory_unit) { 
    memory_unit_local_nonprim = config_node_property_drop_down_parseFromJSON(memory_unit); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->use_off_heap_memory
    cJSON *use_off_heap_memory = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "useOffHeapMemory");
    if (cJSON_IsNull(use_off_heap_memory)) {
        use_off_heap_memory = NULL;
    }
    if (use_off_heap_memory) { 
    use_off_heap_memory_local_nonprim = config_node_property_boolean_parseFromJSON(use_off_heap_memory); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->digest_algorithm
    cJSON *digest_algorithm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "digestAlgorithm");
    if (cJSON_IsNull(digest_algorithm)) {
        digest_algorithm = NULL;
    }
    if (digest_algorithm) { 
    digest_algorithm_local_nonprim = config_node_property_drop_down_parseFromJSON(digest_algorithm); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->monitoring_queue_size
    cJSON *monitoring_queue_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "monitoringQueueSize");
    if (cJSON_IsNull(monitoring_queue_size)) {
        monitoring_queue_size = NULL;
    }
    if (monitoring_queue_size) { 
    monitoring_queue_size_local_nonprim = config_node_property_integer_parseFromJSON(monitoring_queue_size); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->cleanup_delay
    cJSON *cleanup_delay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "cleanupDelay");
    if (cJSON_IsNull(cleanup_delay)) {
        cleanup_delay = NULL;
    }
    if (cleanup_delay) { 
    cleanup_delay_local_nonprim = config_node_property_integer_parseFromJSON(cleanup_delay); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->package_filters
    cJSON *package_filters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "package.filters");
    if (cJSON_IsNull(package_filters)) {
        package_filters = NULL;
    }
    if (package_filters) { 
    package_filters_local_nonprim = config_node_property_array_parseFromJSON(package_filters); //nonprimitive
    }

    // org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties->property_filters
    cJSON *property_filters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON, "property.filters");
    if (cJSON_IsNull(property_filters)) {
        property_filters = NULL;
    }
    if (property_filters) { 
    property_filters_local_nonprim = config_node_property_array_parseFromJSON(property_filters); //nonprimitive
    }



    org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var = org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_create_internal (
        name ? name_local_nonprim : NULL,
        type ? type_local_nonprim : NULL,
        format_target ? format_target_local_nonprim : NULL,
        temp_fs_folder ? temp_fs_folder_local_nonprim : NULL,
        file_threshold ? file_threshold_local_nonprim : NULL,
        memory_unit ? memory_unit_local_nonprim : NULL,
        use_off_heap_memory ? use_off_heap_memory_local_nonprim : NULL,
        digest_algorithm ? digest_algorithm_local_nonprim : NULL,
        monitoring_queue_size ? monitoring_queue_size_local_nonprim : NULL,
        cleanup_delay ? cleanup_delay_local_nonprim : NULL,
        package_filters ? package_filters_local_nonprim : NULL,
        property_filters ? property_filters_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        config_node_property_drop_down_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (format_target_local_nonprim) {
        config_node_property_string_free(format_target_local_nonprim);
        format_target_local_nonprim = NULL;
    }
    if (temp_fs_folder_local_nonprim) {
        config_node_property_string_free(temp_fs_folder_local_nonprim);
        temp_fs_folder_local_nonprim = NULL;
    }
    if (file_threshold_local_nonprim) {
        config_node_property_integer_free(file_threshold_local_nonprim);
        file_threshold_local_nonprim = NULL;
    }
    if (memory_unit_local_nonprim) {
        config_node_property_drop_down_free(memory_unit_local_nonprim);
        memory_unit_local_nonprim = NULL;
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
    if (cleanup_delay_local_nonprim) {
        config_node_property_integer_free(cleanup_delay_local_nonprim);
        cleanup_delay_local_nonprim = NULL;
    }
    if (package_filters_local_nonprim) {
        config_node_property_array_free(package_filters_local_nonprim);
        package_filters_local_nonprim = NULL;
    }
    if (property_filters_local_nonprim) {
        config_node_property_array_free(property_filters_local_nonprim);
        property_filters_local_nonprim = NULL;
    }
    return NULL;

}
