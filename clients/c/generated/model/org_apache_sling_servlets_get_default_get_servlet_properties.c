#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_servlets_get_default_get_servlet_properties.h"



static org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties_create_internal(
    config_node_property_array_t *aliases,
    config_node_property_boolean_t *index,
    config_node_property_array_t *index_files,
    config_node_property_boolean_t *enable_html,
    config_node_property_boolean_t *enable_json,
    config_node_property_boolean_t *enable_txt,
    config_node_property_boolean_t *enable_xml,
    config_node_property_integer_t *json_maximumresults,
    config_node_property_boolean_t *ecma_suport
    ) {
    org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties_local_var = malloc(sizeof(org_apache_sling_servlets_get_default_get_servlet_properties_t));
    if (!org_apache_sling_servlets_get_default_get_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_servlets_get_default_get_servlet_properties_local_var, 0, sizeof(org_apache_sling_servlets_get_default_get_servlet_properties_t));
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->aliases = aliases;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->index = index;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->index_files = index_files;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->enable_html = enable_html;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->enable_json = enable_json;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->enable_txt = enable_txt;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->enable_xml = enable_xml;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->json_maximumresults = json_maximumresults;
    org_apache_sling_servlets_get_default_get_servlet_properties_local_var->ecma_suport = ecma_suport;
    return org_apache_sling_servlets_get_default_get_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties_create(
    config_node_property_array_t *aliases,
    config_node_property_boolean_t *index,
    config_node_property_array_t *index_files,
    config_node_property_boolean_t *enable_html,
    config_node_property_boolean_t *enable_json,
    config_node_property_boolean_t *enable_txt,
    config_node_property_boolean_t *enable_xml,
    config_node_property_integer_t *json_maximumresults,
    config_node_property_boolean_t *ecma_suport
    ) {
    org_apache_sling_servlets_get_default_get_servlet_properties_t *result = org_apache_sling_servlets_get_default_get_servlet_properties_create_internal (
        aliases,
        index,
        index_files,
        enable_html,
        enable_json,
        enable_txt,
        enable_xml,
        json_maximumresults,
        ecma_suport
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_servlets_get_default_get_servlet_properties_free(org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties) {
    if(NULL == org_apache_sling_servlets_get_default_get_servlet_properties){
        return ;
    }
    if(org_apache_sling_servlets_get_default_get_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_servlets_get_default_get_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_servlets_get_default_get_servlet_properties->aliases) {
        config_node_property_array_free(org_apache_sling_servlets_get_default_get_servlet_properties->aliases);
        org_apache_sling_servlets_get_default_get_servlet_properties->aliases = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->index) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->index);
        org_apache_sling_servlets_get_default_get_servlet_properties->index = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->index_files) {
        config_node_property_array_free(org_apache_sling_servlets_get_default_get_servlet_properties->index_files);
        org_apache_sling_servlets_get_default_get_servlet_properties->index_files = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->enable_html) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->enable_html);
        org_apache_sling_servlets_get_default_get_servlet_properties->enable_html = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->enable_json) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->enable_json);
        org_apache_sling_servlets_get_default_get_servlet_properties->enable_json = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt);
        org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml);
        org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults) {
        config_node_property_integer_free(org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults);
        org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults = NULL;
    }
    if (org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport) {
        config_node_property_boolean_free(org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport);
        org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport = NULL;
    }
    free(org_apache_sling_servlets_get_default_get_servlet_properties);
}

