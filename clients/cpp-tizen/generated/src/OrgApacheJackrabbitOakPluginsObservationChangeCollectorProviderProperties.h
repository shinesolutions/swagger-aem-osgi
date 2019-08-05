/*
 * OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_
#define _OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties();
	OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxItems();

	/*! \brief Set 
	 */
	void setMaxItems(ConfigNodePropertyInteger  maxItems);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPathDepth();

	/*! \brief Set 
	 */
	void setMaxPathDepth(ConfigNodePropertyInteger  maxPathDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);

private:
	ConfigNodePropertyInteger maxItems;
	ConfigNodePropertyInteger maxPathDepth;
	ConfigNodePropertyBoolean enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_ */
