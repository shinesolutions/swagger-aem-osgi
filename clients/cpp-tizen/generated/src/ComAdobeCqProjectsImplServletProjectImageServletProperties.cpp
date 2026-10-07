#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqProjectsImplServletProjectImageServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqProjectsImplServletProjectImageServletProperties::ComAdobeCqProjectsImplServletProjectImageServletProperties()
{
	//__init();
}

ComAdobeCqProjectsImplServletProjectImageServletProperties::~ComAdobeCqProjectsImplServletProjectImageServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::__init()
{
	//imagequality = new ConfigNodePropertyString();
	//imagesupportedresolutions = new ConfigNodePropertyString();
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::__cleanup()
{
	//if(imagequality != NULL) {
	//
	//delete imagequality;
	//imagequality = NULL;
	//}
	//if(imagesupportedresolutions != NULL) {
	//
	//delete imagesupportedresolutions;
	//imagesupportedresolutions = NULL;
	//}
	//
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *imagequalityKey = "image.quality";
	node = json_object_get_member(pJsonObject, imagequalityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imagequality, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imagequality);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imagesupportedresolutionsKey = "image.supported.resolutions";
	node = json_object_get_member(pJsonObject, imagesupportedresolutionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imagesupportedresolutions, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imagesupportedresolutions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqProjectsImplServletProjectImageServletProperties::ComAdobeCqProjectsImplServletProjectImageServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqProjectsImplServletProjectImageServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImagequality();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImagequality());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagequalityKey = "image.quality";
	json_object_set_member(pJsonObject, imagequalityKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImagesupportedresolutions();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImagesupportedresolutions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagesupportedresolutionsKey = "image.supported.resolutions";
	json_object_set_member(pJsonObject, imagesupportedresolutionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqProjectsImplServletProjectImageServletProperties::getImagequality()
{
	return imagequality;
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::setImagequality(ConfigNodePropertyString  imagequality)
{
	this->imagequality = imagequality;
}

ConfigNodePropertyString
ComAdobeCqProjectsImplServletProjectImageServletProperties::getImagesupportedresolutions()
{
	return imagesupportedresolutions;
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::setImagesupportedresolutions(ConfigNodePropertyString  imagesupportedresolutions)
{
	this->imagesupportedresolutions = imagesupportedresolutions;
}


