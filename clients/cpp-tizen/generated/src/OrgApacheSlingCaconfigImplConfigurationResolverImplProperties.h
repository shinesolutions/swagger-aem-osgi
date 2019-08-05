/*
 * OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_
#define _OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_


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

class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigImplConfigurationResolverImplProperties();
	OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigImplConfigurationResolverImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigBucketNames();

	/*! \brief Set 
	 */
	void setConfigBucketNames(ConfigNodePropertyArray  configBucketNames);

private:
	ConfigNodePropertyArray configBucketNames;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_ */
