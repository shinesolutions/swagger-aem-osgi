#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adaptive_form_and_interactive_communication_web_channel_configuration_properties.h"



static adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties_create_internal(
    config_node_property_boolean_t *show_placeholder,
    config_node_property_integer_t *maximum_cache_entries,
    config_node_property_drop_down_t *af_scripting_compatversion,
    config_node_property_boolean_t *make_file_name_unique,
    config_node_property_boolean_t *generating_compliant_data
    ) {
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var = malloc(sizeof(adaptive_form_and_interactive_communication_web_channel_configuration_properties_t));
    if (!adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var) {
        return NULL;
    }
    memset(adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var, 0, sizeof(adaptive_form_and_interactive_communication_web_channel_configuration_properties_t));
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->_library_owned = 1;
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->show_placeholder = show_placeholder;
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->maximum_cache_entries = maximum_cache_entries;
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->af_scripting_compatversion = af_scripting_compatversion;
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->make_file_name_unique = make_file_name_unique;
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var->generating_compliant_data = generating_compliant_data;
    return adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var;
}

__attribute__((deprecated)) adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties_create(
    config_node_property_boolean_t *show_placeholder,
    config_node_property_integer_t *maximum_cache_entries,
    config_node_property_drop_down_t *af_scripting_compatversion,
    config_node_property_boolean_t *make_file_name_unique,
    config_node_property_boolean_t *generating_compliant_data
    ) {
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *result = adaptive_form_and_interactive_communication_web_channel_configuration_properties_create_internal (
        show_placeholder,
        maximum_cache_entries,
        af_scripting_compatversion,
        make_file_name_unique,
        generating_compliant_data
        );
    if (!result) {
    }
    return result;
}

void adaptive_form_and_interactive_communication_web_channel_configuration_properties_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties) {
    if(NULL == adaptive_form_and_interactive_communication_web_channel_configuration_properties){
        return ;
    }
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "adaptive_form_and_interactive_communication_web_channel_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder) {
        config_node_property_boolean_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder);
        adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries) {
        config_node_property_integer_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries);
        adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion) {
        config_node_property_drop_down_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion);
        adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique) {
        config_node_property_boolean_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique);
        adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data) {
        config_node_property_boolean_free(adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data);
        adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data = NULL;
    }
    free(adaptive_form_and_interactive_communication_web_channel_configuration_properties);
}

cJSON *adaptive_form_and_interactive_communication_web_channel_configuration_properties_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder) {
    cJSON *show_placeholder_local_JSON = config_node_property_boolean_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder);
    if(show_placeholder_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "showPlaceholder", show_placeholder_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries) {
    cJSON *maximum_cache_entries_local_JSON = config_node_property_integer_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries);
    if(maximum_cache_entries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maximumCacheEntries", maximum_cache_entries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion) {
    cJSON *af_scripting_compatversion_local_JSON = config_node_property_drop_down_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion);
    if(af_scripting_compatversion_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "af.scripting.compatversion", af_scripting_compatversion_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique) {
    cJSON *make_file_name_unique_local_JSON = config_node_property_boolean_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique);
    if(make_file_name_unique_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "makeFileNameUnique", make_file_name_unique_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data
    if(adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data) {
    cJSON *generating_compliant_data_local_JSON = config_node_property_boolean_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data);
    if(generating_compliant_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generatingCompliantData", generating_compliant_data_local_JSON);
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

adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties_parseFromJSON(cJSON *adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON){

    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder
    config_node_property_boolean_t *show_placeholder_local_nonprim = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries
    config_node_property_integer_t *maximum_cache_entries_local_nonprim = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion
    config_node_property_drop_down_t *af_scripting_compatversion_local_nonprim = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique
    config_node_property_boolean_t *make_file_name_unique_local_nonprim = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data
    config_node_property_boolean_t *generating_compliant_data_local_nonprim = NULL;

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->show_placeholder
    cJSON *show_placeholder = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON, "showPlaceholder");
    if (cJSON_IsNull(show_placeholder)) {
        show_placeholder = NULL;
    }
    if (show_placeholder) { 
    show_placeholder_local_nonprim = config_node_property_boolean_parseFromJSON(show_placeholder); //nonprimitive
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->maximum_cache_entries
    cJSON *maximum_cache_entries = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON, "maximumCacheEntries");
    if (cJSON_IsNull(maximum_cache_entries)) {
        maximum_cache_entries = NULL;
    }
    if (maximum_cache_entries) { 
    maximum_cache_entries_local_nonprim = config_node_property_integer_parseFromJSON(maximum_cache_entries); //nonprimitive
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->af_scripting_compatversion
    cJSON *af_scripting_compatversion = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON, "af.scripting.compatversion");
    if (cJSON_IsNull(af_scripting_compatversion)) {
        af_scripting_compatversion = NULL;
    }
    if (af_scripting_compatversion) { 
    af_scripting_compatversion_local_nonprim = config_node_property_drop_down_parseFromJSON(af_scripting_compatversion); //nonprimitive
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->make_file_name_unique
    cJSON *make_file_name_unique = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON, "makeFileNameUnique");
    if (cJSON_IsNull(make_file_name_unique)) {
        make_file_name_unique = NULL;
    }
    if (make_file_name_unique) { 
    make_file_name_unique_local_nonprim = config_node_property_boolean_parseFromJSON(make_file_name_unique); //nonprimitive
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_properties->generating_compliant_data
    cJSON *generating_compliant_data = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_propertiesJSON, "generatingCompliantData");
    if (cJSON_IsNull(generating_compliant_data)) {
        generating_compliant_data = NULL;
    }
    if (generating_compliant_data) { 
    generating_compliant_data_local_nonprim = config_node_property_boolean_parseFromJSON(generating_compliant_data); //nonprimitive
    }



    adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var = adaptive_form_and_interactive_communication_web_channel_configuration_properties_create_internal (
        show_placeholder ? show_placeholder_local_nonprim : NULL,
        maximum_cache_entries ? maximum_cache_entries_local_nonprim : NULL,
        af_scripting_compatversion ? af_scripting_compatversion_local_nonprim : NULL,
        make_file_name_unique ? make_file_name_unique_local_nonprim : NULL,
        generating_compliant_data ? generating_compliant_data_local_nonprim : NULL
        );

    if (!adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var) {
        goto end;
    }

    return adaptive_form_and_interactive_communication_web_channel_configuration_properties_local_var;
end:
    if (show_placeholder_local_nonprim) {
        config_node_property_boolean_free(show_placeholder_local_nonprim);
        show_placeholder_local_nonprim = NULL;
    }
    if (maximum_cache_entries_local_nonprim) {
        config_node_property_integer_free(maximum_cache_entries_local_nonprim);
        maximum_cache_entries_local_nonprim = NULL;
    }
    if (af_scripting_compatversion_local_nonprim) {
        config_node_property_drop_down_free(af_scripting_compatversion_local_nonprim);
        af_scripting_compatversion_local_nonprim = NULL;
    }
    if (make_file_name_unique_local_nonprim) {
        config_node_property_boolean_free(make_file_name_unique_local_nonprim);
        make_file_name_unique_local_nonprim = NULL;
    }
    if (generating_compliant_data_local_nonprim) {
        config_node_property_boolean_free(generating_compliant_data_local_nonprim);
        generating_compliant_data_local_nonprim = NULL;
    }
    return NULL;

}
