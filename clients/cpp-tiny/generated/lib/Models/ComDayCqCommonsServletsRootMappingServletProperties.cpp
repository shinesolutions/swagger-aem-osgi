

#include "ComDayCqCommonsServletsRootMappingServletProperties.h"

using namespace Tiny;

ComDayCqCommonsServletsRootMappingServletProperties::ComDayCqCommonsServletsRootMappingServletProperties()
{
	rootmappingtarget = ConfigNodePropertyString();
}

ComDayCqCommonsServletsRootMappingServletProperties::ComDayCqCommonsServletsRootMappingServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCommonsServletsRootMappingServletProperties::~ComDayCqCommonsServletsRootMappingServletProperties()
{

}

void
ComDayCqCommonsServletsRootMappingServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rootmappingtargetKey = "rootmapping.target";

    if(object.has_key(rootmappingtargetKey))
    {
        bourne::json value = object[rootmappingtargetKey];




        ConfigNodePropertyString* obj = &rootmappingtarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCommonsServletsRootMappingServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["rootmappingtarget"] = getRootmappingtarget().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqCommonsServletsRootMappingServletProperties::getRootmappingtarget()
{
	return rootmappingtarget;
}

void
ComDayCqCommonsServletsRootMappingServletProperties::setRootmappingtarget(ConfigNodePropertyString rootmappingtarget)
{
	this->rootmappingtarget = rootmappingtarget;
}



