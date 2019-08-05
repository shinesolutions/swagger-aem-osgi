using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
    /// </summary>
    public sealed class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties:  IEquatable<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties>
    { 
        /// <summary>
        /// FelixInventoryPrinterName
        /// </summary>
        public ConfigNodePropertyString FelixInventoryPrinterName { get; private set; }

        /// <summary>
        /// FelixInventoryPrinterTitle
        /// </summary>
        public ConfigNodePropertyString FelixInventoryPrinterTitle { get; private set; }

        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties()
        {
        }

        private OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(ConfigNodePropertyString FelixInventoryPrinterName, ConfigNodePropertyString FelixInventoryPrinterTitle, ConfigNodePropertyString Path)
        {
            
            this.FelixInventoryPrinterName = FelixInventoryPrinterName;
            
            this.FelixInventoryPrinterTitle = FelixInventoryPrinterTitle;
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
        /// </summary>
        /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder</returns>
        public static OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder Builder()
        {
            return new OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder</returns>
        public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder With()
        {
            return Builder()
                .FelixInventoryPrinterName(FelixInventoryPrinterName)
                .FelixInventoryPrinterTitle(FelixInventoryPrinterTitle)
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties left, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties left, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
        /// </summary>
        public sealed class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder
        {
            private ConfigNodePropertyString _FelixInventoryPrinterName;
            private ConfigNodePropertyString _FelixInventoryPrinterTitle;
            private ConfigNodePropertyString _Path;

            internal OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.FelixInventoryPrinterName property.
            /// </summary>
            /// <param name="value">FelixInventoryPrinterName</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder FelixInventoryPrinterName(ConfigNodePropertyString value)
            {
                _FelixInventoryPrinterName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.FelixInventoryPrinterTitle property.
            /// </summary>
            /// <param name="value">FelixInventoryPrinterTitle</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder FelixInventoryPrinterTitle(ConfigNodePropertyString value)
            {
                _FelixInventoryPrinterTitle = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
            /// </summary>
            /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties</returns>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties Build()
            {
                Validate();
                return new OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(
                    FelixInventoryPrinterName: _FelixInventoryPrinterName,
                    FelixInventoryPrinterTitle: _FelixInventoryPrinterTitle,
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}