#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties()
{
	//__init();
}

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::~ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::__init()
{
	//cqanalyticsadapterfactorycontextstores = new ConfigNodePropertyArray();
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::__cleanup()
{
	//if(cqanalyticsadapterfactorycontextstores != NULL) {
	//
	//delete cqanalyticsadapterfactorycontextstores;
	//cqanalyticsadapterfactorycontextstores = NULL;
	//}
	//
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticsadapterfactorycontextstoresKey = "cq.analytics.adapterfactory.contextstores";
	node = json_object_get_member(pJsonObject, cqanalyticsadapterfactorycontextstoresKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqanalyticsadapterfactorycontextstores, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqanalyticsadapterfactorycontextstores);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqanalyticsadapterfactorycontextstores();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqanalyticsadapterfactorycontextstores());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticsadapterfactorycontextstoresKey = "cq.analytics.adapterfactory.contextstores";
	json_object_set_member(pJsonObject, cqanalyticsadapterfactorycontextstoresKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::getCqanalyticsadapterfactorycontextstores()
{
	return cqanalyticsadapterfactorycontextstores;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::setCqanalyticsadapterfactorycontextstores(ConfigNodePropertyArray  cqanalyticsadapterfactorycontextstores)
{
	this->cqanalyticsadapterfactorycontextstores = cqanalyticsadapterfactorycontextstores;
}


