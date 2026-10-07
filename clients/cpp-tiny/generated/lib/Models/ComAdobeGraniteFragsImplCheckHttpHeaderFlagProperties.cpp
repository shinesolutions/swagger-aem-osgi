

#include "ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.h"

using namespace Tiny;

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties()
{
	featurename = ConfigNodePropertyString();
	featuredescription = ConfigNodePropertyString();
	httpheadername = ConfigNodePropertyString();
	httpheadervaluepattern = ConfigNodePropertyString();
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::~ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties()
{

}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::fromJson(std::string jsonObj)
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

    const char *httpheadernameKey = "http.header.name";

    if(object.has_key(httpheadernameKey))
    {
        bourne::json value = object[httpheadernameKey];




        ConfigNodePropertyString* obj = &httpheadername;
		obj->fromJson(value.dump());

    }

    const char *httpheadervaluepatternKey = "http.header.valuepattern";

    if(object.has_key(httpheadervaluepatternKey))
    {
        bourne::json value = object[httpheadervaluepatternKey];




        ConfigNodePropertyString* obj = &httpheadervaluepattern;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["featurename"] = getFeaturename().toJson();






	object["featuredescription"] = getFeaturedescription().toJson();






	object["httpheadername"] = getHttpheadername().toJson();






	object["httpheadervaluepattern"] = getHttpheadervaluepattern().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getFeaturename()
{
	return featurename;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setFeaturename(ConfigNodePropertyString featurename)
{
	this->featurename = featurename;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getFeaturedescription()
{
	return featuredescription;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setFeaturedescription(ConfigNodePropertyString featuredescription)
{
	this->featuredescription = featuredescription;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getHttpheadername()
{
	return httpheadername;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setHttpheadername(ConfigNodePropertyString httpheadername)
{
	this->httpheadername = httpheadername;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getHttpheadervaluepattern()
{
	return httpheadervaluepattern;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setHttpheadervaluepattern(ConfigNodePropertyString httpheadervaluepattern)
{
	this->httpheadervaluepattern = httpheadervaluepattern;
}



