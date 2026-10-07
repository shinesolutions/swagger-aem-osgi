#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_datasource_jndi_data_source_factory_properties.h"



static org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_create_internal(
    config_node_property_string_t *datasource_name,
    config_node_property_string_t *datasource_svc_prop_name,
    config_node_property_string_t *datasource_jndi_name,
    config_node_property_array_t *jndi_properties
    ) {
    org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_local_var = malloc(sizeof(org_apache_sling_datasource_jndi_data_source_factory_properties_t));
    if (!org_apache_sling_datasource_jndi_data_source_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_datasource_jndi_data_source_factory_properties_local_var, 0, sizeof(org_apache_sling_datasource_jndi_data_source_factory_properties_t));
    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var->datasource_name = datasource_name;
    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var->datasource_svc_prop_name = datasource_svc_prop_name;
    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var->datasource_jndi_name = datasource_jndi_name;
    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var->jndi_properties = jndi_properties;
    return org_apache_sling_datasource_jndi_data_source_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_create(
    config_node_property_string_t *datasource_name,
    config_node_property_string_t *datasource_svc_prop_name,
    config_node_property_string_t *datasource_jndi_name,
    config_node_property_array_t *jndi_properties
    ) {
    org_apache_sling_datasource_jndi_data_source_factory_properties_t *result = org_apache_sling_datasource_jndi_data_source_factory_properties_create_internal (
        datasource_name,
        datasource_svc_prop_name,
        datasource_jndi_name,
        jndi_properties
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_datasource_jndi_data_source_factory_properties_free(org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties) {
    if(NULL == org_apache_sling_datasource_jndi_data_source_factory_properties){
        return ;
    }
    if(org_apache_sling_datasource_jndi_data_source_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_datasource_jndi_data_source_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name) {
        config_node_property_string_free(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name);
        org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name = NULL;
    }
    if (org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name) {
        config_node_property_string_free(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name);
        org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name = NULL;
    }
    if (org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name) {
        config_node_property_string_free(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name);
        org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name = NULL;
    }
    if (org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties) {
        config_node_property_array_free(org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties);
        org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties = NULL;
    }
    free(org_apache_sling_datasource_jndi_data_source_factory_properties);
}

cJSON *org_apache_sling_datasource_jndi_data_source_factory_properties_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name
    if(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name) {
    cJSON *datasource_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name);
    if(datasource_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.name", datasource_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name
    if(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name) {
    cJSON *datasource_svc_prop_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name);
    if(datasource_svc_prop_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.svc.prop.name", datasource_svc_prop_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name
    if(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name) {
    cJSON *datasource_jndi_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name);
    if(datasource_jndi_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.jndi.name", datasource_jndi_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties
    if(org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties) {
    cJSON *jndi_properties_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties);
    if(jndi_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jndi.properties", jndi_properties_local_JSON);
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

org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_parseFromJSON(cJSON *org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON){

    org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name
    config_node_property_string_t *datasource_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name
    config_node_property_string_t *datasource_svc_prop_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name
    config_node_property_string_t *datasource_jndi_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties
    config_node_property_array_t *jndi_properties_local_nonprim = NULL;

    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_name
    cJSON *datasource_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON, "datasource.name");
    if (cJSON_IsNull(datasource_name)) {
        datasource_name = NULL;
    }
    if (datasource_name) { 
    datasource_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_name); //nonprimitive
    }

    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_svc_prop_name
    cJSON *datasource_svc_prop_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON, "datasource.svc.prop.name");
    if (cJSON_IsNull(datasource_svc_prop_name)) {
        datasource_svc_prop_name = NULL;
    }
    if (datasource_svc_prop_name) { 
    datasource_svc_prop_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_svc_prop_name); //nonprimitive
    }

    // org_apache_sling_datasource_jndi_data_source_factory_properties->datasource_jndi_name
    cJSON *datasource_jndi_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON, "datasource.jndi.name");
    if (cJSON_IsNull(datasource_jndi_name)) {
        datasource_jndi_name = NULL;
    }
    if (datasource_jndi_name) { 
    datasource_jndi_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_jndi_name); //nonprimitive
    }

    // org_apache_sling_datasource_jndi_data_source_factory_properties->jndi_properties
    cJSON *jndi_properties = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON, "jndi.properties");
    if (cJSON_IsNull(jndi_properties)) {
        jndi_properties = NULL;
    }
    if (jndi_properties) { 
    jndi_properties_local_nonprim = config_node_property_array_parseFromJSON(jndi_properties); //nonprimitive
    }



    org_apache_sling_datasource_jndi_data_source_factory_properties_local_var = org_apache_sling_datasource_jndi_data_source_factory_properties_create_internal (
        datasource_name ? datasource_name_local_nonprim : NULL,
        datasource_svc_prop_name ? datasource_svc_prop_name_local_nonprim : NULL,
        datasource_jndi_name ? datasource_jndi_name_local_nonprim : NULL,
        jndi_properties ? jndi_properties_local_nonprim : NULL
        );

    if (!org_apache_sling_datasource_jndi_data_source_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_datasource_jndi_data_source_factory_properties_local_var;
end:
    if (datasource_name_local_nonprim) {
        config_node_property_string_free(datasource_name_local_nonprim);
        datasource_name_local_nonprim = NULL;
    }
    if (datasource_svc_prop_name_local_nonprim) {
        config_node_property_string_free(datasource_svc_prop_name_local_nonprim);
        datasource_svc_prop_name_local_nonprim = NULL;
    }
    if (datasource_jndi_name_local_nonprim) {
        config_node_property_string_free(datasource_jndi_name_local_nonprim);
        datasource_jndi_name_local_nonprim = NULL;
    }
    if (jndi_properties_local_nonprim) {
        config_node_property_array_free(jndi_properties_local_nonprim);
        jndi_properties_local_nonprim = NULL;
    }
    return NULL;

}
