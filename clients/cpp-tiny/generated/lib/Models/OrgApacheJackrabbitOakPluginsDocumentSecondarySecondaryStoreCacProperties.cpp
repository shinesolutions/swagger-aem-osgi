

#include "OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties()
{
	includedPaths = ConfigNodePropertyArray();
	enableAsyncObserver = ConfigNodePropertyBoolean();
	observerQueueSize = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::~OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties()
{

}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *includedPathsKey = "includedPaths";

    if(object.has_key(includedPathsKey))
    {
        bourne::json value = object[includedPathsKey];




        ConfigNodePropertyArray* obj = &includedPaths;
		obj->fromJson(value.dump());

    }

    const char *enableAsyncObserverKey = "enableAsyncObserver";

    if(object.has_key(enableAsyncObserverKey))
    {
        bourne::json value = object[enableAsyncObserverKey];




        ConfigNodePropertyBoolean* obj = &enableAsyncObserver;
		obj->fromJson(value.dump());

    }

    const char *observerQueueSizeKey = "observerQueueSize";

    if(object.has_key(observerQueueSizeKey))
    {
        bourne::json value = object[observerQueueSizeKey];




        ConfigNodePropertyInteger* obj = &observerQueueSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["includedPaths"] = getIncludedPaths().toJson();






	object["enableAsyncObserver"] = getEnableAsyncObserver().toJson();






	object["observerQueueSize"] = getObserverQueueSize().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getIncludedPaths()
{
	return includedPaths;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setIncludedPaths(ConfigNodePropertyArray includedPaths)
{
	this->includedPaths = includedPaths;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getEnableAsyncObserver()
{
	return enableAsyncObserver;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver)
{
	this->enableAsyncObserver = enableAsyncObserver;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getObserverQueueSize()
{
	return observerQueueSize;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize)
{
	this->observerQueueSize = observerQueueSize;
}



