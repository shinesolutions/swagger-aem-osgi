#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::~ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::__init()
{
	//parameterwhitelist = new ConfigNodePropertyArray();
	//parameterwhitelistprefixes = new ConfigNodePropertyArray();
	//binaryparameterwhitelist = new ConfigNodePropertyArray();
	//modifierwhitelist = new ConfigNodePropertyArray();
	//operationwhitelist = new ConfigNodePropertyArray();
	//operationwhitelistprefixes = new ConfigNodePropertyArray();
	//typehintwhitelist = new ConfigNodePropertyArray();
	//resourcetypewhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::__cleanup()
{
	//if(parameterwhitelist != NULL) {
	//
	//delete parameterwhitelist;
	//parameterwhitelist = NULL;
	//}
	//if(parameterwhitelistprefixes != NULL) {
	//
	//delete parameterwhitelistprefixes;
	//parameterwhitelistprefixes = NULL;
	//}
	//if(binaryparameterwhitelist != NULL) {
	//
	//delete binaryparameterwhitelist;
	//binaryparameterwhitelist = NULL;
	//}
	//if(modifierwhitelist != NULL) {
	//
	//delete modifierwhitelist;
	//modifierwhitelist = NULL;
	//}
	//if(operationwhitelist != NULL) {
	//
	//delete operationwhitelist;
	//operationwhitelist = NULL;
	//}
	//if(operationwhitelistprefixes != NULL) {
	//
	//delete operationwhitelistprefixes;
	//operationwhitelistprefixes = NULL;
	//}
	//if(typehintwhitelist != NULL) {
	//
	//delete typehintwhitelist;
	//typehintwhitelist = NULL;
	//}
	//if(resourcetypewhitelist != NULL) {
	//
	//delete resourcetypewhitelist;
	//resourcetypewhitelist = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parameterwhitelistKey = "parameter.whitelist";
	node = json_object_get_member(pJsonObject, parameterwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&parameterwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&parameterwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parameterwhitelistprefixesKey = "parameter.whitelist.prefixes";
	node = json_object_get_member(pJsonObject, parameterwhitelistprefixesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&parameterwhitelistprefixes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&parameterwhitelistprefixes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *binaryparameterwhitelistKey = "binary.parameter.whitelist";
	node = json_object_get_member(pJsonObject, binaryparameterwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&binaryparameterwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&binaryparameterwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modifierwhitelistKey = "modifier.whitelist";
	node = json_object_get_member(pJsonObject, modifierwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&modifierwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&modifierwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *operationwhitelistKey = "operation.whitelist";
	node = json_object_get_member(pJsonObject, operationwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&operationwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&operationwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *operationwhitelistprefixesKey = "operation.whitelist.prefixes";
	node = json_object_get_member(pJsonObject, operationwhitelistprefixesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&operationwhitelistprefixes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&operationwhitelistprefixes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typehintwhitelistKey = "typehint.whitelist";
	node = json_object_get_member(pJsonObject, typehintwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&typehintwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&typehintwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourcetypewhitelistKey = "resourcetype.whitelist";
	node = json_object_get_member(pJsonObject, resourcetypewhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourcetypewhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourcetypewhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getParameterwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getParameterwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parameterwhitelistKey = "parameter.whitelist";
	json_object_set_member(pJsonObject, parameterwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getParameterwhitelistprefixes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getParameterwhitelistprefixes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parameterwhitelistprefixesKey = "parameter.whitelist.prefixes";
	json_object_set_member(pJsonObject, parameterwhitelistprefixesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getBinaryparameterwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getBinaryparameterwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *binaryparameterwhitelistKey = "binary.parameter.whitelist";
	json_object_set_member(pJsonObject, binaryparameterwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getModifierwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getModifierwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modifierwhitelistKey = "modifier.whitelist";
	json_object_set_member(pJsonObject, modifierwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOperationwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOperationwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationwhitelistKey = "operation.whitelist";
	json_object_set_member(pJsonObject, operationwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOperationwhitelistprefixes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOperationwhitelistprefixes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationwhitelistprefixesKey = "operation.whitelist.prefixes";
	json_object_set_member(pJsonObject, operationwhitelistprefixesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTypehintwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTypehintwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typehintwhitelistKey = "typehint.whitelist";
	json_object_set_member(pJsonObject, typehintwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourcetypewhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourcetypewhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourcetypewhitelistKey = "resourcetype.whitelist";
	json_object_set_member(pJsonObject, resourcetypewhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getParameterwhitelist()
{
	return parameterwhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setParameterwhitelist(ConfigNodePropertyArray  parameterwhitelist)
{
	this->parameterwhitelist = parameterwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getParameterwhitelistprefixes()
{
	return parameterwhitelistprefixes;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setParameterwhitelistprefixes(ConfigNodePropertyArray  parameterwhitelistprefixes)
{
	this->parameterwhitelistprefixes = parameterwhitelistprefixes;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getBinaryparameterwhitelist()
{
	return binaryparameterwhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setBinaryparameterwhitelist(ConfigNodePropertyArray  binaryparameterwhitelist)
{
	this->binaryparameterwhitelist = binaryparameterwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getModifierwhitelist()
{
	return modifierwhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setModifierwhitelist(ConfigNodePropertyArray  modifierwhitelist)
{
	this->modifierwhitelist = modifierwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getOperationwhitelist()
{
	return operationwhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setOperationwhitelist(ConfigNodePropertyArray  operationwhitelist)
{
	this->operationwhitelist = operationwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getOperationwhitelistprefixes()
{
	return operationwhitelistprefixes;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setOperationwhitelistprefixes(ConfigNodePropertyArray  operationwhitelistprefixes)
{
	this->operationwhitelistprefixes = operationwhitelistprefixes;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getTypehintwhitelist()
{
	return typehintwhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setTypehintwhitelist(ConfigNodePropertyArray  typehintwhitelist)
{
	this->typehintwhitelist = typehintwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::getResourcetypewhitelist()
{
	return resourcetypewhitelist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties::setResourcetypewhitelist(ConfigNodePropertyArray  resourcetypewhitelist)
{
	this->resourcetypewhitelist = resourcetypewhitelist;
}


