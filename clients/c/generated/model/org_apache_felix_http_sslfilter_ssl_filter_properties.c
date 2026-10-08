#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_http_sslfilter_ssl_filter_properties.h"



static org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_create_internal(
    config_node_property_string_t *ssl_forward_header,
    config_node_property_string_t *ssl_forward_value,
    config_node_property_string_t *ssl_forward_cert_header,
    config_node_property_boolean_t *rewrite_absolute_urls
    ) {
    org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_local_var = malloc(sizeof(org_apache_felix_http_sslfilter_ssl_filter_properties_t));
    if (!org_apache_felix_http_sslfilter_ssl_filter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_http_sslfilter_ssl_filter_properties_local_var, 0, sizeof(org_apache_felix_http_sslfilter_ssl_filter_properties_t));
    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var->_library_owned = 1;
    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var->ssl_forward_header = ssl_forward_header;
    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var->ssl_forward_value = ssl_forward_value;
    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var->ssl_forward_cert_header = ssl_forward_cert_header;
    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var->rewrite_absolute_urls = rewrite_absolute_urls;
    return org_apache_felix_http_sslfilter_ssl_filter_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_create(
    config_node_property_string_t *ssl_forward_header,
    config_node_property_string_t *ssl_forward_value,
    config_node_property_string_t *ssl_forward_cert_header,
    config_node_property_boolean_t *rewrite_absolute_urls
    ) {
    org_apache_felix_http_sslfilter_ssl_filter_properties_t *result = org_apache_felix_http_sslfilter_ssl_filter_properties_create_internal (
        ssl_forward_header,
        ssl_forward_value,
        ssl_forward_cert_header,
        rewrite_absolute_urls
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_http_sslfilter_ssl_filter_properties_free(org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties) {
    if(NULL == org_apache_felix_http_sslfilter_ssl_filter_properties){
        return ;
    }
    if(org_apache_felix_http_sslfilter_ssl_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_http_sslfilter_ssl_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header) {
        config_node_property_string_free(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header);
        org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header = NULL;
    }
    if (org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value) {
        config_node_property_string_free(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value);
        org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value = NULL;
    }
    if (org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header) {
        config_node_property_string_free(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header);
        org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header = NULL;
    }
    if (org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls) {
        config_node_property_boolean_free(org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls);
        org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls = NULL;
    }
    free(org_apache_felix_http_sslfilter_ssl_filter_properties);
}

cJSON *org_apache_felix_http_sslfilter_ssl_filter_properties_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header
    if(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header) {
    cJSON *ssl_forward_header_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header);
    if(ssl_forward_header_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ssl-forward.header", ssl_forward_header_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value
    if(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value) {
    cJSON *ssl_forward_value_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value);
    if(ssl_forward_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ssl-forward.value", ssl_forward_value_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header
    if(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header) {
    cJSON *ssl_forward_cert_header_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header);
    if(ssl_forward_cert_header_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ssl-forward-cert.header", ssl_forward_cert_header_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls
    if(org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls) {
    cJSON *rewrite_absolute_urls_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls);
    if(rewrite_absolute_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rewrite.absolute.urls", rewrite_absolute_urls_local_JSON);
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

org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_parseFromJSON(cJSON *org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON){

    org_apache_felix_http_sslfilter_ssl_filter_properties_t *org_apache_felix_http_sslfilter_ssl_filter_properties_local_var = NULL;

    // define the local variable for org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header
    config_node_property_string_t *ssl_forward_header_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value
    config_node_property_string_t *ssl_forward_value_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header
    config_node_property_string_t *ssl_forward_cert_header_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls
    config_node_property_boolean_t *rewrite_absolute_urls_local_nonprim = NULL;

    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_header
    cJSON *ssl_forward_header = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON, "ssl-forward.header");
    if (cJSON_IsNull(ssl_forward_header)) {
        ssl_forward_header = NULL;
    }
    if (ssl_forward_header) { 
    ssl_forward_header_local_nonprim = config_node_property_string_parseFromJSON(ssl_forward_header); //nonprimitive
    }

    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_value
    cJSON *ssl_forward_value = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON, "ssl-forward.value");
    if (cJSON_IsNull(ssl_forward_value)) {
        ssl_forward_value = NULL;
    }
    if (ssl_forward_value) { 
    ssl_forward_value_local_nonprim = config_node_property_string_parseFromJSON(ssl_forward_value); //nonprimitive
    }

    // org_apache_felix_http_sslfilter_ssl_filter_properties->ssl_forward_cert_header
    cJSON *ssl_forward_cert_header = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON, "ssl-forward-cert.header");
    if (cJSON_IsNull(ssl_forward_cert_header)) {
        ssl_forward_cert_header = NULL;
    }
    if (ssl_forward_cert_header) { 
    ssl_forward_cert_header_local_nonprim = config_node_property_string_parseFromJSON(ssl_forward_cert_header); //nonprimitive
    }

    // org_apache_felix_http_sslfilter_ssl_filter_properties->rewrite_absolute_urls
    cJSON *rewrite_absolute_urls = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_sslfilter_ssl_filter_propertiesJSON, "rewrite.absolute.urls");
    if (cJSON_IsNull(rewrite_absolute_urls)) {
        rewrite_absolute_urls = NULL;
    }
    if (rewrite_absolute_urls) { 
    rewrite_absolute_urls_local_nonprim = config_node_property_boolean_parseFromJSON(rewrite_absolute_urls); //nonprimitive
    }



    org_apache_felix_http_sslfilter_ssl_filter_properties_local_var = org_apache_felix_http_sslfilter_ssl_filter_properties_create_internal (
        ssl_forward_header ? ssl_forward_header_local_nonprim : NULL,
        ssl_forward_value ? ssl_forward_value_local_nonprim : NULL,
        ssl_forward_cert_header ? ssl_forward_cert_header_local_nonprim : NULL,
        rewrite_absolute_urls ? rewrite_absolute_urls_local_nonprim : NULL
        );

    if (!org_apache_felix_http_sslfilter_ssl_filter_properties_local_var) {
        goto end;
    }

    return org_apache_felix_http_sslfilter_ssl_filter_properties_local_var;
end:
    if (ssl_forward_header_local_nonprim) {
        config_node_property_string_free(ssl_forward_header_local_nonprim);
        ssl_forward_header_local_nonprim = NULL;
    }
    if (ssl_forward_value_local_nonprim) {
        config_node_property_string_free(ssl_forward_value_local_nonprim);
        ssl_forward_value_local_nonprim = NULL;
    }
    if (ssl_forward_cert_header_local_nonprim) {
        config_node_property_string_free(ssl_forward_cert_header_local_nonprim);
        ssl_forward_cert_header_local_nonprim = NULL;
    }
    if (rewrite_absolute_urls_local_nonprim) {
        config_node_property_boolean_free(rewrite_absolute_urls_local_nonprim);
        rewrite_absolute_urls_local_nonprim = NULL;
    }
    return NULL;

}
