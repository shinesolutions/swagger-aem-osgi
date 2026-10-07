

#include "ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties()
{
	streamPath = ConfigNodePropertyString();
	streamName = ConfigNodePropertyString();
}

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::~ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *streamPathKey = "streamPath";

    if(object.has_key(streamPathKey))
    {
        bourne::json value = object[streamPathKey];




        ConfigNodePropertyString* obj = &streamPath;
		obj->fromJson(value.dump());

    }

    const char *streamNameKey = "streamName";

    if(object.has_key(streamNameKey))
    {
        bourne::json value = object[streamNameKey];




        ConfigNodePropertyString* obj = &streamName;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["streamPath"] = getStreamPath().toJson();






	object["streamName"] = getStreamName().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::getStreamPath()
{
	return streamPath;
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::setStreamPath(ConfigNodePropertyString streamPath)
{
	this->streamPath = streamPath;
}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::getStreamName()
{
	return streamName;
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::setStreamName(ConfigNodePropertyString streamName)
{
	this->streamName = streamName;
}



