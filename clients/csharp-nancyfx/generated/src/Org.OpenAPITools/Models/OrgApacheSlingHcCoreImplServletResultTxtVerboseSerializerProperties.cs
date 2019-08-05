using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties:  IEquatable<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties>
    { 
        /// <summary>
        /// TotalWidth
        /// </summary>
        public ConfigNodePropertyInteger TotalWidth { get; private set; }

        /// <summary>
        /// ColWidthName
        /// </summary>
        public ConfigNodePropertyInteger ColWidthName { get; private set; }

        /// <summary>
        /// ColWidthResult
        /// </summary>
        public ConfigNodePropertyInteger ColWidthResult { get; private set; }

        /// <summary>
        /// ColWidthTiming
        /// </summary>
        public ConfigNodePropertyInteger ColWidthTiming { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
        {
        }

        private OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(ConfigNodePropertyInteger TotalWidth, ConfigNodePropertyInteger ColWidthName, ConfigNodePropertyInteger ColWidthResult, ConfigNodePropertyInteger ColWidthTiming)
        {
            
            this.TotalWidth = TotalWidth;
            
            this.ColWidthName = ColWidthName;
            
            this.ColWidthResult = ColWidthResult;
            
            this.ColWidthTiming = ColWidthTiming;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder With()
        {
            return Builder()
                .TotalWidth(TotalWidth)
                .ColWidthName(ColWidthName)
                .ColWidthResult(ColWidthResult)
                .ColWidthTiming(ColWidthTiming);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties left, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties left, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _TotalWidth;
            private ConfigNodePropertyInteger _ColWidthName;
            private ConfigNodePropertyInteger _ColWidthResult;
            private ConfigNodePropertyInteger _ColWidthTiming;

            internal OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.TotalWidth property.
            /// </summary>
            /// <param name="value">TotalWidth</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder TotalWidth(ConfigNodePropertyInteger value)
            {
                _TotalWidth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.ColWidthName property.
            /// </summary>
            /// <param name="value">ColWidthName</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder ColWidthName(ConfigNodePropertyInteger value)
            {
                _ColWidthName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.ColWidthResult property.
            /// </summary>
            /// <param name="value">ColWidthResult</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder ColWidthResult(ConfigNodePropertyInteger value)
            {
                _ColWidthResult = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.ColWidthTiming property.
            /// </summary>
            /// <param name="value">ColWidthTiming</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder ColWidthTiming(ConfigNodePropertyInteger value)
            {
                _ColWidthTiming = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties</returns>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
                    TotalWidth: _TotalWidth,
                    ColWidthName: _ColWidthName,
                    ColWidthResult: _ColWidthResult,
                    ColWidthTiming: _ColWidthTiming
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}