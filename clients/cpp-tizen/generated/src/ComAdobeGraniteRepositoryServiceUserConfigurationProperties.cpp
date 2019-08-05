#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRepositoryServiceUserConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::ComAdobeGraniteRepositoryServiceUserConfigurationProperties()
{
	//__init();
}

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::~ComAdobeGraniteRepositoryServiceUserConfigurationProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//serviceuserssimpleSubjectPopulation = new ConfigNodePropertyBoolean();
	//serviceuserslist = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(serviceuserssimpleSubjectPopulation != NULL) {
	//
	//delete serviceuserssimpleSubjectPopulation;
	//serviceuserssimpleSubjectPopulation = NULL;
	//}
	//if(serviceuserslist != NULL) {
	//
	//delete serviceuserslist;
	//serviceuserslist = NULL;
	//}
	//
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::fromJson(char* jsonStr)
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
	const gchar *serviceuserssimpleSubjectPopulationKey = "serviceusers.simpleSubjectPopulation";
	node = json_object_get_member(pJsonObject, serviceuserssimpleSubjectPopulationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&serviceuserssimpleSubjectPopulation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&serviceuserssimpleSubjectPopulation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceuserslistKey = "serviceusers.list";
	node = json_object_get_member(pJsonObject, serviceuserslistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&serviceuserslist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&serviceuserslist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::ComAdobeGraniteRepositoryServiceUserConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServiceuserssimpleSubjectPopulation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServiceuserssimpleSubjectPopulation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceuserssimpleSubjectPopulationKey = "serviceusers.simpleSubjectPopulation";
	json_object_set_member(pJsonObject, serviceuserssimpleSubjectPopulationKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServiceuserslist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServiceuserslist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceuserslistKey = "serviceusers.list";
	json_object_set_member(pJsonObject, serviceuserslistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceuserssimpleSubjectPopulation()
{
	return serviceuserssimpleSubjectPopulation;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceuserssimpleSubjectPopulation(ConfigNodePropertyBoolean  serviceuserssimpleSubjectPopulation)
{
	this->serviceuserssimpleSubjectPopulation = serviceuserssimpleSubjectPopulation;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceuserslist()
{
	return serviceuserslist;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceuserslist(ConfigNodePropertyArray  serviceuserslist)
{
	this->serviceuserslist = serviceuserslist;
}


