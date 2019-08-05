using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// ExcludeSearchPath
        /// </summary>
        public ConfigNodePropertyArray ExcludeSearchPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyArray ExcludeSearchPath)
        {
            
            this.HcTags = HcTags;
            
            this.ExcludeSearchPath = ExcludeSearchPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .ExcludeSearchPath(ExcludeSearchPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties left, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties left, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyArray _ExcludeSearchPath;

            internal ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.ExcludeSearchPath property.
            /// </summary>
            /// <param name="value">ExcludeSearchPath</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesBuilder ExcludeSearchPath(ConfigNodePropertyArray value)
            {
                _ExcludeSearchPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties</returns>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(
                    HcTags: _HcTags,
                    ExcludeSearchPath: _ExcludeSearchPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}