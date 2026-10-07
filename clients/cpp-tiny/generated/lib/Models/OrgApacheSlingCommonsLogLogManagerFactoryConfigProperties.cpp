

#include "OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties()
{
	orgapacheslingcommonsloglevel = ConfigNodePropertyDropDown();
	orgapacheslingcommonslogfile = ConfigNodePropertyString();
	orgapacheslingcommonslogpattern = ConfigNodePropertyString();
	orgapacheslingcommonslognames = ConfigNodePropertyArray();
	orgapacheslingcommonslogadditiv = ConfigNodePropertyBoolean();
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::~OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties()
{

}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";

    if(object.has_key(orgapacheslingcommonsloglevelKey))
    {
        bourne::json value = object[orgapacheslingcommonsloglevelKey];




        ConfigNodePropertyDropDown* obj = &orgapacheslingcommonsloglevel;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";

    if(object.has_key(orgapacheslingcommonslogfileKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfileKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogfile;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";

    if(object.has_key(orgapacheslingcommonslogpatternKey))
    {
        bourne::json value = object[orgapacheslingcommonslogpatternKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogpattern;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslognamesKey = "org.apache.sling.commons.log.names";

    if(object.has_key(orgapacheslingcommonslognamesKey))
    {
        bourne::json value = object[orgapacheslingcommonslognamesKey];




        ConfigNodePropertyArray* obj = &orgapacheslingcommonslognames;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogadditivKey = "org.apache.sling.commons.log.additiv";

    if(object.has_key(orgapacheslingcommonslogadditivKey))
    {
        bourne::json value = object[orgapacheslingcommonslogadditivKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslingcommonslogadditiv;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingcommonsloglevel"] = getOrgapacheslingcommonsloglevel().toJson();






	object["orgapacheslingcommonslogfile"] = getOrgapacheslingcommonslogfile().toJson();






	object["orgapacheslingcommonslogpattern"] = getOrgapacheslingcommonslogpattern().toJson();






	object["orgapacheslingcommonslognames"] = getOrgapacheslingcommonslognames().toJson();






	object["orgapacheslingcommonslogadditiv"] = getOrgapacheslingcommonslogadditiv().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonsloglevel()
{
	return orgapacheslingcommonsloglevel;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown orgapacheslingcommonsloglevel)
{
	this->orgapacheslingcommonsloglevel = orgapacheslingcommonsloglevel;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogpattern()
{
	return orgapacheslingcommonslogpattern;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogpattern(ConfigNodePropertyString orgapacheslingcommonslogpattern)
{
	this->orgapacheslingcommonslogpattern = orgapacheslingcommonslogpattern;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslognames()
{
	return orgapacheslingcommonslognames;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslognames(ConfigNodePropertyArray orgapacheslingcommonslognames)
{
	this->orgapacheslingcommonslognames = orgapacheslingcommonslognames;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogadditiv()
{
	return orgapacheslingcommonslogadditiv;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogadditiv(ConfigNodePropertyBoolean orgapacheslingcommonslogadditiv)
{
	this->orgapacheslingcommonslogadditiv = orgapacheslingcommonslogadditiv;
}



