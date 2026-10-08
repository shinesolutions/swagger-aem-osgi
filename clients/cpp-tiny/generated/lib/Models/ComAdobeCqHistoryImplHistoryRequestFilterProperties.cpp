

#include "ComAdobeCqHistoryImplHistoryRequestFilterProperties.h"

using namespace Tiny;

ComAdobeCqHistoryImplHistoryRequestFilterProperties::ComAdobeCqHistoryImplHistoryRequestFilterProperties()
{
	historyrequestFilterexcludedSelectors = ConfigNodePropertyArray();
	historyrequestFilterexcludedExtensions = ConfigNodePropertyArray();
}

ComAdobeCqHistoryImplHistoryRequestFilterProperties::ComAdobeCqHistoryImplHistoryRequestFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqHistoryImplHistoryRequestFilterProperties::~ComAdobeCqHistoryImplHistoryRequestFilterProperties()
{

}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *historyrequestFilterexcludedSelectorsKey = "history.requestFilter.excludedSelectors";

    if(object.has_key(historyrequestFilterexcludedSelectorsKey))
    {
        bourne::json value = object[historyrequestFilterexcludedSelectorsKey];




        ConfigNodePropertyArray* obj = &historyrequestFilterexcludedSelectors;
		obj->fromJson(value.dump());

    }

    const char *historyrequestFilterexcludedExtensionsKey = "history.requestFilter.excludedExtensions";

    if(object.has_key(historyrequestFilterexcludedExtensionsKey))
    {
        bourne::json value = object[historyrequestFilterexcludedExtensionsKey];




        ConfigNodePropertyArray* obj = &historyrequestFilterexcludedExtensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqHistoryImplHistoryRequestFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["historyrequestFilterexcludedSelectors"] = getHistoryrequestFilterexcludedSelectors().toJson();






	object["historyrequestFilterexcludedExtensions"] = getHistoryrequestFilterexcludedExtensions().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryRequestFilterProperties::getHistoryrequestFilterexcludedSelectors()
{
	return historyrequestFilterexcludedSelectors;
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::setHistoryrequestFilterexcludedSelectors(ConfigNodePropertyArray historyrequestFilterexcludedSelectors)
{
	this->historyrequestFilterexcludedSelectors = historyrequestFilterexcludedSelectors;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryRequestFilterProperties::getHistoryrequestFilterexcludedExtensions()
{
	return historyrequestFilterexcludedExtensions;
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::setHistoryrequestFilterexcludedExtensions(ConfigNodePropertyArray historyrequestFilterexcludedExtensions)
{
	this->historyrequestFilterexcludedExtensions = historyrequestFilterexcludedExtensions;
}



