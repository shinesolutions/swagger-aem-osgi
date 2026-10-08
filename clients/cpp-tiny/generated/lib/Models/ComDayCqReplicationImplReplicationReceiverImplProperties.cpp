

#include "ComDayCqReplicationImplReplicationReceiverImplProperties.h"

using namespace Tiny;

ComDayCqReplicationImplReplicationReceiverImplProperties::ComDayCqReplicationImplReplicationReceiverImplProperties()
{
	receivertmpfilethreshold = ConfigNodePropertyInteger();
	receiverpackagesuseinstall = ConfigNodePropertyBoolean();
}

ComDayCqReplicationImplReplicationReceiverImplProperties::ComDayCqReplicationImplReplicationReceiverImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReplicationReceiverImplProperties::~ComDayCqReplicationImplReplicationReceiverImplProperties()
{

}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *receivertmpfilethresholdKey = "receiver.tmpfile.threshold";

    if(object.has_key(receivertmpfilethresholdKey))
    {
        bourne::json value = object[receivertmpfilethresholdKey];




        ConfigNodePropertyInteger* obj = &receivertmpfilethreshold;
		obj->fromJson(value.dump());

    }

    const char *receiverpackagesuseinstallKey = "receiver.packages.use.install";

    if(object.has_key(receiverpackagesuseinstallKey))
    {
        bourne::json value = object[receiverpackagesuseinstallKey];




        ConfigNodePropertyBoolean* obj = &receiverpackagesuseinstall;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReplicationReceiverImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["receivertmpfilethreshold"] = getReceivertmpfilethreshold().toJson();






	object["receiverpackagesuseinstall"] = getReceiverpackagesuseinstall().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqReplicationImplReplicationReceiverImplProperties::getReceivertmpfilethreshold()
{
	return receivertmpfilethreshold;
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::setReceivertmpfilethreshold(ConfigNodePropertyInteger receivertmpfilethreshold)
{
	this->receivertmpfilethreshold = receivertmpfilethreshold;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicationReceiverImplProperties::getReceiverpackagesuseinstall()
{
	return receiverpackagesuseinstall;
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::setReceiverpackagesuseinstall(ConfigNodePropertyBoolean receiverpackagesuseinstall)
{
	this->receiverpackagesuseinstall = receiverpackagesuseinstall;
}



