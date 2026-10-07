#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties()
{
	//__init();
}

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::~ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::__init()
{
	//cqanalyticssitecatalystservicedatacenterurl = new ConfigNodePropertyArray();
	//devhostnamepatterns = new ConfigNodePropertyArray();
	//connectiontimeout = new ConfigNodePropertyInteger();
	//sockettimeout = new ConfigNodePropertyInteger();
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::__cleanup()
{
	//if(cqanalyticssitecatalystservicedatacenterurl != NULL) {
	//
	//delete cqanalyticssitecatalystservicedatacenterurl;
	//cqanalyticssitecatalystservicedatacenterurl = NULL;
	//}
	//if(devhostnamepatterns != NULL) {
	//
	//delete devhostnamepatterns;
	//devhostnamepatterns = NULL;
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
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticssitecatalystservicedatacenterurlKey = "cq.analytics.sitecatalyst.service.datacenter.url";
	node = json_object_get_member(pJsonObject, cqanalyticssitecatalystservicedatacenterurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqanalyticssitecatalystservicedatacenterurl, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqanalyticssitecatalystservicedatacenterurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *devhostnamepatternsKey = "devhostnamepatterns";
	node = json_object_get_member(pJsonObject, devhostnamepatternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&devhostnamepatterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&devhostnamepatterns);
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

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqanalyticssitecatalystservicedatacenterurl();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqanalyticssitecatalystservicedatacenterurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticssitecatalystservicedatacenterurlKey = "cq.analytics.sitecatalyst.service.datacenter.url";
	json_object_set_member(pJsonObject, cqanalyticssitecatalystservicedatacenterurlKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDevhostnamepatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDevhostnamepatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *devhostnamepatternsKey = "devhostnamepatterns";
	json_object_set_member(pJsonObject, devhostnamepatternsKey, node);
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

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getCqanalyticssitecatalystservicedatacenterurl()
{
	return cqanalyticssitecatalystservicedatacenterurl;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setCqanalyticssitecatalystservicedatacenterurl(ConfigNodePropertyArray  cqanalyticssitecatalystservicedatacenterurl)
{
	this->cqanalyticssitecatalystservicedatacenterurl = cqanalyticssitecatalystservicedatacenterurl;
}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getDevhostnamepatterns()
{
	return devhostnamepatterns;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setDevhostnamepatterns(ConfigNodePropertyArray  devhostnamepatterns)
{
	this->devhostnamepatterns = devhostnamepatterns;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setSockettimeout(ConfigNodePropertyInteger  sockettimeout)
{
	this->sockettimeout = sockettimeout;
}


