#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::~ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::__init()
{
	//streamPath = new ConfigNodePropertyString();
	//streamName = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::__cleanup()
{
	//if(streamPath != NULL) {
	//
	//delete streamPath;
	//streamPath = NULL;
	//}
	//if(streamName != NULL) {
	//
	//delete streamName;
	//streamName = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *streamPathKey = "streamPath";
	node = json_object_get_member(pJsonObject, streamPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&streamPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&streamPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *streamNameKey = "streamName";
	node = json_object_get_member(pJsonObject, streamNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&streamName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&streamName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getStreamPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getStreamPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *streamPathKey = "streamPath";
	json_object_set_member(pJsonObject, streamPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getStreamName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getStreamName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *streamNameKey = "streamName";
	json_object_set_member(pJsonObject, streamNameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::getStreamPath()
{
	return streamPath;
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::setStreamPath(ConfigNodePropertyString  streamPath)
{
	this->streamPath = streamPath;
}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::getStreamName()
{
	return streamName;
}

void
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties::setStreamName(ConfigNodePropertyString  streamName)
{
	this->streamName = streamName;
}


