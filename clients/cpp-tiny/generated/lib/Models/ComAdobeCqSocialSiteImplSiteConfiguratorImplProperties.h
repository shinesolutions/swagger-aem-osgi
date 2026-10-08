
/*
 * ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties();
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComponentsUsingTags();

	/*! \brief Set 
	 */
	void setComponentsUsingTags(ConfigNodePropertyArray componentsUsingTags);


    private:
    ConfigNodePropertyArray componentsUsingTags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_ */
