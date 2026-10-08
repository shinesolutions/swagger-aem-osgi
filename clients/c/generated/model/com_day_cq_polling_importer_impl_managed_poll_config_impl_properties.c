#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_polling_importer_impl_managed_poll_config_impl_properties.h"



static com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_create_internal(
    config_node_property_string_t *id,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *reference,
    config_node_property_integer_t *interval,
    config_node_property_string_t *expression,
    config_node_property_string_t *source,
    config_node_property_string_t *target,
    config_node_property_string_t *login,
    config_node_property_string_t *password
    ) {
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var = malloc(sizeof(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t));
    if (!com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var, 0, sizeof(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t));
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->_library_owned = 1;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->id = id;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->enabled = enabled;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->reference = reference;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->interval = interval;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->expression = expression;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->source = source;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->target = target;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->login = login;
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var->password = password;
    return com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_create(
    config_node_property_string_t *id,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *reference,
    config_node_property_integer_t *interval,
    config_node_property_string_t *expression,
    config_node_property_string_t *source,
    config_node_property_string_t *target,
    config_node_property_string_t *login,
    config_node_property_string_t *password
    ) {
    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *result = com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_create_internal (
        id,
        enabled,
        reference,
        interval,
        expression,
        source,
        target,
        login,
        password
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties) {
    if(NULL == com_day_cq_polling_importer_impl_managed_poll_config_impl_properties){
        return ;
    }
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled) {
        config_node_property_boolean_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference) {
        config_node_property_boolean_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval) {
        config_node_property_integer_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login = NULL;
    }
    if (com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password) {
        config_node_property_string_free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password);
        com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password = NULL;
    }
    free(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties);
}

cJSON *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id) {
    cJSON *id_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id);
    if(id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "id", id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference) {
    cJSON *reference_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference);
    if(reference_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "reference", reference_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval) {
    cJSON *interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval);
    if(interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "interval", interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression) {
    cJSON *expression_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression);
    if(expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "expression", expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source) {
    cJSON *source_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source);
    if(source_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "source", source_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target) {
    cJSON *target_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target);
    if(target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "target", target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login) {
    cJSON *login_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login);
    if(login_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "login", login_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password
    if(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password) {
    cJSON *password_local_JSON = config_node_property_string_convertToJSON(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password);
    if(password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "password", password_local_JSON);
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

com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_parseFromJSON(cJSON *com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON){

    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_t *com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id
    config_node_property_string_t *id_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference
    config_node_property_boolean_t *reference_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval
    config_node_property_integer_t *interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression
    config_node_property_string_t *expression_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source
    config_node_property_string_t *source_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target
    config_node_property_string_t *target_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login
    config_node_property_string_t *login_local_nonprim = NULL;

    // define the local variable for com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password
    config_node_property_string_t *password_local_nonprim = NULL;

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    id_local_nonprim = config_node_property_string_parseFromJSON(id); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->reference
    cJSON *reference = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "reference");
    if (cJSON_IsNull(reference)) {
        reference = NULL;
    }
    if (reference) { 
    reference_local_nonprim = config_node_property_boolean_parseFromJSON(reference); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->interval
    cJSON *interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "interval");
    if (cJSON_IsNull(interval)) {
        interval = NULL;
    }
    if (interval) { 
    interval_local_nonprim = config_node_property_integer_parseFromJSON(interval); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->expression
    cJSON *expression = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "expression");
    if (cJSON_IsNull(expression)) {
        expression = NULL;
    }
    if (expression) { 
    expression_local_nonprim = config_node_property_string_parseFromJSON(expression); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "source");
    if (cJSON_IsNull(source)) {
        source = NULL;
    }
    if (source) { 
    source_local_nonprim = config_node_property_string_parseFromJSON(source); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->target
    cJSON *target = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "target");
    if (cJSON_IsNull(target)) {
        target = NULL;
    }
    if (target) { 
    target_local_nonprim = config_node_property_string_parseFromJSON(target); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->login
    cJSON *login = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "login");
    if (cJSON_IsNull(login)) {
        login = NULL;
    }
    if (login) { 
    login_local_nonprim = config_node_property_string_parseFromJSON(login); //nonprimitive
    }

    // com_day_cq_polling_importer_impl_managed_poll_config_impl_properties->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(com_day_cq_polling_importer_impl_managed_poll_config_impl_propertiesJSON, "password");
    if (cJSON_IsNull(password)) {
        password = NULL;
    }
    if (password) { 
    password_local_nonprim = config_node_property_string_parseFromJSON(password); //nonprimitive
    }



    com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var = com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_create_internal (
        id ? id_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        reference ? reference_local_nonprim : NULL,
        interval ? interval_local_nonprim : NULL,
        expression ? expression_local_nonprim : NULL,
        source ? source_local_nonprim : NULL,
        target ? target_local_nonprim : NULL,
        login ? login_local_nonprim : NULL,
        password ? password_local_nonprim : NULL
        );

    if (!com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_local_var;
end:
    if (id_local_nonprim) {
        config_node_property_string_free(id_local_nonprim);
        id_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (reference_local_nonprim) {
        config_node_property_boolean_free(reference_local_nonprim);
        reference_local_nonprim = NULL;
    }
    if (interval_local_nonprim) {
        config_node_property_integer_free(interval_local_nonprim);
        interval_local_nonprim = NULL;
    }
    if (expression_local_nonprim) {
        config_node_property_string_free(expression_local_nonprim);
        expression_local_nonprim = NULL;
    }
    if (source_local_nonprim) {
        config_node_property_string_free(source_local_nonprim);
        source_local_nonprim = NULL;
    }
    if (target_local_nonprim) {
        config_node_property_string_free(target_local_nonprim);
        target_local_nonprim = NULL;
    }
    if (login_local_nonprim) {
        config_node_property_string_free(login_local_nonprim);
        login_local_nonprim = NULL;
    }
    if (password_local_nonprim) {
        config_node_property_string_free(password_local_nonprim);
        password_local_nonprim = NULL;
    }
    return NULL;

}
