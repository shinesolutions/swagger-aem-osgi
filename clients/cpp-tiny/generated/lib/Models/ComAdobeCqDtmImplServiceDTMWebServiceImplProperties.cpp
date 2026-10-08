

#include "ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::ComAdobeCqDtmImplServiceDTMWebServiceImplProperties()
{
	connectiontimeout = ConfigNodePropertyInteger();
	sockettimeout = ConfigNodePropertyInteger();
}

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::~ComAdobeCqDtmImplServiceDTMWebServiceImplProperties()
{

}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["connectiontimeout"] = getConnectiontimeout().toJson();






	object["sockettimeout"] = getSockettimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::setSockettimeout(ConfigNodePropertyInteger sockettimeout)
{
	this->sockettimeout = sockettimeout;
}



