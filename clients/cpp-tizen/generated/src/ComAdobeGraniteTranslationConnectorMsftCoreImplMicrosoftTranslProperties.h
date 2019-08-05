/*
 * ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_
#define _ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_


#include <string>
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

class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();
	ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTranslationFactory();

	/*! \brief Set 
	 */
	void setTranslationFactory(ConfigNodePropertyString  translationFactory);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorLabel();

	/*! \brief Set 
	 */
	void setDefaultConnectorLabel(ConfigNodePropertyString  defaultConnectorLabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorAttribution();

	/*! \brief Set 
	 */
	void setDefaultConnectorAttribution(ConfigNodePropertyString  defaultConnectorAttribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorWorkspaceId();

	/*! \brief Set 
	 */
	void setDefaultConnectorWorkspaceId(ConfigNodePropertyString  defaultConnectorWorkspaceId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorSubscriptionKey();

	/*! \brief Set 
	 */
	void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString  defaultConnectorSubscriptionKey);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLanguageMapLocation();

	/*! \brief Set 
	 */
	void setLanguageMapLocation(ConfigNodePropertyString  languageMapLocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCategoryMapLocation();

	/*! \brief Set 
	 */
	void setCategoryMapLocation(ConfigNodePropertyString  categoryMapLocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRetryAttempts();

	/*! \brief Set 
	 */
	void setRetryAttempts(ConfigNodePropertyInteger  retryAttempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeoutCount();

	/*! \brief Set 
	 */
	void setTimeoutCount(ConfigNodePropertyInteger  timeoutCount);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties_H_ */
