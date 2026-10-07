
/*
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_


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

class ComDayCqSearchImplBuilderQueryBuilderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqSearchImplBuilderQueryBuilderImplProperties();
    ComDayCqSearchImplBuilderQueryBuilderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqSearchImplBuilderQueryBuilderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcerptproperties();

	/*! \brief Set 
	 */
	void setExcerptproperties(ConfigNodePropertyArray excerptproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxentries();

	/*! \brief Set 
	 */
	void setCachemaxentries(ConfigNodePropertyInteger cachemaxentries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCacheentrylifetime();

	/*! \brief Set 
	 */
	void setCacheentrylifetime(ConfigNodePropertyInteger cacheentrylifetime);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXpathunion();

	/*! \brief Set 
	 */
	void setXpathunion(ConfigNodePropertyBoolean xpathunion);


    private:
    ConfigNodePropertyArray excerptproperties;
    ConfigNodePropertyInteger cachemaxentries;
    ConfigNodePropertyInteger cacheentrylifetime;
    ConfigNodePropertyBoolean xpathunion;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqSearchImplBuilderQueryBuilderImplProperties_H_ */
