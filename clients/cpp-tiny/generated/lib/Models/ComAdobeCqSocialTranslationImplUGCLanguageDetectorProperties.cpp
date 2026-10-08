

#include "ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.h"

using namespace Tiny;

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
	translatelistenertype = ConfigNodePropertyArray();
	translatepropertylist = ConfigNodePropertyArray();
	poolSize = ConfigNodePropertyInteger();
	maxPoolSize = ConfigNodePropertyInteger();
	queueSize = ConfigNodePropertyInteger();
	keepAliveTime = ConfigNodePropertyInteger();
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::~ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties()
{

}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventtopicsKey = "event.topics";

    if(object.has_key(eventtopicsKey))
    {
        bourne::json value = object[eventtopicsKey];




        ConfigNodePropertyString* obj = &eventtopics;
		obj->fromJson(value.dump());

    }

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *translatelistenertypeKey = "translate.listener.type";

    if(object.has_key(translatelistenertypeKey))
    {
        bourne::json value = object[translatelistenertypeKey];




        ConfigNodePropertyArray* obj = &translatelistenertype;
		obj->fromJson(value.dump());

    }

    const char *translatepropertylistKey = "translate.property.list";

    if(object.has_key(translatepropertylistKey))
    {
        bourne::json value = object[translatepropertylistKey];




        ConfigNodePropertyArray* obj = &translatepropertylist;
		obj->fromJson(value.dump());

    }

    const char *poolSizeKey = "poolSize";

    if(object.has_key(poolSizeKey))
    {
        bourne::json value = object[poolSizeKey];




        ConfigNodePropertyInteger* obj = &poolSize;
		obj->fromJson(value.dump());

    }

    const char *maxPoolSizeKey = "maxPoolSize";

    if(object.has_key(maxPoolSizeKey))
    {
        bourne::json value = object[maxPoolSizeKey];




        ConfigNodePropertyInteger* obj = &maxPoolSize;
		obj->fromJson(value.dump());

    }

    const char *queueSizeKey = "queueSize";

    if(object.has_key(queueSizeKey))
    {
        bourne::json value = object[queueSizeKey];




        ConfigNodePropertyInteger* obj = &queueSize;
		obj->fromJson(value.dump());

    }

    const char *keepAliveTimeKey = "keepAliveTime";

    if(object.has_key(keepAliveTimeKey))
    {
        bourne::json value = object[keepAliveTimeKey];




        ConfigNodePropertyInteger* obj = &keepAliveTime;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();






	object["translatelistenertype"] = getTranslatelistenertype().toJson();






	object["translatepropertylist"] = getTranslatepropertylist().toJson();






	object["poolSize"] = getPoolSize().toJson();






	object["maxPoolSize"] = getMaxPoolSize().toJson();






	object["queueSize"] = getQueueSize().toJson();






	object["keepAliveTime"] = getKeepAliveTime().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getTranslatelistenertype()
{
	return translatelistenertype;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setTranslatelistenertype(ConfigNodePropertyArray translatelistenertype)
{
	this->translatelistenertype = translatelistenertype;
}

ConfigNodePropertyArray
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getTranslatepropertylist()
{
	return translatepropertylist;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setTranslatepropertylist(ConfigNodePropertyArray translatepropertylist)
{
	this->translatepropertylist = translatepropertylist;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getPoolSize()
{
	return poolSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setPoolSize(ConfigNodePropertyInteger poolSize)
{
	this->poolSize = poolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getQueueSize()
{
	return queueSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setQueueSize(ConfigNodePropertyInteger queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}



