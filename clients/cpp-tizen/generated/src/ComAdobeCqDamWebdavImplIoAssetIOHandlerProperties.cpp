#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties()
{
	//__init();
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::~ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//pathPrefix = new ConfigNodePropertyString();
	//createVersion = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(pathPrefix != NULL) {
	//
	//delete pathPrefix;
	//pathPrefix = NULL;
	//}
	//if(createVersion != NULL) {
	//
	//delete createVersion;
	//createVersion = NULL;
	//}
	//
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathPrefixKey = "pathPrefix";
	node = json_object_get_member(pJsonObject, pathPrefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathPrefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathPrefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *createVersionKey = "createVersion";
	node = json_object_get_member(pJsonObject, createVersionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&createVersion, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&createVersion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathPrefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathPrefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathPrefixKey = "pathPrefix";
	json_object_set_member(pJsonObject, pathPrefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCreateVersion();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCreateVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *createVersionKey = "createVersion";
	json_object_set_member(pJsonObject, createVersionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getPathPrefix()
{
	return pathPrefix;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setPathPrefix(ConfigNodePropertyString  pathPrefix)
{
	this->pathPrefix = pathPrefix;
}

ConfigNodePropertyBoolean
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getCreateVersion()
{
	return createVersion;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setCreateVersion(ConfigNodePropertyBoolean  createVersion)
{
	this->createVersion = createVersion;
}


