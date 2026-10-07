#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties()
{
	//__init();
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::~ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::__init()
{
	//solrzktimeout = new ConfigNodePropertyString();
	//solrcommit = new ConfigNodePropertyString();
	//cacheon = new ConfigNodePropertyBoolean();
	//concurrencylevel = new ConfigNodePropertyInteger();
	//cachestartsize = new ConfigNodePropertyInteger();
	//cachettl = new ConfigNodePropertyInteger();
	//cachesize = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::__cleanup()
{
	//if(solrzktimeout != NULL) {
	//
	//delete solrzktimeout;
	//solrzktimeout = NULL;
	//}
	//if(solrcommit != NULL) {
	//
	//delete solrcommit;
	//solrcommit = NULL;
	//}
	//if(cacheon != NULL) {
	//
	//delete cacheon;
	//cacheon = NULL;
	//}
	//if(concurrencylevel != NULL) {
	//
	//delete concurrencylevel;
	//concurrencylevel = NULL;
	//}
	//if(cachestartsize != NULL) {
	//
	//delete cachestartsize;
	//cachestartsize = NULL;
	//}
	//if(cachettl != NULL) {
	//
	//delete cachettl;
	//cachettl = NULL;
	//}
	//if(cachesize != NULL) {
	//
	//delete cachesize;
	//cachesize = NULL;
	//}
	//
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *solrzktimeoutKey = "solr.zk.timeout";
	node = json_object_get_member(pJsonObject, solrzktimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrzktimeout, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrzktimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrcommitKey = "solr.commit";
	node = json_object_get_member(pJsonObject, solrcommitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrcommit, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrcommit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cacheonKey = "cache.on";
	node = json_object_get_member(pJsonObject, cacheonKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cacheon, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cacheon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *concurrencylevelKey = "concurrency.level";
	node = json_object_get_member(pJsonObject, concurrencylevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&concurrencylevel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&concurrencylevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachestartsizeKey = "cache.start.size";
	node = json_object_get_member(pJsonObject, cachestartsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachestartsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachestartsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachettlKey = "cache.ttl";
	node = json_object_get_member(pJsonObject, cachettlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachettl, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachettl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachesizeKey = "cache.size";
	node = json_object_get_member(pJsonObject, cachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrzktimeout();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrzktimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrzktimeoutKey = "solr.zk.timeout";
	json_object_set_member(pJsonObject, solrzktimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrcommit();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrcommit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrcommitKey = "solr.commit";
	json_object_set_member(pJsonObject, solrcommitKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCacheon();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCacheon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacheonKey = "cache.on";
	json_object_set_member(pJsonObject, cacheonKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConcurrencylevel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConcurrencylevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *concurrencylevelKey = "concurrency.level";
	json_object_set_member(pJsonObject, concurrencylevelKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachestartsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachestartsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachestartsizeKey = "cache.start.size";
	json_object_set_member(pJsonObject, cachestartsizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachettl();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachettl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachettlKey = "cache.ttl";
	json_object_set_member(pJsonObject, cachettlKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachesizeKey = "cache.size";
	json_object_set_member(pJsonObject, cachesizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getSolrzktimeout()
{
	return solrzktimeout;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setSolrzktimeout(ConfigNodePropertyString  solrzktimeout)
{
	this->solrzktimeout = solrzktimeout;
}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getSolrcommit()
{
	return solrcommit;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setSolrcommit(ConfigNodePropertyString  solrcommit)
{
	this->solrcommit = solrcommit;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCacheon()
{
	return cacheon;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCacheon(ConfigNodePropertyBoolean  cacheon)
{
	this->cacheon = cacheon;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getConcurrencylevel()
{
	return concurrencylevel;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setConcurrencylevel(ConfigNodePropertyInteger  concurrencylevel)
{
	this->concurrencylevel = concurrencylevel;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachestartsize()
{
	return cachestartsize;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachestartsize(ConfigNodePropertyInteger  cachestartsize)
{
	this->cachestartsize = cachestartsize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachettl()
{
	return cachettl;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachettl(ConfigNodePropertyInteger  cachettl)
{
	this->cachettl = cachettl;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachesize()
{
	return cachesize;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachesize(ConfigNodePropertyInteger  cachesize)
{
	this->cachesize = cachesize;
}


