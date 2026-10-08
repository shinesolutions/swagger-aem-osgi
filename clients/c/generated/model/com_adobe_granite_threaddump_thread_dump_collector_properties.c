#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_threaddump_thread_dump_collector_properties.h"



static com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_create_internal(
    config_node_property_integer_t *scheduler_period,
    config_node_property_drop_down_t *scheduler_run_on,
    config_node_property_boolean_t *granite_threaddump_enabled,
    config_node_property_integer_t *granite_threaddump_dumps_per_file,
    config_node_property_boolean_t *granite_threaddump_enable_gzip_compression,
    config_node_property_boolean_t *granite_threaddump_enable_directories_compression,
    config_node_property_boolean_t *granite_threaddump_enable_j_stack,
    config_node_property_integer_t *granite_threaddump_max_backup_days,
    config_node_property_string_t *granite_threaddump_backup_clean_trigger
    ) {
    com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_local_var = malloc(sizeof(com_adobe_granite_threaddump_thread_dump_collector_properties_t));
    if (!com_adobe_granite_threaddump_thread_dump_collector_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_threaddump_thread_dump_collector_properties_local_var, 0, sizeof(com_adobe_granite_threaddump_thread_dump_collector_properties_t));
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->_library_owned = 1;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->scheduler_period = scheduler_period;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->scheduler_run_on = scheduler_run_on;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_enabled = granite_threaddump_enabled;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_dumps_per_file = granite_threaddump_dumps_per_file;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_enable_gzip_compression = granite_threaddump_enable_gzip_compression;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_enable_directories_compression = granite_threaddump_enable_directories_compression;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_enable_j_stack = granite_threaddump_enable_j_stack;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_max_backup_days = granite_threaddump_max_backup_days;
    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var->granite_threaddump_backup_clean_trigger = granite_threaddump_backup_clean_trigger;
    return com_adobe_granite_threaddump_thread_dump_collector_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_drop_down_t *scheduler_run_on,
    config_node_property_boolean_t *granite_threaddump_enabled,
    config_node_property_integer_t *granite_threaddump_dumps_per_file,
    config_node_property_boolean_t *granite_threaddump_enable_gzip_compression,
    config_node_property_boolean_t *granite_threaddump_enable_directories_compression,
    config_node_property_boolean_t *granite_threaddump_enable_j_stack,
    config_node_property_integer_t *granite_threaddump_max_backup_days,
    config_node_property_string_t *granite_threaddump_backup_clean_trigger
    ) {
    com_adobe_granite_threaddump_thread_dump_collector_properties_t *result = com_adobe_granite_threaddump_thread_dump_collector_properties_create_internal (
        scheduler_period,
        scheduler_run_on,
        granite_threaddump_enabled,
        granite_threaddump_dumps_per_file,
        granite_threaddump_enable_gzip_compression,
        granite_threaddump_enable_directories_compression,
        granite_threaddump_enable_j_stack,
        granite_threaddump_max_backup_days,
        granite_threaddump_backup_clean_trigger
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_threaddump_thread_dump_collector_properties_free(com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties) {
    if(NULL == com_adobe_granite_threaddump_thread_dump_collector_properties){
        return ;
    }
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_threaddump_thread_dump_collector_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period) {
        config_node_property_integer_free(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period);
        com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on) {
        config_node_property_drop_down_free(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on);
        com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled) {
        config_node_property_boolean_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file) {
        config_node_property_integer_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression) {
        config_node_property_boolean_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression) {
        config_node_property_boolean_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack) {
        config_node_property_boolean_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days) {
        config_node_property_integer_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days = NULL;
    }
    if (com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger) {
        config_node_property_string_free(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger);
        com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger = NULL;
    }
    free(com_adobe_granite_threaddump_thread_dump_collector_properties);
}

cJSON *com_adobe_granite_threaddump_thread_dump_collector_properties_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period) {
    cJSON *scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period);
    if(scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.period", scheduler_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on) {
    cJSON *scheduler_run_on_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on);
    if(scheduler_run_on_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.runOn", scheduler_run_on_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled) {
    cJSON *granite_threaddump_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled);
    if(granite_threaddump_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.enabled", granite_threaddump_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file) {
    cJSON *granite_threaddump_dumps_per_file_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file);
    if(granite_threaddump_dumps_per_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.dumpsPerFile", granite_threaddump_dumps_per_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression) {
    cJSON *granite_threaddump_enable_gzip_compression_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression);
    if(granite_threaddump_enable_gzip_compression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.enableGzipCompression", granite_threaddump_enable_gzip_compression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression) {
    cJSON *granite_threaddump_enable_directories_compression_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression);
    if(granite_threaddump_enable_directories_compression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.enableDirectoriesCompression", granite_threaddump_enable_directories_compression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack) {
    cJSON *granite_threaddump_enable_j_stack_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack);
    if(granite_threaddump_enable_j_stack_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.enableJStack", granite_threaddump_enable_j_stack_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days) {
    cJSON *granite_threaddump_max_backup_days_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days);
    if(granite_threaddump_max_backup_days_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.maxBackupDays", granite_threaddump_max_backup_days_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger
    if(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger) {
    cJSON *granite_threaddump_backup_clean_trigger_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger);
    if(granite_threaddump_backup_clean_trigger_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite.threaddump.backupCleanTrigger", granite_threaddump_backup_clean_trigger_local_JSON);
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

com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_parseFromJSON(cJSON *com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON){

    com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period
    config_node_property_integer_t *scheduler_period_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on
    config_node_property_drop_down_t *scheduler_run_on_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled
    config_node_property_boolean_t *granite_threaddump_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file
    config_node_property_integer_t *granite_threaddump_dumps_per_file_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression
    config_node_property_boolean_t *granite_threaddump_enable_gzip_compression_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression
    config_node_property_boolean_t *granite_threaddump_enable_directories_compression_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack
    config_node_property_boolean_t *granite_threaddump_enable_j_stack_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days
    config_node_property_integer_t *granite_threaddump_max_backup_days_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger
    config_node_property_string_t *granite_threaddump_backup_clean_trigger_local_nonprim = NULL;

    // com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_period
    cJSON *scheduler_period = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "scheduler.period");
    if (cJSON_IsNull(scheduler_period)) {
        scheduler_period = NULL;
    }
    if (scheduler_period) { 
    scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(scheduler_period); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->scheduler_run_on
    cJSON *scheduler_run_on = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "scheduler.runOn");
    if (cJSON_IsNull(scheduler_run_on)) {
        scheduler_run_on = NULL;
    }
    if (scheduler_run_on) { 
    scheduler_run_on_local_nonprim = config_node_property_drop_down_parseFromJSON(scheduler_run_on); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enabled
    cJSON *granite_threaddump_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.enabled");
    if (cJSON_IsNull(granite_threaddump_enabled)) {
        granite_threaddump_enabled = NULL;
    }
    if (granite_threaddump_enabled) { 
    granite_threaddump_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(granite_threaddump_enabled); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_dumps_per_file
    cJSON *granite_threaddump_dumps_per_file = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.dumpsPerFile");
    if (cJSON_IsNull(granite_threaddump_dumps_per_file)) {
        granite_threaddump_dumps_per_file = NULL;
    }
    if (granite_threaddump_dumps_per_file) { 
    granite_threaddump_dumps_per_file_local_nonprim = config_node_property_integer_parseFromJSON(granite_threaddump_dumps_per_file); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_gzip_compression
    cJSON *granite_threaddump_enable_gzip_compression = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.enableGzipCompression");
    if (cJSON_IsNull(granite_threaddump_enable_gzip_compression)) {
        granite_threaddump_enable_gzip_compression = NULL;
    }
    if (granite_threaddump_enable_gzip_compression) { 
    granite_threaddump_enable_gzip_compression_local_nonprim = config_node_property_boolean_parseFromJSON(granite_threaddump_enable_gzip_compression); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_directories_compression
    cJSON *granite_threaddump_enable_directories_compression = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.enableDirectoriesCompression");
    if (cJSON_IsNull(granite_threaddump_enable_directories_compression)) {
        granite_threaddump_enable_directories_compression = NULL;
    }
    if (granite_threaddump_enable_directories_compression) { 
    granite_threaddump_enable_directories_compression_local_nonprim = config_node_property_boolean_parseFromJSON(granite_threaddump_enable_directories_compression); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_enable_j_stack
    cJSON *granite_threaddump_enable_j_stack = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.enableJStack");
    if (cJSON_IsNull(granite_threaddump_enable_j_stack)) {
        granite_threaddump_enable_j_stack = NULL;
    }
    if (granite_threaddump_enable_j_stack) { 
    granite_threaddump_enable_j_stack_local_nonprim = config_node_property_boolean_parseFromJSON(granite_threaddump_enable_j_stack); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_max_backup_days
    cJSON *granite_threaddump_max_backup_days = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.maxBackupDays");
    if (cJSON_IsNull(granite_threaddump_max_backup_days)) {
        granite_threaddump_max_backup_days = NULL;
    }
    if (granite_threaddump_max_backup_days) { 
    granite_threaddump_max_backup_days_local_nonprim = config_node_property_integer_parseFromJSON(granite_threaddump_max_backup_days); //nonprimitive
    }

    // com_adobe_granite_threaddump_thread_dump_collector_properties->granite_threaddump_backup_clean_trigger
    cJSON *granite_threaddump_backup_clean_trigger = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON, "granite.threaddump.backupCleanTrigger");
    if (cJSON_IsNull(granite_threaddump_backup_clean_trigger)) {
        granite_threaddump_backup_clean_trigger = NULL;
    }
    if (granite_threaddump_backup_clean_trigger) { 
    granite_threaddump_backup_clean_trigger_local_nonprim = config_node_property_string_parseFromJSON(granite_threaddump_backup_clean_trigger); //nonprimitive
    }



    com_adobe_granite_threaddump_thread_dump_collector_properties_local_var = com_adobe_granite_threaddump_thread_dump_collector_properties_create_internal (
        scheduler_period ? scheduler_period_local_nonprim : NULL,
        scheduler_run_on ? scheduler_run_on_local_nonprim : NULL,
        granite_threaddump_enabled ? granite_threaddump_enabled_local_nonprim : NULL,
        granite_threaddump_dumps_per_file ? granite_threaddump_dumps_per_file_local_nonprim : NULL,
        granite_threaddump_enable_gzip_compression ? granite_threaddump_enable_gzip_compression_local_nonprim : NULL,
        granite_threaddump_enable_directories_compression ? granite_threaddump_enable_directories_compression_local_nonprim : NULL,
        granite_threaddump_enable_j_stack ? granite_threaddump_enable_j_stack_local_nonprim : NULL,
        granite_threaddump_max_backup_days ? granite_threaddump_max_backup_days_local_nonprim : NULL,
        granite_threaddump_backup_clean_trigger ? granite_threaddump_backup_clean_trigger_local_nonprim : NULL
        );

    if (!com_adobe_granite_threaddump_thread_dump_collector_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_threaddump_thread_dump_collector_properties_local_var;
end:
    if (scheduler_period_local_nonprim) {
        config_node_property_integer_free(scheduler_period_local_nonprim);
        scheduler_period_local_nonprim = NULL;
    }
    if (scheduler_run_on_local_nonprim) {
        config_node_property_drop_down_free(scheduler_run_on_local_nonprim);
        scheduler_run_on_local_nonprim = NULL;
    }
    if (granite_threaddump_enabled_local_nonprim) {
        config_node_property_boolean_free(granite_threaddump_enabled_local_nonprim);
        granite_threaddump_enabled_local_nonprim = NULL;
    }
    if (granite_threaddump_dumps_per_file_local_nonprim) {
        config_node_property_integer_free(granite_threaddump_dumps_per_file_local_nonprim);
        granite_threaddump_dumps_per_file_local_nonprim = NULL;
    }
    if (granite_threaddump_enable_gzip_compression_local_nonprim) {
        config_node_property_boolean_free(granite_threaddump_enable_gzip_compression_local_nonprim);
        granite_threaddump_enable_gzip_compression_local_nonprim = NULL;
    }
    if (granite_threaddump_enable_directories_compression_local_nonprim) {
        config_node_property_boolean_free(granite_threaddump_enable_directories_compression_local_nonprim);
        granite_threaddump_enable_directories_compression_local_nonprim = NULL;
    }
    if (granite_threaddump_enable_j_stack_local_nonprim) {
        config_node_property_boolean_free(granite_threaddump_enable_j_stack_local_nonprim);
        granite_threaddump_enable_j_stack_local_nonprim = NULL;
    }
    if (granite_threaddump_max_backup_days_local_nonprim) {
        config_node_property_integer_free(granite_threaddump_max_backup_days_local_nonprim);
        granite_threaddump_max_backup_days_local_nonprim = NULL;
    }
    if (granite_threaddump_backup_clean_trigger_local_nonprim) {
        config_node_property_string_free(granite_threaddump_backup_clean_trigger_local_nonprim);
        granite_threaddump_backup_clean_trigger_local_nonprim = NULL;
    }
    return NULL;

}
