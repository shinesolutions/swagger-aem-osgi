#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_repository_service_user_configuration_properties.h"



static com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_boolean_t *serviceusers_simple_subject_population,
    config_node_property_array_t *serviceusers_list
    ) {
    com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties_local_var = malloc(sizeof(com_adobe_granite_repository_service_user_configuration_properties_t));
    if (!com_adobe_granite_repository_service_user_configuration_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_repository_service_user_configuration_properties_local_var, 0, sizeof(com_adobe_granite_repository_service_user_configuration_properties_t));
    com_adobe_granite_repository_service_user_configuration_properties_local_var->_library_owned = 1;
    com_adobe_granite_repository_service_user_configuration_properties_local_var->service_ranking = service_ranking;
    com_adobe_granite_repository_service_user_configuration_properties_local_var->serviceusers_simple_subject_population = serviceusers_simple_subject_population;
    com_adobe_granite_repository_service_user_configuration_properties_local_var->serviceusers_list = serviceusers_list;
    return com_adobe_granite_repository_service_user_configuration_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_boolean_t *serviceusers_simple_subject_population,
    config_node_property_array_t *serviceusers_list
    ) {
    com_adobe_granite_repository_service_user_configuration_properties_t *result = com_adobe_granite_repository_service_user_configuration_properties_create_internal (
        service_ranking,
        serviceusers_simple_subject_population,
        serviceusers_list
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_repository_service_user_configuration_properties_free(com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties) {
    if(NULL == com_adobe_granite_repository_service_user_configuration_properties){
        return ;
    }
    if(com_adobe_granite_repository_service_user_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_repository_service_user_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_repository_service_user_configuration_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_granite_repository_service_user_configuration_properties->service_ranking);
        com_adobe_granite_repository_service_user_configuration_properties->service_ranking = NULL;
    }
    if (com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population) {
        config_node_property_boolean_free(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population);
        com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population = NULL;
    }
    if (com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list) {
        config_node_property_array_free(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list);
        com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list = NULL;
    }
    free(com_adobe_granite_repository_service_user_configuration_properties);
}

cJSON *com_adobe_granite_repository_service_user_configuration_properties_convertToJSON(com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_repository_service_user_configuration_properties->service_ranking
    if(com_adobe_granite_repository_service_user_configuration_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_service_user_configuration_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population
    if(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population) {
    cJSON *serviceusers_simple_subject_population_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population);
    if(serviceusers_simple_subject_population_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceusers.simpleSubjectPopulation", serviceusers_simple_subject_population_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list
    if(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list) {
    cJSON *serviceusers_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list);
    if(serviceusers_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceusers.list", serviceusers_list_local_JSON);
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

com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties_parseFromJSON(cJSON *com_adobe_granite_repository_service_user_configuration_propertiesJSON){

    com_adobe_granite_repository_service_user_configuration_properties_t *com_adobe_granite_repository_service_user_configuration_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_repository_service_user_configuration_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population
    config_node_property_boolean_t *serviceusers_simple_subject_population_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list
    config_node_property_array_t *serviceusers_list_local_nonprim = NULL;

    // com_adobe_granite_repository_service_user_configuration_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_service_user_configuration_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_granite_repository_service_user_configuration_properties->serviceusers_simple_subject_population
    cJSON *serviceusers_simple_subject_population = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_service_user_configuration_propertiesJSON, "serviceusers.simpleSubjectPopulation");
    if (cJSON_IsNull(serviceusers_simple_subject_population)) {
        serviceusers_simple_subject_population = NULL;
    }
    if (serviceusers_simple_subject_population) { 
    serviceusers_simple_subject_population_local_nonprim = config_node_property_boolean_parseFromJSON(serviceusers_simple_subject_population); //nonprimitive
    }

    // com_adobe_granite_repository_service_user_configuration_properties->serviceusers_list
    cJSON *serviceusers_list = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_service_user_configuration_propertiesJSON, "serviceusers.list");
    if (cJSON_IsNull(serviceusers_list)) {
        serviceusers_list = NULL;
    }
    if (serviceusers_list) { 
    serviceusers_list_local_nonprim = config_node_property_array_parseFromJSON(serviceusers_list); //nonprimitive
    }



    com_adobe_granite_repository_service_user_configuration_properties_local_var = com_adobe_granite_repository_service_user_configuration_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        serviceusers_simple_subject_population ? serviceusers_simple_subject_population_local_nonprim : NULL,
        serviceusers_list ? serviceusers_list_local_nonprim : NULL
        );

    if (!com_adobe_granite_repository_service_user_configuration_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_repository_service_user_configuration_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (serviceusers_simple_subject_population_local_nonprim) {
        config_node_property_boolean_free(serviceusers_simple_subject_population_local_nonprim);
        serviceusers_simple_subject_population_local_nonprim = NULL;
    }
    if (serviceusers_list_local_nonprim) {
        config_node_property_array_free(serviceusers_list_local_nonprim);
        serviceusers_list_local_nonprim = NULL;
    }
    return NULL;

}
