#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::ComAdobeCqDamS7imagingImplIsImageServerComponentProperties()
{
	//__init();
}

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::~ComAdobeCqDamS7imagingImplIsImageServerComponentProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::__init()
{
	//tcpPort = new ConfigNodePropertyString();
	//allowRemoteAccess = new ConfigNodePropertyBoolean();
	//maxRenderRgnPixels = new ConfigNodePropertyString();
	//maxMessageSize = new ConfigNodePropertyString();
	//randomAccessUrlTimeout = new ConfigNodePropertyInteger();
	//workerThreads = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::__cleanup()
{
	//if(tcpPort != NULL) {
	//
	//delete tcpPort;
	//tcpPort = NULL;
	//}
	//if(allowRemoteAccess != NULL) {
	//
	//delete allowRemoteAccess;
	//allowRemoteAccess = NULL;
	//}
	//if(maxRenderRgnPixels != NULL) {
	//
	//delete maxRenderRgnPixels;
	//maxRenderRgnPixels = NULL;
	//}
	//if(maxMessageSize != NULL) {
	//
	//delete maxMessageSize;
	//maxMessageSize = NULL;
	//}
	//if(randomAccessUrlTimeout != NULL) {
	//
	//delete randomAccessUrlTimeout;
	//randomAccessUrlTimeout = NULL;
	//}
	//if(workerThreads != NULL) {
	//
	//delete workerThreads;
	//workerThreads = NULL;
	//}
	//
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tcpPortKey = "TcpPort";
	node = json_object_get_member(pJsonObject, tcpPortKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tcpPort, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tcpPort);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowRemoteAccessKey = "AllowRemoteAccess";
	node = json_object_get_member(pJsonObject, allowRemoteAccessKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&allowRemoteAccess, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&allowRemoteAccess);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxRenderRgnPixelsKey = "MaxRenderRgnPixels";
	node = json_object_get_member(pJsonObject, maxRenderRgnPixelsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxRenderRgnPixels, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxRenderRgnPixels);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxMessageSizeKey = "MaxMessageSize";
	node = json_object_get_member(pJsonObject, maxMessageSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxMessageSize, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxMessageSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *randomAccessUrlTimeoutKey = "RandomAccessUrlTimeout";
	node = json_object_get_member(pJsonObject, randomAccessUrlTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&randomAccessUrlTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&randomAccessUrlTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *workerThreadsKey = "WorkerThreads";
	node = json_object_get_member(pJsonObject, workerThreadsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&workerThreads, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&workerThreads);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTcpPort();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTcpPort());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tcpPortKey = "TcpPort";
	json_object_set_member(pJsonObject, tcpPortKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAllowRemoteAccess();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAllowRemoteAccess());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowRemoteAccessKey = "AllowRemoteAccess";
	json_object_set_member(pJsonObject, allowRemoteAccessKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxRenderRgnPixels();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxRenderRgnPixels());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxRenderRgnPixelsKey = "MaxRenderRgnPixels";
	json_object_set_member(pJsonObject, maxRenderRgnPixelsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxMessageSize();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxMessageSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxMessageSizeKey = "MaxMessageSize";
	json_object_set_member(pJsonObject, maxMessageSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRandomAccessUrlTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRandomAccessUrlTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *randomAccessUrlTimeoutKey = "RandomAccessUrlTimeout";
	json_object_set_member(pJsonObject, randomAccessUrlTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getWorkerThreads();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getWorkerThreads());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workerThreadsKey = "WorkerThreads";
	json_object_set_member(pJsonObject, workerThreadsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getTcpPort()
{
	return tcpPort;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setTcpPort(ConfigNodePropertyString  tcpPort)
{
	this->tcpPort = tcpPort;
}

ConfigNodePropertyBoolean
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getAllowRemoteAccess()
{
	return allowRemoteAccess;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setAllowRemoteAccess(ConfigNodePropertyBoolean  allowRemoteAccess)
{
	this->allowRemoteAccess = allowRemoteAccess;
}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getMaxRenderRgnPixels()
{
	return maxRenderRgnPixels;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setMaxRenderRgnPixels(ConfigNodePropertyString  maxRenderRgnPixels)
{
	this->maxRenderRgnPixels = maxRenderRgnPixels;
}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getMaxMessageSize()
{
	return maxMessageSize;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setMaxMessageSize(ConfigNodePropertyString  maxMessageSize)
{
	this->maxMessageSize = maxMessageSize;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getRandomAccessUrlTimeout()
{
	return randomAccessUrlTimeout;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setRandomAccessUrlTimeout(ConfigNodePropertyInteger  randomAccessUrlTimeout)
{
	this->randomAccessUrlTimeout = randomAccessUrlTimeout;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getWorkerThreads()
{
	return workerThreads;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setWorkerThreads(ConfigNodePropertyInteger  workerThreads)
{
	this->workerThreads = workerThreads;
}


