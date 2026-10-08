#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_account_impl_account_management_servlet_properties.h"



static com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_create_internal(
    config_node_property_string_t *cq_accountmanager_config_informnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_informnewpwd_mail
    ) {
    com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_account_impl_account_management_servlet_properties_t));
    if (!com_adobe_cq_account_impl_account_management_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_account_impl_account_management_servlet_properties_local_var, 0, sizeof(com_adobe_cq_account_impl_account_management_servlet_properties_t));
    com_adobe_cq_account_impl_account_management_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_account_impl_account_management_servlet_properties_local_var->cq_accountmanager_config_informnewaccount_mail = cq_accountmanager_config_informnewaccount_mail;
    com_adobe_cq_account_impl_account_management_servlet_properties_local_var->cq_accountmanager_config_informnewpwd_mail = cq_accountmanager_config_informnewpwd_mail;
    return com_adobe_cq_account_impl_account_management_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_create(
    config_node_property_string_t *cq_accountmanager_config_informnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_informnewpwd_mail
    ) {
    com_adobe_cq_account_impl_account_management_servlet_properties_t *result = com_adobe_cq_account_impl_account_management_servlet_properties_create_internal (
        cq_accountmanager_config_informnewaccount_mail,
        cq_accountmanager_config_informnewpwd_mail
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_account_impl_account_management_servlet_properties_free(com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties) {
    if(NULL == com_adobe_cq_account_impl_account_management_servlet_properties){
        return ;
    }
    if(com_adobe_cq_account_impl_account_management_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_account_impl_account_management_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail) {
        config_node_property_string_free(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail);
        com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail = NULL;
    }
    if (com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail) {
        config_node_property_string_free(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail);
        com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail = NULL;
    }
    free(com_adobe_cq_account_impl_account_management_servlet_properties);
}

cJSON *com_adobe_cq_account_impl_account_management_servlet_properties_convertToJSON(com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail
    if(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail) {
    cJSON *cq_accountmanager_config_informnewaccount_mail_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail);
    if(cq_accountmanager_config_informnewaccount_mail_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.accountmanager.config.informnewaccount.mail", cq_accountmanager_config_informnewaccount_mail_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail
    if(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail) {
    cJSON *cq_accountmanager_config_informnewpwd_mail_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail);
    if(cq_accountmanager_config_informnewpwd_mail_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.accountmanager.config.informnewpwd.mail", cq_accountmanager_config_informnewpwd_mail_local_JSON);
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

com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_account_impl_account_management_servlet_propertiesJSON){

    com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail
    config_node_property_string_t *cq_accountmanager_config_informnewaccount_mail_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail
    config_node_property_string_t *cq_accountmanager_config_informnewpwd_mail_local_nonprim = NULL;

    // com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewaccount_mail
    cJSON *cq_accountmanager_config_informnewaccount_mail = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_account_impl_account_management_servlet_propertiesJSON, "cq.accountmanager.config.informnewaccount.mail");
    if (cJSON_IsNull(cq_accountmanager_config_informnewaccount_mail)) {
        cq_accountmanager_config_informnewaccount_mail = NULL;
    }
    if (cq_accountmanager_config_informnewaccount_mail) { 
    cq_accountmanager_config_informnewaccount_mail_local_nonprim = config_node_property_string_parseFromJSON(cq_accountmanager_config_informnewaccount_mail); //nonprimitive
    }

    // com_adobe_cq_account_impl_account_management_servlet_properties->cq_accountmanager_config_informnewpwd_mail
    cJSON *cq_accountmanager_config_informnewpwd_mail = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_account_impl_account_management_servlet_propertiesJSON, "cq.accountmanager.config.informnewpwd.mail");
    if (cJSON_IsNull(cq_accountmanager_config_informnewpwd_mail)) {
        cq_accountmanager_config_informnewpwd_mail = NULL;
    }
    if (cq_accountmanager_config_informnewpwd_mail) { 
    cq_accountmanager_config_informnewpwd_mail_local_nonprim = config_node_property_string_parseFromJSON(cq_accountmanager_config_informnewpwd_mail); //nonprimitive
    }



    com_adobe_cq_account_impl_account_management_servlet_properties_local_var = com_adobe_cq_account_impl_account_management_servlet_properties_create_internal (
        cq_accountmanager_config_informnewaccount_mail ? cq_accountmanager_config_informnewaccount_mail_local_nonprim : NULL,
        cq_accountmanager_config_informnewpwd_mail ? cq_accountmanager_config_informnewpwd_mail_local_nonprim : NULL
        );

    if (!com_adobe_cq_account_impl_account_management_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_account_impl_account_management_servlet_properties_local_var;
end:
    if (cq_accountmanager_config_informnewaccount_mail_local_nonprim) {
        config_node_property_string_free(cq_accountmanager_config_informnewaccount_mail_local_nonprim);
        cq_accountmanager_config_informnewaccount_mail_local_nonprim = NULL;
    }
    if (cq_accountmanager_config_informnewpwd_mail_local_nonprim) {
        config_node_property_string_free(cq_accountmanager_config_informnewpwd_mail_local_nonprim);
        cq_accountmanager_config_informnewpwd_mail_local_nonprim = NULL;
    }
    return NULL;

}
