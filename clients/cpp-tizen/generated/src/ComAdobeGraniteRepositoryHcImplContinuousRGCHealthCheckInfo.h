/*
 * ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo_H_
#define _ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo_H_


#include <string>
#include "ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.h"
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

class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo();
	ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo_H_ */
