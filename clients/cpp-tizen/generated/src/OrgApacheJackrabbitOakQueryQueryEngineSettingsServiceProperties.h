/*
 * OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_
#define _OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_


#include <string>
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

class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties();
	OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueryLimitInMemory();

	/*! \brief Set 
	 */
	void setQueryLimitInMemory(ConfigNodePropertyInteger  queryLimitInMemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueryLimitReads();

	/*! \brief Set 
	 */
	void setQueryLimitReads(ConfigNodePropertyInteger  queryLimitReads);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueryFailTraversal();

	/*! \brief Set 
	 */
	void setQueryFailTraversal(ConfigNodePropertyBoolean  queryFailTraversal);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFastQuerySize();

	/*! \brief Set 
	 */
	void setFastQuerySize(ConfigNodePropertyBoolean  fastQuerySize);

private:
	ConfigNodePropertyInteger queryLimitInMemory;
	ConfigNodePropertyInteger queryLimitReads;
	ConfigNodePropertyBoolean queryFailTraversal;
	ConfigNodePropertyBoolean fastQuerySize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_ */
