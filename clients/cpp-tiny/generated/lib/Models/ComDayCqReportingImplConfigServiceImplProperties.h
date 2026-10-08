
/*
 * ComDayCqReportingImplConfigServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReportingImplConfigServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReportingImplConfigServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReportingImplConfigServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReportingImplConfigServiceImplProperties();
    ComDayCqReportingImplConfigServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReportingImplConfigServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconftimezone();

	/*! \brief Set 
	 */
	void setRepconftimezone(ConfigNodePropertyString repconftimezone);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconflocale();

	/*! \brief Set 
	 */
	void setRepconflocale(ConfigNodePropertyString repconflocale);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfsnapshots();

	/*! \brief Set 
	 */
	void setRepconfsnapshots(ConfigNodePropertyString repconfsnapshots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfrepdir();

	/*! \brief Set 
	 */
	void setRepconfrepdir(ConfigNodePropertyString repconfrepdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfhourofday();

	/*! \brief Set 
	 */
	void setRepconfhourofday(ConfigNodePropertyInteger repconfhourofday);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfminofhour();

	/*! \brief Set 
	 */
	void setRepconfminofhour(ConfigNodePropertyInteger repconfminofhour);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepconfmaxrows();

	/*! \brief Set 
	 */
	void setRepconfmaxrows(ConfigNodePropertyInteger repconfmaxrows);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepconffakedata();

	/*! \brief Set 
	 */
	void setRepconffakedata(ConfigNodePropertyBoolean repconffakedata);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepconfsnapshotuser();

	/*! \brief Set 
	 */
	void setRepconfsnapshotuser(ConfigNodePropertyString repconfsnapshotuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepconfenforcesnapshotuser();

	/*! \brief Set 
	 */
	void setRepconfenforcesnapshotuser(ConfigNodePropertyBoolean repconfenforcesnapshotuser);


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
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReportingImplConfigServiceImplProperties_H_ */