cJSON *org_apache_sling_servlets_get_default_get_servlet_properties_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_servlets_get_default_get_servlet_properties->aliases
    if(org_apache_sling_servlets_get_default_get_servlet_properties->aliases) {
    cJSON *aliases_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->aliases);
    if(aliases_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "aliases", aliases_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->index
    if(org_apache_sling_servlets_get_default_get_servlet_properties->index) {
    cJSON *index_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->index);
    if(index_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "index", index_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->index_files
    if(org_apache_sling_servlets_get_default_get_servlet_properties->index_files) {
    cJSON *index_files_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->index_files);
    if(index_files_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "index.files", index_files_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_html
    if(org_apache_sling_servlets_get_default_get_servlet_properties->enable_html) {
    cJSON *enable_html_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->enable_html);
    if(enable_html_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.html", enable_html_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_json
    if(org_apache_sling_servlets_get_default_get_servlet_properties->enable_json) {
    cJSON *enable_json_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->enable_json);
    if(enable_json_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.json", enable_json_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt
    if(org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt) {
    cJSON *enable_txt_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt);
    if(enable_txt_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.txt", enable_txt_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml
    if(org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml) {
    cJSON *enable_xml_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml);
    if(enable_xml_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.xml", enable_xml_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults
    if(org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults) {
    cJSON *json_maximumresults_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults);
    if(json_maximumresults_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "json.maximumresults", json_maximumresults_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport
    if(org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport) {
    cJSON *ecma_suport_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport);
    if(ecma_suport_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ecmaSuport", ecma_suport_local_JSON);
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

org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties_parseFromJSON(cJSON *org_apache_sling_servlets_get_default_get_servlet_propertiesJSON){

    org_apache_sling_servlets_get_default_get_servlet_properties_t *org_apache_sling_servlets_get_default_get_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->aliases
    config_node_property_array_t *aliases_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->index
    config_node_property_boolean_t *index_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->index_files
    config_node_property_array_t *index_files_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->enable_html
    config_node_property_boolean_t *enable_html_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->enable_json
    config_node_property_boolean_t *enable_json_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt
    config_node_property_boolean_t *enable_txt_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml
    config_node_property_boolean_t *enable_xml_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults
    config_node_property_integer_t *json_maximumresults_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport
    config_node_property_boolean_t *ecma_suport_local_nonprim = NULL;

    // org_apache_sling_servlets_get_default_get_servlet_properties->aliases
    cJSON *aliases = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "aliases");
    if (cJSON_IsNull(aliases)) {
        aliases = NULL;
    }
    if (aliases) { 
    aliases_local_nonprim = config_node_property_array_parseFromJSON(aliases); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (index) { 
    index_local_nonprim = config_node_property_boolean_parseFromJSON(index); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->index_files
    cJSON *index_files = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "index.files");
    if (cJSON_IsNull(index_files)) {
        index_files = NULL;
    }
    if (index_files) { 
    index_files_local_nonprim = config_node_property_array_parseFromJSON(index_files); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_html
    cJSON *enable_html = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "enable.html");
    if (cJSON_IsNull(enable_html)) {
        enable_html = NULL;
    }
    if (enable_html) { 
    enable_html_local_nonprim = config_node_property_boolean_parseFromJSON(enable_html); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_json
    cJSON *enable_json = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "enable.json");
    if (cJSON_IsNull(enable_json)) {
        enable_json = NULL;
    }
    if (enable_json) { 
    enable_json_local_nonprim = config_node_property_boolean_parseFromJSON(enable_json); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_txt
    cJSON *enable_txt = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "enable.txt");
    if (cJSON_IsNull(enable_txt)) {
        enable_txt = NULL;
    }
    if (enable_txt) { 
    enable_txt_local_nonprim = config_node_property_boolean_parseFromJSON(enable_txt); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->enable_xml
    cJSON *enable_xml = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "enable.xml");
    if (cJSON_IsNull(enable_xml)) {
        enable_xml = NULL;
    }
    if (enable_xml) { 
    enable_xml_local_nonprim = config_node_property_boolean_parseFromJSON(enable_xml); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->json_maximumresults
    cJSON *json_maximumresults = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "json.maximumresults");
    if (cJSON_IsNull(json_maximumresults)) {
        json_maximumresults = NULL;
    }
    if (json_maximumresults) { 
    json_maximumresults_local_nonprim = config_node_property_integer_parseFromJSON(json_maximumresults); //nonprimitive
    }

    // org_apache_sling_servlets_get_default_get_servlet_properties->ecma_suport
    cJSON *ecma_suport = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_get_default_get_servlet_propertiesJSON, "ecmaSuport");
    if (cJSON_IsNull(ecma_suport)) {
        ecma_suport = NULL;
    }
    if (ecma_suport) { 
    ecma_suport_local_nonprim = config_node_property_boolean_parseFromJSON(ecma_suport); //nonprimitive
    }



    org_apache_sling_servlets_get_default_get_servlet_properties_local_var = org_apache_sling_servlets_get_default_get_servlet_properties_create_internal (
        aliases ? aliases_local_nonprim : NULL,
        index ? index_local_nonprim : NULL,
        index_files ? index_files_local_nonprim : NULL,
        enable_html ? enable_html_local_nonprim : NULL,
        enable_json ? enable_json_local_nonprim : NULL,
        enable_txt ? enable_txt_local_nonprim : NULL,
        enable_xml ? enable_xml_local_nonprim : NULL,
        json_maximumresults ? json_maximumresults_local_nonprim : NULL,
        ecma_suport ? ecma_suport_local_nonprim : NULL
        );

    if (!org_apache_sling_servlets_get_default_get_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_servlets_get_default_get_servlet_properties_local_var;
end:
    if (aliases_local_nonprim) {
        config_node_property_array_free(aliases_local_nonprim);
        aliases_local_nonprim = NULL;
    }
    if (index_local_nonprim) {
        config_node_property_boolean_free(index_local_nonprim);
        index_local_nonprim = NULL;
    }
    if (index_files_local_nonprim) {
        config_node_property_array_free(index_files_local_nonprim);
        index_files_local_nonprim = NULL;
    }
    if (enable_html_local_nonprim) {
        config_node_property_boolean_free(enable_html_local_nonprim);
        enable_html_local_nonprim = NULL;
    }
    if (enable_json_local_nonprim) {
        config_node_property_boolean_free(enable_json_local_nonprim);
        enable_json_local_nonprim = NULL;
    }
    if (enable_txt_local_nonprim) {
        config_node_property_boolean_free(enable_txt_local_nonprim);
        enable_txt_local_nonprim = NULL;
    }
    if (enable_xml_local_nonprim) {
        config_node_property_boolean_free(enable_xml_local_nonprim);
        enable_xml_local_nonprim = NULL;
    }
    if (json_maximumresults_local_nonprim) {
        config_node_property_integer_free(json_maximumresults_local_nonprim);
        json_maximumresults_local_nonprim = NULL;
    }
    if (ecma_suport_local_nonprim) {
        config_node_property_boolean_free(ecma_suport_local_nonprim);
        ecma_suport_local_nonprim = NULL;
    }
    return NULL;

}
