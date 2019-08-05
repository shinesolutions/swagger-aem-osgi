/*
 * OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_
#define _OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_


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

class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties();
	OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixinventoryprintername();

	/*! \brief Set 
	 */
	void setFelixinventoryprintername(ConfigNodePropertyString  felixinventoryprintername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixinventoryprintertitle();

	/*! \brief Set 
	 */
	void setFelixinventoryprintertitle(ConfigNodePropertyString  felixinventoryprintertitle);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);

private:
	ConfigNodePropertyString felixinventoryprintername;
	ConfigNodePropertyString felixinventoryprintertitle;
	ConfigNodePropertyString path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_ */
