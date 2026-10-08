/*
 * com_day_cq_mailer_default_mail_service_properties.h
 *
 * 
 */

#ifndef _com_day_cq_mailer_default_mail_service_properties_H_
#define _com_day_cq_mailer_default_mail_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_mailer_default_mail_service_properties_t com_day_cq_mailer_default_mail_service_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_mailer_default_mail_service_properties_t {
    struct config_node_property_string_t *smtp_host; //model
    struct config_node_property_integer_t *smtp_port; //model
    struct config_node_property_string_t *smtp_user; //model
    struct config_node_property_string_t *smtp_password; //model
    struct config_node_property_string_t *from_address; //model
    struct config_node_property_boolean_t *smtp_ssl; //model
    struct config_node_property_boolean_t *smtp_starttls; //model
    struct config_node_property_boolean_t *debug_email; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_mailer_default_mail_service_properties_t;

__attribute__((deprecated)) com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_create(
    config_node_property_string_t *smtp_host,
    config_node_property_integer_t *smtp_port,
    config_node_property_string_t *smtp_user,
    config_node_property_string_t *smtp_password,
    config_node_property_string_t *from_address,
    config_node_property_boolean_t *smtp_ssl,
    config_node_property_boolean_t *smtp_starttls,
    config_node_property_boolean_t *debug_email
);

void com_day_cq_mailer_default_mail_service_properties_free(com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties);

com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_parseFromJSON(cJSON *com_day_cq_mailer_default_mail_service_propertiesJSON);

cJSON *com_day_cq_mailer_default_mail_service_properties_convertToJSON(com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties);

#endif /* _com_day_cq_mailer_default_mail_service_properties_H_ */

