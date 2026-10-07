
/*
 * ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties();
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSyncTranslationStateschedulingFormat();

	/*! \brief Set 
	 */
	void setSyncTranslationStateschedulingFormat(ConfigNodePropertyString syncTranslationStateschedulingFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulingRepeatTranslationschedulingFormat();

	/*! \brief Set 
	 */
	void setSchedulingRepeatTranslationschedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationschedulingFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSyncTranslationStatelockTimeoutInMinutes();

	/*! \brief Set 
	 */
	void setSyncTranslationStatelockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStatelockTimeoutInMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getExportformat();

	/*! \brief Set 
	 */
	void setExportformat(ConfigNodePropertyDropDown exportformat);


    private:
    ConfigNodePropertyString syncTranslationStateschedulingFormat;
    ConfigNodePropertyString schedulingRepeatTranslationschedulingFormat;
    ConfigNodePropertyString syncTranslationStatelockTimeoutInMinutes;
    ConfigNodePropertyDropDown exportformat;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_ */
