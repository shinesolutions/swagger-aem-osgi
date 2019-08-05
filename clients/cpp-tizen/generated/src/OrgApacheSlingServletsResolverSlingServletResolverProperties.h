/*
 * OrgApacheSlingServletsResolverSlingServletResolverProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsResolverSlingServletResolverProperties_H_
#define _OrgApacheSlingServletsResolverSlingServletResolverProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingServletsResolverSlingServletResolverProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsResolverSlingServletResolverProperties();
	OrgApacheSlingServletsResolverSlingServletResolverProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsResolverSlingServletResolverProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletresolverservletRoot();

	/*! \brief Set 
	 */
	void setServletresolverservletRoot(ConfigNodePropertyString  servletresolverservletRoot);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServletresolvercacheSize();

	/*! \brief Set 
	 */
	void setServletresolvercacheSize(ConfigNodePropertyInteger  servletresolvercacheSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletresolverpaths();

	/*! \brief Set 
	 */
	void setServletresolverpaths(ConfigNodePropertyArray  servletresolverpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletresolverdefaultExtensions();

	/*! \brief Set 
	 */
	void setServletresolverdefaultExtensions(ConfigNodePropertyArray  servletresolverdefaultExtensions);

private:
	ConfigNodePropertyString servletresolverservletRoot;
	ConfigNodePropertyInteger servletresolvercacheSize;
	ConfigNodePropertyArray servletresolverpaths;
	ConfigNodePropertyArray servletresolverdefaultExtensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsResolverSlingServletResolverProperties_H_ */
