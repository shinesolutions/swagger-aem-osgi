/*
 * OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_
#define _OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_


#include <string>
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

class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties();
	OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxrecursionlevels();

	/*! \brief Set 
	 */
	void setMaxrecursionlevels(ConfigNodePropertyInteger  maxrecursionlevels);

private:
	ConfigNodePropertyInteger maxrecursionlevels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_ */
