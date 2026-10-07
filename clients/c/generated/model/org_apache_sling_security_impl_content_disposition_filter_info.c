#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_security_impl_content_disposition_filter_info.h"



static org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info_create_internal(
    char *pid,
    char *title,
    char *description,
    org_apache_sling_security_impl_content_disposition_filter_properties_t *properties,
    char *bundle_location,
    char *service_location
    ) {
    org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info_local_var = malloc(sizeof(org_apache_sling_security_impl_content_disposition_filter_info_t));
    if (!org_apache_sling_security_impl_content_disposition_filter_info_local_var) {
        return NULL;
    }
    memset(org_apache_sling_security_impl_content_disposition_filter_info_local_var, 0, sizeof(org_apache_sling_security_impl_content_disposition_filter_info_t));
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->_library_owned = 1;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->pid = pid;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->title = title;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->description = description;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->properties = properties;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->bundle_location = bundle_location;
    org_apache_sling_security_impl_content_disposition_filter_info_local_var->service_location = service_location;
    return org_apache_sling_security_impl_content_disposition_filter_info_local_var;
}

__attribute__((deprecated)) org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info_create(
    char *pid,
    char *title,
    char *description,
    org_apache_sling_security_impl_content_disposition_filter_properties_t *properties,
    char *bundle_location,
    char *service_location
    ) {
    org_apache_sling_security_impl_content_disposition_filter_info_t *result = org_apache_sling_security_impl_content_disposition_filter_info_create_internal (
        pid,
        title,
        description,
        properties,
        bundle_location,
        service_location
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_security_impl_content_disposition_filter_info_free(org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info) {
    if(NULL == org_apache_sling_security_impl_content_disposition_filter_info){
        return ;
    }
    if(org_apache_sling_security_impl_content_disposition_filter_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_security_impl_content_disposition_filter_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_security_impl_content_disposition_filter_info->pid) {
        free(org_apache_sling_security_impl_content_disposition_filter_info->pid);
        org_apache_sling_security_impl_content_disposition_filter_info->pid = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_info->title) {
        free(org_apache_sling_security_impl_content_disposition_filter_info->title);
        org_apache_sling_security_impl_content_disposition_filter_info->title = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_info->description) {
        free(org_apache_sling_security_impl_content_disposition_filter_info->description);
        org_apache_sling_security_impl_content_disposition_filter_info->description = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_info->properties) {
        org_apache_sling_security_impl_content_disposition_filter_properties_free(org_apache_sling_security_impl_content_disposition_filter_info->properties);
        org_apache_sling_security_impl_content_disposition_filter_info->properties = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_info->bundle_location) {
        free(org_apache_sling_security_impl_content_disposition_filter_info->bundle_location);
        org_apache_sling_security_impl_content_disposition_filter_info->bundle_location = NULL;
    }
    if (org_apache_sling_security_impl_content_disposition_filter_info->service_location) {
        free(org_apache_sling_security_impl_content_disposition_filter_info->service_location);
        org_apache_sling_security_impl_content_disposition_filter_info->service_location = NULL;
    }
    free(org_apache_sling_security_impl_content_disposition_filter_info);
}

cJSON *org_apache_sling_security_impl_content_disposition_filter_info_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_security_impl_content_disposition_filter_info->pid
    if(org_apache_sling_security_impl_content_disposition_filter_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", org_apache_sling_security_impl_content_disposition_filter_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_info->title
    if(org_apache_sling_security_impl_content_disposition_filter_info->title) {
    if(cJSON_AddStringToObject(item, "title", org_apache_sling_security_impl_content_disposition_filter_info->title) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_info->description
    if(org_apache_sling_security_impl_content_disposition_filter_info->description) {
    if(cJSON_AddStringToObject(item, "description", org_apache_sling_security_impl_content_disposition_filter_info->description) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_info->properties
    if(org_apache_sling_security_impl_content_disposition_filter_info->properties) {
    cJSON *properties_local_JSON = org_apache_sling_security_impl_content_disposition_filter_properties_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_info->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_info->bundle_location
    if(org_apache_sling_security_impl_content_disposition_filter_info->bundle_location) {
    if(cJSON_AddStringToObject(item, "bundle_location", org_apache_sling_security_impl_content_disposition_filter_info->bundle_location) == NULL) {
    goto fail; //String
    }
    }


    // org_apache_sling_security_impl_content_disposition_filter_info->service_location
    if(org_apache_sling_security_impl_content_disposition_filter_info->service_location) {
    if(cJSON_AddStringToObject(item, "service_location", org_apache_sling_security_impl_content_disposition_filter_info->service_location) == NULL) {
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

org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info_parseFromJSON(cJSON *org_apache_sling_security_impl_content_disposition_filter_infoJSON){

    org_apache_sling_security_impl_content_disposition_filter_info_t *org_apache_sling_security_impl_content_disposition_filter_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for org_apache_sling_security_impl_content_disposition_filter_info->properties
    org_apache_sling_security_impl_content_disposition_filter_properties_t *properties_local_nonprim = NULL;

    char *bundle_location_local_str = NULL;

    char *service_location_local_str = NULL;

    // org_apache_sling_security_impl_content_disposition_filter_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // org_apache_sling_security_impl_content_disposition_filter_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // org_apache_sling_security_impl_content_disposition_filter_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // org_apache_sling_security_impl_content_disposition_filter_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = org_apache_sling_security_impl_content_disposition_filter_properties_parseFromJSON(properties); //nonprimitive
    }

    // org_apache_sling_security_impl_content_disposition_filter_info->bundle_location
    cJSON *bundle_location = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "bundle_location");
    if (cJSON_IsNull(bundle_location)) {
        bundle_location = NULL;
    }
    if (bundle_location) { 
    if(!cJSON_IsString(bundle_location) && !cJSON_IsNull(bundle_location))
    {
    goto end; //String
    }
    }

    // org_apache_sling_security_impl_content_disposition_filter_info->service_location
    cJSON *service_location = cJSON_GetObjectItemCaseSensitive(org_apache_sling_security_impl_content_disposition_filter_infoJSON, "service_location");
    if (cJSON_IsNull(service_location)) {
        service_location = NULL;
    }
    if (service_location) { 
    if(!cJSON_IsString(service_location) && !cJSON_IsNull(service_location))
    {
    goto end; //String
    }
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (bundle_location && !cJSON_IsNull(bundle_location)) bundle_location_local_str = strdup(bundle_location->valuestring);
    if (service_location && !cJSON_IsNull(service_location)) service_location_local_str = strdup(service_location->valuestring);

    org_apache_sling_security_impl_content_disposition_filter_info_local_var = org_apache_sling_security_impl_content_disposition_filter_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL,
        bundle_location_local_str,
        service_location_local_str
        );

    if (!org_apache_sling_security_impl_content_disposition_filter_info_local_var) {
        goto end;
    }

    return org_apache_sling_security_impl_content_disposition_filter_info_local_var;
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
        org_apache_sling_security_impl_content_disposition_filter_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    if (bundle_location_local_str) {
        free(bundle_location_local_str);
        bundle_location_local_str = NULL;
    }
    if (service_location_local_str) {
        free(service_location_local_str);
        service_location_local_str = NULL;
    }
    return NULL;

}
