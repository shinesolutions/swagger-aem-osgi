

#include "AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.h"

using namespace Tiny;

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties()
{
	showPlaceholder = ConfigNodePropertyBoolean();
	maximumCacheEntries = ConfigNodePropertyInteger();
	afscriptingcompatversion = ConfigNodePropertyDropDown();
	makeFileNameUnique = ConfigNodePropertyBoolean();
	generatingCompliantData = ConfigNodePropertyBoolean();
}

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::~AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties()
{

}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *showPlaceholderKey = "showPlaceholder";

    if(object.has_key(showPlaceholderKey))
    {
        bourne::json value = object[showPlaceholderKey];




        ConfigNodePropertyBoolean* obj = &showPlaceholder;
		obj->fromJson(value.dump());

    }

    const char *maximumCacheEntriesKey = "maximumCacheEntries";

    if(object.has_key(maximumCacheEntriesKey))
    {
        bourne::json value = object[maximumCacheEntriesKey];




        ConfigNodePropertyInteger* obj = &maximumCacheEntries;
		obj->fromJson(value.dump());

    }

    const char *afscriptingcompatversionKey = "af.scripting.compatversion";

    if(object.has_key(afscriptingcompatversionKey))
    {
        bourne::json value = object[afscriptingcompatversionKey];




        ConfigNodePropertyDropDown* obj = &afscriptingcompatversion;
		obj->fromJson(value.dump());

    }

    const char *makeFileNameUniqueKey = "makeFileNameUnique";

    if(object.has_key(makeFileNameUniqueKey))
    {
        bourne::json value = object[makeFileNameUniqueKey];




        ConfigNodePropertyBoolean* obj = &makeFileNameUnique;
		obj->fromJson(value.dump());

    }

    const char *generatingCompliantDataKey = "generatingCompliantData";

    if(object.has_key(generatingCompliantDataKey))
    {
        bourne::json value = object[generatingCompliantDataKey];




        ConfigNodePropertyBoolean* obj = &generatingCompliantData;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["showPlaceholder"] = getShowPlaceholder().toJson();






	object["maximumCacheEntries"] = getMaximumCacheEntries().toJson();






	object["afscriptingcompatversion"] = getAfscriptingcompatversion().toJson();






	object["makeFileNameUnique"] = getMakeFileNameUnique().toJson();






	object["generatingCompliantData"] = getGeneratingCompliantData().toJson();


    return object;

}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getShowPlaceholder()
{
	return showPlaceholder;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setShowPlaceholder(ConfigNodePropertyBoolean showPlaceholder)
{
	this->showPlaceholder = showPlaceholder;
}

ConfigNodePropertyInteger
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getMaximumCacheEntries()
{
	return maximumCacheEntries;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setMaximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries)
{
	this->maximumCacheEntries = maximumCacheEntries;
}

ConfigNodePropertyDropDown
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getAfscriptingcompatversion()
{
	return afscriptingcompatversion;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setAfscriptingcompatversion(ConfigNodePropertyDropDown afscriptingcompatversion)
{
	this->afscriptingcompatversion = afscriptingcompatversion;
}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getMakeFileNameUnique()
{
	return makeFileNameUnique;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setMakeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique)
{
	this->makeFileNameUnique = makeFileNameUnique;
}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getGeneratingCompliantData()
{
	return generatingCompliantData;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setGeneratingCompliantData(ConfigNodePropertyBoolean generatingCompliantData)
{
	this->generatingCompliantData = generatingCompliantData;
}



