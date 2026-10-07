/*
 * OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_
#define _OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_


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

class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();
	OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCheckpathprefix();

	/*! \brief Set 
	 */
	void setCheckpathprefix(ConfigNodePropertyString  checkpathprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJcrPath();

	/*! \brief Set 
	 */
	void setJcrPath(ConfigNodePropertyString  jcrPath);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyString checkpathprefix;
	ConfigNodePropertyString jcrPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_ */
