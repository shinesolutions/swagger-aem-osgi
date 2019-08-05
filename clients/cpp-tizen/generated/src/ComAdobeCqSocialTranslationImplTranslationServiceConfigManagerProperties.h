/*
 * ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_
#define _ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties();
	ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatelanguage();

	/*! \brief Set 
	 */
	void setTranslatelanguage(ConfigNodePropertyDropDown  translatelanguage);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatedisplay();

	/*! \brief Set 
	 */
	void setTranslatedisplay(ConfigNodePropertyDropDown  translatedisplay);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTranslateattribution();

	/*! \brief Set 
	 */
	void setTranslateattribution(ConfigNodePropertyBoolean  translateattribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatecaching();

	/*! \brief Set 
	 */
	void setTranslatecaching(ConfigNodePropertyDropDown  translatecaching);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatesmartrendering();

	/*! \brief Set 
	 */
	void setTranslatesmartrendering(ConfigNodePropertyDropDown  translatesmartrendering);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatecachingduration();

	/*! \brief Set 
	 */
	void setTranslatecachingduration(ConfigNodePropertyString  translatecachingduration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatesessionsaveinterval();

	/*! \brief Set 
	 */
	void setTranslatesessionsaveinterval(ConfigNodePropertyString  translatesessionsaveinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatesessionsavebatchLimit();

	/*! \brief Set 
	 */
	void setTranslatesessionsavebatchLimit(ConfigNodePropertyString  translatesessionsavebatchLimit);

private:
	ConfigNodePropertyDropDown translatelanguage;
	ConfigNodePropertyDropDown translatedisplay;
	ConfigNodePropertyBoolean translateattribution;
	ConfigNodePropertyDropDown translatecaching;
	ConfigNodePropertyDropDown translatesmartrendering;
	ConfigNodePropertyString translatecachingduration;
	ConfigNodePropertyString translatesessionsaveinterval;
	ConfigNodePropertyString translatesessionsavebatchLimit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_ */
