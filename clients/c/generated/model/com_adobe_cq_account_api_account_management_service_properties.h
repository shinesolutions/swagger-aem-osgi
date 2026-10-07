/*
 * com_adobe_cq_account_api_account_management_service_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_account_api_account_management_service_properties_H_
#define _com_adobe_cq_account_api_account_management_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_account_api_account_management_service_properties_t com_adobe_cq_account_api_account_management_service_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_account_api_account_management_service_properties_t {
    struct config_node_property_integer_t *cq_accountmanager_token_validity_period; //model
    struct config_node_property_string_t *cq_accountmanager_config_requestnewaccount_mail; //model
    struct config_node_property_string_t *cq_accountmanager_config_requestnewpwd_mail; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_account_api_account_management_service_properties_t;

__attribute__((deprecated)) com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_create(
    config_node_property_integer_t *cq_accountmanager_token_validity_period,
    config_node_property_string_t *cq_accountmanager_config_requestnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_requestnewpwd_mail
);

void com_adobe_cq_account_api_account_management_service_properties_free(com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties);

com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties_parseFromJSON(cJSON *com_adobe_cq_account_api_account_management_service_propertiesJSON);

cJSON *com_adobe_cq_account_api_account_management_service_properties_convertToJSON(com_adobe_cq_account_api_account_management_service_properties_t *com_adobe_cq_account_api_account_management_service_properties);

#endif /* _com_adobe_cq_account_api_account_management_service_properties_H_ */

