

#include "OrgApacheSlingXssImplXSSFilterImplProperties.h"

using namespace Tiny;

OrgApacheSlingXssImplXSSFilterImplProperties::OrgApacheSlingXssImplXSSFilterImplProperties()
{
	policyPath = ConfigNodePropertyString();
}

OrgApacheSlingXssImplXSSFilterImplProperties::OrgApacheSlingXssImplXSSFilterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingXssImplXSSFilterImplProperties::~OrgApacheSlingXssImplXSSFilterImplProperties()
{

}

void
OrgApacheSlingXssImplXSSFilterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *policyPathKey = "policyPath";

    if(object.has_key(policyPathKey))
    {
        bourne::json value = object[policyPathKey];




        ConfigNodePropertyString* obj = &policyPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingXssImplXSSFilterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["policyPath"] = getPolicyPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingXssImplXSSFilterImplProperties::getPolicyPath()
{
	return policyPath;
}

void
OrgApacheSlingXssImplXSSFilterImplProperties::setPolicyPath(ConfigNodePropertyString policyPath)
{
	this->policyPath = policyPath;
}



