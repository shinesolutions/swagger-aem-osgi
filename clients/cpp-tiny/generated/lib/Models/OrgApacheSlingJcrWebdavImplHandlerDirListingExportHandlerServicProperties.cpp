

#include "OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.h"

using namespace Tiny;

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties()
{
	serviceranking = ConfigNodePropertyInteger();
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::~OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties()
{

}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



