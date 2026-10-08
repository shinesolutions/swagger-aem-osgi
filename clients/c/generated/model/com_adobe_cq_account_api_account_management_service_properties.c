#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_account_api_account_management_service_properties.h"



static com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_create_internal(
    config_node_property_integer_t *cq_accountmanager_token_validity_period,
    config_node_property_string_t *cq_accountmanager_config_requestnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_requestnewpwd_mail
    ) {
    com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_local_var = malloc(sizeof(com_adobe_cq_account_api_account_management_service_properties_t));
    if (!com_adobe_cq_account_api_account_management_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_account_api_account_management_service_properties_local_var, 0, sizeof(com_adobe_cq_account_api_account_management_service_properties_t));
    com_adobe_cq_account_api_account_management_service_properties_local_var->_library_owned = 1;
    com_adobe_cq_account_api_account_management_service_properties_local_var->cq_accountmanager_token_validity_period = cq_accountmanager_token_validity_period;
    com_adobe_cq_account_api_account_management_service_properties_local_var->cq_accountmanager_config_requestnewaccount_mail = cq_accountmanager_config_requestnewaccount_mail;
    com_adobe_cq_account_api_account_management_service_properties_local_var->cq_accountmanager_config_requestnewpwd_mail = cq_accountmanager_config_requestnewpwd_mail;
    return com_adobe_cq_account_api_account_management_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_create(
    config_node_property_integer_t *cq_accountmanager_token_validity_period,
    config_node_property_string_t *cq_accountmanager_config_requestnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_requestnewpwd_mail
    ) {
    com_adobe_cq_account_api_account_management_service_properties_t *result = com_adobe_cq_account_api_account_management_service_properties_create_internal (
        cq_accountmanager_token_validity_period,
        cq_accountmanager_config_requestnewaccount_mail,
        cq_accountmanager_config_requestnewpwd_mail
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_account_api_account_management_service_properties_free(com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties) {
    if(NULL == com_adobe_cq_account_api_account_management_service_properties){
        return ;
    }
    if(com_adobe_cq_account_api_account_management_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_account_api_account_management_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period) {
        config_node_property_integer_free(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period);
        com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period = NULL;
    }
    if (com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail) {
        config_node_property_string_free(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail);
        com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail = NULL;
    }
    if (com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail) {
        config_node_property_string_free(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail);
        com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail = NULL;
    }
    free(com_adobe_cq_account_api_account_management_service_properties);
}

cJSON *com_adobe_cq_account_api_account_management_service_properties_convertToJSON(com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period
    if(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period) {
    cJSON *cq_accountmanager_token_validity_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period);
    if(cq_accountmanager_token_validity_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.accountmanager.token.validity.period", cq_accountmanager_token_validity_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail
    if(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail) {
    cJSON *cq_accountmanager_config_requestnewaccount_mail_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail);
    if(cq_accountmanager_config_requestnewaccount_mail_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.accountmanager.config.requestnewaccount.mail", cq_accountmanager_config_requestnewaccount_mail_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail
    if(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail) {
    cJSON *cq_accountmanager_config_requestnewpwd_mail_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail);
    if(cq_accountmanager_config_requestnewpwd_mail_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.accountmanager.config.requestnewpwd.mail", cq_accountmanager_config_requestnewpwd_mail_local_JSON);
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

com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_parseFromJSON(cJSON *com_adobe_cq_account_api_account_management_service_propertiesJSON){

    com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period
    config_node_property_integer_t *cq_accountmanager_token_validity_period_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail
    config_node_property_string_t *cq_accountmanager_config_requestnewaccount_mail_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail
    config_node_property_string_t *cq_accountmanager_config_requestnewpwd_mail_local_nonprim = NULL;

    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_token_validity_period
    cJSON *cq_accountmanager_token_validity_period = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_account_api_account_management_service_propertiesJSON, "cq.accountmanager.token.validity.period");
    if (cJSON_IsNull(cq_accountmanager_token_validity_period)) {
        cq_accountmanager_token_validity_period = NULL;
    }
    if (cq_accountmanager_token_validity_period) { 
    cq_accountmanager_token_validity_period_local_nonprim = config_node_property_integer_parseFromJSON(cq_accountmanager_token_validity_period); //nonprimitive
    }

    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewaccount_mail
    cJSON *cq_accountmanager_config_requestnewaccount_mail = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_account_api_account_management_service_propertiesJSON, "cq.accountmanager.config.requestnewaccount.mail");
    if (cJSON_IsNull(cq_accountmanager_config_requestnewaccount_mail)) {
        cq_accountmanager_config_requestnewaccount_mail = NULL;
    }
    if (cq_accountmanager_config_requestnewaccount_mail) { 
    cq_accountmanager_config_requestnewaccount_mail_local_nonprim = config_node_property_string_parseFromJSON(cq_accountmanager_config_requestnewaccount_mail); //nonprimitive
    }

    // com_adobe_cq_account_api_account_management_service_properties->cq_accountmanager_config_requestnewpwd_mail
    cJSON *cq_accountmanager_config_requestnewpwd_mail = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_account_api_account_management_service_propertiesJSON, "cq.accountmanager.config.requestnewpwd.mail");
    if (cJSON_IsNull(cq_accountmanager_config_requestnewpwd_mail)) {
        cq_accountmanager_config_requestnewpwd_mail = NULL;
    }
    if (cq_accountmanager_config_requestnewpwd_mail) { 
    cq_accountmanager_config_requestnewpwd_mail_local_nonprim = config_node_property_string_parseFromJSON(cq_accountmanager_config_requestnewpwd_mail); //nonprimitive
    }



    com_adobe_cq_account_api_account_management_service_properties_local_var = com_adobe_cq_account_api_account_management_service_properties_create_internal (
        cq_accountmanager_token_validity_period ? cq_accountmanager_token_validity_period_local_nonprim : NULL,
        cq_accountmanager_config_requestnewaccount_mail ? cq_accountmanager_config_requestnewaccount_mail_local_nonprim : NULL,
        cq_accountmanager_config_requestnewpwd_mail ? cq_accountmanager_config_requestnewpwd_mail_local_nonprim : NULL
        );

    if (!com_adobe_cq_account_api_account_management_service_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_account_api_account_management_service_properties_local_var;
end:
    if (cq_accountmanager_token_validity_period_local_nonprim) {
        config_node_property_integer_free(cq_accountmanager_token_validity_period_local_nonprim);
        cq_accountmanager_token_validity_period_local_nonprim = NULL;
    }
    if (cq_accountmanager_config_requestnewaccount_mail_local_nonprim) {
        config_node_property_string_free(cq_accountmanager_config_requestnewaccount_mail_local_nonprim);
        cq_accountmanager_config_requestnewaccount_mail_local_nonprim = NULL;
    }
    if (cq_accountmanager_config_requestnewpwd_mail_local_nonprim) {
        config_node_property_string_free(cq_accountmanager_config_requestnewpwd_mail_local_nonprim);
        cq_accountmanager_config_requestnewpwd_mail_local_nonprim = NULL;
    }
    return NULL;

}
