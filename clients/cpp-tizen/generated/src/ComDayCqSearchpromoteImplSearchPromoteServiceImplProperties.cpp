#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties()
{
	//__init();
}

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::~ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::__init()
{
	//cqsearchpromoteconfigurationserveruri = new ConfigNodePropertyString();
	//cqsearchpromoteconfigurationenvironment = new ConfigNodePropertyString();
	//connectiontimeout = new ConfigNodePropertyInteger();
	//sockettimeout = new ConfigNodePropertyInteger();
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::__cleanup()
{
	//if(cqsearchpromoteconfigurationserveruri != NULL) {
	//
	//delete cqsearchpromoteconfigurationserveruri;
	//cqsearchpromoteconfigurationserveruri = NULL;
	//}
	//if(cqsearchpromoteconfigurationenvironment != NULL) {
	//
	//delete cqsearchpromoteconfigurationenvironment;
	//cqsearchpromoteconfigurationenvironment = NULL;
	//}
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
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsearchpromoteconfigurationserveruriKey = "cq.searchpromote.configuration.server.uri";
	node = json_object_get_member(pJsonObject, cqsearchpromoteconfigurationserveruriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqsearchpromoteconfigurationserveruri, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqsearchpromoteconfigurationserveruri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqsearchpromoteconfigurationenvironmentKey = "cq.searchpromote.configuration.environment";
	node = json_object_get_member(pJsonObject, cqsearchpromoteconfigurationenvironmentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqsearchpromoteconfigurationenvironment, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqsearchpromoteconfigurationenvironment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqsearchpromoteconfigurationserveruri();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqsearchpromoteconfigurationserveruri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsearchpromoteconfigurationserveruriKey = "cq.searchpromote.configuration.server.uri";
	json_object_set_member(pJsonObject, cqsearchpromoteconfigurationserveruriKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqsearchpromoteconfigurationenvironment();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqsearchpromoteconfigurationenvironment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsearchpromoteconfigurationenvironmentKey = "cq.searchpromote.configuration.environment";
	json_object_set_member(pJsonObject, cqsearchpromoteconfigurationenvironmentKey, node);
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

ConfigNodePropertyString
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getCqsearchpromoteconfigurationserveruri()
{
	return cqsearchpromoteconfigurationserveruri;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setCqsearchpromoteconfigurationserveruri(ConfigNodePropertyString  cqsearchpromoteconfigurationserveruri)
{
	this->cqsearchpromoteconfigurationserveruri = cqsearchpromoteconfigurationserveruri;
}

ConfigNodePropertyString
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getCqsearchpromoteconfigurationenvironment()
{
	return cqsearchpromoteconfigurationenvironment;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setCqsearchpromoteconfigurationenvironment(ConfigNodePropertyString  cqsearchpromoteconfigurationenvironment)
{
	this->cqsearchpromoteconfigurationenvironment = cqsearchpromoteconfigurationenvironment;
}

ConfigNodePropertyInteger
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties::setSockettimeout(ConfigNodePropertyInteger  sockettimeout)
{
	this->sockettimeout = sockettimeout;
}


