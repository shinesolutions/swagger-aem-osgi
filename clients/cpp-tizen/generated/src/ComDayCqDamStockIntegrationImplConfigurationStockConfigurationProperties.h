/*
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_
#define _ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_


#include <string>
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

class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();
	ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocale();

	/*! \brief Set 
	 */
	void setLocale(ConfigNodePropertyString  locale);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsConfig();

	/*! \brief Set 
	 */
	void setImsConfig(ConfigNodePropertyString  imsConfig);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString locale;
	ConfigNodePropertyString imsConfig;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_ */
