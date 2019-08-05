using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties
    /// </summary>
    public sealed class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties:  IEquatable<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties()
        {
        }

        private ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder</returns>
        public static ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder Builder()
        {
            return new ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder</returns>
        public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties left, ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties left, ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties</returns>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}