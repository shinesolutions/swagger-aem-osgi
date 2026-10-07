#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_rewriter_processor_impl_html_parser_factory_properties.h"



static com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_create_internal(
    config_node_property_array_t *htmlparser_process_tags,
    config_node_property_boolean_t *htmlparser_preserve_camel_case
    ) {
    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var = malloc(sizeof(com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t));
    if (!com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var, 0, sizeof(com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t));
    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var->_library_owned = 1;
    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var->htmlparser_process_tags = htmlparser_process_tags;
    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var->htmlparser_preserve_camel_case = htmlparser_preserve_camel_case;
    return com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_create(
    config_node_property_array_t *htmlparser_process_tags,
    config_node_property_boolean_t *htmlparser_preserve_camel_case
    ) {
    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *result = com_day_cq_rewriter_processor_impl_html_parser_factory_properties_create_internal (
        htmlparser_process_tags,
        htmlparser_preserve_camel_case
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_rewriter_processor_impl_html_parser_factory_properties_free(com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties) {
    if(NULL == com_day_cq_rewriter_processor_impl_html_parser_factory_properties){
        return ;
    }
    if(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_rewriter_processor_impl_html_parser_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags) {
        config_node_property_array_free(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags);
        com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags = NULL;
    }
    if (com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case) {
        config_node_property_boolean_free(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case);
        com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case = NULL;
    }
    free(com_day_cq_rewriter_processor_impl_html_parser_factory_properties);
}

cJSON *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_convertToJSON(com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags
    if(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags) {
    cJSON *htmlparser_process_tags_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags);
    if(htmlparser_process_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmlparser.processTags", htmlparser_process_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case
    if(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case) {
    cJSON *htmlparser_preserve_camel_case_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case);
    if(htmlparser_preserve_camel_case_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "htmlparser.preserveCamelCase", htmlparser_preserve_camel_case_local_JSON);
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

com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_parseFromJSON(cJSON *com_day_cq_rewriter_processor_impl_html_parser_factory_propertiesJSON){

    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_t *com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var = NULL;

    // define the local variable for com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags
    config_node_property_array_t *htmlparser_process_tags_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case
    config_node_property_boolean_t *htmlparser_preserve_camel_case_local_nonprim = NULL;

    // com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_process_tags
    cJSON *htmlparser_process_tags = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_processor_impl_html_parser_factory_propertiesJSON, "htmlparser.processTags");
    if (cJSON_IsNull(htmlparser_process_tags)) {
        htmlparser_process_tags = NULL;
    }
    if (htmlparser_process_tags) { 
    htmlparser_process_tags_local_nonprim = config_node_property_array_parseFromJSON(htmlparser_process_tags); //nonprimitive
    }

    // com_day_cq_rewriter_processor_impl_html_parser_factory_properties->htmlparser_preserve_camel_case
    cJSON *htmlparser_preserve_camel_case = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_processor_impl_html_parser_factory_propertiesJSON, "htmlparser.preserveCamelCase");
    if (cJSON_IsNull(htmlparser_preserve_camel_case)) {
        htmlparser_preserve_camel_case = NULL;
    }
    if (htmlparser_preserve_camel_case) { 
    htmlparser_preserve_camel_case_local_nonprim = config_node_property_boolean_parseFromJSON(htmlparser_preserve_camel_case); //nonprimitive
    }



    com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var = com_day_cq_rewriter_processor_impl_html_parser_factory_properties_create_internal (
        htmlparser_process_tags ? htmlparser_process_tags_local_nonprim : NULL,
        htmlparser_preserve_camel_case ? htmlparser_preserve_camel_case_local_nonprim : NULL
        );

    if (!com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var) {
        goto end;
    }

    return com_day_cq_rewriter_processor_impl_html_parser_factory_properties_local_var;
end:
    if (htmlparser_process_tags_local_nonprim) {
        config_node_property_array_free(htmlparser_process_tags_local_nonprim);
        htmlparser_process_tags_local_nonprim = NULL;
    }
    if (htmlparser_preserve_camel_case_local_nonprim) {
        config_node_property_boolean_free(htmlparser_preserve_camel_case_local_nonprim);
        htmlparser_preserve_camel_case_local_nonprim = NULL;
    }
    return NULL;

}
