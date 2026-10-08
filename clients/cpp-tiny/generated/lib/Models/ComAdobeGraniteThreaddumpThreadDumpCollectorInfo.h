
/*
 * ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteThreaddumpThreadDumpCollectorInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteThreaddumpThreadDumpCollectorInfo();
    ComAdobeGraniteThreaddumpThreadDumpCollectorInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteThreaddumpThreadDumpCollectorInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeGraniteThreaddumpThreadDumpCollectorProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteThreaddumpThreadDumpCollectorProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorInfo_H_ */
