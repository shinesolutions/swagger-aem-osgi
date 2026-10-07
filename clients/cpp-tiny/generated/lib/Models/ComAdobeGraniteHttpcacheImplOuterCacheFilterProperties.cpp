

#include "ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.h"

using namespace Tiny;

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties()
{
	comadobegranitehttpcacheurlpaths = ConfigNodePropertyArray();
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::~ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties()
{

}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobegranitehttpcacheurlpathsKey = "com.adobe.granite.httpcache.url.paths";

    if(object.has_key(comadobegranitehttpcacheurlpathsKey))
    {
        bourne::json value = object[comadobegranitehttpcacheurlpathsKey];




        ConfigNodePropertyArray* obj = &comadobegranitehttpcacheurlpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobegranitehttpcacheurlpaths"] = getComadobegranitehttpcacheurlpaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::getComadobegranitehttpcacheurlpaths()
{
	return comadobegranitehttpcacheurlpaths;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::setComadobegranitehttpcacheurlpaths(ConfigNodePropertyArray comadobegranitehttpcacheurlpaths)
{
	this->comadobegranitehttpcacheurlpaths = comadobegranitehttpcacheurlpaths;
}



