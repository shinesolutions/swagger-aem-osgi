

#include "OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties()
{
	name = ConfigNodePropertyString();
	jcrPrivilege = ConfigNodePropertyString();
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties()
{

}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *jcrPrivilegeKey = "jcrPrivilege";

    if(object.has_key(jcrPrivilegeKey))
    {
        bourne::json value = object[jcrPrivilegeKey];




        ConfigNodePropertyString* obj = &jcrPrivilege;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["jcrPrivilege"] = getJcrPrivilege().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::getJcrPrivilege()
{
	return jcrPrivilege;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties::setJcrPrivilege(ConfigNodePropertyString jcrPrivilege)
{
	this->jcrPrivilege = jcrPrivilege;
}



