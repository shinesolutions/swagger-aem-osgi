
/*
 * OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigRefResourceNames();

	/*! \brief Set 
	 */
	void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigRefPropertyNames();

	/*! \brief Set 
	 */
	void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyArray configRefResourceNames;
    ConfigNodePropertyArray configRefPropertyNames;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties_H_ */
