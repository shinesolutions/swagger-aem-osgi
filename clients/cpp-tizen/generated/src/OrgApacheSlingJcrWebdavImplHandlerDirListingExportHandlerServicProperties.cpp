#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties()
{
	//__init();
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::~OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::fromJson(char* jsonStr)
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
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

