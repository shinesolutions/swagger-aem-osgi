/*
 * com_adobe_cq_account_impl_account_management_servlet_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_account_impl_account_management_servlet_properties_H_
#define _com_adobe_cq_account_impl_account_management_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_account_impl_account_management_servlet_properties_t com_adobe_cq_account_impl_account_management_servlet_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_cq_account_impl_account_management_servlet_properties_t {
    struct config_node_property_string_t *cq_accountmanager_config_informnewaccount_mail; //model
    struct config_node_property_string_t *cq_accountmanager_config_informnewpwd_mail; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_account_impl_account_management_servlet_properties_t;

__attribute__((deprecated)) com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_create(
    config_node_property_string_t *cq_accountmanager_config_informnewaccount_mail,
    config_node_property_string_t *cq_accountmanager_config_informnewpwd_mail
);

void com_adobe_cq_account_impl_account_management_servlet_properties_free(com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties);

com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_account_impl_account_management_servlet_propertiesJSON);

cJSON *com_adobe_cq_account_impl_account_management_servlet_properties_convertToJSON(com_adobe_cq_account_impl_account_management_servlet_properties_t *com_adobe_cq_account_impl_account_management_servlet_properties);

#endif /* _com_adobe_cq_account_impl_account_management_servlet_properties_H_ */

