
/*
 * ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties();
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatelanguage();

	/*! \brief Set 
	 */
	void setTranslatelanguage(ConfigNodePropertyDropDown translatelanguage);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatedisplay();

	/*! \brief Set 
	 */
	void setTranslatedisplay(ConfigNodePropertyDropDown translatedisplay);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTranslateattribution();

	/*! \brief Set 
	 */
	void setTranslateattribution(ConfigNodePropertyBoolean translateattribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatecaching();

	/*! \brief Set 
	 */
	void setTranslatecaching(ConfigNodePropertyDropDown translatecaching);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTranslatesmartrendering();

	/*! \brief Set 
	 */
	void setTranslatesmartrendering(ConfigNodePropertyDropDown translatesmartrendering);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatecachingduration();

	/*! \brief Set 
	 */
	void setTranslatecachingduration(ConfigNodePropertyString translatecachingduration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatesessionsaveinterval();

	/*! \brief Set 
	 */
	void setTranslatesessionsaveinterval(ConfigNodePropertyString translatesessionsaveinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslatesessionsavebatchLimit();

	/*! \brief Set 
	 */
	void setTranslatesessionsavebatchLimit(ConfigNodePropertyString translatesessionsavebatchLimit);


    private:
    ConfigNodePropertyDropDown translatelanguage;
    ConfigNodePropertyDropDown translatedisplay;
    ConfigNodePropertyBoolean translateattribution;
    ConfigNodePropertyDropDown translatecaching;
    ConfigNodePropertyDropDown translatesmartrendering;
    ConfigNodePropertyString translatecachingduration;
    ConfigNodePropertyString translatesessionsaveinterval;
    ConfigNodePropertyString translatesessionsavebatchLimit;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties_H_ */
