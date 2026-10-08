#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_scripting_java_impl_java_script_engine_factory_properties.h"



static org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_create_internal(
    config_node_property_boolean_t *java_classdebuginfo,
    config_node_property_string_t *java_java_encoding,
    config_node_property_string_t *java_compiler_source_vm,
    config_node_property_string_t *java_compiler_target_vm
    ) {
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var = malloc(sizeof(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t));
    if (!org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var, 0, sizeof(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t));
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var->java_classdebuginfo = java_classdebuginfo;
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var->java_java_encoding = java_java_encoding;
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var->java_compiler_source_vm = java_compiler_source_vm;
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var->java_compiler_target_vm = java_compiler_target_vm;
    return org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_create(
    config_node_property_boolean_t *java_classdebuginfo,
    config_node_property_string_t *java_java_encoding,
    config_node_property_string_t *java_compiler_source_vm,
    config_node_property_string_t *java_compiler_target_vm
    ) {
    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *result = org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_create_internal (
        java_classdebuginfo,
        java_java_encoding,
        java_compiler_source_vm,
        java_compiler_target_vm
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties) {
    if(NULL == org_apache_sling_scripting_java_impl_java_script_engine_factory_properties){
        return ;
    }
    if(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo) {
        config_node_property_boolean_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo);
        org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo = NULL;
    }
    if (org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding) {
        config_node_property_string_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding);
        org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding = NULL;
    }
    if (org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm) {
        config_node_property_string_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm);
        org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm = NULL;
    }
    if (org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm) {
        config_node_property_string_free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm);
        org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm = NULL;
    }
    free(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties);
}

cJSON *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo
    if(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo) {
    cJSON *java_classdebuginfo_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo);
    if(java_classdebuginfo_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.classdebuginfo", java_classdebuginfo_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding
    if(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding) {
    cJSON *java_java_encoding_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding);
    if(java_java_encoding_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.javaEncoding", java_java_encoding_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm
    if(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm) {
    cJSON *java_compiler_source_vm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm);
    if(java_compiler_source_vm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.compilerSourceVM", java_compiler_source_vm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm
    if(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm) {
    cJSON *java_compiler_target_vm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm);
    if(java_compiler_target_vm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "java.compilerTargetVM", java_compiler_target_vm_local_JSON);
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

org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_parseFromJSON(cJSON *org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON){

    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_t *org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo
    config_node_property_boolean_t *java_classdebuginfo_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding
    config_node_property_string_t *java_java_encoding_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm
    config_node_property_string_t *java_compiler_source_vm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm
    config_node_property_string_t *java_compiler_target_vm_local_nonprim = NULL;

    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_classdebuginfo
    cJSON *java_classdebuginfo = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON, "java.classdebuginfo");
    if (cJSON_IsNull(java_classdebuginfo)) {
        java_classdebuginfo = NULL;
    }
    if (java_classdebuginfo) { 
    java_classdebuginfo_local_nonprim = config_node_property_boolean_parseFromJSON(java_classdebuginfo); //nonprimitive
    }

    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_java_encoding
    cJSON *java_java_encoding = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON, "java.javaEncoding");
    if (cJSON_IsNull(java_java_encoding)) {
        java_java_encoding = NULL;
    }
    if (java_java_encoding) { 
    java_java_encoding_local_nonprim = config_node_property_string_parseFromJSON(java_java_encoding); //nonprimitive
    }

    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_source_vm
    cJSON *java_compiler_source_vm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON, "java.compilerSourceVM");
    if (cJSON_IsNull(java_compiler_source_vm)) {
        java_compiler_source_vm = NULL;
    }
    if (java_compiler_source_vm) { 
    java_compiler_source_vm_local_nonprim = config_node_property_string_parseFromJSON(java_compiler_source_vm); //nonprimitive
    }

    // org_apache_sling_scripting_java_impl_java_script_engine_factory_properties->java_compiler_target_vm
    cJSON *java_compiler_target_vm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_java_impl_java_script_engine_factory_propertiesJSON, "java.compilerTargetVM");
    if (cJSON_IsNull(java_compiler_target_vm)) {
        java_compiler_target_vm = NULL;
    }
    if (java_compiler_target_vm) { 
    java_compiler_target_vm_local_nonprim = config_node_property_string_parseFromJSON(java_compiler_target_vm); //nonprimitive
    }



    org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var = org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_create_internal (
        java_classdebuginfo ? java_classdebuginfo_local_nonprim : NULL,
        java_java_encoding ? java_java_encoding_local_nonprim : NULL,
        java_compiler_source_vm ? java_compiler_source_vm_local_nonprim : NULL,
        java_compiler_target_vm ? java_compiler_target_vm_local_nonprim : NULL
        );

    if (!org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_scripting_java_impl_java_script_engine_factory_properties_local_var;
end:
    if (java_classdebuginfo_local_nonprim) {
        config_node_property_boolean_free(java_classdebuginfo_local_nonprim);
        java_classdebuginfo_local_nonprim = NULL;
    }
    if (java_java_encoding_local_nonprim) {
        config_node_property_string_free(java_java_encoding_local_nonprim);
        java_java_encoding_local_nonprim = NULL;
    }
    if (java_compiler_source_vm_local_nonprim) {
        config_node_property_string_free(java_compiler_source_vm_local_nonprim);
        java_compiler_source_vm_local_nonprim = NULL;
    }
    if (java_compiler_target_vm_local_nonprim) {
        config_node_property_string_free(java_compiler_target_vm_local_nonprim);
        java_compiler_target_vm_local_nonprim = NULL;
    }
    return NULL;

}
