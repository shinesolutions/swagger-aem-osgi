using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHcContentPackagesHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeCqHcContentPackagesHealthCheckProperties:  IEquatable<ComAdobeCqHcContentPackagesHealthCheckProperties>
    { 
        /// <summary>
        /// HcName
        /// </summary>
        public ConfigNodePropertyString HcName { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// HcMbeanName
        /// </summary>
        public ConfigNodePropertyString HcMbeanName { get; private set; }

        /// <summary>
        /// PackageNames
        /// </summary>
        public ConfigNodePropertyArray PackageNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqHcContentPackagesHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHcContentPackagesHealthCheckProperties()
        {
        }

        private ComAdobeCqHcContentPackagesHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName, ConfigNodePropertyArray PackageNames)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
            this.PackageNames = PackageNames;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHcContentPackagesHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder</returns>
        public static ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder</returns>
        public ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName)
                .PackageNames(PackageNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqHcContentPackagesHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHcContentPackagesHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHcContentPackagesHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqHcContentPackagesHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHcContentPackagesHealthCheckProperties left, ComAdobeCqHcContentPackagesHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHcContentPackagesHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHcContentPackagesHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqHcContentPackagesHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHcContentPackagesHealthCheckProperties left, ComAdobeCqHcContentPackagesHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHcContentPackagesHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;
            private ConfigNodePropertyArray _PackageNames;

            internal ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckProperties.PackageNames property.
            /// </summary>
            /// <param name="value">PackageNames</param>
            public ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder PackageNames(ConfigNodePropertyArray value)
            {
                _PackageNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHcContentPackagesHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeCqHcContentPackagesHealthCheckProperties</returns>
            public ComAdobeCqHcContentPackagesHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeCqHcContentPackagesHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName,
                    PackageNames: _PackageNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}