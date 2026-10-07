#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties.h"



static com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_create_internal(
    config_node_property_string_t *job_topics
    ) {
    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var = malloc(sizeof(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t));
    if (!com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var, 0, sizeof(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t));
    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var->_library_owned = 1;
    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var->job_topics = job_topics;
    return com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_create(
    config_node_property_string_t *job_topics
    ) {
    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *result = com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_create_internal (
        job_topics
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_free(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties) {
    if(NULL == com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties){
        return ;
    }
    if(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics) {
        config_node_property_string_free(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics);
        com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics = NULL;
    }
    free(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties);
}

cJSON *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_convertToJSON(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics
    if(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics) {
    cJSON *job_topics_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics);
    if(job_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.topics", job_topics_local_JSON);
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

com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_parseFromJSON(cJSON *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_propertiesJSON){

    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_t *com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics
    config_node_property_string_t *job_topics_local_nonprim = NULL;

    // com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties->job_topics
    cJSON *job_topics = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_propertiesJSON, "job.topics");
    if (cJSON_IsNull(job_topics)) {
        job_topics = NULL;
    }
    if (job_topics) { 
    job_topics_local_nonprim = config_node_property_string_parseFromJSON(job_topics); //nonprimitive
    }



    com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var = com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_create_internal (
        job_topics ? job_topics_local_nonprim : NULL
        );

    if (!com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties_local_var;
end:
    if (job_topics_local_nonprim) {
        config_node_property_string_free(job_topics_local_nonprim);
        job_topics_local_nonprim = NULL;
    }
    return NULL;

}
