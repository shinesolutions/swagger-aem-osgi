/*
 * AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.h
 *
 * 
 */

#ifndef _AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_
#define _AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties();
	AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getShowPlaceholder();

	/*! \brief Set 
	 */
	void setShowPlaceholder(ConfigNodePropertyBoolean  showPlaceholder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaximumCacheEntries();

	/*! \brief Set 
	 */
	void setMaximumCacheEntries(ConfigNodePropertyInteger  maximumCacheEntries);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAfscriptingcompatversion();

	/*! \brief Set 
	 */
	void setAfscriptingcompatversion(ConfigNodePropertyDropDown  afscriptingcompatversion);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMakeFileNameUnique();

	/*! \brief Set 
	 */
	void setMakeFileNameUnique(ConfigNodePropertyBoolean  makeFileNameUnique);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGeneratingCompliantData();

	/*! \brief Set 
	 */
	void setGeneratingCompliantData(ConfigNodePropertyBoolean  generatingCompliantData);

private:
	ConfigNodePropertyBoolean showPlaceholder;
	ConfigNodePropertyInteger maximumCacheEntries;
	ConfigNodePropertyDropDown afscriptingcompatversion;
	ConfigNodePropertyBoolean makeFileNameUnique;
	ConfigNodePropertyBoolean generatingCompliantData;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_ */
