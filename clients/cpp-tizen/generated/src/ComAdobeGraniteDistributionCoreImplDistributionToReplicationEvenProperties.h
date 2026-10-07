/*
 * ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_
#define _ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties();
	ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getImportername();

	/*! \brief Set 
	 */
	void setImportername(ConfigNodePropertyArray  importername);

private:
	ConfigNodePropertyArray importername;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_ */
