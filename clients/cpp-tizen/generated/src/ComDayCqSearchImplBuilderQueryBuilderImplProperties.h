/*
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_
#define _ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqSearchImplBuilderQueryBuilderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqSearchImplBuilderQueryBuilderImplProperties();
	ComDayCqSearchImplBuilderQueryBuilderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqSearchImplBuilderQueryBuilderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcerptproperties();

	/*! \brief Set 
	 */
	void setExcerptproperties(ConfigNodePropertyArray  excerptproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxentries();

	/*! \brief Set 
	 */
	void setCachemaxentries(ConfigNodePropertyInteger  cachemaxentries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCacheentrylifetime();

	/*! \brief Set 
	 */
	void setCacheentrylifetime(ConfigNodePropertyInteger  cacheentrylifetime);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXpathunion();

	/*! \brief Set 
	 */
	void setXpathunion(ConfigNodePropertyBoolean  xpathunion);

private:
	ConfigNodePropertyArray excerptproperties;
	ConfigNodePropertyInteger cachemaxentries;
	ConfigNodePropertyInteger cacheentrylifetime;
	ConfigNodePropertyBoolean xpathunion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_ */
