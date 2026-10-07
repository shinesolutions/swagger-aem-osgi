/*
 * ComDayCqReportingImplConfigServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReportingImplConfigServiceImplProperties_H_
#define _ComDayCqReportingImplConfigServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqReportingImplConfigServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReportingImplConfigServiceImplProperties();
	ComDayCqReportingImplConfigServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReportingImplConfigServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconftimezone();

	/*! \brief Set 
	 */
	void setRepconftimezone(ConfigNodePropertyString  repconftimezone);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconflocale();

	/*! \brief Set 
	 */
	void setRepconflocale(ConfigNodePropertyString  repconflocale);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfsnapshots();

	/*! \brief Set 
	 */
	void setRepconfsnapshots(ConfigNodePropertyString  repconfsnapshots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfrepdir();

	/*! \brief Set 
	 */
	void setRepconfrepdir(ConfigNodePropertyString  repconfrepdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfhourofday();

	/*! \brief Set 
	 */
	void setRepconfhourofday(ConfigNodePropertyInteger  repconfhourofday);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfminofhour();

	/*! \brief Set 
	 */
	void setRepconfminofhour(ConfigNodePropertyInteger  repconfminofhour);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfmaxrows();

	/*! \brief Set 
	 */
	void setRepconfmaxrows(ConfigNodePropertyInteger  repconfmaxrows);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepconffakedata();

	/*! \brief Set 
	 */
	void setRepconffakedata(ConfigNodePropertyBoolean  repconffakedata);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfsnapshotuser();

	/*! \brief Set 
	 */
	void setRepconfsnapshotuser(ConfigNodePropertyString  repconfsnapshotuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepconfenforcesnapshotuser();

	/*! \brief Set 
	 */
	void setRepconfenforcesnapshotuser(ConfigNodePropertyBoolean  repconfenforcesnapshotuser);

private:
	ConfigNodePropertyString repconftimezone;
	ConfigNodePropertyString repconflocale;
	ConfigNodePropertyString repconfsnapshots;
	ConfigNodePropertyString repconfrepdir;
	ConfigNodePropertyInteger repconfhourofday;
	ConfigNodePropertyInteger repconfminofhour;
	ConfigNodePropertyInteger repconfmaxrows;
	ConfigNodePropertyBoolean repconffakedata;
	ConfigNodePropertyString repconfsnapshotuser;
	ConfigNodePropertyBoolean repconfenforcesnapshotuser;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReportingImplConfigServiceImplProperties_H_ */
