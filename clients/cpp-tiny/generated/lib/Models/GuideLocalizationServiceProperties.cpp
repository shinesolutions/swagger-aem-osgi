

#include "GuideLocalizationServiceProperties.h"

using namespace Tiny;

GuideLocalizationServiceProperties::GuideLocalizationServiceProperties()
{
	supportedLocales = ConfigNodePropertyArray();
	localizableProperties = ConfigNodePropertyArray();
}

GuideLocalizationServiceProperties::GuideLocalizationServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

GuideLocalizationServiceProperties::~GuideLocalizationServiceProperties()
{

}

void
GuideLocalizationServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *supportedLocalesKey = "supportedLocales";

    if(object.has_key(supportedLocalesKey))
    {
        bourne::json value = object[supportedLocalesKey];




        ConfigNodePropertyArray* obj = &supportedLocales;
		obj->fromJson(value.dump());

    }

    const char *localizablePropertiesKey = "Localizable Properties";

    if(object.has_key(localizablePropertiesKey))
    {
        bourne::json value = object[localizablePropertiesKey];




        ConfigNodePropertyArray* obj = &localizableProperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
GuideLocalizationServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["supportedLocales"] = getSupportedLocales().toJson();






	object["localizableProperties"] = getLocalizableProperties().toJson();


    return object;

}

ConfigNodePropertyArray
GuideLocalizationServiceProperties::getSupportedLocales()
{
	return supportedLocales;
}

void
GuideLocalizationServiceProperties::setSupportedLocales(ConfigNodePropertyArray supportedLocales)
{
	this->supportedLocales = supportedLocales;
}

ConfigNodePropertyArray
GuideLocalizationServiceProperties::getLocalizableProperties()
{
	return localizableProperties;
}

void
GuideLocalizationServiceProperties::setLocalizableProperties(ConfigNodePropertyArray localizableProperties)
{
	this->localizableProperties = localizableProperties;
}



