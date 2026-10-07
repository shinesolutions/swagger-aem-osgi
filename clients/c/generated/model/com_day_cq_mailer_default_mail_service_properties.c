#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mailer_default_mail_service_properties.h"



static com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_create_internal(
    config_node_property_string_t *smtp_host,
    config_node_property_integer_t *smtp_port,
    config_node_property_string_t *smtp_user,
    config_node_property_string_t *smtp_password,
    config_node_property_string_t *from_address,
    config_node_property_boolean_t *smtp_ssl,
    config_node_property_boolean_t *smtp_starttls,
    config_node_property_boolean_t *debug_email
    ) {
    com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_local_var = malloc(sizeof(com_day_cq_mailer_default_mail_service_properties_t));
    if (!com_day_cq_mailer_default_mail_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mailer_default_mail_service_properties_local_var, 0, sizeof(com_day_cq_mailer_default_mail_service_properties_t));
    com_day_cq_mailer_default_mail_service_properties_local_var->_library_owned = 1;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_host = smtp_host;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_port = smtp_port;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_user = smtp_user;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_password = smtp_password;
    com_day_cq_mailer_default_mail_service_properties_local_var->from_address = from_address;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_ssl = smtp_ssl;
    com_day_cq_mailer_default_mail_service_properties_local_var->smtp_starttls = smtp_starttls;
    com_day_cq_mailer_default_mail_service_properties_local_var->debug_email = debug_email;
    return com_day_cq_mailer_default_mail_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_create(
    config_node_property_string_t *smtp_host,
    config_node_property_integer_t *smtp_port,
    config_node_property_string_t *smtp_user,
    config_node_property_string_t *smtp_password,
    config_node_property_string_t *from_address,
    config_node_property_boolean_t *smtp_ssl,
    config_node_property_boolean_t *smtp_starttls,
    config_node_property_boolean_t *debug_email
    ) {
    com_day_cq_mailer_default_mail_service_properties_t *result = com_day_cq_mailer_default_mail_service_properties_create_internal (
        smtp_host,
        smtp_port,
        smtp_user,
        smtp_password,
        from_address,
        smtp_ssl,
        smtp_starttls,
        debug_email
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mailer_default_mail_service_properties_free(com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties) {
    if(NULL == com_day_cq_mailer_default_mail_service_properties){
        return ;
    }
    if(com_day_cq_mailer_default_mail_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mailer_default_mail_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mailer_default_mail_service_properties->smtp_host) {
        config_node_property_string_free(com_day_cq_mailer_default_mail_service_properties->smtp_host);
        com_day_cq_mailer_default_mail_service_properties->smtp_host = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->smtp_port) {
        config_node_property_integer_free(com_day_cq_mailer_default_mail_service_properties->smtp_port);
        com_day_cq_mailer_default_mail_service_properties->smtp_port = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->smtp_user) {
        config_node_property_string_free(com_day_cq_mailer_default_mail_service_properties->smtp_user);
        com_day_cq_mailer_default_mail_service_properties->smtp_user = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->smtp_password) {
        config_node_property_string_free(com_day_cq_mailer_default_mail_service_properties->smtp_password);
        com_day_cq_mailer_default_mail_service_properties->smtp_password = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->from_address) {
        config_node_property_string_free(com_day_cq_mailer_default_mail_service_properties->from_address);
        com_day_cq_mailer_default_mail_service_properties->from_address = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->smtp_ssl) {
        config_node_property_boolean_free(com_day_cq_mailer_default_mail_service_properties->smtp_ssl);
        com_day_cq_mailer_default_mail_service_properties->smtp_ssl = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->smtp_starttls) {
        config_node_property_boolean_free(com_day_cq_mailer_default_mail_service_properties->smtp_starttls);
        com_day_cq_mailer_default_mail_service_properties->smtp_starttls = NULL;
    }
    if (com_day_cq_mailer_default_mail_service_properties->debug_email) {
        config_node_property_boolean_free(com_day_cq_mailer_default_mail_service_properties->debug_email);
        com_day_cq_mailer_default_mail_service_properties->debug_email = NULL;
    }
    free(com_day_cq_mailer_default_mail_service_properties);
}

cJSON *com_day_cq_mailer_default_mail_service_properties_convertToJSON(com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mailer_default_mail_service_properties->smtp_host
    if(com_day_cq_mailer_default_mail_service_properties->smtp_host) {
    cJSON *smtp_host_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_host);
    if(smtp_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.host", smtp_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->smtp_port
    if(com_day_cq_mailer_default_mail_service_properties->smtp_port) {
    cJSON *smtp_port_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_port);
    if(smtp_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.port", smtp_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->smtp_user
    if(com_day_cq_mailer_default_mail_service_properties->smtp_user) {
    cJSON *smtp_user_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_user);
    if(smtp_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.user", smtp_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->smtp_password
    if(com_day_cq_mailer_default_mail_service_properties->smtp_password) {
    cJSON *smtp_password_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_password);
    if(smtp_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.password", smtp_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->from_address
    if(com_day_cq_mailer_default_mail_service_properties->from_address) {
    cJSON *from_address_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_default_mail_service_properties->from_address);
    if(from_address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "from.address", from_address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->smtp_ssl
    if(com_day_cq_mailer_default_mail_service_properties->smtp_ssl) {
    cJSON *smtp_ssl_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_ssl);
    if(smtp_ssl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.ssl", smtp_ssl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->smtp_starttls
    if(com_day_cq_mailer_default_mail_service_properties->smtp_starttls) {
    cJSON *smtp_starttls_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_mailer_default_mail_service_properties->smtp_starttls);
    if(smtp_starttls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "smtp.starttls", smtp_starttls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_default_mail_service_properties->debug_email
    if(com_day_cq_mailer_default_mail_service_properties->debug_email) {
    cJSON *debug_email_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_mailer_default_mail_service_properties->debug_email);
    if(debug_email_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "debug.email", debug_email_local_JSON);
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

com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_parseFromJSON(cJSON *com_day_cq_mailer_default_mail_service_propertiesJSON){

    com_day_cq_mailer_default_mail_service_properties_t *com_day_cq_mailer_default_mail_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_host
    config_node_property_string_t *smtp_host_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_port
    config_node_property_integer_t *smtp_port_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_user
    config_node_property_string_t *smtp_user_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_password
    config_node_property_string_t *smtp_password_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->from_address
    config_node_property_string_t *from_address_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_ssl
    config_node_property_boolean_t *smtp_ssl_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->smtp_starttls
    config_node_property_boolean_t *smtp_starttls_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_default_mail_service_properties->debug_email
    config_node_property_boolean_t *debug_email_local_nonprim = NULL;

    // com_day_cq_mailer_default_mail_service_properties->smtp_host
    cJSON *smtp_host = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.host");
    if (cJSON_IsNull(smtp_host)) {
        smtp_host = NULL;
    }
    if (smtp_host) { 
    smtp_host_local_nonprim = config_node_property_string_parseFromJSON(smtp_host); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->smtp_port
    cJSON *smtp_port = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.port");
    if (cJSON_IsNull(smtp_port)) {
        smtp_port = NULL;
    }
    if (smtp_port) { 
    smtp_port_local_nonprim = config_node_property_integer_parseFromJSON(smtp_port); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->smtp_user
    cJSON *smtp_user = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.user");
    if (cJSON_IsNull(smtp_user)) {
        smtp_user = NULL;
    }
    if (smtp_user) { 
    smtp_user_local_nonprim = config_node_property_string_parseFromJSON(smtp_user); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->smtp_password
    cJSON *smtp_password = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.password");
    if (cJSON_IsNull(smtp_password)) {
        smtp_password = NULL;
    }
    if (smtp_password) { 
    smtp_password_local_nonprim = config_node_property_string_parseFromJSON(smtp_password); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->from_address
    cJSON *from_address = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "from.address");
    if (cJSON_IsNull(from_address)) {
        from_address = NULL;
    }
    if (from_address) { 
    from_address_local_nonprim = config_node_property_string_parseFromJSON(from_address); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->smtp_ssl
    cJSON *smtp_ssl = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.ssl");
    if (cJSON_IsNull(smtp_ssl)) {
        smtp_ssl = NULL;
    }
    if (smtp_ssl) { 
    smtp_ssl_local_nonprim = config_node_property_boolean_parseFromJSON(smtp_ssl); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->smtp_starttls
    cJSON *smtp_starttls = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "smtp.starttls");
    if (cJSON_IsNull(smtp_starttls)) {
        smtp_starttls = NULL;
    }
    if (smtp_starttls) { 
    smtp_starttls_local_nonprim = config_node_property_boolean_parseFromJSON(smtp_starttls); //nonprimitive
    }

    // com_day_cq_mailer_default_mail_service_properties->debug_email
    cJSON *debug_email = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_default_mail_service_propertiesJSON, "debug.email");
    if (cJSON_IsNull(debug_email)) {
        debug_email = NULL;
    }
    if (debug_email) { 
    debug_email_local_nonprim = config_node_property_boolean_parseFromJSON(debug_email); //nonprimitive
    }



    com_day_cq_mailer_default_mail_service_properties_local_var = com_day_cq_mailer_default_mail_service_properties_create_internal (
        smtp_host ? smtp_host_local_nonprim : NULL,
        smtp_port ? smtp_port_local_nonprim : NULL,
        smtp_user ? smtp_user_local_nonprim : NULL,
        smtp_password ? smtp_password_local_nonprim : NULL,
        from_address ? from_address_local_nonprim : NULL,
        smtp_ssl ? smtp_ssl_local_nonprim : NULL,
        smtp_starttls ? smtp_starttls_local_nonprim : NULL,
        debug_email ? debug_email_local_nonprim : NULL
        );

    if (!com_day_cq_mailer_default_mail_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_mailer_default_mail_service_properties_local_var;
end:
    if (smtp_host_local_nonprim) {
        config_node_property_string_free(smtp_host_local_nonprim);
        smtp_host_local_nonprim = NULL;
    }
    if (smtp_port_local_nonprim) {
        config_node_property_integer_free(smtp_port_local_nonprim);
        smtp_port_local_nonprim = NULL;
    }
    if (smtp_user_local_nonprim) {
        config_node_property_string_free(smtp_user_local_nonprim);
        smtp_user_local_nonprim = NULL;
    }
    if (smtp_password_local_nonprim) {
        config_node_property_string_free(smtp_password_local_nonprim);
        smtp_password_local_nonprim = NULL;
    }
    if (from_address_local_nonprim) {
        config_node_property_string_free(from_address_local_nonprim);
        from_address_local_nonprim = NULL;
    }
    if (smtp_ssl_local_nonprim) {
        config_node_property_boolean_free(smtp_ssl_local_nonprim);
        smtp_ssl_local_nonprim = NULL;
    }
    if (smtp_starttls_local_nonprim) {
        config_node_property_boolean_free(smtp_starttls_local_nonprim);
        smtp_starttls_local_nonprim = NULL;
    }
    if (debug_email_local_nonprim) {
        config_node_property_boolean_free(debug_email_local_nonprim);
        debug_email_local_nonprim = NULL;
    }
    return NULL;

}
