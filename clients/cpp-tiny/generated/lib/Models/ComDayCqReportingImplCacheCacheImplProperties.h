
/*
 * ComDayCqReportingImplCacheCacheImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReportingImplCacheCacheImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReportingImplCacheCacheImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReportingImplCacheCacheImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReportingImplCacheCacheImplProperties();
    ComDayCqReportingImplCacheCacheImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReportingImplCacheCacheImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepcacheenable();

	/*! \brief Set 
	 */
	void setRepcacheenable(ConfigNodePropertyBoolean repcacheenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepcachettl();

	/*! \brief Set 
	 */
	void setRepcachettl(ConfigNodePropertyInteger repcachettl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepcachemax();

	/*! \brief Set 
	 */
	void setRepcachemax(ConfigNodePropertyInteger repcachemax);


    private:
    ConfigNodePropertyBoolean repcacheenable;
    ConfigNodePropertyInteger repcachettl;
    ConfigNodePropertyInteger repcachemax;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReportingImplCacheCacheImplProperties_H_ */
