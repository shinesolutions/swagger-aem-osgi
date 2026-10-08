

#include "ComAdobeGraniteFragsImplRandomFeatureProperties.h"

using namespace Tiny;

ComAdobeGraniteFragsImplRandomFeatureProperties::ComAdobeGraniteFragsImplRandomFeatureProperties()
{
	featurename = ConfigNodePropertyString();
	featuredescription = ConfigNodePropertyString();
	activepercentage = ConfigNodePropertyString();
	cookiename = ConfigNodePropertyString();
	cookiemaxAge = ConfigNodePropertyInteger();
}

ComAdobeGraniteFragsImplRandomFeatureProperties::ComAdobeGraniteFragsImplRandomFeatureProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteFragsImplRandomFeatureProperties::~ComAdobeGraniteFragsImplRandomFeatureProperties()
{

}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *featurenameKey = "feature.name";

    if(object.has_key(featurenameKey))
    {
        bourne::json value = object[featurenameKey];




        ConfigNodePropertyString* obj = &featurename;
		obj->fromJson(value.dump());

    }

    const char *featuredescriptionKey = "feature.description";

    if(object.has_key(featuredescriptionKey))
    {
        bourne::json value = object[featuredescriptionKey];




        ConfigNodePropertyString* obj = &featuredescription;
		obj->fromJson(value.dump());

    }

    const char *activepercentageKey = "active.percentage";

    if(object.has_key(activepercentageKey))
    {
        bourne::json value = object[activepercentageKey];




        ConfigNodePropertyString* obj = &activepercentage;
		obj->fromJson(value.dump());

    }

    const char *cookienameKey = "cookie.name";

    if(object.has_key(cookienameKey))
    {
        bourne::json value = object[cookienameKey];




        ConfigNodePropertyString* obj = &cookiename;
		obj->fromJson(value.dump());

    }

    const char *cookiemaxAgeKey = "cookie.maxAge";

    if(object.has_key(cookiemaxAgeKey))
    {
        bourne::json value = object[cookiemaxAgeKey];




        ConfigNodePropertyInteger* obj = &cookiemaxAge;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteFragsImplRandomFeatureProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["featurename"] = getFeaturename().toJson();






	object["featuredescription"] = getFeaturedescription().toJson();






	object["activepercentage"] = getActivepercentage().toJson();






	object["cookiename"] = getCookiename().toJson();






	object["cookiemaxAge"] = getCookiemaxAge().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getFeaturename()
{
	return featurename;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setFeaturename(ConfigNodePropertyString featurename)
{
	this->featurename = featurename;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getFeaturedescription()
{
	return featuredescription;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setFeaturedescription(ConfigNodePropertyString featuredescription)
{
	this->featuredescription = featuredescription;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getActivepercentage()
{
	return activepercentage;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setActivepercentage(ConfigNodePropertyString activepercentage)
{
	this->activepercentage = activepercentage;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getCookiename()
{
	return cookiename;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setCookiename(ConfigNodePropertyString cookiename)
{
	this->cookiename = cookiename;
}

ConfigNodePropertyInteger
ComAdobeGraniteFragsImplRandomFeatureProperties::getCookiemaxAge()
{
	return cookiemaxAge;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setCookiemaxAge(ConfigNodePropertyInteger cookiemaxAge)
{
	this->cookiemaxAge = cookiemaxAge;
}



