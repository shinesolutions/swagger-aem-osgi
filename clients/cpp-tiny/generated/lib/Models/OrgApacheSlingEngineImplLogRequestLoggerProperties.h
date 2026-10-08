
/*
 * OrgApacheSlingEngineImplLogRequestLoggerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEngineImplLogRequestLoggerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineImplLogRequestLoggerProperties();
    OrgApacheSlingEngineImplLogRequestLoggerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineImplLogRequestLoggerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogoutput();

	/*! \brief Set 
	 */
	void setRequestlogoutput(ConfigNodePropertyString requestlogoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRequestlogoutputtype();

	/*! \brief Set 
	 */
	void setRequestlogoutputtype(ConfigNodePropertyDropDown requestlogoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequestlogenabled();

	/*! \brief Set 
	 */
	void setRequestlogenabled(ConfigNodePropertyBoolean requestlogenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccesslogoutput();

	/*! \brief Set 
	 */
	void setAccesslogoutput(ConfigNodePropertyString accesslogoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAccesslogoutputtype();

	/*! \brief Set 
	 */
	void setAccesslogoutputtype(ConfigNodePropertyDropDown accesslogoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAccesslogenabled();

	/*! \brief Set 
	 */
	void setAccesslogenabled(ConfigNodePropertyBoolean accesslogenabled);


    private:
    ConfigNodePropertyString requestlogoutput;
    ConfigNodePropertyDropDown requestlogoutputtype;
    ConfigNodePropertyBoolean requestlogenabled;
    ConfigNodePropertyString accesslogoutput;
    ConfigNodePropertyDropDown accesslogoutputtype;
    ConfigNodePropertyBoolean accesslogenabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerProperties_H_ */
