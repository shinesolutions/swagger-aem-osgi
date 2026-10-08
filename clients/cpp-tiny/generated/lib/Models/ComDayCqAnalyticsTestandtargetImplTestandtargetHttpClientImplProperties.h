
/*
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetapiurl();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetapiurl(ConfigNodePropertyString cqanalyticstestandtargetapiurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticstestandtargettimeout();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargettimeout(ConfigNodePropertyInteger cqanalyticstestandtargettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticstestandtargetsockettimeout();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetsockettimeout(ConfigNodePropertyInteger cqanalyticstestandtargetsockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetrecommendationsurlreplace();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetrecommendationsurlreplace(ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplace);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetrecommendationsurlreplacewith();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetrecommendationsurlreplacewith(ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplacewith);


    private:
    ConfigNodePropertyString cqanalyticstestandtargetapiurl;
    ConfigNodePropertyInteger cqanalyticstestandtargettimeout;
    ConfigNodePropertyInteger cqanalyticstestandtargetsockettimeout;
    ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplace;
    ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplacewith;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_ */
