

#include "ComDayCqCommonsImplExternalizerImplProperties.h"

using namespace Tiny;

ComDayCqCommonsImplExternalizerImplProperties::ComDayCqCommonsImplExternalizerImplProperties()
{
	externalizerdomains = ConfigNodePropertyArray();
	externalizerhost = ConfigNodePropertyString();
	externalizercontextpath = ConfigNodePropertyString();
	externalizerencodedpath = ConfigNodePropertyBoolean();
}

ComDayCqCommonsImplExternalizerImplProperties::ComDayCqCommonsImplExternalizerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCommonsImplExternalizerImplProperties::~ComDayCqCommonsImplExternalizerImplProperties()
{

}

void
ComDayCqCommonsImplExternalizerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *externalizerdomainsKey = "externalizer.domains";

    if(object.has_key(externalizerdomainsKey))
    {
        bourne::json value = object[externalizerdomainsKey];




        ConfigNodePropertyArray* obj = &externalizerdomains;
		obj->fromJson(value.dump());

    }

    const char *externalizerhostKey = "externalizer.host";

    if(object.has_key(externalizerhostKey))
    {
        bourne::json value = object[externalizerhostKey];




        ConfigNodePropertyString* obj = &externalizerhost;
		obj->fromJson(value.dump());

    }

    const char *externalizercontextpathKey = "externalizer.contextpath";

    if(object.has_key(externalizercontextpathKey))
    {
        bourne::json value = object[externalizercontextpathKey];




        ConfigNodePropertyString* obj = &externalizercontextpath;
		obj->fromJson(value.dump());

    }

    const char *externalizerencodedpathKey = "externalizer.encodedpath";

    if(object.has_key(externalizerencodedpathKey))
    {
        bourne::json value = object[externalizerencodedpathKey];




        ConfigNodePropertyBoolean* obj = &externalizerencodedpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCommonsImplExternalizerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["externalizerdomains"] = getExternalizerdomains().toJson();






	object["externalizerhost"] = getExternalizerhost().toJson();






	object["externalizercontextpath"] = getExternalizercontextpath().toJson();






	object["externalizerencodedpath"] = getExternalizerencodedpath().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerdomains()
{
	return externalizerdomains;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerdomains(ConfigNodePropertyArray externalizerdomains)
{
	this->externalizerdomains = externalizerdomains;
}

ConfigNodePropertyString
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerhost()
{
	return externalizerhost;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerhost(ConfigNodePropertyString externalizerhost)
{
	this->externalizerhost = externalizerhost;
}

ConfigNodePropertyString
ComDayCqCommonsImplExternalizerImplProperties::getExternalizercontextpath()
{
	return externalizercontextpath;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizercontextpath(ConfigNodePropertyString externalizercontextpath)
{
	this->externalizercontextpath = externalizercontextpath;
}

ConfigNodePropertyBoolean
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerencodedpath()
{
	return externalizerencodedpath;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerencodedpath(ConfigNodePropertyBoolean externalizerencodedpath)
{
	this->externalizerencodedpath = externalizerencodedpath;
}



