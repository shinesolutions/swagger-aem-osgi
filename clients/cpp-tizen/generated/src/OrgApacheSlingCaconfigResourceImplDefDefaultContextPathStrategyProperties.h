/*
 * OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_
#define _OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_


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

class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();
	OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigRefResourceNames();

	/*! \brief Set 
	 */
	void setConfigRefResourceNames(ConfigNodePropertyArray  configRefResourceNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigRefPropertyNames();

	/*! \brief Set 
	 */
	void setConfigRefPropertyNames(ConfigNodePropertyArray  configRefPropertyNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyArray configRefResourceNames;
	ConfigNodePropertyArray configRefPropertyNames;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_ */
