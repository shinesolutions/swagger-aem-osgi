
/*
 * AnalyticsComponentQueryCacheServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AnalyticsComponentQueryCacheServiceProperties_H_
#define TINY_CPP_CLIENT_AnalyticsComponentQueryCacheServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AnalyticsComponentQueryCacheServiceProperties{
public:

    /*! \brief Constructor.
	 */
    AnalyticsComponentQueryCacheServiceProperties();
    AnalyticsComponentQueryCacheServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AnalyticsComponentQueryCacheServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticscomponentquerycachesize();

	/*! \brief Set 
	 */
	void setCqanalyticscomponentquerycachesize(ConfigNodePropertyInteger cqanalyticscomponentquerycachesize);


    private:
    ConfigNodePropertyInteger cqanalyticscomponentquerycachesize;
};
}

#endif /* TINY_CPP_CLIENT_AnalyticsComponentQueryCacheServiceProperties_H_ */
