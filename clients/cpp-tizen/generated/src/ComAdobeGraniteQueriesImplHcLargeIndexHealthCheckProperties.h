/*
 * ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_
#define _ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();
	ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeindexcriticalthreshold();

	/*! \brief Set 
	 */
	void setLargeindexcriticalthreshold(ConfigNodePropertyInteger  largeindexcriticalthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeindexwarnthreshold();

	/*! \brief Set 
	 */
	void setLargeindexwarnthreshold(ConfigNodePropertyInteger  largeindexwarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);

private:
	ConfigNodePropertyInteger largeindexcriticalthreshold;
	ConfigNodePropertyInteger largeindexwarnthreshold;
	ConfigNodePropertyArray hctags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_ */
