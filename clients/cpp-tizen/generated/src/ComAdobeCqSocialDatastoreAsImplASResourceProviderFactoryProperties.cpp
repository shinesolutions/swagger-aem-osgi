#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties()
{
	//__init();
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::~ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::__init()
{
	//versionid = new ConfigNodePropertyString();
	//cacheon = new ConfigNodePropertyBoolean();
	//concurrencylevel = new ConfigNodePropertyInteger();
	//cachestartsize = new ConfigNodePropertyInteger();
	//cachettl = new ConfigNodePropertyInteger();
	//cachesize = new ConfigNodePropertyInteger();
	//timelimit = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::__cleanup()
{
	//if(versionid != NULL) {
	//
	//delete versionid;
	//versionid = NULL;
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
	//if(timelimit != NULL) {
	//
	//delete timelimit;
	//timelimit = NULL;
	//}
	//
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionidKey = "version.id";
	node = json_object_get_member(pJsonObject, versionidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&versionid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&versionid);
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
	const gchar *timelimitKey = "time.limit";
	node = json_object_get_member(pJsonObject, timelimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timelimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timelimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getVersionid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getVersionid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionidKey = "version.id";
	json_object_set_member(pJsonObject, versionidKey, node);
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimelimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimelimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timelimitKey = "time.limit";
	json_object_set_member(pJsonObject, timelimitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getVersionid()
{
	return versionid;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setVersionid(ConfigNodePropertyString  versionid)
{
	this->versionid = versionid;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCacheon()
{
	return cacheon;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCacheon(ConfigNodePropertyBoolean  cacheon)
{
	this->cacheon = cacheon;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getConcurrencylevel()
{
	return concurrencylevel;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setConcurrencylevel(ConfigNodePropertyInteger  concurrencylevel)
{
	this->concurrencylevel = concurrencylevel;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachestartsize()
{
	return cachestartsize;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachestartsize(ConfigNodePropertyInteger  cachestartsize)
{
	this->cachestartsize = cachestartsize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachettl()
{
	return cachettl;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachettl(ConfigNodePropertyInteger  cachettl)
{
	this->cachettl = cachettl;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachesize()
{
	return cachesize;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachesize(ConfigNodePropertyInteger  cachesize)
{
	this->cachesize = cachesize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getTimelimit()
{
	return timelimit;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setTimelimit(ConfigNodePropertyInteger  timelimit)
{
	this->timelimit = timelimit;
}


