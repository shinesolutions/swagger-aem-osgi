
/*
 * ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslationFactory();

	/*! \brief Set 
	 */
	void setTranslationFactory(ConfigNodePropertyString translationFactory);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorLabel();

	/*! \brief Set 
	 */
	void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorAttribution();

	/*! \brief Set 
	 */
	void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorWorkspaceId();

	/*! \brief Set 
	 */
	void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorSubscriptionKey();

	/*! \brief Set 
	 */
	void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLanguageMapLocation();

	/*! \brief Set 
	 */
	void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCategoryMapLocation();

	/*! \brief Set 
	 */
	void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRetryAttempts();

	/*! \brief Set 
	 */
	void setRetryAttempts(ConfigNodePropertyInteger retryAttempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeoutCount();

	/*! \brief Set 
	 */
	void setTimeoutCount(ConfigNodePropertyInteger timeoutCount);


    private:
    ConfigNodePropertyString translationFactory;
    ConfigNodePropertyString defaultConnectorLabel;
    ConfigNodePropertyString defaultConnectorAttribution;
    ConfigNodePropertyString defaultConnectorWorkspaceId;
    ConfigNodePropertyString defaultConnectorSubscriptionKey;
    ConfigNodePropertyString languageMapLocation;
    ConfigNodePropertyString categoryMapLocation;
    ConfigNodePropertyInteger retryAttempts;
    ConfigNodePropertyInteger timeoutCount;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_ */
