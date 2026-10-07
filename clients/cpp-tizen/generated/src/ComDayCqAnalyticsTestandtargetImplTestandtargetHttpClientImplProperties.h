/*
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_


#include <string>
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

class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();
	ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetapiurl();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetapiurl(ConfigNodePropertyString  cqanalyticstestandtargetapiurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticstestandtargettimeout();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargettimeout(ConfigNodePropertyInteger  cqanalyticstestandtargettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticstestandtargetsockettimeout();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetsockettimeout(ConfigNodePropertyInteger  cqanalyticstestandtargetsockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetrecommendationsurlreplace();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetrecommendationsurlreplace(ConfigNodePropertyString  cqanalyticstestandtargetrecommendationsurlreplace);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqanalyticstestandtargetrecommendationsurlreplacewith();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetrecommendationsurlreplacewith(ConfigNodePropertyString  cqanalyticstestandtargetrecommendationsurlreplacewith);

private:
	ConfigNodePropertyString cqanalyticstestandtargetapiurl;
	ConfigNodePropertyInteger cqanalyticstestandtargettimeout;
	ConfigNodePropertyInteger cqanalyticstestandtargetsockettimeout;
	ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplace;
	ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplacewith;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties_H_ */
