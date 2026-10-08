

#include "ComAdobeCqProjectsImplServletProjectImageServletProperties.h"

using namespace Tiny;

ComAdobeCqProjectsImplServletProjectImageServletProperties::ComAdobeCqProjectsImplServletProjectImageServletProperties()
{
	imagequality = ConfigNodePropertyString();
	imagesupportedresolutions = ConfigNodePropertyString();
}

ComAdobeCqProjectsImplServletProjectImageServletProperties::ComAdobeCqProjectsImplServletProjectImageServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqProjectsImplServletProjectImageServletProperties::~ComAdobeCqProjectsImplServletProjectImageServletProperties()
{

}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *imagequalityKey = "image.quality";

    if(object.has_key(imagequalityKey))
    {
        bourne::json value = object[imagequalityKey];




        ConfigNodePropertyString* obj = &imagequality;
		obj->fromJson(value.dump());

    }

    const char *imagesupportedresolutionsKey = "image.supported.resolutions";

    if(object.has_key(imagesupportedresolutionsKey))
    {
        bourne::json value = object[imagesupportedresolutionsKey];




        ConfigNodePropertyString* obj = &imagesupportedresolutions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqProjectsImplServletProjectImageServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["imagequality"] = getImagequality().toJson();






	object["imagesupportedresolutions"] = getImagesupportedresolutions().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqProjectsImplServletProjectImageServletProperties::getImagequality()
{
	return imagequality;
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::setImagequality(ConfigNodePropertyString imagequality)
{
	this->imagequality = imagequality;
}

ConfigNodePropertyString
ComAdobeCqProjectsImplServletProjectImageServletProperties::getImagesupportedresolutions()
{
	return imagesupportedresolutions;
}

void
ComAdobeCqProjectsImplServletProjectImageServletProperties::setImagesupportedresolutions(ConfigNodePropertyString imagesupportedresolutions)
{
	this->imagesupportedresolutions = imagesupportedresolutions;
}



