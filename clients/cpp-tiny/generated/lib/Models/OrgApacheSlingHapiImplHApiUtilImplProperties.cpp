

#include "OrgApacheSlingHapiImplHApiUtilImplProperties.h"

using namespace Tiny;

OrgApacheSlingHapiImplHApiUtilImplProperties::OrgApacheSlingHapiImplHApiUtilImplProperties()
{
	orgapacheslinghapitoolsresourcetype = ConfigNodePropertyString();
	orgapacheslinghapitoolscollectionresourcetype = ConfigNodePropertyString();
	orgapacheslinghapitoolssearchpaths = ConfigNodePropertyArray();
	orgapacheslinghapitoolsexternalurl = ConfigNodePropertyString();
	orgapacheslinghapitoolsenabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingHapiImplHApiUtilImplProperties::OrgApacheSlingHapiImplHApiUtilImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHapiImplHApiUtilImplProperties::~OrgApacheSlingHapiImplHApiUtilImplProperties()
{

}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslinghapitoolsresourcetypeKey = "org.apache.sling.hapi.tools.resourcetype";

    if(object.has_key(orgapacheslinghapitoolsresourcetypeKey))
    {
        bourne::json value = object[orgapacheslinghapitoolsresourcetypeKey];




        ConfigNodePropertyString* obj = &orgapacheslinghapitoolsresourcetype;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslinghapitoolscollectionresourcetypeKey = "org.apache.sling.hapi.tools.collectionresourcetype";

    if(object.has_key(orgapacheslinghapitoolscollectionresourcetypeKey))
    {
        bourne::json value = object[orgapacheslinghapitoolscollectionresourcetypeKey];




        ConfigNodePropertyString* obj = &orgapacheslinghapitoolscollectionresourcetype;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslinghapitoolssearchpathsKey = "org.apache.sling.hapi.tools.searchpaths";

    if(object.has_key(orgapacheslinghapitoolssearchpathsKey))
    {
        bourne::json value = object[orgapacheslinghapitoolssearchpathsKey];




        ConfigNodePropertyArray* obj = &orgapacheslinghapitoolssearchpaths;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslinghapitoolsexternalurlKey = "org.apache.sling.hapi.tools.externalurl";

    if(object.has_key(orgapacheslinghapitoolsexternalurlKey))
    {
        bourne::json value = object[orgapacheslinghapitoolsexternalurlKey];




        ConfigNodePropertyString* obj = &orgapacheslinghapitoolsexternalurl;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslinghapitoolsenabledKey = "org.apache.sling.hapi.tools.enabled";

    if(object.has_key(orgapacheslinghapitoolsenabledKey))
    {
        bourne::json value = object[orgapacheslinghapitoolsenabledKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslinghapitoolsenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHapiImplHApiUtilImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslinghapitoolsresourcetype"] = getOrgapacheslinghapitoolsresourcetype().toJson();






	object["orgapacheslinghapitoolscollectionresourcetype"] = getOrgapacheslinghapitoolscollectionresourcetype().toJson();






	object["orgapacheslinghapitoolssearchpaths"] = getOrgapacheslinghapitoolssearchpaths().toJson();






	object["orgapacheslinghapitoolsexternalurl"] = getOrgapacheslinghapitoolsexternalurl().toJson();






	object["orgapacheslinghapitoolsenabled"] = getOrgapacheslinghapitoolsenabled().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsresourcetype()
{
	return orgapacheslinghapitoolsresourcetype;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsresourcetype(ConfigNodePropertyString orgapacheslinghapitoolsresourcetype)
{
	this->orgapacheslinghapitoolsresourcetype = orgapacheslinghapitoolsresourcetype;
}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolscollectionresourcetype()
{
	return orgapacheslinghapitoolscollectionresourcetype;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolscollectionresourcetype(ConfigNodePropertyString orgapacheslinghapitoolscollectionresourcetype)
{
	this->orgapacheslinghapitoolscollectionresourcetype = orgapacheslinghapitoolscollectionresourcetype;
}

ConfigNodePropertyArray
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolssearchpaths()
{
	return orgapacheslinghapitoolssearchpaths;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolssearchpaths(ConfigNodePropertyArray orgapacheslinghapitoolssearchpaths)
{
	this->orgapacheslinghapitoolssearchpaths = orgapacheslinghapitoolssearchpaths;
}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsexternalurl()
{
	return orgapacheslinghapitoolsexternalurl;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsexternalurl(ConfigNodePropertyString orgapacheslinghapitoolsexternalurl)
{
	this->orgapacheslinghapitoolsexternalurl = orgapacheslinghapitoolsexternalurl;
}

ConfigNodePropertyBoolean
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsenabled()
{
	return orgapacheslinghapitoolsenabled;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsenabled(ConfigNodePropertyBoolean orgapacheslinghapitoolsenabled)
{
	this->orgapacheslinghapitoolsenabled = orgapacheslinghapitoolsenabled;
}



