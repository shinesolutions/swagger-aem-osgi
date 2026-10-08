
/*
 * ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties();
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqanalyticssitecatalystservicedatacenterurl();

	/*! \brief Set 
	 */
	void setCqanalyticssitecatalystservicedatacenterurl(ConfigNodePropertyArray cqanalyticssitecatalystservicedatacenterurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDevhostnamepatterns();

	/*! \brief Set 
	 */
	void setDevhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger sockettimeout);


    private:
    ConfigNodePropertyArray cqanalyticssitecatalystservicedatacenterurl;
    ConfigNodePropertyArray devhostnamepatterns;
    ConfigNodePropertyInteger connectiontimeout;
    ConfigNodePropertyInteger sockettimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_ */
