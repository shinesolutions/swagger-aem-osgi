#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties()
{
	//__init();
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::~ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::__init()
{
	//aggregaterelationships = new ConfigNodePropertyArray();
	//aggregatedescendvirtual = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::__cleanup()
{
	//if(aggregaterelationships != NULL) {
	//
	//delete aggregaterelationships;
	//aggregaterelationships = NULL;
	//}
	//if(aggregatedescendvirtual != NULL) {
	//
	//delete aggregatedescendvirtual;
	//aggregatedescendvirtual = NULL;
	//}
	//
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aggregaterelationshipsKey = "aggregate.relationships";
	node = json_object_get_member(pJsonObject, aggregaterelationshipsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&aggregaterelationships, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&aggregaterelationships);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aggregatedescendvirtualKey = "aggregate.descend.virtual";
	node = json_object_get_member(pJsonObject, aggregatedescendvirtualKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&aggregatedescendvirtual, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&aggregatedescendvirtual);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAggregaterelationships();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAggregaterelationships());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aggregaterelationshipsKey = "aggregate.relationships";
	json_object_set_member(pJsonObject, aggregaterelationshipsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAggregatedescendvirtual();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAggregatedescendvirtual());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aggregatedescendvirtualKey = "aggregate.descend.virtual";
	json_object_set_member(pJsonObject, aggregatedescendvirtualKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::getAggregaterelationships()
{
	return aggregaterelationships;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::setAggregaterelationships(ConfigNodePropertyArray  aggregaterelationships)
{
	this->aggregaterelationships = aggregaterelationships;
}

ConfigNodePropertyBoolean
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::getAggregatedescendvirtual()
{
	return aggregatedescendvirtual;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::setAggregatedescendvirtual(ConfigNodePropertyBoolean  aggregatedescendvirtual)
{
	this->aggregatedescendvirtual = aggregatedescendvirtual;
}


