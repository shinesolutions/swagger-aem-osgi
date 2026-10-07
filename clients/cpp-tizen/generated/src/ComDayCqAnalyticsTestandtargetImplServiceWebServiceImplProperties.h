/*
 * ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties();
	ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEndpointUri();

	/*! \brief Set 
	 */
	void setEndpointUri(ConfigNodePropertyString  endpointUri);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectionTimeout();

	/*! \brief Set 
	 */
	void setConnectionTimeout(ConfigNodePropertyInteger  connectionTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSocketTimeout();

	/*! \brief Set 
	 */
	void setSocketTimeout(ConfigNodePropertyInteger  socketTimeout);

private:
	ConfigNodePropertyString endpointUri;
	ConfigNodePropertyInteger connectionTimeout;
	ConfigNodePropertyInteger socketTimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties_H_ */
