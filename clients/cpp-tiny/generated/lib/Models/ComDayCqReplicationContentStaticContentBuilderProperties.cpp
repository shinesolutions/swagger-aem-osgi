

#include "ComDayCqReplicationContentStaticContentBuilderProperties.h"

using namespace Tiny;

ComDayCqReplicationContentStaticContentBuilderProperties::ComDayCqReplicationContentStaticContentBuilderProperties()
{
	host = ConfigNodePropertyString();
	port = ConfigNodePropertyInteger();
}

ComDayCqReplicationContentStaticContentBuilderProperties::ComDayCqReplicationContentStaticContentBuilderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationContentStaticContentBuilderProperties::~ComDayCqReplicationContentStaticContentBuilderProperties()
{

}

void
ComDayCqReplicationContentStaticContentBuilderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hostKey = "host";

    if(object.has_key(hostKey))
    {
        bourne::json value = object[hostKey];




        ConfigNodePropertyString* obj = &host;
		obj->fromJson(value.dump());

    }

    const char *portKey = "port";

    if(object.has_key(portKey))
    {
        bourne::json value = object[portKey];




        ConfigNodePropertyInteger* obj = &port;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationContentStaticContentBuilderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["host"] = getHost().toJson();






	object["port"] = getPort().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqReplicationContentStaticContentBuilderProperties::getHost()
{
	return host;
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::setHost(ConfigNodePropertyString host)
{
	this->host = host;
}

ConfigNodePropertyInteger
ComDayCqReplicationContentStaticContentBuilderProperties::getPort()
{
	return port;
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::setPort(ConfigNodePropertyInteger port)
{
	this->port = port;
}



