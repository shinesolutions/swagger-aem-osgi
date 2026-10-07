#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties()
{
	//__init();
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::__init()
{
	//cqcommercecataloggeneratorbucketsize = new ConfigNodePropertyInteger();
	//cqcommercecataloggeneratorbucketname = new ConfigNodePropertyString();
	//cqcommercecataloggeneratorexcludedtemplateproperties = new ConfigNodePropertyArray();
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::__cleanup()
{
	//if(cqcommercecataloggeneratorbucketsize != NULL) {
	//
	//delete cqcommercecataloggeneratorbucketsize;
	//cqcommercecataloggeneratorbucketsize = NULL;
	//}
	//if(cqcommercecataloggeneratorbucketname != NULL) {
	//
	//delete cqcommercecataloggeneratorbucketname;
	//cqcommercecataloggeneratorbucketname = NULL;
	//}
	//if(cqcommercecataloggeneratorexcludedtemplateproperties != NULL) {
	//
	//delete cqcommercecataloggeneratorexcludedtemplateproperties;
	//cqcommercecataloggeneratorexcludedtemplateproperties = NULL;
	//}
	//
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcommercecataloggeneratorbucketsizeKey = "cq.commerce.cataloggenerator.bucketsize";
	node = json_object_get_member(pJsonObject, cqcommercecataloggeneratorbucketsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqcommercecataloggeneratorbucketsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqcommercecataloggeneratorbucketsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcommercecataloggeneratorbucketnameKey = "cq.commerce.cataloggenerator.bucketname";
	node = json_object_get_member(pJsonObject, cqcommercecataloggeneratorbucketnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcommercecataloggeneratorbucketname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcommercecataloggeneratorbucketname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcommercecataloggeneratorexcludedtemplatepropertiesKey = "cq.commerce.cataloggenerator.excludedtemplateproperties";
	node = json_object_get_member(pJsonObject, cqcommercecataloggeneratorexcludedtemplatepropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqcommercecataloggeneratorexcludedtemplateproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqcommercecataloggeneratorexcludedtemplateproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqcommercecataloggeneratorbucketsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqcommercecataloggeneratorbucketsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommercecataloggeneratorbucketsizeKey = "cq.commerce.cataloggenerator.bucketsize";
	json_object_set_member(pJsonObject, cqcommercecataloggeneratorbucketsizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcommercecataloggeneratorbucketname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcommercecataloggeneratorbucketname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommercecataloggeneratorbucketnameKey = "cq.commerce.cataloggenerator.bucketname";
	json_object_set_member(pJsonObject, cqcommercecataloggeneratorbucketnameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqcommercecataloggeneratorexcludedtemplateproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqcommercecataloggeneratorexcludedtemplateproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommercecataloggeneratorexcludedtemplatepropertiesKey = "cq.commerce.cataloggenerator.excludedtemplateproperties";
	json_object_set_member(pJsonObject, cqcommercecataloggeneratorexcludedtemplatepropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorbucketsize()
{
	return cqcommercecataloggeneratorbucketsize;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorbucketsize(ConfigNodePropertyInteger  cqcommercecataloggeneratorbucketsize)
{
	this->cqcommercecataloggeneratorbucketsize = cqcommercecataloggeneratorbucketsize;
}

ConfigNodePropertyString
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorbucketname()
{
	return cqcommercecataloggeneratorbucketname;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorbucketname(ConfigNodePropertyString  cqcommercecataloggeneratorbucketname)
{
	this->cqcommercecataloggeneratorbucketname = cqcommercecataloggeneratorbucketname;
}

ConfigNodePropertyArray
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorexcludedtemplateproperties()
{
	return cqcommercecataloggeneratorexcludedtemplateproperties;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorexcludedtemplateproperties(ConfigNodePropertyArray  cqcommercecataloggeneratorexcludedtemplateproperties)
{
	this->cqcommercecataloggeneratorexcludedtemplateproperties = cqcommercecataloggeneratorexcludedtemplateproperties;
}


