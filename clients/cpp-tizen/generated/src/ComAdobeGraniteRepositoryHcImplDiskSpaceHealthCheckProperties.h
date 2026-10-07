/*
 * ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_
#define _ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_


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

class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();
	ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();

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
	ConfigNodePropertyInteger getDiskspacewarnthreshold();

	/*! \brief Set 
	 */
	void setDiskspacewarnthreshold(ConfigNodePropertyInteger  diskspacewarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDiskspaceerrorthreshold();

	/*! \brief Set 
	 */
	void setDiskspaceerrorthreshold(ConfigNodePropertyInteger  diskspaceerrorthreshold);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyInteger diskspacewarnthreshold;
	ConfigNodePropertyInteger diskspaceerrorthreshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_ */
