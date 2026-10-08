#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties.h"



static com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_create_internal(
    config_node_property_array_t *parameter_whitelist,
    config_node_property_array_t *parameter_whitelist_prefixes,
    config_node_property_array_t *binary_parameter_whitelist,
    config_node_property_array_t *modifier_whitelist,
    config_node_property_array_t *operation_whitelist,
    config_node_property_array_t *operation_whitelist_prefixes,
    config_node_property_array_t *typehint_whitelist,
    config_node_property_array_t *resourcetype_whitelist
    ) {
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t));
    if (!com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t));
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->parameter_whitelist = parameter_whitelist;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->parameter_whitelist_prefixes = parameter_whitelist_prefixes;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->binary_parameter_whitelist = binary_parameter_whitelist;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->modifier_whitelist = modifier_whitelist;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->operation_whitelist = operation_whitelist;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->operation_whitelist_prefixes = operation_whitelist_prefixes;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->typehint_whitelist = typehint_whitelist;
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var->resourcetype_whitelist = resourcetype_whitelist;
    return com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_create(
    config_node_property_array_t *parameter_whitelist,
    config_node_property_array_t *parameter_whitelist_prefixes,
    config_node_property_array_t *binary_parameter_whitelist,
    config_node_property_array_t *modifier_whitelist,
    config_node_property_array_t *operation_whitelist,
    config_node_property_array_t *operation_whitelist_prefixes,
    config_node_property_array_t *typehint_whitelist,
    config_node_property_array_t *resourcetype_whitelist
    ) {
    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *result = com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_create_internal (
        parameter_whitelist,
        parameter_whitelist_prefixes,
        binary_parameter_whitelist,
        modifier_whitelist,
        operation_whitelist,
        operation_whitelist_prefixes,
        typehint_whitelist,
        resourcetype_whitelist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist = NULL;
    }
    if (com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist);
        com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist = NULL;
    }
    free(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties);
}

