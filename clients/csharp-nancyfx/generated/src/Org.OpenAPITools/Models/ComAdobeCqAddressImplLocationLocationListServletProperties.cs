using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAddressImplLocationLocationListServletProperties
    /// </summary>
    public sealed class ComAdobeCqAddressImplLocationLocationListServletProperties:  IEquatable<ComAdobeCqAddressImplLocationLocationListServletProperties>
    { 
        /// <summary>
        /// CqAddressLocationDefaultMaxResults
        /// </summary>
        public ConfigNodePropertyInteger CqAddressLocationDefaultMaxResults { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAddressImplLocationLocationListServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAddressImplLocationLocationListServletProperties()
        {
        }

        private ComAdobeCqAddressImplLocationLocationListServletProperties(ConfigNodePropertyInteger CqAddressLocationDefaultMaxResults)
        {
            
            this.CqAddressLocationDefaultMaxResults = CqAddressLocationDefaultMaxResults;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAddressImplLocationLocationListServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder</returns>
        public static ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder</returns>
        public ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder With()
        {
            return Builder()
                .CqAddressLocationDefaultMaxResults(CqAddressLocationDefaultMaxResults);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqAddressImplLocationLocationListServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAddressImplLocationLocationListServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAddressImplLocationLocationListServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqAddressImplLocationLocationListServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAddressImplLocationLocationListServletProperties left, ComAdobeCqAddressImplLocationLocationListServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAddressImplLocationLocationListServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAddressImplLocationLocationListServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqAddressImplLocationLocationListServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAddressImplLocationLocationListServletProperties left, ComAdobeCqAddressImplLocationLocationListServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAddressImplLocationLocationListServletProperties.
        /// </summary>
        public sealed class ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqAddressLocationDefaultMaxResults;

            internal ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAddressImplLocationLocationListServletProperties.CqAddressLocationDefaultMaxResults property.
            /// </summary>
            /// <param name="value">CqAddressLocationDefaultMaxResults</param>
            public ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder CqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger value)
            {
                _CqAddressLocationDefaultMaxResults = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAddressImplLocationLocationListServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqAddressImplLocationLocationListServletProperties</returns>
            public ComAdobeCqAddressImplLocationLocationListServletProperties Build()
            {
                Validate();
                return new ComAdobeCqAddressImplLocationLocationListServletProperties(
                    CqAddressLocationDefaultMaxResults: _CqAddressLocationDefaultMaxResults
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}