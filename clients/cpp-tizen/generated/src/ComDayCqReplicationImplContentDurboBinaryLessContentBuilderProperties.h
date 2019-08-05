/*
 * ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_
#define _ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_


#include <string>
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

class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties();
	ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBinarythreshold();

	/*! \brief Set 
	 */
	void setBinarythreshold(ConfigNodePropertyInteger  binarythreshold);

private:
	ConfigNodePropertyInteger binarythreshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_ */
