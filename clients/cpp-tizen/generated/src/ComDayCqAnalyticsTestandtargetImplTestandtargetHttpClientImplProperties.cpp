#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::__init()
{
	//cqanalyticstestandtargetapiurl = new ConfigNodePropertyString();
	//cqanalyticstestandtargettimeout = new ConfigNodePropertyInteger();
	//cqanalyticstestandtargetsockettimeout = new ConfigNodePropertyInteger();
	//cqanalyticstestandtargetrecommendationsurlreplace = new ConfigNodePropertyString();
	//cqanalyticstestandtargetrecommendationsurlreplacewith = new ConfigNodePropertyString();
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::__cleanup()
{
	//if(cqanalyticstestandtargetapiurl != NULL) {
	//
	//delete cqanalyticstestandtargetapiurl;
	//cqanalyticstestandtargetapiurl = NULL;
	//}
	//if(cqanalyticstestandtargettimeout != NULL) {
	//
	//delete cqanalyticstestandtargettimeout;
	//cqanalyticstestandtargettimeout = NULL;
	//}
	//if(cqanalyticstestandtargetsockettimeout != NULL) {
	//
	//delete cqanalyticstestandtargetsockettimeout;
	//cqanalyticstestandtargetsockettimeout = NULL;
	//}
	//if(cqanalyticstestandtargetrecommendationsurlreplace != NULL) {
	//
	//delete cqanalyticstestandtargetrecommendationsurlreplace;
	//cqanalyticstestandtargetrecommendationsurlreplace = NULL;
	//}
	//if(cqanalyticstestandtargetrecommendationsurlreplacewith != NULL) {
	//
	//delete cqanalyticstestandtargetrecommendationsurlreplacewith;
	//cqanalyticstestandtargetrecommendationsurlreplacewith = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticstestandtargetapiurlKey = "cq.analytics.testandtarget.api.url";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetapiurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqanalyticstestandtargetapiurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqanalyticstestandtargetapiurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqanalyticstestandtargettimeoutKey = "cq.analytics.testandtarget.timeout";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargettimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqanalyticstestandtargettimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqanalyticstestandtargettimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqanalyticstestandtargetsockettimeoutKey = "cq.analytics.testandtarget.sockettimeout";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetsockettimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqanalyticstestandtargetsockettimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqanalyticstestandtargetsockettimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqanalyticstestandtargetrecommendationsurlreplaceKey = "cq.analytics.testandtarget.recommendations.url.replace";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetrecommendationsurlreplaceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqanalyticstestandtargetrecommendationsurlreplace, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqanalyticstestandtargetrecommendationsurlreplace);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqanalyticstestandtargetrecommendationsurlreplacewithKey = "cq.analytics.testandtarget.recommendations.url.replacewith";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetrecommendationsurlreplacewithKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqanalyticstestandtargetrecommendationsurlreplacewith, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqanalyticstestandtargetrecommendationsurlreplacewith);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqanalyticstestandtargetapiurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqanalyticstestandtargetapiurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetapiurlKey = "cq.analytics.testandtarget.api.url";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetapiurlKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqanalyticstestandtargettimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqanalyticstestandtargettimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargettimeoutKey = "cq.analytics.testandtarget.timeout";
	json_object_set_member(pJsonObject, cqanalyticstestandtargettimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqanalyticstestandtargetsockettimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqanalyticstestandtargetsockettimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetsockettimeoutKey = "cq.analytics.testandtarget.sockettimeout";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetsockettimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqanalyticstestandtargetrecommendationsurlreplace();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqanalyticstestandtargetrecommendationsurlreplace());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetrecommendationsurlreplaceKey = "cq.analytics.testandtarget.recommendations.url.replace";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetrecommendationsurlreplaceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqanalyticstestandtargetrecommendationsurlreplacewith();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqanalyticstestandtargetrecommendationsurlreplacewith());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetrecommendationsurlreplacewithKey = "cq.analytics.testandtarget.recommendations.url.replacewith";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetrecommendationsurlreplacewithKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetapiurl()
{
	return cqanalyticstestandtargetapiurl;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetapiurl(ConfigNodePropertyString  cqanalyticstestandtargetapiurl)
{
	this->cqanalyticstestandtargetapiurl = cqanalyticstestandtargetapiurl;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargettimeout()
{
	return cqanalyticstestandtargettimeout;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargettimeout(ConfigNodePropertyInteger  cqanalyticstestandtargettimeout)
{
	this->cqanalyticstestandtargettimeout = cqanalyticstestandtargettimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetsockettimeout()
{
	return cqanalyticstestandtargetsockettimeout;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetsockettimeout(ConfigNodePropertyInteger  cqanalyticstestandtargetsockettimeout)
{
	this->cqanalyticstestandtargetsockettimeout = cqanalyticstestandtargetsockettimeout;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetrecommendationsurlreplace()
{
	return cqanalyticstestandtargetrecommendationsurlreplace;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetrecommendationsurlreplace(ConfigNodePropertyString  cqanalyticstestandtargetrecommendationsurlreplace)
{
	this->cqanalyticstestandtargetrecommendationsurlreplace = cqanalyticstestandtargetrecommendationsurlreplace;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetrecommendationsurlreplacewith()
{
	return cqanalyticstestandtargetrecommendationsurlreplacewith;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetrecommendationsurlreplacewith(ConfigNodePropertyString  cqanalyticstestandtargetrecommendationsurlreplacewith)
{
	this->cqanalyticstestandtargetrecommendationsurlreplacewith = cqanalyticstestandtargetrecommendationsurlreplacewith;
}


