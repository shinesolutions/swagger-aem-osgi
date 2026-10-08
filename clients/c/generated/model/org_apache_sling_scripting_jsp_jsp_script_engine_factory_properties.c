#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties.h"



static org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_create_internal(
    config_node_property_string_t *jasper_compiler_target_vm,
    config_node_property_string_t *jasper_compiler_source_vm,
    config_node_property_boolean_t *jasper_classdebuginfo,
    config_node_property_boolean_t *jasper_enable_pooling,
    config_node_property_string_t *jasper_ie_class_id,
    config_node_property_boolean_t *jasper_gen_string_as_char_array,
    config_node_property_boolean_t *jasper_keepgenerated,
    config_node_property_boolean_t *jasper_mappedfile,
    config_node_property_boolean_t *jasper_trim_spaces,
    config_node_property_boolean_t *jasper_display_source_fragments,
    config_node_property_boolean_t *default_is_session
    ) {
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var = malloc(sizeof(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t));
    if (!org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var, 0, sizeof(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t));
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_compiler_target_vm = jasper_compiler_target_vm;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_compiler_source_vm = jasper_compiler_source_vm;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_classdebuginfo = jasper_classdebuginfo;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_enable_pooling = jasper_enable_pooling;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_ie_class_id = jasper_ie_class_id;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_gen_string_as_char_array = jasper_gen_string_as_char_array;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_keepgenerated = jasper_keepgenerated;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_mappedfile = jasper_mappedfile;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_trim_spaces = jasper_trim_spaces;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->jasper_display_source_fragments = jasper_display_source_fragments;
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var->default_is_session = default_is_session;
    return org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_create(
    config_node_property_string_t *jasper_compiler_target_vm,
    config_node_property_string_t *jasper_compiler_source_vm,
    config_node_property_boolean_t *jasper_classdebuginfo,
    config_node_property_boolean_t *jasper_enable_pooling,
    config_node_property_string_t *jasper_ie_class_id,
    config_node_property_boolean_t *jasper_gen_string_as_char_array,
    config_node_property_boolean_t *jasper_keepgenerated,
    config_node_property_boolean_t *jasper_mappedfile,
    config_node_property_boolean_t *jasper_trim_spaces,
    config_node_property_boolean_t *jasper_display_source_fragments,
    config_node_property_boolean_t *default_is_session
    ) {
    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *result = org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_create_internal (
        jasper_compiler_target_vm,
        jasper_compiler_source_vm,
        jasper_classdebuginfo,
        jasper_enable_pooling,
        jasper_ie_class_id,
        jasper_gen_string_as_char_array,
        jasper_keepgenerated,
        jasper_mappedfile,
        jasper_trim_spaces,
        jasper_display_source_fragments,
        default_is_session
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties) {
    if(NULL == org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties){
        return ;
    }
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm) {
        config_node_property_string_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm) {
        config_node_property_string_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id) {
        config_node_property_string_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments = NULL;
    }
    if (org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session) {
        config_node_property_boolean_free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session);
        org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session = NULL;
    }
    free(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties);
}

