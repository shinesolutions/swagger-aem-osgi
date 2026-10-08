

#include "ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.h"

using namespace Tiny;

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties()
{
	nuiEnabled = ConfigNodePropertyBoolean();
	nuiServiceUrl = ConfigNodePropertyString();
	nuiApiKey = ConfigNodePropertyString();
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties()
{

}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nuiEnabledKey = "nuiEnabled";

    if(object.has_key(nuiEnabledKey))
    {
        bourne::json value = object[nuiEnabledKey];




        ConfigNodePropertyBoolean* obj = &nuiEnabled;
		obj->fromJson(value.dump());

    }

    const char *nuiServiceUrlKey = "nuiServiceUrl";

    if(object.has_key(nuiServiceUrlKey))
    {
        bourne::json value = object[nuiServiceUrlKey];




        ConfigNodePropertyString* obj = &nuiServiceUrl;
		obj->fromJson(value.dump());

    }

    const char *nuiApiKeyKey = "nuiApiKey";

    if(object.has_key(nuiApiKeyKey))
    {
        bourne::json value = object[nuiApiKeyKey];




        ConfigNodePropertyString* obj = &nuiApiKey;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["nuiEnabled"] = getNuiEnabled().toJson();






	object["nuiServiceUrl"] = getNuiServiceUrl().toJson();






	object["nuiApiKey"] = getNuiApiKey().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiEnabled()
{
	return nuiEnabled;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled)
{
	this->nuiEnabled = nuiEnabled;
}

ConfigNodePropertyString
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiServiceUrl()
{
	return nuiServiceUrl;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl)
{
	this->nuiServiceUrl = nuiServiceUrl;
}

ConfigNodePropertyString
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiApiKey()
{
	return nuiApiKey;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiApiKey(ConfigNodePropertyString nuiApiKey)
{
	this->nuiApiKey = nuiApiKey;
}



