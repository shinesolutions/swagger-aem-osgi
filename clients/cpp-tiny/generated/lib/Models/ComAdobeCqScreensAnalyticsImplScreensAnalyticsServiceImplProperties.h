
/*
 * ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplurl();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplurl(ConfigNodePropertyString comadobecqscreensanalyticsimplurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplapikey();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplapikey(ConfigNodePropertyString comadobecqscreensanalyticsimplapikey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplproject();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplproject(ConfigNodePropertyString comadobecqscreensanalyticsimplproject);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobecqscreensanalyticsimplenvironment();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplenvironment(ConfigNodePropertyDropDown comadobecqscreensanalyticsimplenvironment);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensanalyticsimplsendFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplsendFrequency(ConfigNodePropertyInteger comadobecqscreensanalyticsimplsendFrequency);


    private:
    ConfigNodePropertyString comadobecqscreensanalyticsimplurl;
    ConfigNodePropertyString comadobecqscreensanalyticsimplapikey;
    ConfigNodePropertyString comadobecqscreensanalyticsimplproject;
    ConfigNodePropertyDropDown comadobecqscreensanalyticsimplenvironment;
    ConfigNodePropertyInteger comadobecqscreensanalyticsimplsendFrequency;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_ */
