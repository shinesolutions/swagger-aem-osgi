

#include "ComAdobeCqHistoryImplHistoryServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqHistoryImplHistoryServiceImplProperties::ComAdobeCqHistoryImplHistoryServiceImplProperties()
{
	historyserviceresourceTypes = ConfigNodePropertyArray();
	historyservicepathFilter = ConfigNodePropertyArray();
}

ComAdobeCqHistoryImplHistoryServiceImplProperties::ComAdobeCqHistoryImplHistoryServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqHistoryImplHistoryServiceImplProperties::~ComAdobeCqHistoryImplHistoryServiceImplProperties()
{

}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *historyserviceresourceTypesKey = "history.service.resourceTypes";

    if(object.has_key(historyserviceresourceTypesKey))
    {
        bourne::json value = object[historyserviceresourceTypesKey];




        ConfigNodePropertyArray* obj = &historyserviceresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *historyservicepathFilterKey = "history.service.pathFilter";

    if(object.has_key(historyservicepathFilterKey))
    {
        bourne::json value = object[historyservicepathFilterKey];




        ConfigNodePropertyArray* obj = &historyservicepathFilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqHistoryImplHistoryServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["historyserviceresourceTypes"] = getHistoryserviceresourceTypes().toJson();






	object["historyservicepathFilter"] = getHistoryservicepathFilter().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryServiceImplProperties::getHistoryserviceresourceTypes()
{
	return historyserviceresourceTypes;
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::setHistoryserviceresourceTypes(ConfigNodePropertyArray historyserviceresourceTypes)
{
	this->historyserviceresourceTypes = historyserviceresourceTypes;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryServiceImplProperties::getHistoryservicepathFilter()
{
	return historyservicepathFilter;
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::setHistoryservicepathFilter(ConfigNodePropertyArray historyservicepathFilter)
{
	this->historyservicepathFilter = historyservicepathFilter;
}



