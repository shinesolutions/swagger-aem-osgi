
/*
 * OrgApacheSlingEngineParametersProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineParametersProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineParametersProperties_H_


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

class OrgApacheSlingEngineParametersProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineParametersProperties();
    OrgApacheSlingEngineParametersProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineParametersProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingdefaultparameterencoding();

	/*! \brief Set 
	 */
	void setSlingdefaultparameterencoding(ConfigNodePropertyString slingdefaultparameterencoding);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingdefaultmaxparameters();

	/*! \brief Set 
	 */
	void setSlingdefaultmaxparameters(ConfigNodePropertyInteger slingdefaultmaxparameters);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilelocation();

	/*! \brief Set 
	 */
	void setFilelocation(ConfigNodePropertyString filelocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFilethreshold();

	/*! \brief Set 
	 */
	void setFilethreshold(ConfigNodePropertyInteger filethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFilemax();

	/*! \brief Set 
	 */
	void setFilemax(ConfigNodePropertyInteger filemax);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestmax();

	/*! \brief Set 
	 */
	void setRequestmax(ConfigNodePropertyInteger requestmax);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingdefaultparametercheckForAdditionalContainerParameters();

	/*! \brief Set 
	 */
	void setSlingdefaultparametercheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingdefaultparametercheckForAdditionalContainerParameters);


    private:
    ConfigNodePropertyString slingdefaultparameterencoding;
    ConfigNodePropertyInteger slingdefaultmaxparameters;
    ConfigNodePropertyString filelocation;
    ConfigNodePropertyInteger filethreshold;
    ConfigNodePropertyInteger filemax;
    ConfigNodePropertyInteger requestmax;
    ConfigNodePropertyBoolean slingdefaultparametercheckForAdditionalContainerParameters;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineParametersProperties_H_ */
