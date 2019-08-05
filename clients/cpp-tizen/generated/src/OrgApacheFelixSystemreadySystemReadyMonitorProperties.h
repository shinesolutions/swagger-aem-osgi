/*
 * OrgApacheFelixSystemreadySystemReadyMonitorProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadySystemReadyMonitorProperties_H_
#define _OrgApacheFelixSystemreadySystemReadyMonitorProperties_H_


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

class OrgApacheFelixSystemreadySystemReadyMonitorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadySystemReadyMonitorProperties();
	OrgApacheFelixSystemreadySystemReadyMonitorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadySystemReadyMonitorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPollinterval();

	/*! \brief Set 
	 */
	void setPollinterval(ConfigNodePropertyInteger  pollinterval);

private:
	ConfigNodePropertyInteger pollinterval;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadySystemReadyMonitorProperties_H_ */
