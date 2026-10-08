

#include "ComAdobeGraniteAcpPlatformPlatformServletProperties.h"

using namespace Tiny;

ComAdobeGraniteAcpPlatformPlatformServletProperties::ComAdobeGraniteAcpPlatformPlatformServletProperties()
{
	querylimit = ConfigNodePropertyInteger();
	filetypeextensionmap = ConfigNodePropertyArray();
}

ComAdobeGraniteAcpPlatformPlatformServletProperties::ComAdobeGraniteAcpPlatformPlatformServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAcpPlatformPlatformServletProperties::~ComAdobeGraniteAcpPlatformPlatformServletProperties()
{

}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *querylimitKey = "query.limit";

    if(object.has_key(querylimitKey))
    {
        bourne::json value = object[querylimitKey];




        ConfigNodePropertyInteger* obj = &querylimit;
		obj->fromJson(value.dump());

    }

    const char *filetypeextensionmapKey = "file.type.extension.map";

    if(object.has_key(filetypeextensionmapKey))
    {
        bourne::json value = object[filetypeextensionmapKey];




        ConfigNodePropertyArray* obj = &filetypeextensionmap;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAcpPlatformPlatformServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["querylimit"] = getQuerylimit().toJson();






	object["filetypeextensionmap"] = getFiletypeextensionmap().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteAcpPlatformPlatformServletProperties::getQuerylimit()
{
	return querylimit;
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::setQuerylimit(ConfigNodePropertyInteger querylimit)
{
	this->querylimit = querylimit;
}

ConfigNodePropertyArray
ComAdobeGraniteAcpPlatformPlatformServletProperties::getFiletypeextensionmap()
{
	return filetypeextensionmap;
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::setFiletypeextensionmap(ConfigNodePropertyArray filetypeextensionmap)
{
	this->filetypeextensionmap = filetypeextensionmap;
}



