

#include "ComAdobeGraniteRestImplServletDefaultGETServletProperties.h"

using namespace Tiny;

ComAdobeGraniteRestImplServletDefaultGETServletProperties::ComAdobeGraniteRestImplServletDefaultGETServletProperties()
{
	defaultlimit = ConfigNodePropertyInteger();
	useabsoluteuri = ConfigNodePropertyBoolean();
}

ComAdobeGraniteRestImplServletDefaultGETServletProperties::ComAdobeGraniteRestImplServletDefaultGETServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRestImplServletDefaultGETServletProperties::~ComAdobeGraniteRestImplServletDefaultGETServletProperties()
{

}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaultlimitKey = "default.limit";

    if(object.has_key(defaultlimitKey))
    {
        bourne::json value = object[defaultlimitKey];




        ConfigNodePropertyInteger* obj = &defaultlimit;
		obj->fromJson(value.dump());

    }

    const char *useabsoluteuriKey = "use.absolute.uri";

    if(object.has_key(useabsoluteuriKey))
    {
        bourne::json value = object[useabsoluteuriKey];




        ConfigNodePropertyBoolean* obj = &useabsoluteuri;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRestImplServletDefaultGETServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaultlimit"] = getDefaultlimit().toJson();






	object["useabsoluteuri"] = getUseabsoluteuri().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteRestImplServletDefaultGETServletProperties::getDefaultlimit()
{
	return defaultlimit;
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::setDefaultlimit(ConfigNodePropertyInteger defaultlimit)
{
	this->defaultlimit = defaultlimit;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRestImplServletDefaultGETServletProperties::getUseabsoluteuri()
{
	return useabsoluteuri;
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::setUseabsoluteuri(ConfigNodePropertyBoolean useabsoluteuri)
{
	this->useabsoluteuri = useabsoluteuri;
}



