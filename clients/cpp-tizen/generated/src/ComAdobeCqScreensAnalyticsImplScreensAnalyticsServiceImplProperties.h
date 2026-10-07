/*
 * ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_
#define _ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();
	ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplurl();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplurl(ConfigNodePropertyString  comadobecqscreensanalyticsimplurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplapikey();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplapikey(ConfigNodePropertyString  comadobecqscreensanalyticsimplapikey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensanalyticsimplproject();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplproject(ConfigNodePropertyString  comadobecqscreensanalyticsimplproject);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobecqscreensanalyticsimplenvironment();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplenvironment(ConfigNodePropertyDropDown  comadobecqscreensanalyticsimplenvironment);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensanalyticsimplsendFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensanalyticsimplsendFrequency(ConfigNodePropertyInteger  comadobecqscreensanalyticsimplsendFrequency);

private:
	ConfigNodePropertyString comadobecqscreensanalyticsimplurl;
	ConfigNodePropertyString comadobecqscreensanalyticsimplapikey;
	ConfigNodePropertyString comadobecqscreensanalyticsimplproject;
	ConfigNodePropertyDropDown comadobecqscreensanalyticsimplenvironment;
	ConfigNodePropertyInteger comadobecqscreensanalyticsimplsendFrequency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties_H_ */
