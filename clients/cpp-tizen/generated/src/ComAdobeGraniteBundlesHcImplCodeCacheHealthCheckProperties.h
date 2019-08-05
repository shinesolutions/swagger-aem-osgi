/*
 * ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_
#define _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_


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

class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties();
	ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinimumcodecachesize();

	/*! \brief Set 
	 */
	void setMinimumcodecachesize(ConfigNodePropertyInteger  minimumcodecachesize);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyInteger minimumcodecachesize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_ */
