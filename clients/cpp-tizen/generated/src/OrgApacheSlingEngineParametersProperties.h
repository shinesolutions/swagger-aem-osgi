/*
 * OrgApacheSlingEngineParametersProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineParametersProperties_H_
#define _OrgApacheSlingEngineParametersProperties_H_


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

class OrgApacheSlingEngineParametersProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineParametersProperties();
	OrgApacheSlingEngineParametersProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineParametersProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingdefaultparameterencoding();

	/*! \brief Set 
	 */
	void setSlingdefaultparameterencoding(ConfigNodePropertyString  slingdefaultparameterencoding);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingdefaultmaxparameters();

	/*! \brief Set 
	 */
	void setSlingdefaultmaxparameters(ConfigNodePropertyInteger  slingdefaultmaxparameters);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilelocation();

	/*! \brief Set 
	 */
	void setFilelocation(ConfigNodePropertyString  filelocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFilethreshold();

	/*! \brief Set 
	 */
	void setFilethreshold(ConfigNodePropertyInteger  filethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFilemax();

	/*! \brief Set 
	 */
	void setFilemax(ConfigNodePropertyInteger  filemax);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestmax();

	/*! \brief Set 
	 */
	void setRequestmax(ConfigNodePropertyInteger  requestmax);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingdefaultparametercheckForAdditionalContainerParameters();

	/*! \brief Set 
	 */
	void setSlingdefaultparametercheckForAdditionalContainerParameters(ConfigNodePropertyBoolean  slingdefaultparametercheckForAdditionalContainerParameters);

private:
	ConfigNodePropertyString slingdefaultparameterencoding;
	ConfigNodePropertyInteger slingdefaultmaxparameters;
	ConfigNodePropertyString filelocation;
	ConfigNodePropertyInteger filethreshold;
	ConfigNodePropertyInteger filemax;
	ConfigNodePropertyInteger requestmax;
	ConfigNodePropertyBoolean slingdefaultparametercheckForAdditionalContainerParameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineParametersProperties_H_ */
