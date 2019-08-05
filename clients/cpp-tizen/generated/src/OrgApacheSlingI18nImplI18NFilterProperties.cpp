#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingI18nImplI18NFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingI18nImplI18NFilterProperties::OrgApacheSlingI18nImplI18NFilterProperties()
{
	//__init();
}

OrgApacheSlingI18nImplI18NFilterProperties::~OrgApacheSlingI18nImplI18NFilterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingI18nImplI18NFilterProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//slingfilterscope = new ConfigNodePropertyArray();
}

void
OrgApacheSlingI18nImplI18NFilterProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(slingfilterscope != NULL) {
	//
	//delete slingfilterscope;
	//slingfilterscope = NULL;
	//}
	//
}

void
OrgApacheSlingI18nImplI18NFilterProperties::fromJson(char* jsonStr)
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
	const gchar *slingfilterscopeKey = "sling.filter.scope";
	node = json_object_get_member(pJsonObject, slingfilterscopeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingfilterscope, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingfilterscope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingI18nImplI18NFilterProperties::OrgApacheSlingI18nImplI18NFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingI18nImplI18NFilterProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingfilterscope();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingfilterscope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingfilterscopeKey = "sling.filter.scope";
	json_object_set_member(pJsonObject, slingfilterscopeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingI18nImplI18NFilterProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingI18nImplI18NFilterProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
OrgApacheSlingI18nImplI18NFilterProperties::getSlingfilterscope()
{
	return slingfilterscope;
}

void
OrgApacheSlingI18nImplI18NFilterProperties::setSlingfilterscope(ConfigNodePropertyArray  slingfilterscope)
{
	this->slingfilterscope = slingfilterscope;
}


