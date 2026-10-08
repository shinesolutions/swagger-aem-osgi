#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties.h"



static org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_create_internal(
    config_node_property_integer_t *jaas_ranking,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_string_t *idp_name,
    config_node_property_string_t *sync_handler_name
    ) {
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t));
    if (!org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t));
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->jaas_ranking = jaas_ranking;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->jaas_control_flag = jaas_control_flag;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->jaas_realm_name = jaas_realm_name;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->idp_name = idp_name;
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var->sync_handler_name = sync_handler_name;
    return org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_create(
    config_node_property_integer_t *jaas_ranking,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_string_t *idp_name,
    config_node_property_string_t *sync_handler_name
    ) {
    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *result = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_create_internal (
        jaas_ranking,
        jaas_control_flag,
        jaas_realm_name,
        idp_name,
        sync_handler_name
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties) {
    if(NULL == org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name);
        org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name = NULL;
    }
    free(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties);
}

cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking) {
    cJSON *jaas_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking);
    if(jaas_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.ranking", jaas_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag) {
    cJSON *jaas_control_flag_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag);
    if(jaas_control_flag_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.controlFlag", jaas_control_flag_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name) {
    cJSON *jaas_realm_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name);
    if(jaas_realm_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.realmName", jaas_realm_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name) {
    cJSON *idp_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name);
    if(idp_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idp.name", idp_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name
    if(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name) {
    cJSON *sync_handler_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name);
    if(sync_handler_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sync.handlerName", sync_handler_name_local_JSON);
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

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON){

    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_t *org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking
    config_node_property_integer_t *jaas_ranking_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag
    config_node_property_string_t *jaas_control_flag_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name
    config_node_property_string_t *jaas_realm_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name
    config_node_property_string_t *idp_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name
    config_node_property_string_t *sync_handler_name_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_ranking
    cJSON *jaas_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON, "jaas.ranking");
    if (cJSON_IsNull(jaas_ranking)) {
        jaas_ranking = NULL;
    }
    if (jaas_ranking) { 
    jaas_ranking_local_nonprim = config_node_property_integer_parseFromJSON(jaas_ranking); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_control_flag
    cJSON *jaas_control_flag = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON, "jaas.controlFlag");
    if (cJSON_IsNull(jaas_control_flag)) {
        jaas_control_flag = NULL;
    }
    if (jaas_control_flag) { 
    jaas_control_flag_local_nonprim = config_node_property_string_parseFromJSON(jaas_control_flag); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->jaas_realm_name
    cJSON *jaas_realm_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON, "jaas.realmName");
    if (cJSON_IsNull(jaas_realm_name)) {
        jaas_realm_name = NULL;
    }
    if (jaas_realm_name) { 
    jaas_realm_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_realm_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->idp_name
    cJSON *idp_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON, "idp.name");
    if (cJSON_IsNull(idp_name)) {
        idp_name = NULL;
    }
    if (idp_name) { 
    idp_name_local_nonprim = config_node_property_string_parseFromJSON(idp_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties->sync_handler_name
    cJSON *sync_handler_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_propertiesJSON, "sync.handlerName");
    if (cJSON_IsNull(sync_handler_name)) {
        sync_handler_name = NULL;
    }
    if (sync_handler_name) { 
    sync_handler_name_local_nonprim = config_node_property_string_parseFromJSON(sync_handler_name); //nonprimitive
    }



    org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_create_internal (
        jaas_ranking ? jaas_ranking_local_nonprim : NULL,
        jaas_control_flag ? jaas_control_flag_local_nonprim : NULL,
        jaas_realm_name ? jaas_realm_name_local_nonprim : NULL,
        idp_name ? idp_name_local_nonprim : NULL,
        sync_handler_name ? sync_handler_name_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_local_var;
end:
    if (jaas_ranking_local_nonprim) {
        config_node_property_integer_free(jaas_ranking_local_nonprim);
        jaas_ranking_local_nonprim = NULL;
    }
    if (jaas_control_flag_local_nonprim) {
        config_node_property_string_free(jaas_control_flag_local_nonprim);
        jaas_control_flag_local_nonprim = NULL;
    }
    if (jaas_realm_name_local_nonprim) {
        config_node_property_string_free(jaas_realm_name_local_nonprim);
        jaas_realm_name_local_nonprim = NULL;
    }
    if (idp_name_local_nonprim) {
        config_node_property_string_free(idp_name_local_nonprim);
        idp_name_local_nonprim = NULL;
    }
    if (sync_handler_name_local_nonprim) {
        config_node_property_string_free(sync_handler_name_local_nonprim);
        sync_handler_name_local_nonprim = NULL;
    }
    return NULL;

}
