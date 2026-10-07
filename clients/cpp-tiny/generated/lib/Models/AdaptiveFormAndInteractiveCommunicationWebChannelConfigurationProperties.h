
/*
 * AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_
#define TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties();
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getShowPlaceholder();

	/*! \brief Set 
	 */
	void setShowPlaceholder(ConfigNodePropertyBoolean showPlaceholder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaximumCacheEntries();

	/*! \brief Set 
	 */
	void setMaximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAfscriptingcompatversion();

	/*! \brief Set 
	 */
	void setAfscriptingcompatversion(ConfigNodePropertyDropDown afscriptingcompatversion);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMakeFileNameUnique();

	/*! \brief Set 
	 */
	void setMakeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGeneratingCompliantData();

	/*! \brief Set 
	 */
	void setGeneratingCompliantData(ConfigNodePropertyBoolean generatingCompliantData);


    private:
    ConfigNodePropertyBoolean showPlaceholder;
    ConfigNodePropertyInteger maximumCacheEntries;
    ConfigNodePropertyDropDown afscriptingcompatversion;
    ConfigNodePropertyBoolean makeFileNameUnique;
    ConfigNodePropertyBoolean generatingCompliantData;
};
}

#endif /* TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties_H_ */
