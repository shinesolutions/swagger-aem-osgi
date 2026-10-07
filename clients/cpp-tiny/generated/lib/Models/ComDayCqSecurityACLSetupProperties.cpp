

#include "ComDayCqSecurityACLSetupProperties.h"

using namespace Tiny;

ComDayCqSecurityACLSetupProperties::ComDayCqSecurityACLSetupProperties()
{
	cqaclsetuprules = ConfigNodePropertyArray();
}

ComDayCqSecurityACLSetupProperties::ComDayCqSecurityACLSetupProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSecurityACLSetupProperties::~ComDayCqSecurityACLSetupProperties()
{

}

void
ComDayCqSecurityACLSetupProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqaclsetuprulesKey = "cq.aclsetup.rules";

    if(object.has_key(cqaclsetuprulesKey))
    {
        bourne::json value = object[cqaclsetuprulesKey];




        ConfigNodePropertyArray* obj = &cqaclsetuprules;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSecurityACLSetupProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqaclsetuprules"] = getCqaclsetuprules().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqSecurityACLSetupProperties::getCqaclsetuprules()
{
	return cqaclsetuprules;
}

void
ComDayCqSecurityACLSetupProperties::setCqaclsetuprules(ConfigNodePropertyArray cqaclsetuprules)
{
	this->cqaclsetuprules = cqaclsetuprules;
}



