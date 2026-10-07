#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::ComAdobeCqDtmImplServiceDTMWebServiceImplProperties()
{
	//__init();
}

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::~ComAdobeCqDtmImplServiceDTMWebServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::__init()
{
	//connectiontimeout = new ConfigNodePropertyInteger();
	//sockettimeout = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::__cleanup()
{
	//if(connectiontimeout != NULL) {
	//
	//delete connectiontimeout;
	//connectiontimeout = NULL;
	//}
	//if(sockettimeout != NULL) {
	//
	//delete sockettimeout;
	//sockettimeout = NULL;
	//}
	//
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *connectiontimeoutKey = "connection.timeout";
	node = json_object_get_member(pJsonObject, connectiontimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectiontimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectiontimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sockettimeoutKey = "socket.timeout";
	node = json_object_get_member(pJsonObject, sockettimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&sockettimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&sockettimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectiontimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectiontimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectiontimeoutKey = "connection.timeout";
	json_object_set_member(pJsonObject, connectiontimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSockettimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSockettimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sockettimeoutKey = "socket.timeout";
	json_object_set_member(pJsonObject, sockettimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplProperties::setSockettimeout(ConfigNodePropertyInteger  sockettimeout)
{
	this->sockettimeout = sockettimeout;
}


