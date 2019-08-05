/*
 * ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_
#define _ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_


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

class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties();
	ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIndexingcriticalthreshold();

	/*! \brief Set 
	 */
	void setIndexingcriticalthreshold(ConfigNodePropertyInteger  indexingcriticalthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIndexingwarnthreshold();

	/*! \brief Set 
	 */
	void setIndexingwarnthreshold(ConfigNodePropertyInteger  indexingwarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);

private:
	ConfigNodePropertyInteger indexingcriticalthreshold;
	ConfigNodePropertyInteger indexingwarnthreshold;
	ConfigNodePropertyArray hctags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_ */
