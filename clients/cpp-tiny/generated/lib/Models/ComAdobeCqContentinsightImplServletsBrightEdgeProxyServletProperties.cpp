

#include "ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.h"

using namespace Tiny;

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties()
{
	brightedgeurl = ConfigNodePropertyString();
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::~ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties()
{

}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *brightedgeurlKey = "brightedge.url";

    if(object.has_key(brightedgeurlKey))
    {
        bourne::json value = object[brightedgeurlKey];




        ConfigNodePropertyString* obj = &brightedgeurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["brightedgeurl"] = getBrightedgeurl().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::getBrightedgeurl()
{
	return brightedgeurl;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::setBrightedgeurl(ConfigNodePropertyString brightedgeurl)
{
	this->brightedgeurl = brightedgeurl;
}



