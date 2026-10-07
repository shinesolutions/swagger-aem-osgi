#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::__init()
{
	//solrhttpurl = new ConfigNodePropertyString();
	//solrzkhost = new ConfigNodePropertyString();
	//solrcollection = new ConfigNodePropertyString();
	//solrsockettimeout = new ConfigNodePropertyInteger();
	//solrconnectiontimeout = new ConfigNodePropertyInteger();
	//solrshardsno = new ConfigNodePropertyInteger();
	//solrreplicationfactor = new ConfigNodePropertyInteger();
	//solrconfdir = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::__cleanup()
{
	//if(solrhttpurl != NULL) {
	//
	//delete solrhttpurl;
	//solrhttpurl = NULL;
	//}
	//if(solrzkhost != NULL) {
	//
	//delete solrzkhost;
	//solrzkhost = NULL;
	//}
	//if(solrcollection != NULL) {
	//
	//delete solrcollection;
	//solrcollection = NULL;
	//}
	//if(solrsockettimeout != NULL) {
	//
	//delete solrsockettimeout;
	//solrsockettimeout = NULL;
	//}
	//if(solrconnectiontimeout != NULL) {
	//
	//delete solrconnectiontimeout;
	//solrconnectiontimeout = NULL;
	//}
	//if(solrshardsno != NULL) {
	//
	//delete solrshardsno;
	//solrshardsno = NULL;
	//}
	//if(solrreplicationfactor != NULL) {
	//
	//delete solrreplicationfactor;
	//solrreplicationfactor = NULL;
	//}
	//if(solrconfdir != NULL) {
	//
	//delete solrconfdir;
	//solrconfdir = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *solrhttpurlKey = "solr.http.url";
	node = json_object_get_member(pJsonObject, solrhttpurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrhttpurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrhttpurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrzkhostKey = "solr.zk.host";
	node = json_object_get_member(pJsonObject, solrzkhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrzkhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrzkhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrcollectionKey = "solr.collection";
	node = json_object_get_member(pJsonObject, solrcollectionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrcollection, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrcollection);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrsockettimeoutKey = "solr.socket.timeout";
	node = json_object_get_member(pJsonObject, solrsockettimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&solrsockettimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&solrsockettimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrconnectiontimeoutKey = "solr.connection.timeout";
	node = json_object_get_member(pJsonObject, solrconnectiontimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&solrconnectiontimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&solrconnectiontimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrshardsnoKey = "solr.shards.no";
	node = json_object_get_member(pJsonObject, solrshardsnoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&solrshardsno, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&solrshardsno);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrreplicationfactorKey = "solr.replication.factor";
	node = json_object_get_member(pJsonObject, solrreplicationfactorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&solrreplicationfactor, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&solrreplicationfactor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrconfdirKey = "solr.conf.dir";
	node = json_object_get_member(pJsonObject, solrconfdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrconfdir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrconfdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrhttpurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrhttpurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrhttpurlKey = "solr.http.url";
	json_object_set_member(pJsonObject, solrhttpurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrzkhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrzkhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrzkhostKey = "solr.zk.host";
	json_object_set_member(pJsonObject, solrzkhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrcollection();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrcollection());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrcollectionKey = "solr.collection";
	json_object_set_member(pJsonObject, solrcollectionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSolrsockettimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSolrsockettimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrsockettimeoutKey = "solr.socket.timeout";
	json_object_set_member(pJsonObject, solrsockettimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSolrconnectiontimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSolrconnectiontimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrconnectiontimeoutKey = "solr.connection.timeout";
	json_object_set_member(pJsonObject, solrconnectiontimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSolrshardsno();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSolrshardsno());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrshardsnoKey = "solr.shards.no";
	json_object_set_member(pJsonObject, solrshardsnoKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSolrreplicationfactor();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSolrreplicationfactor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrreplicationfactorKey = "solr.replication.factor";
	json_object_set_member(pJsonObject, solrreplicationfactorKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrconfdir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrconfdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrconfdirKey = "solr.conf.dir";
	json_object_set_member(pJsonObject, solrconfdirKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrhttpurl()
{
	return solrhttpurl;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrhttpurl(ConfigNodePropertyString  solrhttpurl)
{
	this->solrhttpurl = solrhttpurl;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrzkhost()
{
	return solrzkhost;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrzkhost(ConfigNodePropertyString  solrzkhost)
{
	this->solrzkhost = solrzkhost;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrcollection()
{
	return solrcollection;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrcollection(ConfigNodePropertyString  solrcollection)
{
	this->solrcollection = solrcollection;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrsockettimeout()
{
	return solrsockettimeout;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrsockettimeout(ConfigNodePropertyInteger  solrsockettimeout)
{
	this->solrsockettimeout = solrsockettimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrconnectiontimeout()
{
	return solrconnectiontimeout;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrconnectiontimeout(ConfigNodePropertyInteger  solrconnectiontimeout)
{
	this->solrconnectiontimeout = solrconnectiontimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrshardsno()
{
	return solrshardsno;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrshardsno(ConfigNodePropertyInteger  solrshardsno)
{
	this->solrshardsno = solrshardsno;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrreplicationfactor()
{
	return solrreplicationfactor;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrreplicationfactor(ConfigNodePropertyInteger  solrreplicationfactor)
{
	this->solrreplicationfactor = solrreplicationfactor;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrconfdir()
{
	return solrconfdir;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrconfdir(ConfigNodePropertyString  solrconfdir)
{
	this->solrconfdir = solrconfdir;
}


