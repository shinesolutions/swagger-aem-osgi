#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties.h"



static com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_create_internal(
    config_node_property_string_t *pattern_time,
    config_node_property_string_t *pattern_newline,
    config_node_property_string_t *pattern_day_of_month,
    config_node_property_string_t *pattern_month,
    config_node_property_string_t *pattern_year,
    config_node_property_string_t *pattern_date,
    config_node_property_string_t *pattern_date_time,
    config_node_property_string_t *pattern_email
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t));
    if (!com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t));
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_time = pattern_time;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_newline = pattern_newline;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_day_of_month = pattern_day_of_month;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_month = pattern_month;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_year = pattern_year;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_date = pattern_date;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_date_time = pattern_date_time;
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var->pattern_email = pattern_email;
    return com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_create(
    config_node_property_string_t *pattern_time,
    config_node_property_string_t *pattern_newline,
    config_node_property_string_t *pattern_day_of_month,
    config_node_property_string_t *pattern_month,
    config_node_property_string_t *pattern_year,
    config_node_property_string_t *pattern_date,
    config_node_property_string_t *pattern_date_time,
    config_node_property_string_t *pattern_email
    ) {
    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *result = com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_create_internal (
        pattern_time,
        pattern_newline,
        pattern_day_of_month,
        pattern_month,
        pattern_year,
        pattern_date,
        pattern_date_time,
        pattern_email
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties) {
    if(NULL == com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email) {
        config_node_property_string_free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email);
        com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email = NULL;
    }
    free(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties);
}

cJSON *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time) {
    cJSON *pattern_time_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time);
    if(pattern_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.time", pattern_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline) {
    cJSON *pattern_newline_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline);
    if(pattern_newline_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.newline", pattern_newline_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month) {
    cJSON *pattern_day_of_month_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month);
    if(pattern_day_of_month_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.dayOfMonth", pattern_day_of_month_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month) {
    cJSON *pattern_month_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month);
    if(pattern_month_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.month", pattern_month_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year) {
    cJSON *pattern_year_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year);
    if(pattern_year_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.year", pattern_year_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date) {
    cJSON *pattern_date_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date);
    if(pattern_date_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.date", pattern_date_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time) {
    cJSON *pattern_date_time_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time);
    if(pattern_date_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.dateTime", pattern_date_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email
    if(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email) {
    cJSON *pattern_email_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email);
    if(pattern_email_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern.email", pattern_email_local_JSON);
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

com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON){

    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_t *com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time
    config_node_property_string_t *pattern_time_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline
    config_node_property_string_t *pattern_newline_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month
    config_node_property_string_t *pattern_day_of_month_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month
    config_node_property_string_t *pattern_month_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year
    config_node_property_string_t *pattern_year_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date
    config_node_property_string_t *pattern_date_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time
    config_node_property_string_t *pattern_date_time_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email
    config_node_property_string_t *pattern_email_local_nonprim = NULL;

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_time
    cJSON *pattern_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.time");
    if (cJSON_IsNull(pattern_time)) {
        pattern_time = NULL;
    }
    if (pattern_time) { 
    pattern_time_local_nonprim = config_node_property_string_parseFromJSON(pattern_time); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_newline
    cJSON *pattern_newline = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.newline");
    if (cJSON_IsNull(pattern_newline)) {
        pattern_newline = NULL;
    }
    if (pattern_newline) { 
    pattern_newline_local_nonprim = config_node_property_string_parseFromJSON(pattern_newline); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_day_of_month
    cJSON *pattern_day_of_month = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.dayOfMonth");
    if (cJSON_IsNull(pattern_day_of_month)) {
        pattern_day_of_month = NULL;
    }
    if (pattern_day_of_month) { 
    pattern_day_of_month_local_nonprim = config_node_property_string_parseFromJSON(pattern_day_of_month); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_month
    cJSON *pattern_month = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.month");
    if (cJSON_IsNull(pattern_month)) {
        pattern_month = NULL;
    }
    if (pattern_month) { 
    pattern_month_local_nonprim = config_node_property_string_parseFromJSON(pattern_month); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_year
    cJSON *pattern_year = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.year");
    if (cJSON_IsNull(pattern_year)) {
        pattern_year = NULL;
    }
    if (pattern_year) { 
    pattern_year_local_nonprim = config_node_property_string_parseFromJSON(pattern_year); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date
    cJSON *pattern_date = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.date");
    if (cJSON_IsNull(pattern_date)) {
        pattern_date = NULL;
    }
    if (pattern_date) { 
    pattern_date_local_nonprim = config_node_property_string_parseFromJSON(pattern_date); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_date_time
    cJSON *pattern_date_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.dateTime");
    if (cJSON_IsNull(pattern_date_time)) {
        pattern_date_time = NULL;
    }
    if (pattern_date_time) { 
    pattern_date_time_local_nonprim = config_node_property_string_parseFromJSON(pattern_date_time); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties->pattern_email
    cJSON *pattern_email = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_propertiesJSON, "pattern.email");
    if (cJSON_IsNull(pattern_email)) {
        pattern_email = NULL;
    }
    if (pattern_email) { 
    pattern_email_local_nonprim = config_node_property_string_parseFromJSON(pattern_email); //nonprimitive
    }



    com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var = com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_create_internal (
        pattern_time ? pattern_time_local_nonprim : NULL,
        pattern_newline ? pattern_newline_local_nonprim : NULL,
        pattern_day_of_month ? pattern_day_of_month_local_nonprim : NULL,
        pattern_month ? pattern_month_local_nonprim : NULL,
        pattern_year ? pattern_year_local_nonprim : NULL,
        pattern_date ? pattern_date_local_nonprim : NULL,
        pattern_date_time ? pattern_date_time_local_nonprim : NULL,
        pattern_email ? pattern_email_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_local_var;
end:
    if (pattern_time_local_nonprim) {
        config_node_property_string_free(pattern_time_local_nonprim);
        pattern_time_local_nonprim = NULL;
    }
    if (pattern_newline_local_nonprim) {
        config_node_property_string_free(pattern_newline_local_nonprim);
        pattern_newline_local_nonprim = NULL;
    }
    if (pattern_day_of_month_local_nonprim) {
        config_node_property_string_free(pattern_day_of_month_local_nonprim);
        pattern_day_of_month_local_nonprim = NULL;
    }
    if (pattern_month_local_nonprim) {
        config_node_property_string_free(pattern_month_local_nonprim);
        pattern_month_local_nonprim = NULL;
    }
    if (pattern_year_local_nonprim) {
        config_node_property_string_free(pattern_year_local_nonprim);
        pattern_year_local_nonprim = NULL;
    }
    if (pattern_date_local_nonprim) {
        config_node_property_string_free(pattern_date_local_nonprim);
        pattern_date_local_nonprim = NULL;
    }
    if (pattern_date_time_local_nonprim) {
        config_node_property_string_free(pattern_date_time_local_nonprim);
        pattern_date_time_local_nonprim = NULL;
    }
    if (pattern_email_local_nonprim) {
        config_node_property_string_free(pattern_email_local_nonprim);
        pattern_email_local_nonprim = NULL;
    }
    return NULL;

}
