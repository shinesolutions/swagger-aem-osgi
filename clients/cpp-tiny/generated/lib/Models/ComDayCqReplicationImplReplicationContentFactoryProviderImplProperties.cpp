

#include "ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.h"

using namespace Tiny;

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties()
{
	replicationcontentuseFileStorage = ConfigNodePropertyBoolean();
	replicationcontentmaxCommitAttempts = ConfigNodePropertyInteger();
}

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::~ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties()
{

}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *replicationcontentuseFileStorageKey = "replication.content.useFileStorage";

    if(object.has_key(replicationcontentuseFileStorageKey))
    {
        bourne::json value = object[replicationcontentuseFileStorageKey];




        ConfigNodePropertyBoolean* obj = &replicationcontentuseFileStorage;
		obj->fromJson(value.dump());

    }

    const char *replicationcontentmaxCommitAttemptsKey = "replication.content.maxCommitAttempts";

    if(object.has_key(replicationcontentmaxCommitAttemptsKey))
    {
        bourne::json value = object[replicationcontentmaxCommitAttemptsKey];




        ConfigNodePropertyInteger* obj = &replicationcontentmaxCommitAttempts;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["replicationcontentuseFileStorage"] = getReplicationcontentuseFileStorage().toJson();






	object["replicationcontentmaxCommitAttempts"] = getReplicationcontentmaxCommitAttempts().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::getReplicationcontentuseFileStorage()
{
	return replicationcontentuseFileStorage;
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::setReplicationcontentuseFileStorage(ConfigNodePropertyBoolean replicationcontentuseFileStorage)
{
	this->replicationcontentuseFileStorage = replicationcontentuseFileStorage;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::getReplicationcontentmaxCommitAttempts()
{
	return replicationcontentmaxCommitAttempts;
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::setReplicationcontentmaxCommitAttempts(ConfigNodePropertyInteger replicationcontentmaxCommitAttempts)
{
	this->replicationcontentmaxCommitAttempts = replicationcontentmaxCommitAttempts;
}



