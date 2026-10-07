

#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.h"

using namespace Tiny;

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	usermapping = ConfigNodePropertyArray();
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties()
{

}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *usermappingKey = "user.mapping";

    if(object.has_key(usermappingKey))
    {
        bourne::json value = object[usermappingKey];




        ConfigNodePropertyArray* obj = &usermapping;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["usermapping"] = getUsermapping().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::getUsermapping()
{
	return usermapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::setUsermapping(ConfigNodePropertyArray usermapping)
{
	this->usermapping = usermapping;
}



