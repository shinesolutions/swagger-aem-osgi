

#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.h"

using namespace Tiny;

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties()
{
	usermapping = ConfigNodePropertyArray();
	userdefault = ConfigNodePropertyString();
	userenabledefaultmapping = ConfigNodePropertyBoolean();
	requirevalidation = ConfigNodePropertyBoolean();
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::~OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties()
{

}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *usermappingKey = "user.mapping";

    if(object.has_key(usermappingKey))
    {
        bourne::json value = object[usermappingKey];




        ConfigNodePropertyArray* obj = &usermapping;
		obj->fromJson(value.dump());

    }

    const char *userdefaultKey = "user.default";

    if(object.has_key(userdefaultKey))
    {
        bourne::json value = object[userdefaultKey];




        ConfigNodePropertyString* obj = &userdefault;
		obj->fromJson(value.dump());

    }

    const char *userenabledefaultmappingKey = "user.enable.default.mapping";

    if(object.has_key(userenabledefaultmappingKey))
    {
        bourne::json value = object[userenabledefaultmappingKey];




        ConfigNodePropertyBoolean* obj = &userenabledefaultmapping;
		obj->fromJson(value.dump());

    }

    const char *requirevalidationKey = "require.validation";

    if(object.has_key(requirevalidationKey))
    {
        bourne::json value = object[requirevalidationKey];




        ConfigNodePropertyBoolean* obj = &requirevalidation;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["usermapping"] = getUsermapping().toJson();






	object["userdefault"] = getUserdefault().toJson();






	object["userenabledefaultmapping"] = getUserenabledefaultmapping().toJson();






	object["requirevalidation"] = getRequirevalidation().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUsermapping()
{
	return usermapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUsermapping(ConfigNodePropertyArray usermapping)
{
	this->usermapping = usermapping;
}

ConfigNodePropertyString
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUserdefault()
{
	return userdefault;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUserdefault(ConfigNodePropertyString userdefault)
{
	this->userdefault = userdefault;
}

ConfigNodePropertyBoolean
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUserenabledefaultmapping()
{
	return userenabledefaultmapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUserenabledefaultmapping(ConfigNodePropertyBoolean userenabledefaultmapping)
{
	this->userenabledefaultmapping = userenabledefaultmapping;
}

ConfigNodePropertyBoolean
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getRequirevalidation()
{
	return requirevalidation;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setRequirevalidation(ConfigNodePropertyBoolean requirevalidation)
{
	this->requirevalidation = requirevalidation;
}



