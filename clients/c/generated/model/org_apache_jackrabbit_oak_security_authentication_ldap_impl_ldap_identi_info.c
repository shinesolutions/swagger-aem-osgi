#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info.h"



static org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_create_internal(
    char *pid,
    char *title,
    char *description,
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *properties
    ) {
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t));
    if (!org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t));
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var->pid = pid;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var->title = title;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var->description = description;
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var->properties = properties;
    return org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_create(
    char *pid,
    char *title,
    char *description,
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *properties
    ) {
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *result = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info) {
    if(NULL == org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid) {
        free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title) {
        free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description) {
        free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties) {
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties);
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties = NULL;
    }
    free(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info);
}

cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title) {
    if(cJSON_AddStringToObject(item, "title", org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description) {
    if(cJSON_AddStringToObject(item, "description", org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties
    if(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties) {
    cJSON *properties_local_JSON = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
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

org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_infoJSON){

    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_t *org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties
    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_t *properties_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var = org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info_local_var;
end:
    if (pid_local_str) {
        free(pid_local_str);
        pid_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (properties_local_nonprim) {
        org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
