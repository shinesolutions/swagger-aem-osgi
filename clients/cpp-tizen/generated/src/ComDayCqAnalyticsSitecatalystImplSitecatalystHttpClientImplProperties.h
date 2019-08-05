/*
 * ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_
#define _ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties();
	ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqanalyticssitecatalystservicedatacenterurl();

	/*! \brief Set 
	 */
	void setCqanalyticssitecatalystservicedatacenterurl(ConfigNodePropertyArray  cqanalyticssitecatalystservicedatacenterurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDevhostnamepatterns();

	/*! \brief Set 
	 */
	void setDevhostnamepatterns(ConfigNodePropertyArray  devhostnamepatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger  sockettimeout);

private:
	ConfigNodePropertyArray cqanalyticssitecatalystservicedatacenterurl;
	ConfigNodePropertyArray devhostnamepatterns;
	ConfigNodePropertyInteger connectiontimeout;
	ConfigNodePropertyInteger sockettimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties_H_ */
