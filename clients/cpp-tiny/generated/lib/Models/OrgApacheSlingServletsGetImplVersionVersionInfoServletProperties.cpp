

#include "OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.h"

using namespace Tiny;

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{
	slingservletselectors = ConfigNodePropertyArray();
	ecmaSuport = ConfigNodePropertyBoolean();
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::~OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{

}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyArray* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }

    const char *ecmaSuportKey = "ecmaSuport";

    if(object.has_key(ecmaSuportKey))
    {
        bourne::json value = object[ecmaSuportKey];




        ConfigNodePropertyBoolean* obj = &ecmaSuport;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["ecmaSuport"] = getEcmaSuport().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setSlingservletselectors(ConfigNodePropertyArray slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getEcmaSuport()
{
	return ecmaSuport;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport)
{
	this->ecmaSuport = ecmaSuport;
}



