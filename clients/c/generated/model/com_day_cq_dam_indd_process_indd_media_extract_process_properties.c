#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_indd_process_indd_media_extract_process_properties.h"



static com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_create_internal(
    config_node_property_string_t *process_label,
    config_node_property_string_t *cq_dam_indd_pages_regex,
    config_node_property_boolean_t *ids_job_decoupled,
    config_node_property_string_t *ids_job_workflow_model
    ) {
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var = malloc(sizeof(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t));
    if (!com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var, 0, sizeof(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t));
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var->_library_owned = 1;
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var->process_label = process_label;
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var->cq_dam_indd_pages_regex = cq_dam_indd_pages_regex;
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var->ids_job_decoupled = ids_job_decoupled;
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var->ids_job_workflow_model = ids_job_workflow_model;
    return com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_create(
    config_node_property_string_t *process_label,
    config_node_property_string_t *cq_dam_indd_pages_regex,
    config_node_property_boolean_t *ids_job_decoupled,
    config_node_property_string_t *ids_job_workflow_model
    ) {
    com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *result = com_day_cq_dam_indd_process_indd_media_extract_process_properties_create_internal (
        process_label,
        cq_dam_indd_pages_regex,
        ids_job_decoupled,
        ids_job_workflow_model
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_indd_process_indd_media_extract_process_properties_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties) {
    if(NULL == com_day_cq_dam_indd_process_indd_media_extract_process_properties){
        return ;
    }
    if(com_day_cq_dam_indd_process_indd_media_extract_process_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_indd_process_indd_media_extract_process_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label) {
        config_node_property_string_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label);
        com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label = NULL;
    }
    if (com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex) {
        config_node_property_string_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex);
        com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex = NULL;
    }
    if (com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled) {
        config_node_property_boolean_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled);
        com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled = NULL;
    }
    if (com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model) {
        config_node_property_string_free(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model);
        com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model = NULL;
    }
    free(com_day_cq_dam_indd_process_indd_media_extract_process_properties);
}

cJSON *com_day_cq_dam_indd_process_indd_media_extract_process_properties_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label
    if(com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label) {
    cJSON *process_label_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label);
    if(process_label_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process.label", process_label_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex
    if(com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex) {
    cJSON *cq_dam_indd_pages_regex_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex);
    if(cq_dam_indd_pages_regex_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.indd.pages.regex", cq_dam_indd_pages_regex_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled
    if(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled) {
    cJSON *ids_job_decoupled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled);
    if(ids_job_decoupled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ids.job.decoupled", ids_job_decoupled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model
    if(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model) {
    cJSON *ids_job_workflow_model_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model);
    if(ids_job_workflow_model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ids.job.workflow.model", ids_job_workflow_model_local_JSON);
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

com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_parseFromJSON(cJSON *com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON){

    com_day_cq_dam_indd_process_indd_media_extract_process_properties_t *com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label
    config_node_property_string_t *process_label_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex
    config_node_property_string_t *cq_dam_indd_pages_regex_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled
    config_node_property_boolean_t *ids_job_decoupled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model
    config_node_property_string_t *ids_job_workflow_model_local_nonprim = NULL;

    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->process_label
    cJSON *process_label = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON, "process.label");
    if (cJSON_IsNull(process_label)) {
        process_label = NULL;
    }
    if (process_label) { 
    process_label_local_nonprim = config_node_property_string_parseFromJSON(process_label); //nonprimitive
    }

    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->cq_dam_indd_pages_regex
    cJSON *cq_dam_indd_pages_regex = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON, "cq.dam.indd.pages.regex");
    if (cJSON_IsNull(cq_dam_indd_pages_regex)) {
        cq_dam_indd_pages_regex = NULL;
    }
    if (cq_dam_indd_pages_regex) { 
    cq_dam_indd_pages_regex_local_nonprim = config_node_property_string_parseFromJSON(cq_dam_indd_pages_regex); //nonprimitive
    }

    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_decoupled
    cJSON *ids_job_decoupled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON, "ids.job.decoupled");
    if (cJSON_IsNull(ids_job_decoupled)) {
        ids_job_decoupled = NULL;
    }
    if (ids_job_decoupled) { 
    ids_job_decoupled_local_nonprim = config_node_property_boolean_parseFromJSON(ids_job_decoupled); //nonprimitive
    }

    // com_day_cq_dam_indd_process_indd_media_extract_process_properties->ids_job_workflow_model
    cJSON *ids_job_workflow_model = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_process_indd_media_extract_process_propertiesJSON, "ids.job.workflow.model");
    if (cJSON_IsNull(ids_job_workflow_model)) {
        ids_job_workflow_model = NULL;
    }
    if (ids_job_workflow_model) { 
    ids_job_workflow_model_local_nonprim = config_node_property_string_parseFromJSON(ids_job_workflow_model); //nonprimitive
    }



    com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var = com_day_cq_dam_indd_process_indd_media_extract_process_properties_create_internal (
        process_label ? process_label_local_nonprim : NULL,
        cq_dam_indd_pages_regex ? cq_dam_indd_pages_regex_local_nonprim : NULL,
        ids_job_decoupled ? ids_job_decoupled_local_nonprim : NULL,
        ids_job_workflow_model ? ids_job_workflow_model_local_nonprim : NULL
        );

    if (!com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_indd_process_indd_media_extract_process_properties_local_var;
end:
    if (process_label_local_nonprim) {
        config_node_property_string_free(process_label_local_nonprim);
        process_label_local_nonprim = NULL;
    }
    if (cq_dam_indd_pages_regex_local_nonprim) {
        config_node_property_string_free(cq_dam_indd_pages_regex_local_nonprim);
        cq_dam_indd_pages_regex_local_nonprim = NULL;
    }
    if (ids_job_decoupled_local_nonprim) {
        config_node_property_boolean_free(ids_job_decoupled_local_nonprim);
        ids_job_decoupled_local_nonprim = NULL;
    }
    if (ids_job_workflow_model_local_nonprim) {
        config_node_property_string_free(ids_job_workflow_model_local_nonprim);
        ids_job_workflow_model_local_nonprim = NULL;
    }
    return NULL;

}
