

#include "OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties()
{
	orgapacheslingcommonslogfile = ConfigNodePropertyString();
	orgapacheslingcommonslogfilenumber = ConfigNodePropertyInteger();
	orgapacheslingcommonslogfilesize = ConfigNodePropertyString();
	orgapacheslingcommonslogfilebuffered = ConfigNodePropertyBoolean();
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::~OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties()
{

}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";

    if(object.has_key(orgapacheslingcommonslogfileKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfileKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogfile;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";

    if(object.has_key(orgapacheslingcommonslogfilenumberKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfilenumberKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingcommonslogfilenumber;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";

    if(object.has_key(orgapacheslingcommonslogfilesizeKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfilesizeKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogfilesize;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfilebufferedKey = "org.apache.sling.commons.log.file.buffered";

    if(object.has_key(orgapacheslingcommonslogfilebufferedKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfilebufferedKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslingcommonslogfilebuffered;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingcommonslogfile"] = getOrgapacheslingcommonslogfile().toJson();






	object["orgapacheslingcommonslogfilenumber"] = getOrgapacheslingcommonslogfilenumber().toJson();






	object["orgapacheslingcommonslogfilesize"] = getOrgapacheslingcommonslogfilesize().toJson();






	object["orgapacheslingcommonslogfilebuffered"] = getOrgapacheslingcommonslogfilebuffered().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilenumber()
{
	return orgapacheslingcommonslogfilenumber;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber)
{
	this->orgapacheslingcommonslogfilenumber = orgapacheslingcommonslogfilenumber;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilesize()
{
	return orgapacheslingcommonslogfilesize;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString orgapacheslingcommonslogfilesize)
{
	this->orgapacheslingcommonslogfilesize = orgapacheslingcommonslogfilesize;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilebuffered()
{
	return orgapacheslingcommonslogfilebuffered;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilebuffered(ConfigNodePropertyBoolean orgapacheslingcommonslogfilebuffered)
{
	this->orgapacheslingcommonslogfilebuffered = orgapacheslingcommonslogfilebuffered;
}



