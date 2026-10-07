

#include "ComAdobeGraniteCsrfImplCSRFFilterProperties.h"

using namespace Tiny;

ComAdobeGraniteCsrfImplCSRFFilterProperties::ComAdobeGraniteCsrfImplCSRFFilterProperties()
{
	filtermethods = ConfigNodePropertyArray();
	filterenablesafeuseragents = ConfigNodePropertyBoolean();
	filtersafeuseragents = ConfigNodePropertyArray();
	filterexcludedpaths = ConfigNodePropertyArray();
}

ComAdobeGraniteCsrfImplCSRFFilterProperties::ComAdobeGraniteCsrfImplCSRFFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCsrfImplCSRFFilterProperties::~ComAdobeGraniteCsrfImplCSRFFilterProperties()
{

}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filtermethodsKey = "filter.methods";

    if(object.has_key(filtermethodsKey))
    {
        bourne::json value = object[filtermethodsKey];




        ConfigNodePropertyArray* obj = &filtermethods;
		obj->fromJson(value.dump());

    }

    const char *filterenablesafeuseragentsKey = "filter.enable.safe.user.agents";

    if(object.has_key(filterenablesafeuseragentsKey))
    {
        bourne::json value = object[filterenablesafeuseragentsKey];




        ConfigNodePropertyBoolean* obj = &filterenablesafeuseragents;
		obj->fromJson(value.dump());

    }

    const char *filtersafeuseragentsKey = "filter.safe.user.agents";

    if(object.has_key(filtersafeuseragentsKey))
    {
        bourne::json value = object[filtersafeuseragentsKey];




        ConfigNodePropertyArray* obj = &filtersafeuseragents;
		obj->fromJson(value.dump());

    }

    const char *filterexcludedpathsKey = "filter.excluded.paths";

    if(object.has_key(filterexcludedpathsKey))
    {
        bourne::json value = object[filterexcludedpathsKey];




        ConfigNodePropertyArray* obj = &filterexcludedpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCsrfImplCSRFFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["filtermethods"] = getFiltermethods().toJson();






	object["filterenablesafeuseragents"] = getFilterenablesafeuseragents().toJson();






	object["filtersafeuseragents"] = getFiltersafeuseragents().toJson();






	object["filterexcludedpaths"] = getFilterexcludedpaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFiltermethods()
{
	return filtermethods;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFiltermethods(ConfigNodePropertyArray filtermethods)
{
	this->filtermethods = filtermethods;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFilterenablesafeuseragents()
{
	return filterenablesafeuseragents;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFilterenablesafeuseragents(ConfigNodePropertyBoolean filterenablesafeuseragents)
{
	this->filterenablesafeuseragents = filterenablesafeuseragents;
}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFiltersafeuseragents()
{
	return filtersafeuseragents;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFiltersafeuseragents(ConfigNodePropertyArray filtersafeuseragents)
{
	this->filtersafeuseragents = filtersafeuseragents;
}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFilterexcludedpaths()
{
	return filterexcludedpaths;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFilterexcludedpaths(ConfigNodePropertyArray filterexcludedpaths)
{
	this->filterexcludedpaths = filterexcludedpaths;
}



