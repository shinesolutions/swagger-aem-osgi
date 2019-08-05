using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties>
    { 
        /// <summary>
        /// DamShowexpired
        /// </summary>
        public ConfigNodePropertyBoolean DamShowexpired { get; private set; }

        /// <summary>
        /// DamShowhidden
        /// </summary>
        public ConfigNodePropertyBoolean DamShowhidden { get; private set; }

        /// <summary>
        /// TagTitleSearch
        /// </summary>
        public ConfigNodePropertyBoolean TagTitleSearch { get; private set; }

        /// <summary>
        /// GuessTotal
        /// </summary>
        public ConfigNodePropertyString GuessTotal { get; private set; }

        /// <summary>
        /// DamExpiryProperty
        /// </summary>
        public ConfigNodePropertyString DamExpiryProperty { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(ConfigNodePropertyBoolean DamShowexpired, ConfigNodePropertyBoolean DamShowhidden, ConfigNodePropertyBoolean TagTitleSearch, ConfigNodePropertyString GuessTotal, ConfigNodePropertyString DamExpiryProperty)
        {
            
            this.DamShowexpired = DamShowexpired;
            
            this.DamShowhidden = DamShowhidden;
            
            this.TagTitleSearch = TagTitleSearch;
            
            this.GuessTotal = GuessTotal;
            
            this.DamExpiryProperty = DamExpiryProperty;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder With()
        {
            return Builder()
                .DamShowexpired(DamShowexpired)
                .DamShowhidden(DamShowhidden)
                .TagTitleSearch(TagTitleSearch)
                .GuessTotal(GuessTotal)
                .DamExpiryProperty(DamExpiryProperty);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties left, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties left, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DamShowexpired;
            private ConfigNodePropertyBoolean _DamShowhidden;
            private ConfigNodePropertyBoolean _TagTitleSearch;
            private ConfigNodePropertyString _GuessTotal;
            private ConfigNodePropertyString _DamExpiryProperty;

            internal ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.DamShowexpired property.
            /// </summary>
            /// <param name="value">DamShowexpired</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder DamShowexpired(ConfigNodePropertyBoolean value)
            {
                _DamShowexpired = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.DamShowhidden property.
            /// </summary>
            /// <param name="value">DamShowhidden</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder DamShowhidden(ConfigNodePropertyBoolean value)
            {
                _DamShowhidden = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.TagTitleSearch property.
            /// </summary>
            /// <param name="value">TagTitleSearch</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder TagTitleSearch(ConfigNodePropertyBoolean value)
            {
                _TagTitleSearch = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.GuessTotal property.
            /// </summary>
            /// <param name="value">GuessTotal</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder GuessTotal(ConfigNodePropertyString value)
            {
                _GuessTotal = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.DamExpiryProperty property.
            /// </summary>
            /// <param name="value">DamExpiryProperty</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder DamExpiryProperty(ConfigNodePropertyString value)
            {
                _DamExpiryProperty = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties</returns>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
                    DamShowexpired: _DamShowexpired,
                    DamShowhidden: _DamShowhidden,
                    TagTitleSearch: _TagTitleSearch,
                    GuessTotal: _GuessTotal,
                    DamExpiryProperty: _DamExpiryProperty
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}