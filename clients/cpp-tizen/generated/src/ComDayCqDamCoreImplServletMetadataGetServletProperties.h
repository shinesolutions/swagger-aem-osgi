/*
 * ComDayCqDamCoreImplServletMetadataGetServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletMetadataGetServletProperties_H_
#define _ComDayCqDamCoreImplServletMetadataGetServletProperties_H_


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

class ComDayCqDamCoreImplServletMetadataGetServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletMetadataGetServletProperties();
	ComDayCqDamCoreImplServletMetadataGetServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletMetadataGetServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString  slingservletextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString  slingservletselectors);

private:
	ConfigNodePropertyString slingservletresourceTypes;
	ConfigNodePropertyString slingservletmethods;
	ConfigNodePropertyString slingservletextensions;
	ConfigNodePropertyString slingservletselectors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletMetadataGetServletProperties_H_ */
