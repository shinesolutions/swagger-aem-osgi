using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsPostImplSlingPostServletProperties
    /// </summary>
    public sealed class OrgApacheSlingServletsPostImplSlingPostServletProperties:  IEquatable<OrgApacheSlingServletsPostImplSlingPostServletProperties>
    { 
        /// <summary>
        /// ServletPostDateFormats
        /// </summary>
        public ConfigNodePropertyArray ServletPostDateFormats { get; private set; }

        /// <summary>
        /// ServletPostNodeNameHints
        /// </summary>
        public ConfigNodePropertyArray ServletPostNodeNameHints { get; private set; }

        /// <summary>
        /// ServletPostNodeNameMaxLength
        /// </summary>
        public ConfigNodePropertyInteger ServletPostNodeNameMaxLength { get; private set; }

        /// <summary>
        /// ServletPostCheckinNewVersionableNodes
        /// </summary>
        public ConfigNodePropertyBoolean ServletPostCheckinNewVersionableNodes { get; private set; }

        /// <summary>
        /// ServletPostAutoCheckout
        /// </summary>
        public ConfigNodePropertyBoolean ServletPostAutoCheckout { get; private set; }

        /// <summary>
        /// ServletPostAutoCheckin
        /// </summary>
        public ConfigNodePropertyBoolean ServletPostAutoCheckin { get; private set; }

        /// <summary>
        /// ServletPostIgnorePattern
        /// </summary>
        public ConfigNodePropertyString ServletPostIgnorePattern { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsPostImplSlingPostServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsPostImplSlingPostServletProperties()
        {
        }

        private OrgApacheSlingServletsPostImplSlingPostServletProperties(ConfigNodePropertyArray ServletPostDateFormats, ConfigNodePropertyArray ServletPostNodeNameHints, ConfigNodePropertyInteger ServletPostNodeNameMaxLength, ConfigNodePropertyBoolean ServletPostCheckinNewVersionableNodes, ConfigNodePropertyBoolean ServletPostAutoCheckout, ConfigNodePropertyBoolean ServletPostAutoCheckin, ConfigNodePropertyString ServletPostIgnorePattern)
        {
            
            this.ServletPostDateFormats = ServletPostDateFormats;
            
            this.ServletPostNodeNameHints = ServletPostNodeNameHints;
            
            this.ServletPostNodeNameMaxLength = ServletPostNodeNameMaxLength;
            
            this.ServletPostCheckinNewVersionableNodes = ServletPostCheckinNewVersionableNodes;
            
            this.ServletPostAutoCheckout = ServletPostAutoCheckout;
            
            this.ServletPostAutoCheckin = ServletPostAutoCheckin;
            
            this.ServletPostIgnorePattern = ServletPostIgnorePattern;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsPostImplSlingPostServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder</returns>
        public static OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder</returns>
        public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder With()
        {
            return Builder()
                .ServletPostDateFormats(ServletPostDateFormats)
                .ServletPostNodeNameHints(ServletPostNodeNameHints)
                .ServletPostNodeNameMaxLength(ServletPostNodeNameMaxLength)
                .ServletPostCheckinNewVersionableNodes(ServletPostCheckinNewVersionableNodes)
                .ServletPostAutoCheckout(ServletPostAutoCheckout)
                .ServletPostAutoCheckin(ServletPostAutoCheckin)
                .ServletPostIgnorePattern(ServletPostIgnorePattern);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServletsPostImplSlingPostServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsPostImplSlingPostServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplSlingPostServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplSlingPostServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsPostImplSlingPostServletProperties left, OrgApacheSlingServletsPostImplSlingPostServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsPostImplSlingPostServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplSlingPostServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplSlingPostServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsPostImplSlingPostServletProperties left, OrgApacheSlingServletsPostImplSlingPostServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsPostImplSlingPostServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _ServletPostDateFormats;
            private ConfigNodePropertyArray _ServletPostNodeNameHints;
            private ConfigNodePropertyInteger _ServletPostNodeNameMaxLength;
            private ConfigNodePropertyBoolean _ServletPostCheckinNewVersionableNodes;
            private ConfigNodePropertyBoolean _ServletPostAutoCheckout;
            private ConfigNodePropertyBoolean _ServletPostAutoCheckin;
            private ConfigNodePropertyString _ServletPostIgnorePattern;

            internal OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostDateFormats property.
            /// </summary>
            /// <param name="value">ServletPostDateFormats</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostDateFormats(ConfigNodePropertyArray value)
            {
                _ServletPostDateFormats = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostNodeNameHints property.
            /// </summary>
            /// <param name="value">ServletPostNodeNameHints</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostNodeNameHints(ConfigNodePropertyArray value)
            {
                _ServletPostNodeNameHints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostNodeNameMaxLength property.
            /// </summary>
            /// <param name="value">ServletPostNodeNameMaxLength</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostNodeNameMaxLength(ConfigNodePropertyInteger value)
            {
                _ServletPostNodeNameMaxLength = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostCheckinNewVersionableNodes property.
            /// </summary>
            /// <param name="value">ServletPostCheckinNewVersionableNodes</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean value)
            {
                _ServletPostCheckinNewVersionableNodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostAutoCheckout property.
            /// </summary>
            /// <param name="value">ServletPostAutoCheckout</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostAutoCheckout(ConfigNodePropertyBoolean value)
            {
                _ServletPostAutoCheckout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostAutoCheckin property.
            /// </summary>
            /// <param name="value">ServletPostAutoCheckin</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostAutoCheckin(ConfigNodePropertyBoolean value)
            {
                _ServletPostAutoCheckin = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletProperties.ServletPostIgnorePattern property.
            /// </summary>
            /// <param name="value">ServletPostIgnorePattern</param>
            public OrgApacheSlingServletsPostImplSlingPostServletPropertiesBuilder ServletPostIgnorePattern(ConfigNodePropertyString value)
            {
                _ServletPostIgnorePattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsPostImplSlingPostServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServletsPostImplSlingPostServletProperties</returns>
            public OrgApacheSlingServletsPostImplSlingPostServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingServletsPostImplSlingPostServletProperties(
                    ServletPostDateFormats: _ServletPostDateFormats,
                    ServletPostNodeNameHints: _ServletPostNodeNameHints,
                    ServletPostNodeNameMaxLength: _ServletPostNodeNameMaxLength,
                    ServletPostCheckinNewVersionableNodes: _ServletPostCheckinNewVersionableNodes,
                    ServletPostAutoCheckout: _ServletPostAutoCheckout,
                    ServletPostAutoCheckin: _ServletPostAutoCheckin,
                    ServletPostIgnorePattern: _ServletPostIgnorePattern
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}