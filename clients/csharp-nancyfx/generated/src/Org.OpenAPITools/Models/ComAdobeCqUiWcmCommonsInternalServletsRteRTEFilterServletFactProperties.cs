using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties
    /// </summary>
    public sealed class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties:  IEquatable<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties>
    { 
        /// <summary>
        /// ResourceTypes
        /// </summary>
        public ConfigNodePropertyArray ResourceTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties()
        {
        }

        private ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(ConfigNodePropertyArray ResourceTypes)
        {
            
            this.ResourceTypes = ResourceTypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
        /// </summary>
        /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder</returns>
        public static ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder Builder()
        {
            return new ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder</returns>
        public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder With()
        {
            return Builder()
                .ResourceTypes(ResourceTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties</param>
        /// <param name="right">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties left, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties</param>
        /// <param name="right">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties left, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
        /// </summary>
        public sealed class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder
        {
            private ConfigNodePropertyArray _ResourceTypes;

            internal ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.ResourceTypes property.
            /// </summary>
            /// <param name="value">ResourceTypes</param>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder ResourceTypes(ConfigNodePropertyArray value)
            {
                _ResourceTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
            /// </summary>
            /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties</returns>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties Build()
            {
                Validate();
                return new ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(
                    ResourceTypes: _ResourceTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}