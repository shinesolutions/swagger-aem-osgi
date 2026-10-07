/*
 * OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties_H_
#define _OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties();
	OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMergeroot();

	/*! \brief Set 
	 */
	void setMergeroot(ConfigNodePropertyString  mergeroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMergereadOnly();

	/*! \brief Set 
	 */
	void setMergereadOnly(ConfigNodePropertyBoolean  mergereadOnly);

private:
	ConfigNodePropertyString mergeroot;
	ConfigNodePropertyBoolean mergereadOnly;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties_H_ */
