/*
 * ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_
#define _ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_


#include <string>
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

class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties();
	ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSyncTranslationStateschedulingFormat();

	/*! \brief Set 
	 */
	void setSyncTranslationStateschedulingFormat(ConfigNodePropertyString  syncTranslationStateschedulingFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulingRepeatTranslationschedulingFormat();

	/*! \brief Set 
	 */
	void setSchedulingRepeatTranslationschedulingFormat(ConfigNodePropertyString  schedulingRepeatTranslationschedulingFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSyncTranslationStatelockTimeoutInMinutes();

	/*! \brief Set 
	 */
	void setSyncTranslationStatelockTimeoutInMinutes(ConfigNodePropertyString  syncTranslationStatelockTimeoutInMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getExportformat();

	/*! \brief Set 
	 */
	void setExportformat(ConfigNodePropertyDropDown  exportformat);

private:
	ConfigNodePropertyString syncTranslationStateschedulingFormat;
	ConfigNodePropertyString schedulingRepeatTranslationschedulingFormat;
	ConfigNodePropertyString syncTranslationStatelockTimeoutInMinutes;
	ConfigNodePropertyDropDown exportformat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties_H_ */
