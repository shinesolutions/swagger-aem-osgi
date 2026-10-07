
/*
 * OrgApacheSlingServletsResolverSlingServletResolverProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServletsResolverSlingServletResolverProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServletsResolverSlingServletResolverProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServletsResolverSlingServletResolverProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServletsResolverSlingServletResolverProperties();
    OrgApacheSlingServletsResolverSlingServletResolverProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServletsResolverSlingServletResolverProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletresolverservletRoot();

	/*! \brief Set 
	 */
	void setServletresolverservletRoot(ConfigNodePropertyString servletresolverservletRoot);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServletresolvercacheSize();

	/*! \brief Set 
	 */
	void setServletresolvercacheSize(ConfigNodePropertyInteger servletresolvercacheSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletresolverpaths();

	/*! \brief Set 
	 */
	void setServletresolverpaths(ConfigNodePropertyArray servletresolverpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletresolverdefaultExtensions();

	/*! \brief Set 
	 */
	void setServletresolverdefaultExtensions(ConfigNodePropertyArray servletresolverdefaultExtensions);


    private:
    ConfigNodePropertyString servletresolverservletRoot;
    ConfigNodePropertyInteger servletresolvercacheSize;
    ConfigNodePropertyArray servletresolverpaths;
    ConfigNodePropertyArray servletresolverdefaultExtensions;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServletsResolverSlingServletResolverProperties_H_ */