cJSON *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm) {
    cJSON *jasper_compiler_target_vm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm);
    if(jasper_compiler_target_vm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.compilerTargetVM", jasper_compiler_target_vm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm) {
    cJSON *jasper_compiler_source_vm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm);
    if(jasper_compiler_source_vm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.compilerSourceVM", jasper_compiler_source_vm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo) {
    cJSON *jasper_classdebuginfo_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo);
    if(jasper_classdebuginfo_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.classdebuginfo", jasper_classdebuginfo_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling) {
    cJSON *jasper_enable_pooling_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling);
    if(jasper_enable_pooling_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.enablePooling", jasper_enable_pooling_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id) {
    cJSON *jasper_ie_class_id_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id);
    if(jasper_ie_class_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.ieClassId", jasper_ie_class_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array) {
    cJSON *jasper_gen_string_as_char_array_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array);
    if(jasper_gen_string_as_char_array_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.genStringAsCharArray", jasper_gen_string_as_char_array_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated) {
    cJSON *jasper_keepgenerated_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated);
    if(jasper_keepgenerated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.keepgenerated", jasper_keepgenerated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile) {
    cJSON *jasper_mappedfile_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile);
    if(jasper_mappedfile_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.mappedfile", jasper_mappedfile_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces) {
    cJSON *jasper_trim_spaces_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces);
    if(jasper_trim_spaces_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.trimSpaces", jasper_trim_spaces_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments) {
    cJSON *jasper_display_source_fragments_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments);
    if(jasper_display_source_fragments_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jasper.displaySourceFragments", jasper_display_source_fragments_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session
    if(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session) {
    cJSON *default_is_session_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session);
    if(default_is_session_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.is.session", default_is_session_local_JSON);
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

org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_parseFromJSON(cJSON *org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON){

    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_t *org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm
    config_node_property_string_t *jasper_compiler_target_vm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm
    config_node_property_string_t *jasper_compiler_source_vm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo
    config_node_property_boolean_t *jasper_classdebuginfo_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling
    config_node_property_boolean_t *jasper_enable_pooling_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id
    config_node_property_string_t *jasper_ie_class_id_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array
    config_node_property_boolean_t *jasper_gen_string_as_char_array_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated
    config_node_property_boolean_t *jasper_keepgenerated_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile
    config_node_property_boolean_t *jasper_mappedfile_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces
    config_node_property_boolean_t *jasper_trim_spaces_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments
    config_node_property_boolean_t *jasper_display_source_fragments_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session
    config_node_property_boolean_t *default_is_session_local_nonprim = NULL;

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_target_vm
    cJSON *jasper_compiler_target_vm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.compilerTargetVM");
    if (cJSON_IsNull(jasper_compiler_target_vm)) {
        jasper_compiler_target_vm = NULL;
    }
    if (jasper_compiler_target_vm) { 
    jasper_compiler_target_vm_local_nonprim = config_node_property_string_parseFromJSON(jasper_compiler_target_vm); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_compiler_source_vm
    cJSON *jasper_compiler_source_vm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.compilerSourceVM");
    if (cJSON_IsNull(jasper_compiler_source_vm)) {
        jasper_compiler_source_vm = NULL;
    }
    if (jasper_compiler_source_vm) { 
    jasper_compiler_source_vm_local_nonprim = config_node_property_string_parseFromJSON(jasper_compiler_source_vm); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_classdebuginfo
    cJSON *jasper_classdebuginfo = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.classdebuginfo");
    if (cJSON_IsNull(jasper_classdebuginfo)) {
        jasper_classdebuginfo = NULL;
    }
    if (jasper_classdebuginfo) { 
    jasper_classdebuginfo_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_classdebuginfo); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_enable_pooling
    cJSON *jasper_enable_pooling = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.enablePooling");
    if (cJSON_IsNull(jasper_enable_pooling)) {
        jasper_enable_pooling = NULL;
    }
    if (jasper_enable_pooling) { 
    jasper_enable_pooling_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_enable_pooling); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_ie_class_id
    cJSON *jasper_ie_class_id = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.ieClassId");
    if (cJSON_IsNull(jasper_ie_class_id)) {
        jasper_ie_class_id = NULL;
    }
    if (jasper_ie_class_id) { 
    jasper_ie_class_id_local_nonprim = config_node_property_string_parseFromJSON(jasper_ie_class_id); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_gen_string_as_char_array
    cJSON *jasper_gen_string_as_char_array = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.genStringAsCharArray");
    if (cJSON_IsNull(jasper_gen_string_as_char_array)) {
        jasper_gen_string_as_char_array = NULL;
    }
    if (jasper_gen_string_as_char_array) { 
    jasper_gen_string_as_char_array_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_gen_string_as_char_array); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_keepgenerated
    cJSON *jasper_keepgenerated = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.keepgenerated");
    if (cJSON_IsNull(jasper_keepgenerated)) {
        jasper_keepgenerated = NULL;
    }
    if (jasper_keepgenerated) { 
    jasper_keepgenerated_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_keepgenerated); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_mappedfile
    cJSON *jasper_mappedfile = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.mappedfile");
    if (cJSON_IsNull(jasper_mappedfile)) {
        jasper_mappedfile = NULL;
    }
    if (jasper_mappedfile) { 
    jasper_mappedfile_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_mappedfile); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_trim_spaces
    cJSON *jasper_trim_spaces = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.trimSpaces");
    if (cJSON_IsNull(jasper_trim_spaces)) {
        jasper_trim_spaces = NULL;
    }
    if (jasper_trim_spaces) { 
    jasper_trim_spaces_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_trim_spaces); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->jasper_display_source_fragments
    cJSON *jasper_display_source_fragments = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "jasper.displaySourceFragments");
    if (cJSON_IsNull(jasper_display_source_fragments)) {
        jasper_display_source_fragments = NULL;
    }
    if (jasper_display_source_fragments) { 
    jasper_display_source_fragments_local_nonprim = config_node_property_boolean_parseFromJSON(jasper_display_source_fragments); //nonprimitive
    }

    // org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties->default_is_session
    cJSON *default_is_session = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_jsp_jsp_script_engine_factory_propertiesJSON, "default.is.session");
    if (cJSON_IsNull(default_is_session)) {
        default_is_session = NULL;
    }
    if (default_is_session) { 
    default_is_session_local_nonprim = config_node_property_boolean_parseFromJSON(default_is_session); //nonprimitive
    }



    org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var = org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_create_internal (
        jasper_compiler_target_vm ? jasper_compiler_target_vm_local_nonprim : NULL,
        jasper_compiler_source_vm ? jasper_compiler_source_vm_local_nonprim : NULL,
        jasper_classdebuginfo ? jasper_classdebuginfo_local_nonprim : NULL,
        jasper_enable_pooling ? jasper_enable_pooling_local_nonprim : NULL,
        jasper_ie_class_id ? jasper_ie_class_id_local_nonprim : NULL,
        jasper_gen_string_as_char_array ? jasper_gen_string_as_char_array_local_nonprim : NULL,
        jasper_keepgenerated ? jasper_keepgenerated_local_nonprim : NULL,
        jasper_mappedfile ? jasper_mappedfile_local_nonprim : NULL,
        jasper_trim_spaces ? jasper_trim_spaces_local_nonprim : NULL,
        jasper_display_source_fragments ? jasper_display_source_fragments_local_nonprim : NULL,
        default_is_session ? default_is_session_local_nonprim : NULL
        );

    if (!org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_scripting_jsp_jsp_script_engine_factory_properties_local_var;
end:
    if (jasper_compiler_target_vm_local_nonprim) {
        config_node_property_string_free(jasper_compiler_target_vm_local_nonprim);
        jasper_compiler_target_vm_local_nonprim = NULL;
    }
    if (jasper_compiler_source_vm_local_nonprim) {
        config_node_property_string_free(jasper_compiler_source_vm_local_nonprim);
        jasper_compiler_source_vm_local_nonprim = NULL;
    }
    if (jasper_classdebuginfo_local_nonprim) {
        config_node_property_boolean_free(jasper_classdebuginfo_local_nonprim);
        jasper_classdebuginfo_local_nonprim = NULL;
    }
    if (jasper_enable_pooling_local_nonprim) {
        config_node_property_boolean_free(jasper_enable_pooling_local_nonprim);
        jasper_enable_pooling_local_nonprim = NULL;
    }
    if (jasper_ie_class_id_local_nonprim) {
        config_node_property_string_free(jasper_ie_class_id_local_nonprim);
        jasper_ie_class_id_local_nonprim = NULL;
    }
    if (jasper_gen_string_as_char_array_local_nonprim) {
        config_node_property_boolean_free(jasper_gen_string_as_char_array_local_nonprim);
        jasper_gen_string_as_char_array_local_nonprim = NULL;
    }
    if (jasper_keepgenerated_local_nonprim) {
        config_node_property_boolean_free(jasper_keepgenerated_local_nonprim);
        jasper_keepgenerated_local_nonprim = NULL;
    }
    if (jasper_mappedfile_local_nonprim) {
        config_node_property_boolean_free(jasper_mappedfile_local_nonprim);
        jasper_mappedfile_local_nonprim = NULL;
    }
    if (jasper_trim_spaces_local_nonprim) {
        config_node_property_boolean_free(jasper_trim_spaces_local_nonprim);
        jasper_trim_spaces_local_nonprim = NULL;
    }
    if (jasper_display_source_fragments_local_nonprim) {
        config_node_property_boolean_free(jasper_display_source_fragments_local_nonprim);
        jasper_display_source_fragments_local_nonprim = NULL;
    }
    if (default_is_session_local_nonprim) {
        config_node_property_boolean_free(default_is_session_local_nonprim);
        default_is_session_local_nonprim = NULL;
    }
    return NULL;

}
