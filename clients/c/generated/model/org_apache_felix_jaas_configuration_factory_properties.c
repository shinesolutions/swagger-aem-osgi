#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_jaas_configuration_factory_properties.h"



static org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_create_internal(
    config_node_property_drop_down_t *jaas_control_flag,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_string_t *jaas_classname,
    config_node_property_array_t *jaas_options
    ) {
    org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_local_var = malloc(sizeof(org_apache_felix_jaas_configuration_factory_properties_t));
    if (!org_apache_felix_jaas_configuration_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_jaas_configuration_factory_properties_local_var, 0, sizeof(org_apache_felix_jaas_configuration_factory_properties_t));
    org_apache_felix_jaas_configuration_factory_properties_local_var->_library_owned = 1;
    org_apache_felix_jaas_configuration_factory_properties_local_var->jaas_control_flag = jaas_control_flag;
    org_apache_felix_jaas_configuration_factory_properties_local_var->jaas_ranking = jaas_ranking;
    org_apache_felix_jaas_configuration_factory_properties_local_var->jaas_realm_name = jaas_realm_name;
    org_apache_felix_jaas_configuration_factory_properties_local_var->jaas_classname = jaas_classname;
    org_apache_felix_jaas_configuration_factory_properties_local_var->jaas_options = jaas_options;
    return org_apache_felix_jaas_configuration_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_create(
    config_node_property_drop_down_t *jaas_control_flag,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_string_t *jaas_classname,
    config_node_property_array_t *jaas_options
    ) {
    org_apache_felix_jaas_configuration_factory_properties_t *result = org_apache_felix_jaas_configuration_factory_properties_create_internal (
        jaas_control_flag,
        jaas_ranking,
        jaas_realm_name,
        jaas_classname,
        jaas_options
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_jaas_configuration_factory_properties_free(org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties) {
    if(NULL == org_apache_felix_jaas_configuration_factory_properties){
        return ;
    }
    if(org_apache_felix_jaas_configuration_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_jaas_configuration_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag) {
        config_node_property_drop_down_free(org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag);
        org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag = NULL;
    }
    if (org_apache_felix_jaas_configuration_factory_properties->jaas_ranking) {
        config_node_property_integer_free(org_apache_felix_jaas_configuration_factory_properties->jaas_ranking);
        org_apache_felix_jaas_configuration_factory_properties->jaas_ranking = NULL;
    }
    if (org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name) {
        config_node_property_string_free(org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name);
        org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name = NULL;
    }
    if (org_apache_felix_jaas_configuration_factory_properties->jaas_classname) {
        config_node_property_string_free(org_apache_felix_jaas_configuration_factory_properties->jaas_classname);
        org_apache_felix_jaas_configuration_factory_properties->jaas_classname = NULL;
    }
    if (org_apache_felix_jaas_configuration_factory_properties->jaas_options) {
        config_node_property_array_free(org_apache_felix_jaas_configuration_factory_properties->jaas_options);
        org_apache_felix_jaas_configuration_factory_properties->jaas_options = NULL;
    }
    free(org_apache_felix_jaas_configuration_factory_properties);
}

cJSON *org_apache_felix_jaas_configuration_factory_properties_convertToJSON(org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag
    if(org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag) {
    cJSON *jaas_control_flag_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag);
    if(jaas_control_flag_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.controlFlag", jaas_control_flag_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_factory_properties->jaas_ranking
    if(org_apache_felix_jaas_configuration_factory_properties->jaas_ranking) {
    cJSON *jaas_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_jaas_configuration_factory_properties->jaas_ranking);
    if(jaas_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.ranking", jaas_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name
    if(org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name) {
    cJSON *jaas_realm_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name);
    if(jaas_realm_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.realmName", jaas_realm_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_factory_properties->jaas_classname
    if(org_apache_felix_jaas_configuration_factory_properties->jaas_classname) {
    cJSON *jaas_classname_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_jaas_configuration_factory_properties->jaas_classname);
    if(jaas_classname_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.classname", jaas_classname_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_factory_properties->jaas_options
    if(org_apache_felix_jaas_configuration_factory_properties->jaas_options) {
    cJSON *jaas_options_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_jaas_configuration_factory_properties->jaas_options);
    if(jaas_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.options", jaas_options_local_JSON);
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

org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_parseFromJSON(cJSON *org_apache_felix_jaas_configuration_factory_propertiesJSON){

    org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_local_var = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag
    config_node_property_drop_down_t *jaas_control_flag_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_factory_properties->jaas_ranking
    config_node_property_integer_t *jaas_ranking_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name
    config_node_property_string_t *jaas_realm_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_factory_properties->jaas_classname
    config_node_property_string_t *jaas_classname_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_factory_properties->jaas_options
    config_node_property_array_t *jaas_options_local_nonprim = NULL;

    // org_apache_felix_jaas_configuration_factory_properties->jaas_control_flag
    cJSON *jaas_control_flag = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_factory_propertiesJSON, "jaas.controlFlag");
    if (cJSON_IsNull(jaas_control_flag)) {
        jaas_control_flag = NULL;
    }
    if (jaas_control_flag) { 
    jaas_control_flag_local_nonprim = config_node_property_drop_down_parseFromJSON(jaas_control_flag); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_factory_properties->jaas_ranking
    cJSON *jaas_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_factory_propertiesJSON, "jaas.ranking");
    if (cJSON_IsNull(jaas_ranking)) {
        jaas_ranking = NULL;
    }
    if (jaas_ranking) { 
    jaas_ranking_local_nonprim = config_node_property_integer_parseFromJSON(jaas_ranking); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_factory_properties->jaas_realm_name
    cJSON *jaas_realm_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_factory_propertiesJSON, "jaas.realmName");
    if (cJSON_IsNull(jaas_realm_name)) {
        jaas_realm_name = NULL;
    }
    if (jaas_realm_name) { 
    jaas_realm_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_realm_name); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_factory_properties->jaas_classname
    cJSON *jaas_classname = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_factory_propertiesJSON, "jaas.classname");
    if (cJSON_IsNull(jaas_classname)) {
        jaas_classname = NULL;
    }
    if (jaas_classname) { 
    jaas_classname_local_nonprim = config_node_property_string_parseFromJSON(jaas_classname); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_factory_properties->jaas_options
    cJSON *jaas_options = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_factory_propertiesJSON, "jaas.options");
    if (cJSON_IsNull(jaas_options)) {
        jaas_options = NULL;
    }
    if (jaas_options) { 
    jaas_options_local_nonprim = config_node_property_array_parseFromJSON(jaas_options); //nonprimitive
    }



    org_apache_felix_jaas_configuration_factory_properties_local_var = org_apache_felix_jaas_configuration_factory_properties_create_internal (
        jaas_control_flag ? jaas_control_flag_local_nonprim : NULL,
        jaas_ranking ? jaas_ranking_local_nonprim : NULL,
        jaas_realm_name ? jaas_realm_name_local_nonprim : NULL,
        jaas_classname ? jaas_classname_local_nonprim : NULL,
        jaas_options ? jaas_options_local_nonprim : NULL
        );

    if (!org_apache_felix_jaas_configuration_factory_properties_local_var) {
        goto end;
    }

    return org_apache_felix_jaas_configuration_factory_properties_local_var;
end:
    if (jaas_control_flag_local_nonprim) {
        config_node_property_drop_down_free(jaas_control_flag_local_nonprim);
        jaas_control_flag_local_nonprim = NULL;
    }
    if (jaas_ranking_local_nonprim) {
        config_node_property_integer_free(jaas_ranking_local_nonprim);
        jaas_ranking_local_nonprim = NULL;
    }
    if (jaas_realm_name_local_nonprim) {
        config_node_property_string_free(jaas_realm_name_local_nonprim);
        jaas_realm_name_local_nonprim = NULL;
    }
    if (jaas_classname_local_nonprim) {
        config_node_property_string_free(jaas_classname_local_nonprim);
        jaas_classname_local_nonprim = NULL;
    }
    if (jaas_options_local_nonprim) {
        config_node_property_array_free(jaas_options_local_nonprim);
        jaas_options_local_nonprim = NULL;
    }
    return NULL;

}
