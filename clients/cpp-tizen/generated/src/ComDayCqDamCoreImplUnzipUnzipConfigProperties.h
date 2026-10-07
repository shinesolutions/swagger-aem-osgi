/*
 * ComDayCqDamCoreImplUnzipUnzipConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplUnzipUnzipConfigProperties_H_
#define _ComDayCqDamCoreImplUnzipUnzipConfigProperties_H_


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

class ComDayCqDamCoreImplUnzipUnzipConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplUnzipUnzipConfigProperties();
	ComDayCqDamCoreImplUnzipUnzipConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplUnzipUnzipConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamconfigunzipmaxuncompressedsize();

	/*! \brief Set 
	 */
	void setCqdamconfigunzipmaxuncompressedsize(ConfigNodePropertyInteger  cqdamconfigunzipmaxuncompressedsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamconfigunzipencoding();

	/*! \brief Set 
	 */
	void setCqdamconfigunzipencoding(ConfigNodePropertyString  cqdamconfigunzipencoding);

private:
	ConfigNodePropertyInteger cqdamconfigunzipmaxuncompressedsize;
	ConfigNodePropertyString cqdamconfigunzipencoding;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplUnzipUnzipConfigProperties_H_ */
