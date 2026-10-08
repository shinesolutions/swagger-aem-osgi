
/*
 * ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_


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

class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties();
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqsocialconsoleanalyticscomponents();

	/*! \brief Set 
	 */
	void setCqsocialconsoleanalyticscomponents(ConfigNodePropertyArray cqsocialconsoleanalyticscomponents);


    private:
    ConfigNodePropertyArray cqsocialconsoleanalyticscomponents;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_ */
