

#include "ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h"

using namespace Tiny;

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties()
{
	translationFactory = ConfigNodePropertyString();
	defaultConnectorLabel = ConfigNodePropertyString();
	defaultConnectorAttribution = ConfigNodePropertyString();
	defaultConnectorWorkspaceId = ConfigNodePropertyString();
	defaultConnectorSubscriptionKey = ConfigNodePropertyString();
	languageMapLocation = ConfigNodePropertyString();
	categoryMapLocation = ConfigNodePropertyString();
	retryAttempts = ConfigNodePropertyInteger();
	timeoutCount = ConfigNodePropertyInteger();
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties()
{

}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *translationFactoryKey = "translationFactory";

    if(object.has_key(translationFactoryKey))
    {
        bourne::json value = object[translationFactoryKey];




        ConfigNodePropertyString* obj = &translationFactory;
		obj->fromJson(value.dump());

    }

    const char *defaultConnectorLabelKey = "defaultConnectorLabel";

    if(object.has_key(defaultConnectorLabelKey))
    {
        bourne::json value = object[defaultConnectorLabelKey];




        ConfigNodePropertyString* obj = &defaultConnectorLabel;
		obj->fromJson(value.dump());

    }

    const char *defaultConnectorAttributionKey = "defaultConnectorAttribution";

    if(object.has_key(defaultConnectorAttributionKey))
    {
        bourne::json value = object[defaultConnectorAttributionKey];




        ConfigNodePropertyString* obj = &defaultConnectorAttribution;
		obj->fromJson(value.dump());

    }

    const char *defaultConnectorWorkspaceIdKey = "defaultConnectorWorkspaceId";

    if(object.has_key(defaultConnectorWorkspaceIdKey))
    {
        bourne::json value = object[defaultConnectorWorkspaceIdKey];




        ConfigNodePropertyString* obj = &defaultConnectorWorkspaceId;
		obj->fromJson(value.dump());

    }

    const char *defaultConnectorSubscriptionKeyKey = "defaultConnectorSubscriptionKey";

    if(object.has_key(defaultConnectorSubscriptionKeyKey))
    {
        bourne::json value = object[defaultConnectorSubscriptionKeyKey];




        ConfigNodePropertyString* obj = &defaultConnectorSubscriptionKey;
		obj->fromJson(value.dump());

    }

    const char *languageMapLocationKey = "languageMapLocation";

    if(object.has_key(languageMapLocationKey))
    {
        bourne::json value = object[languageMapLocationKey];




        ConfigNodePropertyString* obj = &languageMapLocation;
		obj->fromJson(value.dump());

    }

    const char *categoryMapLocationKey = "categoryMapLocation";

    if(object.has_key(categoryMapLocationKey))
    {
        bourne::json value = object[categoryMapLocationKey];




        ConfigNodePropertyString* obj = &categoryMapLocation;
		obj->fromJson(value.dump());

    }

    const char *retryAttemptsKey = "retryAttempts";

    if(object.has_key(retryAttemptsKey))
    {
        bourne::json value = object[retryAttemptsKey];




        ConfigNodePropertyInteger* obj = &retryAttempts;
		obj->fromJson(value.dump());

    }

    const char *timeoutCountKey = "timeoutCount";

    if(object.has_key(timeoutCountKey))
    {
        bourne::json value = object[timeoutCountKey];




        ConfigNodePropertyInteger* obj = &timeoutCount;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["translationFactory"] = getTranslationFactory().toJson();






	object["defaultConnectorLabel"] = getDefaultConnectorLabel().toJson();






	object["defaultConnectorAttribution"] = getDefaultConnectorAttribution().toJson();






	object["defaultConnectorWorkspaceId"] = getDefaultConnectorWorkspaceId().toJson();






	object["defaultConnectorSubscriptionKey"] = getDefaultConnectorSubscriptionKey().toJson();






	object["languageMapLocation"] = getLanguageMapLocation().toJson();






	object["categoryMapLocation"] = getCategoryMapLocation().toJson();






	object["retryAttempts"] = getRetryAttempts().toJson();






	object["timeoutCount"] = getTimeoutCount().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTranslationFactory()
{
	return translationFactory;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTranslationFactory(ConfigNodePropertyString translationFactory)
{
	this->translationFactory = translationFactory;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorLabel()
{
	return defaultConnectorLabel;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel)
{
	this->defaultConnectorLabel = defaultConnectorLabel;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorAttribution()
{
	return defaultConnectorAttribution;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution)
{
	this->defaultConnectorAttribution = defaultConnectorAttribution;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorWorkspaceId()
{
	return defaultConnectorWorkspaceId;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId)
{
	this->defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorSubscriptionKey()
{
	return defaultConnectorSubscriptionKey;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey)
{
	this->defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getLanguageMapLocation()
{
	return languageMapLocation;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setLanguageMapLocation(ConfigNodePropertyString languageMapLocation)
{
	this->languageMapLocation = languageMapLocation;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getCategoryMapLocation()
{
	return categoryMapLocation;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation)
{
	this->categoryMapLocation = categoryMapLocation;
}

ConfigNodePropertyInteger
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getRetryAttempts()
{
	return retryAttempts;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setRetryAttempts(ConfigNodePropertyInteger retryAttempts)
{
	this->retryAttempts = retryAttempts;
}

ConfigNodePropertyInteger
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTimeoutCount()
{
	return timeoutCount;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTimeoutCount(ConfigNodePropertyInteger timeoutCount)
{
	this->timeoutCount = timeoutCount;
}



