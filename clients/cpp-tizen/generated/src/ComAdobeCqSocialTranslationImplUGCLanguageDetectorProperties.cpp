#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties()
{
	//__init();
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::~ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::__init()
{
	//eventtopics = new ConfigNodePropertyString();
	//eventfilter = new ConfigNodePropertyString();
	//translatelistenertype = new ConfigNodePropertyArray();
	//translatepropertylist = new ConfigNodePropertyArray();
	//poolSize = new ConfigNodePropertyInteger();
	//maxPoolSize = new ConfigNodePropertyInteger();
	//queueSize = new ConfigNodePropertyInteger();
	//keepAliveTime = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::__cleanup()
{
	//if(eventtopics != NULL) {
	//
	//delete eventtopics;
	//eventtopics = NULL;
	//}
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(translatelistenertype != NULL) {
	//
	//delete translatelistenertype;
	//translatelistenertype = NULL;
	//}
	//if(translatepropertylist != NULL) {
	//
	//delete translatepropertylist;
	//translatepropertylist = NULL;
	//}
	//if(poolSize != NULL) {
	//
	//delete poolSize;
	//poolSize = NULL;
	//}
	//if(maxPoolSize != NULL) {
	//
	//delete maxPoolSize;
	//maxPoolSize = NULL;
	//}
	//if(queueSize != NULL) {
	//
	//delete queueSize;
	//queueSize = NULL;
	//}
	//if(keepAliveTime != NULL) {
	//
	//delete keepAliveTime;
	//keepAliveTime = NULL;
	//}
	//
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventtopicsKey = "event.topics";
	node = json_object_get_member(pJsonObject, eventtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventtopics, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventtopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eventfilterKey = "event.filter";
	node = json_object_get_member(pJsonObject, eventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatelistenertypeKey = "translate.listener.type";
	node = json_object_get_member(pJsonObject, translatelistenertypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&translatelistenertype, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&translatelistenertype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatepropertylistKey = "translate.property.list";
	node = json_object_get_member(pJsonObject, translatepropertylistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&translatepropertylist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&translatepropertylist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *poolSizeKey = "poolSize";
	node = json_object_get_member(pJsonObject, poolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&poolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&poolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxPoolSizeKey = "maxPoolSize";
	node = json_object_get_member(pJsonObject, maxPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueSizeKey = "queueSize";
	node = json_object_get_member(pJsonObject, queueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keepAliveTimeKey = "keepAliveTime";
	node = json_object_get_member(pJsonObject, keepAliveTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&keepAliveTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&keepAliveTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventtopics();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventtopicsKey = "event.topics";
	json_object_set_member(pJsonObject, eventtopicsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventfilterKey = "event.filter";
	json_object_set_member(pJsonObject, eventfilterKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTranslatelistenertype();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTranslatelistenertype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatelistenertypeKey = "translate.listener.type";
	json_object_set_member(pJsonObject, translatelistenertypeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTranslatepropertylist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTranslatepropertylist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatepropertylistKey = "translate.property.list";
	json_object_set_member(pJsonObject, translatepropertylistKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *poolSizeKey = "poolSize";
	json_object_set_member(pJsonObject, poolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxPoolSizeKey = "maxPoolSize";
	json_object_set_member(pJsonObject, maxPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueSizeKey = "queueSize";
	json_object_set_member(pJsonObject, queueSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getKeepAliveTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getKeepAliveTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keepAliveTimeKey = "keepAliveTime";
	json_object_set_member(pJsonObject, keepAliveTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setEventtopics(ConfigNodePropertyString  eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getTranslatelistenertype()
{
	return translatelistenertype;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setTranslatelistenertype(ConfigNodePropertyArray  translatelistenertype)
{
	this->translatelistenertype = translatelistenertype;
}

ConfigNodePropertyArray
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getTranslatepropertylist()
{
	return translatepropertylist;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setTranslatepropertylist(ConfigNodePropertyArray  translatepropertylist)
{
	this->translatepropertylist = translatepropertylist;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getPoolSize()
{
	return poolSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setPoolSize(ConfigNodePropertyInteger  poolSize)
{
	this->poolSize = poolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getQueueSize()
{
	return queueSize;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setQueueSize(ConfigNodePropertyInteger  queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties::setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}


