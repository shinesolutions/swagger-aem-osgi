

#include "ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties()
{
	parameterwhitelist = ConfigNodePropertyArray();
	parameterwhitelistprefixes = ConfigNodePropertyArray();
	binaryparameterwhitelist = ConfigNodePropertyArray();
	modifierwhitelist = ConfigNodePropertyArray();
	operationwhitelist = ConfigNodePropertyArray();
	operationwhitelistprefixes = ConfigNodePropertyArray();
	typehintwhitelist = ConfigNodePropertyArray();
	resourcetypewhitelist = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::~ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties()
{

}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parameterwhitelistKey = "parameter.whitelist";

    if(object.has_key(parameterwhitelistKey))
    {
        bourne::json value = object[parameterwhitelistKey];




        ConfigNodePropertyArray* obj = &parameterwhitelist;
		obj->fromJson(value.dump());

    }

    const char *parameterwhitelistprefixesKey = "parameter.whitelist.prefixes";

    if(object.has_key(parameterwhitelistprefixesKey))
    {
        bourne::json value = object[parameterwhitelistprefixesKey];




        ConfigNodePropertyArray* obj = &parameterwhitelistprefixes;
		obj->fromJson(value.dump());

    }

    const char *binaryparameterwhitelistKey = "binary.parameter.whitelist";

    if(object.has_key(binaryparameterwhitelistKey))
    {
        bourne::json value = object[binaryparameterwhitelistKey];




        ConfigNodePropertyArray* obj = &binaryparameterwhitelist;
		obj->fromJson(value.dump());

    }

    const char *modifierwhitelistKey = "modifier.whitelist";

    if(object.has_key(modifierwhitelistKey))
    {
        bourne::json value = object[modifierwhitelistKey];




        ConfigNodePropertyArray* obj = &modifierwhitelist;
		obj->fromJson(value.dump());

    }

    const char *operationwhitelistKey = "operation.whitelist";

    if(object.has_key(operationwhitelistKey))
    {
        bourne::json value = object[operationwhitelistKey];




        ConfigNodePropertyArray* obj = &operationwhitelist;
		obj->fromJson(value.dump());

    }

    const char *operationwhitelistprefixesKey = "operation.whitelist.prefixes";

    if(object.has_key(operationwhitelistprefixesKey))
    {
        bourne::json value = object[operationwhitelistprefixesKey];




        ConfigNodePropertyArray* obj = &operationwhitelistprefixes;
		obj->fromJson(value.dump());

    }

    const char *typehintwhitelistKey = "typehint.whitelist";

    if(object.has_key(typehintwhitelistKey))
    {
        bourne::json value = object[typehintwhitelistKey];




        ConfigNodePropertyArray* obj = &typehintwhitelist;
		obj->fromJson(value.dump());

    }

    const char *resourcetypewhitelistKey = "resourcetype.whitelist";

    if(object.has_key(resourcetypewhitelistKey))
    {
        bourne::json value = object[resourcetypewhitelistKey];




        ConfigNodePropertyArray* obj = &resourcetypewhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["parameterwhitelist"] = getParameterwhitelist().toJson();






	object["parameterwhitelistprefixes"] = getParameterwhitelistprefixes().toJson();






	object["binaryparameterwhitelist"] = getBinaryparameterwhitelist().toJson();






	object["modifierwhitelist"] = getModifierwhitelist().toJson();






	object["operationwhitelist"] = getOperationwhitelist().toJson();






	object["operationwhitelistprefixes"] = getOperationwhitelistprefixes().toJson();






	object["typehintwhitelist"] = getTypehintwhitelist().toJson();






	object["resourcetypewhitelist"] = getResourcetypewhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getParameterwhitelist()
{
	return parameterwhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setParameterwhitelist(ConfigNodePropertyArray parameterwhitelist)
{
	this->parameterwhitelist = parameterwhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getParameterwhitelistprefixes()
{
	return parameterwhitelistprefixes;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setParameterwhitelistprefixes(ConfigNodePropertyArray parameterwhitelistprefixes)
{
	this->parameterwhitelistprefixes = parameterwhitelistprefixes;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getBinaryparameterwhitelist()
{
	return binaryparameterwhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setBinaryparameterwhitelist(ConfigNodePropertyArray binaryparameterwhitelist)
{
	this->binaryparameterwhitelist = binaryparameterwhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getModifierwhitelist()
{
	return modifierwhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setModifierwhitelist(ConfigNodePropertyArray modifierwhitelist)
{
	this->modifierwhitelist = modifierwhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getOperationwhitelist()
{
	return operationwhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setOperationwhitelist(ConfigNodePropertyArray operationwhitelist)
{
	this->operationwhitelist = operationwhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getOperationwhitelistprefixes()
{
	return operationwhitelistprefixes;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setOperationwhitelistprefixes(ConfigNodePropertyArray operationwhitelistprefixes)
{
	this->operationwhitelistprefixes = operationwhitelistprefixes;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getTypehintwhitelist()
{
	return typehintwhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setTypehintwhitelist(ConfigNodePropertyArray typehintwhitelist)
{
	this->typehintwhitelist = typehintwhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::getResourcetypewhitelist()
{
	return resourcetypewhitelist;
}

void
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties::setResourcetypewhitelist(ConfigNodePropertyArray resourcetypewhitelist)
{
	this->resourcetypewhitelist = resourcetypewhitelist;
}



