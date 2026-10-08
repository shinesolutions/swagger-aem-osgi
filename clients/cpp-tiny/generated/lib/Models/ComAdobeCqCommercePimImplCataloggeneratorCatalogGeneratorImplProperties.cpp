

#include "ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.h"

using namespace Tiny;

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties()
{
	cqcommercecataloggeneratorbucketsize = ConfigNodePropertyInteger();
	cqcommercecataloggeneratorbucketname = ConfigNodePropertyString();
	cqcommercecataloggeneratorexcludedtemplateproperties = ConfigNodePropertyArray();
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties()
{

}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcommercecataloggeneratorbucketsizeKey = "cq.commerce.cataloggenerator.bucketsize";

    if(object.has_key(cqcommercecataloggeneratorbucketsizeKey))
    {
        bourne::json value = object[cqcommercecataloggeneratorbucketsizeKey];




        ConfigNodePropertyInteger* obj = &cqcommercecataloggeneratorbucketsize;
		obj->fromJson(value.dump());

    }

    const char *cqcommercecataloggeneratorbucketnameKey = "cq.commerce.cataloggenerator.bucketname";

    if(object.has_key(cqcommercecataloggeneratorbucketnameKey))
    {
        bourne::json value = object[cqcommercecataloggeneratorbucketnameKey];




        ConfigNodePropertyString* obj = &cqcommercecataloggeneratorbucketname;
		obj->fromJson(value.dump());

    }

    const char *cqcommercecataloggeneratorexcludedtemplatepropertiesKey = "cq.commerce.cataloggenerator.excludedtemplateproperties";

    if(object.has_key(cqcommercecataloggeneratorexcludedtemplatepropertiesKey))
    {
        bourne::json value = object[cqcommercecataloggeneratorexcludedtemplatepropertiesKey];




        ConfigNodePropertyArray* obj = &cqcommercecataloggeneratorexcludedtemplateproperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommercecataloggeneratorbucketsize"] = getCqcommercecataloggeneratorbucketsize().toJson();






	object["cqcommercecataloggeneratorbucketname"] = getCqcommercecataloggeneratorbucketname().toJson();






	object["cqcommercecataloggeneratorexcludedtemplateproperties"] = getCqcommercecataloggeneratorexcludedtemplateproperties().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorbucketsize()
{
	return cqcommercecataloggeneratorbucketsize;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorbucketsize(ConfigNodePropertyInteger cqcommercecataloggeneratorbucketsize)
{
	this->cqcommercecataloggeneratorbucketsize = cqcommercecataloggeneratorbucketsize;
}

ConfigNodePropertyString
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorbucketname()
{
	return cqcommercecataloggeneratorbucketname;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorbucketname(ConfigNodePropertyString cqcommercecataloggeneratorbucketname)
{
	this->cqcommercecataloggeneratorbucketname = cqcommercecataloggeneratorbucketname;
}

ConfigNodePropertyArray
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::getCqcommercecataloggeneratorexcludedtemplateproperties()
{
	return cqcommercecataloggeneratorexcludedtemplateproperties;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties::setCqcommercecataloggeneratorexcludedtemplateproperties(ConfigNodePropertyArray cqcommercecataloggeneratorexcludedtemplateproperties)
{
	this->cqcommercecataloggeneratorexcludedtemplateproperties = cqcommercecataloggeneratorexcludedtemplateproperties;
}



