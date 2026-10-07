#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "config_node_property_integer.h"



static config_node_property_integer_t *config_node_property_integer_create_internal(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
    ) {
    config_node_property_integer_t *config_node_property_integer_local_var = malloc(sizeof(config_node_property_integer_t));
    if (!config_node_property_integer_local_var) {
        return NULL;
    }
    memset(config_node_property_integer_local_var, 0, sizeof(config_node_property_integer_t));
    config_node_property_integer_local_var->_library_owned = 1;
    config_node_property_integer_local_var->name = name;
    config_node_property_integer_local_var->optional = optional;
    config_node_property_integer_local_var->is_set = is_set;
    config_node_property_integer_local_var->type = type;
    config_node_property_integer_local_var->value = value;
    config_node_property_integer_local_var->description = description;
    return config_node_property_integer_local_var;
}

__attribute__((deprecated)) config_node_property_integer_t *config_node_property_integer_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
    ) {
    int *optional_copy = NULL;
    if (optional) {
        optional_copy = malloc(sizeof(int));
        if (optional_copy) *optional_copy = *optional;
    }
    int *is_set_copy = NULL;
    if (is_set) {
        is_set_copy = malloc(sizeof(int));
        if (is_set_copy) *is_set_copy = *is_set;
    }
    int *type_copy = NULL;
    if (type) {
        type_copy = malloc(sizeof(int));
        if (type_copy) *type_copy = *type;
    }
    int *value_copy = NULL;
    if (value) {
        value_copy = malloc(sizeof(int));
        if (value_copy) *value_copy = *value;
    }
    config_node_property_integer_t *result = config_node_property_integer_create_internal (
        name,
        optional_copy,
        is_set_copy,
        type_copy,
        value_copy,
        description
        );
    if (!result) {
        free(optional_copy);
        free(is_set_copy);
        free(type_copy);
        free(value_copy);
    }
    return result;
}

void config_node_property_integer_free(config_node_property_integer_t *config_node_property_integer) {
    if(NULL == config_node_property_integer){
        return ;
    }
    if(config_node_property_integer->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "config_node_property_integer_free");
        return ;
    }
    listEntry_t *listEntry;
    if (config_node_property_integer->name) {
        free(config_node_property_integer->name);
        config_node_property_integer->name = NULL;
    }
    if (config_node_property_integer->optional) {
        free(config_node_property_integer->optional);
        config_node_property_integer->optional = NULL;
    }
    if (config_node_property_integer->is_set) {
        free(config_node_property_integer->is_set);
        config_node_property_integer->is_set = NULL;
    }
    if (config_node_property_integer->type) {
        free(config_node_property_integer->type);
        config_node_property_integer->type = NULL;
    }
    if (config_node_property_integer->value) {
        free(config_node_property_integer->value);
        config_node_property_integer->value = NULL;
    }
    if (config_node_property_integer->description) {
        free(config_node_property_integer->description);
        config_node_property_integer->description = NULL;
    }
    free(config_node_property_integer);
}

cJSON *config_node_property_integer_convertToJSON(config_node_property_integer_t *config_node_property_integer) {
    cJSON *item = cJSON_CreateObject();

    // config_node_property_integer->name
    if(config_node_property_integer->name) {
    if(cJSON_AddStringToObject(item, "name", config_node_property_integer->name) == NULL) {
    goto fail; //String
    }
    }


    // config_node_property_integer->optional
    if(config_node_property_integer->optional) {
    if(cJSON_AddBoolToObject(item, "optional", *config_node_property_integer->optional) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_integer->is_set
    if(config_node_property_integer->is_set) {
    if(cJSON_AddBoolToObject(item, "is_set", *config_node_property_integer->is_set) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_integer->type
    if(config_node_property_integer->type) {
    if(cJSON_AddNumberToObject(item, "type", *config_node_property_integer->type) == NULL) {
    goto fail; //Numeric
    }
    }


    // config_node_property_integer->value
    if(config_node_property_integer->value) {
    if(cJSON_AddNumberToObject(item, "value", *config_node_property_integer->value) == NULL) {
    goto fail; //Numeric
    }
    }


    // config_node_property_integer->description
    if(config_node_property_integer->description) {
    if(cJSON_AddStringToObject(item, "description", config_node_property_integer->description) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

config_node_property_integer_t *config_node_property_integer_parseFromJSON(cJSON *config_node_property_integerJSON){

    config_node_property_integer_t *config_node_property_integer_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for config_node_property_integer->optional
    int *optional_local_var = NULL;

    // define the local variable for config_node_property_integer->is_set
    int *is_set_local_var = NULL;

    // define the local variable for config_node_property_integer->type
    int *type_local_var = NULL;

    // define the local variable for config_node_property_integer->value
    int *value_local_var = NULL;

    char *description_local_str = NULL;

    // config_node_property_integer->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // config_node_property_integer->optional
    cJSON *optional = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "optional");
    if (cJSON_IsNull(optional)) {
        optional = NULL;
    }
    if (optional) { 
    if(!cJSON_IsBool(optional))
    {
    goto end; //Bool
    }
    optional_local_var = malloc(sizeof(int));
    if(!optional_local_var)
    {
        goto end;
    }
    *optional_local_var = optional->valueint;
    }

    // config_node_property_integer->is_set
    cJSON *is_set = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "is_set");
    if (cJSON_IsNull(is_set)) {
        is_set = NULL;
    }
    if (is_set) { 
    if(!cJSON_IsBool(is_set))
    {
    goto end; //Bool
    }
    is_set_local_var = malloc(sizeof(int));
    if(!is_set_local_var)
    {
        goto end;
    }
    *is_set_local_var = is_set->valueint;
    }

    // config_node_property_integer->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsNumber(type))
    {
    goto end; //Numeric
    }
    type_local_var = malloc(sizeof(int));
    if(!type_local_var)
    {
        goto end;
    }
    *type_local_var = type->valuedouble;
    }

    // config_node_property_integer->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    value_local_var = malloc(sizeof(int));
    if(!value_local_var)
    {
        goto end;
    }
    *value_local_var = value->valuedouble;
    }

    // config_node_property_integer->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(config_node_property_integerJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    config_node_property_integer_local_var = config_node_property_integer_create_internal (
        name_local_str,
        optional_local_var,
        is_set_local_var,
        type_local_var,
        value_local_var,
        description_local_str
        );

    if (!config_node_property_integer_local_var) {
        goto end;
    }

    return config_node_property_integer_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (optional_local_var) {
        free(optional_local_var);
        optional_local_var = NULL;
    }
    if (is_set_local_var) {
        free(is_set_local_var);
        is_set_local_var = NULL;
    }
    if (type_local_var) {
        free(type_local_var);
        type_local_var = NULL;
    }
    if (value_local_var) {
        free(value_local_var);
        value_local_var = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    return NULL;

}
