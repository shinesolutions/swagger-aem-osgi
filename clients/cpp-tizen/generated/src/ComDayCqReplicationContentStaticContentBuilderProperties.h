/*
 * ComDayCqReplicationContentStaticContentBuilderProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationContentStaticContentBuilderProperties_H_
#define _ComDayCqReplicationContentStaticContentBuilderProperties_H_


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

class ComDayCqReplicationContentStaticContentBuilderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationContentStaticContentBuilderProperties();
	ComDayCqReplicationContentStaticContentBuilderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationContentStaticContentBuilderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHost();

	/*! \brief Set 
	 */
	void setHost(ConfigNodePropertyString  host);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger  port);

private:
	ConfigNodePropertyString host;
	ConfigNodePropertyInteger port;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationContentStaticContentBuilderProperties_H_ */
