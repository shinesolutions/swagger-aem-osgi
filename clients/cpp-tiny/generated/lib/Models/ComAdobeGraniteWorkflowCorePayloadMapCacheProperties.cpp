

#include "ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::ComAdobeGraniteWorkflowCorePayloadMapCacheProperties()
{
	getSystemWorkflowModels = ConfigNodePropertyArray();
	getPackageRootPath = ConfigNodePropertyString();
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::~ComAdobeGraniteWorkflowCorePayloadMapCacheProperties()
{

}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *getSystemWorkflowModelsKey = "getSystemWorkflowModels";

    if(object.has_key(getSystemWorkflowModelsKey))
    {
        bourne::json value = object[getSystemWorkflowModelsKey];




        ConfigNodePropertyArray* obj = &getSystemWorkflowModels;
		obj->fromJson(value.dump());

    }

    const char *getPackageRootPathKey = "getPackageRootPath";

    if(object.has_key(getPackageRootPathKey))
    {
        bourne::json value = object[getPackageRootPathKey];




        ConfigNodePropertyString* obj = &getPackageRootPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["getSystemWorkflowModels"] = getGetSystemWorkflowModels().toJson();






	object["getPackageRootPath"] = getGetPackageRootPath().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::getGetSystemWorkflowModels()
{
	return getSystemWorkflowModels;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels)
{
	this->getSystemWorkflowModels = getSystemWorkflowModels;
}

ConfigNodePropertyString
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::getGetPackageRootPath()
{
	return getPackageRootPath;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath)
{
	this->getPackageRootPath = getPackageRootPath;
}



