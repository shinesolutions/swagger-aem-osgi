

#include "OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.h"

using namespace Tiny;

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties()
{
	allowonlysystemuser = ConfigNodePropertyBoolean();
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::~OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties()
{

}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *allowonlysystemuserKey = "allow.only.system.user";

    if(object.has_key(allowonlysystemuserKey))
    {
        bourne::json value = object[allowonlysystemuserKey];




        ConfigNodePropertyBoolean* obj = &allowonlysystemuser;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["allowonlysystemuser"] = getAllowonlysystemuser().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::getAllowonlysystemuser()
{
	return allowonlysystemuser;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::setAllowonlysystemuser(ConfigNodePropertyBoolean allowonlysystemuser)
{
	this->allowonlysystemuser = allowonlysystemuser;
}



