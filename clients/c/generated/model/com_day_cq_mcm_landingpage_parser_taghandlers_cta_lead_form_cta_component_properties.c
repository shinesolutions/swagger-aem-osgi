#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties.h"



static com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_create_internal(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *tagpattern
    ) {
    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var = malloc(sizeof(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t));
    if (!com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var, 0, sizeof(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t));
    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var->_library_owned = 1;
    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var->service_ranking = service_ranking;
    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var->tagpattern = tagpattern;
    return com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *tagpattern
    ) {
    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *result = com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_create_internal (
        service_ranking,
        tagpattern
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_free(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties) {
    if(NULL == com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties){
        return ;
    }
    if(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking) {
        config_node_property_integer_free(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking);
        com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking = NULL;
    }
    if (com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern) {
        config_node_property_string_free(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern);
        com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern = NULL;
    }
    free(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties);
}

cJSON *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_convertToJSON(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking
    if(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern
    if(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern) {
    cJSON *tagpattern_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern);
    if(tagpattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tagpattern", tagpattern_local_JSON);
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

com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_parseFromJSON(cJSON *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_propertiesJSON){

    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_t *com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var = NULL;

    // define the local variable for com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern
    config_node_property_string_t *tagpattern_local_nonprim = NULL;

    // com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties->tagpattern
    cJSON *tagpattern = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_propertiesJSON, "tagpattern");
    if (cJSON_IsNull(tagpattern)) {
        tagpattern = NULL;
    }
    if (tagpattern) { 
    tagpattern_local_nonprim = config_node_property_string_parseFromJSON(tagpattern); //nonprimitive
    }



    com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var = com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        tagpattern ? tagpattern_local_nonprim : NULL
        );

    if (!com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var) {
        goto end;
    }

    return com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (tagpattern_local_nonprim) {
        config_node_property_string_free(tagpattern_local_nonprim);
        tagpattern_local_nonprim = NULL;
    }
    return NULL;

}
