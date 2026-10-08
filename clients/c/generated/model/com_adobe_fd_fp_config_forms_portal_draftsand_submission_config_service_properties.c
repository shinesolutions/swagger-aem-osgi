#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties.h"



static com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_create_internal(
    config_node_property_array_t *portal_outboxes,
    config_node_property_string_t *draft_data_service,
    config_node_property_string_t *draft_metadata_service,
    config_node_property_string_t *submit_data_service,
    config_node_property_string_t *submit_metadata_service,
    config_node_property_string_t *pending_sign_data_service,
    config_node_property_string_t *pending_sign_metadata_service
    ) {
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var = malloc(sizeof(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t));
    if (!com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var, 0, sizeof(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t));
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->_library_owned = 1;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->portal_outboxes = portal_outboxes;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->draft_data_service = draft_data_service;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->draft_metadata_service = draft_metadata_service;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->submit_data_service = submit_data_service;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->submit_metadata_service = submit_metadata_service;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->pending_sign_data_service = pending_sign_data_service;
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var->pending_sign_metadata_service = pending_sign_metadata_service;
    return com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_create(
    config_node_property_array_t *portal_outboxes,
    config_node_property_string_t *draft_data_service,
    config_node_property_string_t *draft_metadata_service,
    config_node_property_string_t *submit_data_service,
    config_node_property_string_t *submit_metadata_service,
    config_node_property_string_t *pending_sign_data_service,
    config_node_property_string_t *pending_sign_metadata_service
    ) {
    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *result = com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_create_internal (
        portal_outboxes,
        draft_data_service,
        draft_metadata_service,
        submit_data_service,
        submit_metadata_service,
        pending_sign_data_service,
        pending_sign_metadata_service
        );
    if (!result) {
    }
    return result;
}

void com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties) {
    if(NULL == com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties){
        return ;
    }
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes) {
        config_node_property_array_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service = NULL;
    }
    if (com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service) {
        config_node_property_string_free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service);
        com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service = NULL;
    }
    free(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties);
}

