

#include "ComAdobeFormsCommonServletTempCleanUpTaskProperties.h"

using namespace Tiny;

ComAdobeFormsCommonServletTempCleanUpTaskProperties::ComAdobeFormsCommonServletTempCleanUpTaskProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	durationforTemporaryStorage = ConfigNodePropertyString();
	durationforAnonymousStorage = ConfigNodePropertyString();
}

ComAdobeFormsCommonServletTempCleanUpTaskProperties::ComAdobeFormsCommonServletTempCleanUpTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServletTempCleanUpTaskProperties::~ComAdobeFormsCommonServletTempCleanUpTaskProperties()
{

}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *durationforTemporaryStorageKey = "Duration for Temporary Storage";

    if(object.has_key(durationforTemporaryStorageKey))
    {
        bourne::json value = object[durationforTemporaryStorageKey];




        ConfigNodePropertyString* obj = &durationforTemporaryStorage;
		obj->fromJson(value.dump());

    }

    const char *durationforAnonymousStorageKey = "Duration for Anonymous Storage";

    if(object.has_key(durationforAnonymousStorageKey))
    {
        bourne::json value = object[durationforAnonymousStorageKey];




        ConfigNodePropertyString* obj = &durationforAnonymousStorage;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServletTempCleanUpTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["durationforTemporaryStorage"] = getDurationforTemporaryStorage().toJson();






	object["durationforAnonymousStorage"] = getDurationforAnonymousStorage().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getDurationforTemporaryStorage()
{
	return durationforTemporaryStorage;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setDurationforTemporaryStorage(ConfigNodePropertyString durationforTemporaryStorage)
{
	this->durationforTemporaryStorage = durationforTemporaryStorage;
}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getDurationforAnonymousStorage()
{
	return durationforAnonymousStorage;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setDurationforAnonymousStorage(ConfigNodePropertyString durationforAnonymousStorage)
{
	this->durationforAnonymousStorage = durationforAnonymousStorage;
}



