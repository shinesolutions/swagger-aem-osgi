#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_html_internal_tagsoup_html_parser_properties.h"



static org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_create_internal(
    config_node_property_array_t *parser_features
    ) {
    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var = malloc(sizeof(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t));
    if (!org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var, 0, sizeof(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t));
    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var->parser_features = parser_features;
    return org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_create(
    config_node_property_array_t *parser_features
    ) {
    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *result = org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_create_internal (
        parser_features
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_free(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties) {
    if(NULL == org_apache_sling_commons_html_internal_tagsoup_html_parser_properties){
        return ;
    }
    if(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features) {
        config_node_property_array_free(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features);
        org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features = NULL;
    }
    free(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties);
}

cJSON *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_convertToJSON(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features
    if(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features) {
    cJSON *parser_features_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features);
    if(parser_features_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parser.features", parser_features_local_JSON);
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

org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_parseFromJSON(cJSON *org_apache_sling_commons_html_internal_tagsoup_html_parser_propertiesJSON){

    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_t *org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features
    config_node_property_array_t *parser_features_local_nonprim = NULL;

    // org_apache_sling_commons_html_internal_tagsoup_html_parser_properties->parser_features
    cJSON *parser_features = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_html_internal_tagsoup_html_parser_propertiesJSON, "parser.features");
    if (cJSON_IsNull(parser_features)) {
        parser_features = NULL;
    }
    if (parser_features) { 
    parser_features_local_nonprim = config_node_property_array_parseFromJSON(parser_features); //nonprimitive
    }



    org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var = org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_create_internal (
        parser_features ? parser_features_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_html_internal_tagsoup_html_parser_properties_local_var;
end:
    if (parser_features_local_nonprim) {
        config_node_property_array_free(parser_features_local_nonprim);
        parser_features_local_nonprim = NULL;
    }
    return NULL;

}
