

#include "ComAdobeCqAddressImplLocationLocationListServletProperties.h"

using namespace Tiny;

ComAdobeCqAddressImplLocationLocationListServletProperties::ComAdobeCqAddressImplLocationLocationListServletProperties()
{
	cqaddresslocationdefaultmaxResults = ConfigNodePropertyInteger();
}

ComAdobeCqAddressImplLocationLocationListServletProperties::ComAdobeCqAddressImplLocationLocationListServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAddressImplLocationLocationListServletProperties::~ComAdobeCqAddressImplLocationLocationListServletProperties()
{

}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqaddresslocationdefaultmaxResultsKey = "cq.address.location.default.maxResults";

    if(object.has_key(cqaddresslocationdefaultmaxResultsKey))
    {
        bourne::json value = object[cqaddresslocationdefaultmaxResultsKey];




        ConfigNodePropertyInteger* obj = &cqaddresslocationdefaultmaxResults;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAddressImplLocationLocationListServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqaddresslocationdefaultmaxResults"] = getCqaddresslocationdefaultmaxResults().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqAddressImplLocationLocationListServletProperties::getCqaddresslocationdefaultmaxResults()
{
	return cqaddresslocationdefaultmaxResults;
}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::setCqaddresslocationdefaultmaxResults(ConfigNodePropertyInteger cqaddresslocationdefaultmaxResults)
{
	this->cqaddresslocationdefaultmaxResults = cqaddresslocationdefaultmaxResults;
}



