#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_agent_manager_impl_properties.h"



static com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties_create_internal(
    config_node_property_string_t *job_topics,
    config_node_property_string_t *service_user_target,
    config_node_property_string_t *agent_provider_target
    ) {
    com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_agent_manager_impl_properties_t));
    if (!com_day_cq_replication_impl_agent_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_agent_manager_impl_properties_local_var, 0, sizeof(com_day_cq_replication_impl_agent_manager_impl_properties_t));
    com_day_cq_replication_impl_agent_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_agent_manager_impl_properties_local_var->job_topics = job_topics;
    com_day_cq_replication_impl_agent_manager_impl_properties_local_var->service_user_target = service_user_target;
    com_day_cq_replication_impl_agent_manager_impl_properties_local_var->agent_provider_target = agent_provider_target;
    return com_day_cq_replication_impl_agent_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties_create(
    config_node_property_string_t *job_topics,
    config_node_property_string_t *service_user_target,
    config_node_property_string_t *agent_provider_target
    ) {
    com_day_cq_replication_impl_agent_manager_impl_properties_t *result = com_day_cq_replication_impl_agent_manager_impl_properties_create_internal (
        job_topics,
        service_user_target,
        agent_provider_target
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_agent_manager_impl_properties_free(com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties) {
    if(NULL == com_day_cq_replication_impl_agent_manager_impl_properties){
        return ;
    }
    if(com_day_cq_replication_impl_agent_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_agent_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_agent_manager_impl_properties->job_topics) {
        config_node_property_string_free(com_day_cq_replication_impl_agent_manager_impl_properties->job_topics);
        com_day_cq_replication_impl_agent_manager_impl_properties->job_topics = NULL;
    }
    if (com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target) {
        config_node_property_string_free(com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target);
        com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target = NULL;
    }
    if (com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target) {
        config_node_property_string_free(com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target);
        com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target = NULL;
    }
    free(com_day_cq_replication_impl_agent_manager_impl_properties);
}

cJSON *com_day_cq_replication_impl_agent_manager_impl_properties_convertToJSON(com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_agent_manager_impl_properties->job_topics
    if(com_day_cq_replication_impl_agent_manager_impl_properties->job_topics) {
    cJSON *job_topics_local_JSON = config_node_property_string_convertToJSON(com_day_cq_replication_impl_agent_manager_impl_properties->job_topics);
    if(job_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "job.topics", job_topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target
    if(com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target) {
    cJSON *service_user_target_local_JSON = config_node_property_string_convertToJSON(com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target);
    if(service_user_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceUser.target", service_user_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target
    if(com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target) {
    cJSON *agent_provider_target_local_JSON = config_node_property_string_convertToJSON(com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target);
    if(agent_provider_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agentProvider.target", agent_provider_target_local_JSON);
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

com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_agent_manager_impl_propertiesJSON){

    com_day_cq_replication_impl_agent_manager_impl_properties_t *com_day_cq_replication_impl_agent_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_agent_manager_impl_properties->job_topics
    config_node_property_string_t *job_topics_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target
    config_node_property_string_t *service_user_target_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target
    config_node_property_string_t *agent_provider_target_local_nonprim = NULL;

    // com_day_cq_replication_impl_agent_manager_impl_properties->job_topics
    cJSON *job_topics = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_agent_manager_impl_propertiesJSON, "job.topics");
    if (cJSON_IsNull(job_topics)) {
        job_topics = NULL;
    }
    if (job_topics) { 
    job_topics_local_nonprim = config_node_property_string_parseFromJSON(job_topics); //nonprimitive
    }

    // com_day_cq_replication_impl_agent_manager_impl_properties->service_user_target
    cJSON *service_user_target = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_agent_manager_impl_propertiesJSON, "serviceUser.target");
    if (cJSON_IsNull(service_user_target)) {
        service_user_target = NULL;
    }
    if (service_user_target) { 
    service_user_target_local_nonprim = config_node_property_string_parseFromJSON(service_user_target); //nonprimitive
    }

    // com_day_cq_replication_impl_agent_manager_impl_properties->agent_provider_target
    cJSON *agent_provider_target = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_agent_manager_impl_propertiesJSON, "agentProvider.target");
    if (cJSON_IsNull(agent_provider_target)) {
        agent_provider_target = NULL;
    }
    if (agent_provider_target) { 
    agent_provider_target_local_nonprim = config_node_property_string_parseFromJSON(agent_provider_target); //nonprimitive
    }



    com_day_cq_replication_impl_agent_manager_impl_properties_local_var = com_day_cq_replication_impl_agent_manager_impl_properties_create_internal (
        job_topics ? job_topics_local_nonprim : NULL,
        service_user_target ? service_user_target_local_nonprim : NULL,
        agent_provider_target ? agent_provider_target_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_agent_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_agent_manager_impl_properties_local_var;
end:
    if (job_topics_local_nonprim) {
        config_node_property_string_free(job_topics_local_nonprim);
        job_topics_local_nonprim = NULL;
    }
    if (service_user_target_local_nonprim) {
        config_node_property_string_free(service_user_target_local_nonprim);
        service_user_target_local_nonprim = NULL;
    }
    if (agent_provider_target_local_nonprim) {
        config_node_property_string_free(agent_provider_target_local_nonprim);
        agent_provider_target_local_nonprim = NULL;
    }
    return NULL;

}
