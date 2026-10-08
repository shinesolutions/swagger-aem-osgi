

#include "ComDayCqReplicationAuditReplicationEventListenerProperties.h"

using namespace Tiny;

ComDayCqReplicationAuditReplicationEventListenerProperties::ComDayCqReplicationAuditReplicationEventListenerProperties()
{
	serviceranking = ConfigNodePropertyInteger();
}

ComDayCqReplicationAuditReplicationEventListenerProperties::ComDayCqReplicationAuditReplicationEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationAuditReplicationEventListenerProperties::~ComDayCqReplicationAuditReplicationEventListenerProperties()
{

}

void
ComDayCqReplicationAuditReplicationEventListenerProperties::fromJson(std::string jsonObj)
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
ComDayCqReplicationAuditReplicationEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqReplicationAuditReplicationEventListenerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqReplicationAuditReplicationEventListenerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



