#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties()
{
	//__init();
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::~OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//typecollections = new ConfigNodePropertyString();
	//typenoncollections = new ConfigNodePropertyString();
	//typecontent = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(typecollections != NULL) {
	//
	//delete typecollections;
	//typecollections = NULL;
	//}
	//if(typenoncollections != NULL) {
	//
	//delete typenoncollections;
	//typenoncollections = NULL;
	//}
	//if(typecontent != NULL) {
	//
	//delete typecontent;
	//typecontent = NULL;
	//}
	//
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::fromJson(char* jsonStr)
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
	const gchar *typecollectionsKey = "type.collections";
	node = json_object_get_member(pJsonObject, typecollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typecollections, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typecollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typenoncollectionsKey = "type.noncollections";
	node = json_object_get_member(pJsonObject, typenoncollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typenoncollections, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typenoncollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typecontentKey = "type.content";
	node = json_object_get_member(pJsonObject, typecontentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typecontent, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typecontent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::toJson()
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
		ConfigNodePropertyString obj = getTypecollections();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypecollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typecollectionsKey = "type.collections";
	json_object_set_member(pJsonObject, typecollectionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTypenoncollections();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypenoncollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typenoncollectionsKey = "type.noncollections";
	json_object_set_member(pJsonObject, typenoncollectionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTypecontent();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypecontent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typecontentKey = "type.content";
	json_object_set_member(pJsonObject, typecontentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypecollections()
{
	return typecollections;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypecollections(ConfigNodePropertyString  typecollections)
{
	this->typecollections = typecollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypenoncollections()
{
	return typenoncollections;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypenoncollections(ConfigNodePropertyString  typenoncollections)
{
	this->typenoncollections = typenoncollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypecontent()
{
	return typecontent;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypecontent(ConfigNodePropertyString  typecontent)
{
	this->typecontent = typecontent;
}


