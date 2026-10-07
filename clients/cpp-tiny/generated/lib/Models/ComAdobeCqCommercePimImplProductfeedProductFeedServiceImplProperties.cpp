

#include "ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties()
{
	feedgeneratoralgorithm = ConfigNodePropertyDropDown();
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::~ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties()
{

}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedgeneratoralgorithmKey = "Feed generator algorithm";

    if(object.has_key(feedgeneratoralgorithmKey))
    {
        bourne::json value = object[feedgeneratoralgorithmKey];




        ConfigNodePropertyDropDown* obj = &feedgeneratoralgorithm;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["feedgeneratoralgorithm"] = getFeedgeneratoralgorithm().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::getFeedgeneratoralgorithm()
{
	return feedgeneratoralgorithm;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::setFeedgeneratoralgorithm(ConfigNodePropertyDropDown feedgeneratoralgorithm)
{
	this->feedgeneratoralgorithm = feedgeneratoralgorithm;
}



