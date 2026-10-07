

#include "ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.h"

using namespace Tiny;

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties()
{
	cqsearchpromoteconfigurationserveruri = ConfigNodePropertyString();
	cqsearchpromoteconfigurationenvironment = ConfigNodePropertyString();
	connectiontimeout = ConfigNodePropertyInteger();
	sockettimeout = ConfigNodePropertyInteger();
}

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::~ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties()
{

}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsearchpromoteconfigurationserveruriKey = "cq.searchpromote.configuration.server.uri";

    if(object.has_key(cqsearchpromoteconfigurationserveruriKey))
    {
        bourne::json value = object[cqsearchpromoteconfigurationserveruriKey];




        ConfigNodePropertyString* obj = &cqsearchpromoteconfigurationserveruri;
		obj->fromJson(value.dump());

    }

    const char *cqsearchpromoteconfigurationenvironmentKey = "cq.searchpromote.configuration.environment";

    if(object.has_key(cqsearchpromoteconfigurationenvironmentKey))
    {
        bourne::json value = object[cqsearchpromoteconfigurationenvironmentKey];




        ConfigNodePropertyString* obj = &cqsearchpromoteconfigurationenvironment;
		obj->fromJson(value.dump());

    }

    const char *connectiontimeoutKey = "connection.timeout";

    if(object.has_key(connectiontimeoutKey))
    {
        bourne::json value = object[connectiontimeoutKey];




        ConfigNodePropertyInteger* obj = &connectiontimeout;
		obj->fromJson(value.dump());

    }

    const char *sockettimeoutKey = "socket.timeout";

    if(object.has_key(sockettimeoutKey))
    {
        bourne::json value = object[sockettimeoutKey];




        ConfigNodePropertyInteger* obj = &sockettimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsearchpromoteconfigurationserveruri"] = getCqsearchpromoteconfigurationserveruri().toJson();






	object["cqsearchpromoteconfigurationenvironment"] = getCqsearchpromoteconfigurationenvironment().toJson();






	object["connectiontimeout"] = getConnectiontimeout().toJson();






	object["sockettimeout"] = getSockettimeout().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getCqsearchpromoteconfigurationserveruri()
{
	return cqsearchpromoteconfigurationserveruri;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setCqsearchpromoteconfigurationserveruri(ConfigNodePropertyString cqsearchpromoteconfigurationserveruri)
{
	this->cqsearchpromoteconfigurationserveruri = cqsearchpromoteconfigurationserveruri;
}

ConfigNodePropertyString
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getCqsearchpromoteconfigurationenvironment()
{
	return cqsearchpromoteconfigurationenvironment;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setCqsearchpromoteconfigurationenvironment(ConfigNodePropertyString cqsearchpromoteconfigurationenvironment)
{
	this->cqsearchpromoteconfigurationenvironment = cqsearchpromoteconfigurationenvironment;
}

ConfigNodePropertyInteger
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setSockettimeout(ConfigNodePropertyInteger sockettimeout)
{
	this->sockettimeout = sockettimeout;
}