cJSON *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes) {
    cJSON *portal_outboxes_local_JSON = config_node_property_array_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes);
    if(portal_outboxes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "portal.outboxes", portal_outboxes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service) {
    cJSON *draft_data_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service);
    if(draft_data_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "draft.data.service", draft_data_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service) {
    cJSON *draft_metadata_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service);
    if(draft_metadata_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "draft.metadata.service", draft_metadata_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service) {
    cJSON *submit_data_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service);
    if(submit_data_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "submit.data.service", submit_data_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service) {
    cJSON *submit_metadata_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service);
    if(submit_metadata_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "submit.metadata.service", submit_metadata_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service) {
    cJSON *pending_sign_data_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service);
    if(pending_sign_data_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pendingSign.data.service", pending_sign_data_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service
    if(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service) {
    cJSON *pending_sign_metadata_service_local_JSON = config_node_property_string_convertToJSON(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service);
    if(pending_sign_metadata_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pendingSign.metadata.service", pending_sign_metadata_service_local_JSON);
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

com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_parseFromJSON(cJSON *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON){

    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_t *com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes
    config_node_property_array_t *portal_outboxes_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service
    config_node_property_string_t *draft_data_service_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service
    config_node_property_string_t *draft_metadata_service_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service
    config_node_property_string_t *submit_data_service_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service
    config_node_property_string_t *submit_metadata_service_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service
    config_node_property_string_t *pending_sign_data_service_local_nonprim = NULL;

    // define the local variable for com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service
    config_node_property_string_t *pending_sign_metadata_service_local_nonprim = NULL;

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->portal_outboxes
    cJSON *portal_outboxes = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "portal.outboxes");
    if (cJSON_IsNull(portal_outboxes)) {
        portal_outboxes = NULL;
    }
    if (portal_outboxes) { 
    portal_outboxes_local_nonprim = config_node_property_array_parseFromJSON(portal_outboxes); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_data_service
    cJSON *draft_data_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "draft.data.service");
    if (cJSON_IsNull(draft_data_service)) {
        draft_data_service = NULL;
    }
    if (draft_data_service) { 
    draft_data_service_local_nonprim = config_node_property_string_parseFromJSON(draft_data_service); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->draft_metadata_service
    cJSON *draft_metadata_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "draft.metadata.service");
    if (cJSON_IsNull(draft_metadata_service)) {
        draft_metadata_service = NULL;
    }
    if (draft_metadata_service) { 
    draft_metadata_service_local_nonprim = config_node_property_string_parseFromJSON(draft_metadata_service); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_data_service
    cJSON *submit_data_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "submit.data.service");
    if (cJSON_IsNull(submit_data_service)) {
        submit_data_service = NULL;
    }
    if (submit_data_service) { 
    submit_data_service_local_nonprim = config_node_property_string_parseFromJSON(submit_data_service); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->submit_metadata_service
    cJSON *submit_metadata_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "submit.metadata.service");
    if (cJSON_IsNull(submit_metadata_service)) {
        submit_metadata_service = NULL;
    }
    if (submit_metadata_service) { 
    submit_metadata_service_local_nonprim = config_node_property_string_parseFromJSON(submit_metadata_service); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_data_service
    cJSON *pending_sign_data_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "pendingSign.data.service");
    if (cJSON_IsNull(pending_sign_data_service)) {
        pending_sign_data_service = NULL;
    }
    if (pending_sign_data_service) { 
    pending_sign_data_service_local_nonprim = config_node_property_string_parseFromJSON(pending_sign_data_service); //nonprimitive
    }

    // com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties->pending_sign_metadata_service
    cJSON *pending_sign_metadata_service = cJSON_GetObjectItemCaseSensitive(com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_propertiesJSON, "pendingSign.metadata.service");
    if (cJSON_IsNull(pending_sign_metadata_service)) {
        pending_sign_metadata_service = NULL;
    }
    if (pending_sign_metadata_service) { 
    pending_sign_metadata_service_local_nonprim = config_node_property_string_parseFromJSON(pending_sign_metadata_service); //nonprimitive
    }



    com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var = com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_create_internal (
        portal_outboxes ? portal_outboxes_local_nonprim : NULL,
        draft_data_service ? draft_data_service_local_nonprim : NULL,
        draft_metadata_service ? draft_metadata_service_local_nonprim : NULL,
        submit_data_service ? submit_data_service_local_nonprim : NULL,
        submit_metadata_service ? submit_metadata_service_local_nonprim : NULL,
        pending_sign_data_service ? pending_sign_data_service_local_nonprim : NULL,
        pending_sign_metadata_service ? pending_sign_metadata_service_local_nonprim : NULL
        );

    if (!com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var) {
        goto end;
    }

    return com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties_local_var;
end:
    if (portal_outboxes_local_nonprim) {
        config_node_property_array_free(portal_outboxes_local_nonprim);
        portal_outboxes_local_nonprim = NULL;
    }
    if (draft_data_service_local_nonprim) {
        config_node_property_string_free(draft_data_service_local_nonprim);
        draft_data_service_local_nonprim = NULL;
    }
    if (draft_metadata_service_local_nonprim) {
        config_node_property_string_free(draft_metadata_service_local_nonprim);
        draft_metadata_service_local_nonprim = NULL;
    }
    if (submit_data_service_local_nonprim) {
        config_node_property_string_free(submit_data_service_local_nonprim);
        submit_data_service_local_nonprim = NULL;
    }
    if (submit_metadata_service_local_nonprim) {
        config_node_property_string_free(submit_metadata_service_local_nonprim);
        submit_metadata_service_local_nonprim = NULL;
    }
    if (pending_sign_data_service_local_nonprim) {
        config_node_property_string_free(pending_sign_data_service_local_nonprim);
        pending_sign_data_service_local_nonprim = NULL;
    }
    if (pending_sign_metadata_service_local_nonprim) {
        config_node_property_string_free(pending_sign_metadata_service_local_nonprim);
        pending_sign_metadata_service_local_nonprim = NULL;
    }
    return NULL;

}
