

#include "ComAdobeGraniteLoggingImplLogAnalyserImplProperties.h"

using namespace Tiny;

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::ComAdobeGraniteLoggingImplLogAnalyserImplProperties()
{
	messagesqueuesize = ConfigNodePropertyInteger();
	loggerconfig = ConfigNodePropertyArray();
	messagessize = ConfigNodePropertyInteger();
}

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::ComAdobeGraniteLoggingImplLogAnalyserImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::~ComAdobeGraniteLoggingImplLogAnalyserImplProperties()
{

}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messagesqueuesizeKey = "messages.queue.size";

    if(object.has_key(messagesqueuesizeKey))
    {
        bourne::json value = object[messagesqueuesizeKey];




        ConfigNodePropertyInteger* obj = &messagesqueuesize;
		obj->fromJson(value.dump());

    }

    const char *loggerconfigKey = "logger.config";

    if(object.has_key(loggerconfigKey))
    {
        bourne::json value = object[loggerconfigKey];




        ConfigNodePropertyArray* obj = &loggerconfig;
		obj->fromJson(value.dump());

    }

    const char *messagessizeKey = "messages.size";

    if(object.has_key(messagessizeKey))
    {
        bourne::json value = object[messagessizeKey];




        ConfigNodePropertyInteger* obj = &messagessize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["messagesqueuesize"] = getMessagesqueuesize().toJson();






	object["loggerconfig"] = getLoggerconfig().toJson();






	object["messagessize"] = getMessagessize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getMessagesqueuesize()
{
	return messagesqueuesize;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setMessagesqueuesize(ConfigNodePropertyInteger messagesqueuesize)
{
	this->messagesqueuesize = messagesqueuesize;
}

ConfigNodePropertyArray
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getLoggerconfig()
{
	return loggerconfig;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setLoggerconfig(ConfigNodePropertyArray loggerconfig)
{
	this->loggerconfig = loggerconfig;
}

ConfigNodePropertyInteger
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getMessagessize()
{
	return messagessize;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setMessagessize(ConfigNodePropertyInteger messagessize)
{
	this->messagessize = messagessize;
}



