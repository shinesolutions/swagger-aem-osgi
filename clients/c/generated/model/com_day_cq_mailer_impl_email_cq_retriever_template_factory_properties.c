#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties.h"



static com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_create_internal(
    config_node_property_boolean_t *mailer_email_embed,
    config_node_property_string_t *mailer_email_charset,
    config_node_property_string_t *mailer_email_retriever_user_id,
    config_node_property_string_t *mailer_email_retriever_user_pwd
    ) {
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var = malloc(sizeof(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t));
    if (!com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var, 0, sizeof(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t));
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var->_library_owned = 1;
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var->mailer_email_embed = mailer_email_embed;
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var->mailer_email_charset = mailer_email_charset;
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var->mailer_email_retriever_user_id = mailer_email_retriever_user_id;
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var->mailer_email_retriever_user_pwd = mailer_email_retriever_user_pwd;
    return com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_create(
    config_node_property_boolean_t *mailer_email_embed,
    config_node_property_string_t *mailer_email_charset,
    config_node_property_string_t *mailer_email_retriever_user_id,
    config_node_property_string_t *mailer_email_retriever_user_pwd
    ) {
    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *result = com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_create_internal (
        mailer_email_embed,
        mailer_email_charset,
        mailer_email_retriever_user_id,
        mailer_email_retriever_user_pwd
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties) {
    if(NULL == com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties){
        return ;
    }
    if(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed) {
        config_node_property_boolean_free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed);
        com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed = NULL;
    }
    if (com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset) {
        config_node_property_string_free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset);
        com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset = NULL;
    }
    if (com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id) {
        config_node_property_string_free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id);
        com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id = NULL;
    }
    if (com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd) {
        config_node_property_string_free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd);
        com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd = NULL;
    }
    free(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties);
}

cJSON *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_convertToJSON(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed
    if(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed) {
    cJSON *mailer_email_embed_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed);
    if(mailer_email_embed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mailer.email.embed", mailer_email_embed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset
    if(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset) {
    cJSON *mailer_email_charset_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset);
    if(mailer_email_charset_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mailer.email.charset", mailer_email_charset_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id
    if(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id) {
    cJSON *mailer_email_retriever_user_id_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id);
    if(mailer_email_retriever_user_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mailer.email.retrieverUserID", mailer_email_retriever_user_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd
    if(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd) {
    cJSON *mailer_email_retriever_user_pwd_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd);
    if(mailer_email_retriever_user_pwd_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mailer.email.retrieverUserPWD", mailer_email_retriever_user_pwd_local_JSON);
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

com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_parseFromJSON(cJSON *com_day_cq_mailer_impl_email_cq_retriever_template_factory_propertiesJSON){

    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_t *com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var = NULL;

    // define the local variable for com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed
    config_node_property_boolean_t *mailer_email_embed_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset
    config_node_property_string_t *mailer_email_charset_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id
    config_node_property_string_t *mailer_email_retriever_user_id_local_nonprim = NULL;

    // define the local variable for com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd
    config_node_property_string_t *mailer_email_retriever_user_pwd_local_nonprim = NULL;

    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_embed
    cJSON *mailer_email_embed = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_impl_email_cq_retriever_template_factory_propertiesJSON, "mailer.email.embed");
    if (cJSON_IsNull(mailer_email_embed)) {
        mailer_email_embed = NULL;
    }
    if (mailer_email_embed) { 
    mailer_email_embed_local_nonprim = config_node_property_boolean_parseFromJSON(mailer_email_embed); //nonprimitive
    }

    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_charset
    cJSON *mailer_email_charset = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_impl_email_cq_retriever_template_factory_propertiesJSON, "mailer.email.charset");
    if (cJSON_IsNull(mailer_email_charset)) {
        mailer_email_charset = NULL;
    }
    if (mailer_email_charset) { 
    mailer_email_charset_local_nonprim = config_node_property_string_parseFromJSON(mailer_email_charset); //nonprimitive
    }

    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_id
    cJSON *mailer_email_retriever_user_id = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_impl_email_cq_retriever_template_factory_propertiesJSON, "mailer.email.retrieverUserID");
    if (cJSON_IsNull(mailer_email_retriever_user_id)) {
        mailer_email_retriever_user_id = NULL;
    }
    if (mailer_email_retriever_user_id) { 
    mailer_email_retriever_user_id_local_nonprim = config_node_property_string_parseFromJSON(mailer_email_retriever_user_id); //nonprimitive
    }

    // com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties->mailer_email_retriever_user_pwd
    cJSON *mailer_email_retriever_user_pwd = cJSON_GetObjectItemCaseSensitive(com_day_cq_mailer_impl_email_cq_retriever_template_factory_propertiesJSON, "mailer.email.retrieverUserPWD");
    if (cJSON_IsNull(mailer_email_retriever_user_pwd)) {
        mailer_email_retriever_user_pwd = NULL;
    }
    if (mailer_email_retriever_user_pwd) { 
    mailer_email_retriever_user_pwd_local_nonprim = config_node_property_string_parseFromJSON(mailer_email_retriever_user_pwd); //nonprimitive
    }



    com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var = com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_create_internal (
        mailer_email_embed ? mailer_email_embed_local_nonprim : NULL,
        mailer_email_charset ? mailer_email_charset_local_nonprim : NULL,
        mailer_email_retriever_user_id ? mailer_email_retriever_user_id_local_nonprim : NULL,
        mailer_email_retriever_user_pwd ? mailer_email_retriever_user_pwd_local_nonprim : NULL
        );

    if (!com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var) {
        goto end;
    }

    return com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties_local_var;
end:
    if (mailer_email_embed_local_nonprim) {
        config_node_property_boolean_free(mailer_email_embed_local_nonprim);
        mailer_email_embed_local_nonprim = NULL;
    }
    if (mailer_email_charset_local_nonprim) {
        config_node_property_string_free(mailer_email_charset_local_nonprim);
        mailer_email_charset_local_nonprim = NULL;
    }
    if (mailer_email_retriever_user_id_local_nonprim) {
        config_node_property_string_free(mailer_email_retriever_user_id_local_nonprim);
        mailer_email_retriever_user_id_local_nonprim = NULL;
    }
    if (mailer_email_retriever_user_pwd_local_nonprim) {
        config_node_property_string_free(mailer_email_retriever_user_pwd_local_nonprim);
        mailer_email_retriever_user_pwd_local_nonprim = NULL;
    }
    return NULL;

}
