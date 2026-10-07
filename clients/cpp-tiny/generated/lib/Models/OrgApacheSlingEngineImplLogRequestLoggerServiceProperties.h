
/*
 * OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_


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

class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogserviceformat();

	/*! \brief Set 
	 */
	void setRequestlogserviceformat(ConfigNodePropertyString requestlogserviceformat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogserviceoutput();

	/*! \brief Set 
	 */
	void setRequestlogserviceoutput(ConfigNodePropertyString requestlogserviceoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRequestlogserviceoutputtype();

	/*! \brief Set 
	 */
	void setRequestlogserviceoutputtype(ConfigNodePropertyDropDown requestlogserviceoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequestlogserviceonentry();

	/*! \brief Set 
	 */
	void setRequestlogserviceonentry(ConfigNodePropertyBoolean requestlogserviceonentry);


    private:
    ConfigNodePropertyString requestlogserviceformat;
    ConfigNodePropertyString requestlogserviceoutput;
    ConfigNodePropertyDropDown requestlogserviceoutputtype;
    ConfigNodePropertyBoolean requestlogserviceonentry;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_ */
