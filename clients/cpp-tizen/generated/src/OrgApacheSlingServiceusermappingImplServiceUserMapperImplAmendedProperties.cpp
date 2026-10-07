#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties()
{
	//__init();
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//usermapping = new ConfigNodePropertyArray();
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(usermapping != NULL) {
	//
	//delete usermapping;
	//usermapping = NULL;
	//}
	//
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::fromJson(char* jsonStr)
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
	const gchar *usermappingKey = "user.mapping";
	node = json_object_get_member(pJsonObject, usermappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&usermapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&usermapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::toJson()
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
		ConfigNodePropertyArray obj = getUsermapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUsermapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermappingKey = "user.mapping";
	json_object_set_member(pJsonObject, usermappingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::getUsermapping()
{
	return usermapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties::setUsermapping(ConfigNodePropertyArray  usermapping)
{
	this->usermapping = usermapping;
}


