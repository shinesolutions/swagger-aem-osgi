#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixHttpSslfilterSslFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixHttpSslfilterSslFilterProperties::OrgApacheFelixHttpSslfilterSslFilterProperties()
{
	//__init();
}

OrgApacheFelixHttpSslfilterSslFilterProperties::~OrgApacheFelixHttpSslfilterSslFilterProperties()
{
	//__cleanup();
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::__init()
{
	//sslforwardheader = new ConfigNodePropertyString();
	//sslforwardvalue = new ConfigNodePropertyString();
	//sslforwardcertheader = new ConfigNodePropertyString();
	//rewriteabsoluteurls = new ConfigNodePropertyBoolean();
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::__cleanup()
{
	//if(sslforwardheader != NULL) {
	//
	//delete sslforwardheader;
	//sslforwardheader = NULL;
	//}
	//if(sslforwardvalue != NULL) {
	//
	//delete sslforwardvalue;
	//sslforwardvalue = NULL;
	//}
	//if(sslforwardcertheader != NULL) {
	//
	//delete sslforwardcertheader;
	//sslforwardcertheader = NULL;
	//}
	//if(rewriteabsoluteurls != NULL) {
	//
	//delete rewriteabsoluteurls;
	//rewriteabsoluteurls = NULL;
	//}
	//
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *sslforwardheaderKey = "ssl-forward.header";
	node = json_object_get_member(pJsonObject, sslforwardheaderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sslforwardheader, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sslforwardheader);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sslforwardvalueKey = "ssl-forward.value";
	node = json_object_get_member(pJsonObject, sslforwardvalueKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sslforwardvalue, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sslforwardvalue);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sslforwardcertheaderKey = "ssl-forward-cert.header";
	node = json_object_get_member(pJsonObject, sslforwardcertheaderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sslforwardcertheader, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sslforwardcertheader);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rewriteabsoluteurlsKey = "rewrite.absolute.urls";
	node = json_object_get_member(pJsonObject, rewriteabsoluteurlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&rewriteabsoluteurls, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&rewriteabsoluteurls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixHttpSslfilterSslFilterProperties::OrgApacheFelixHttpSslfilterSslFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixHttpSslfilterSslFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSslforwardheader();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSslforwardheader());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sslforwardheaderKey = "ssl-forward.header";
	json_object_set_member(pJsonObject, sslforwardheaderKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSslforwardvalue();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSslforwardvalue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sslforwardvalueKey = "ssl-forward.value";
	json_object_set_member(pJsonObject, sslforwardvalueKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSslforwardcertheader();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSslforwardcertheader());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sslforwardcertheaderKey = "ssl-forward-cert.header";
	json_object_set_member(pJsonObject, sslforwardcertheaderKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRewriteabsoluteurls();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRewriteabsoluteurls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rewriteabsoluteurlsKey = "rewrite.absolute.urls";
	json_object_set_member(pJsonObject, rewriteabsoluteurlsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardheader()
{
	return sslforwardheader;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardheader(ConfigNodePropertyString  sslforwardheader)
{
	this->sslforwardheader = sslforwardheader;
}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardvalue()
{
	return sslforwardvalue;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardvalue(ConfigNodePropertyString  sslforwardvalue)
{
	this->sslforwardvalue = sslforwardvalue;
}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardcertheader()
{
	return sslforwardcertheader;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardcertheader(ConfigNodePropertyString  sslforwardcertheader)
{
	this->sslforwardcertheader = sslforwardcertheader;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpSslfilterSslFilterProperties::getRewriteabsoluteurls()
{
	return rewriteabsoluteurls;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setRewriteabsoluteurls(ConfigNodePropertyBoolean  rewriteabsoluteurls)
{
	this->rewriteabsoluteurls = rewriteabsoluteurls;
}


