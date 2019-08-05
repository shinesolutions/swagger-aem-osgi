/*
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_
#define _ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();
	ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAggregaterelationships();

	/*! \brief Set 
	 */
	void setAggregaterelationships(ConfigNodePropertyArray  aggregaterelationships);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAggregatedescendvirtual();

	/*! \brief Set 
	 */
	void setAggregatedescendvirtual(ConfigNodePropertyBoolean  aggregatedescendvirtual);

private:
	ConfigNodePropertyArray aggregaterelationships;
	ConfigNodePropertyBoolean aggregatedescendvirtual;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_ */
