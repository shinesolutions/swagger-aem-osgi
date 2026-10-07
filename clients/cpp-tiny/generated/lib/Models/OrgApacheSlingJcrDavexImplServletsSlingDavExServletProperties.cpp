

#include "OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.h"

using namespace Tiny;

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties()
{
	alias = ConfigNodePropertyString();
	davcreateabsoluteuri = ConfigNodePropertyBoolean();
	davprotectedhandlers = ConfigNodePropertyString();
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::~OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties()
{

}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aliasKey = "alias";

    if(object.has_key(aliasKey))
    {
        bourne::json value = object[aliasKey];




        ConfigNodePropertyString* obj = &alias;
		obj->fromJson(value.dump());

    }

    const char *davcreateabsoluteuriKey = "dav.create-absolute-uri";

    if(object.has_key(davcreateabsoluteuriKey))
    {
        bourne::json value = object[davcreateabsoluteuriKey];




        ConfigNodePropertyBoolean* obj = &davcreateabsoluteuri;
		obj->fromJson(value.dump());

    }

    const char *davprotectedhandlersKey = "dav.protectedhandlers";

    if(object.has_key(davprotectedhandlersKey))
    {
        bourne::json value = object[davprotectedhandlersKey];




        ConfigNodePropertyString* obj = &davprotectedhandlers;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["alias"] = getAlias().toJson();






	object["davcreateabsoluteuri"] = getDavcreateabsoluteuri().toJson();






	object["davprotectedhandlers"] = getDavprotectedhandlers().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getAlias()
{
	return alias;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setAlias(ConfigNodePropertyString alias)
{
	this->alias = alias;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getDavcreateabsoluteuri()
{
	return davcreateabsoluteuri;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setDavcreateabsoluteuri(ConfigNodePropertyBoolean davcreateabsoluteuri)
{
	this->davcreateabsoluteuri = davcreateabsoluteuri;
}

ConfigNodePropertyString
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getDavprotectedhandlers()
{
	return davprotectedhandlers;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setDavprotectedhandlers(ConfigNodePropertyString davprotectedhandlers)
{
	this->davprotectedhandlers = davprotectedhandlers;
}