cJSON *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist) {
    cJSON *parameter_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist);
    if(parameter_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parameter.whitelist", parameter_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes) {
    cJSON *parameter_whitelist_prefixes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes);
    if(parameter_whitelist_prefixes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parameter.whitelist.prefixes", parameter_whitelist_prefixes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist) {
    cJSON *binary_parameter_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist);
    if(binary_parameter_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "binary.parameter.whitelist", binary_parameter_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist) {
    cJSON *modifier_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist);
    if(modifier_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "modifier.whitelist", modifier_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist) {
    cJSON *operation_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist);
    if(operation_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "operation.whitelist", operation_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes) {
    cJSON *operation_whitelist_prefixes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes);
    if(operation_whitelist_prefixes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "operation.whitelist.prefixes", operation_whitelist_prefixes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist) {
    cJSON *typehint_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist);
    if(typehint_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "typehint.whitelist", typehint_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist
    if(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist) {
    cJSON *resourcetype_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist);
    if(resourcetype_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resourcetype.whitelist", resourcetype_whitelist_local_JSON);
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

com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON){

    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_t *com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist
    config_node_property_array_t *parameter_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes
    config_node_property_array_t *parameter_whitelist_prefixes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist
    config_node_property_array_t *binary_parameter_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist
    config_node_property_array_t *modifier_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist
    config_node_property_array_t *operation_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes
    config_node_property_array_t *operation_whitelist_prefixes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist
    config_node_property_array_t *typehint_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist
    config_node_property_array_t *resourcetype_whitelist_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist
    cJSON *parameter_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "parameter.whitelist");
    if (cJSON_IsNull(parameter_whitelist)) {
        parameter_whitelist = NULL;
    }
    if (parameter_whitelist) { 
    parameter_whitelist_local_nonprim = config_node_property_array_parseFromJSON(parameter_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->parameter_whitelist_prefixes
    cJSON *parameter_whitelist_prefixes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "parameter.whitelist.prefixes");
    if (cJSON_IsNull(parameter_whitelist_prefixes)) {
        parameter_whitelist_prefixes = NULL;
    }
    if (parameter_whitelist_prefixes) { 
    parameter_whitelist_prefixes_local_nonprim = config_node_property_array_parseFromJSON(parameter_whitelist_prefixes); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->binary_parameter_whitelist
    cJSON *binary_parameter_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "binary.parameter.whitelist");
    if (cJSON_IsNull(binary_parameter_whitelist)) {
        binary_parameter_whitelist = NULL;
    }
    if (binary_parameter_whitelist) { 
    binary_parameter_whitelist_local_nonprim = config_node_property_array_parseFromJSON(binary_parameter_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->modifier_whitelist
    cJSON *modifier_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "modifier.whitelist");
    if (cJSON_IsNull(modifier_whitelist)) {
        modifier_whitelist = NULL;
    }
    if (modifier_whitelist) { 
    modifier_whitelist_local_nonprim = config_node_property_array_parseFromJSON(modifier_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist
    cJSON *operation_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "operation.whitelist");
    if (cJSON_IsNull(operation_whitelist)) {
        operation_whitelist = NULL;
    }
    if (operation_whitelist) { 
    operation_whitelist_local_nonprim = config_node_property_array_parseFromJSON(operation_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->operation_whitelist_prefixes
    cJSON *operation_whitelist_prefixes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "operation.whitelist.prefixes");
    if (cJSON_IsNull(operation_whitelist_prefixes)) {
        operation_whitelist_prefixes = NULL;
    }
    if (operation_whitelist_prefixes) { 
    operation_whitelist_prefixes_local_nonprim = config_node_property_array_parseFromJSON(operation_whitelist_prefixes); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->typehint_whitelist
    cJSON *typehint_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "typehint.whitelist");
    if (cJSON_IsNull(typehint_whitelist)) {
        typehint_whitelist = NULL;
    }
    if (typehint_whitelist) { 
    typehint_whitelist_local_nonprim = config_node_property_array_parseFromJSON(typehint_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties->resourcetype_whitelist
    cJSON *resourcetype_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_propertiesJSON, "resourcetype.whitelist");
    if (cJSON_IsNull(resourcetype_whitelist)) {
        resourcetype_whitelist = NULL;
    }
    if (resourcetype_whitelist) { 
    resourcetype_whitelist_local_nonprim = config_node_property_array_parseFromJSON(resourcetype_whitelist); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var = com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_create_internal (
        parameter_whitelist ? parameter_whitelist_local_nonprim : NULL,
        parameter_whitelist_prefixes ? parameter_whitelist_prefixes_local_nonprim : NULL,
        binary_parameter_whitelist ? binary_parameter_whitelist_local_nonprim : NULL,
        modifier_whitelist ? modifier_whitelist_local_nonprim : NULL,
        operation_whitelist ? operation_whitelist_local_nonprim : NULL,
        operation_whitelist_prefixes ? operation_whitelist_prefixes_local_nonprim : NULL,
        typehint_whitelist ? typehint_whitelist_local_nonprim : NULL,
        resourcetype_whitelist ? resourcetype_whitelist_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties_local_var;
end:
    if (parameter_whitelist_local_nonprim) {
        config_node_property_array_free(parameter_whitelist_local_nonprim);
        parameter_whitelist_local_nonprim = NULL;
    }
    if (parameter_whitelist_prefixes_local_nonprim) {
        config_node_property_array_free(parameter_whitelist_prefixes_local_nonprim);
        parameter_whitelist_prefixes_local_nonprim = NULL;
    }
    if (binary_parameter_whitelist_local_nonprim) {
        config_node_property_array_free(binary_parameter_whitelist_local_nonprim);
        binary_parameter_whitelist_local_nonprim = NULL;
    }
    if (modifier_whitelist_local_nonprim) {
        config_node_property_array_free(modifier_whitelist_local_nonprim);
        modifier_whitelist_local_nonprim = NULL;
    }
    if (operation_whitelist_local_nonprim) {
        config_node_property_array_free(operation_whitelist_local_nonprim);
        operation_whitelist_local_nonprim = NULL;
    }
    if (operation_whitelist_prefixes_local_nonprim) {
        config_node_property_array_free(operation_whitelist_prefixes_local_nonprim);
        operation_whitelist_prefixes_local_nonprim = NULL;
    }
    if (typehint_whitelist_local_nonprim) {
        config_node_property_array_free(typehint_whitelist_local_nonprim);
        typehint_whitelist_local_nonprim = NULL;
    }
    if (resourcetype_whitelist_local_nonprim) {
        config_node_property_array_free(resourcetype_whitelist_local_nonprim);
        resourcetype_whitelist_local_nonprim = NULL;
    }
    return NULL;

}
