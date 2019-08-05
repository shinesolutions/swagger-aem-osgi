using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletGuidLookupFilterProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletGuidLookupFilterProperties:  IEquatable<ComDayCqDamCoreImplServletGuidLookupFilterProperties>
    { 
        /// <summary>
        /// CqDamCoreGuidlookupfilterEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqDamCoreGuidlookupfilterEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletGuidLookupFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletGuidLookupFilterProperties()
        {
        }

        private ComDayCqDamCoreImplServletGuidLookupFilterProperties(ConfigNodePropertyBoolean CqDamCoreGuidlookupfilterEnabled)
        {
            
            this.CqDamCoreGuidlookupfilterEnabled = CqDamCoreGuidlookupfilterEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletGuidLookupFilterProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder With()
        {
            return Builder()
                .CqDamCoreGuidlookupfilterEnabled(CqDamCoreGuidlookupfilterEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletGuidLookupFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletGuidLookupFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletGuidLookupFilterProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletGuidLookupFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletGuidLookupFilterProperties left, ComDayCqDamCoreImplServletGuidLookupFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletGuidLookupFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletGuidLookupFilterProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletGuidLookupFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletGuidLookupFilterProperties left, ComDayCqDamCoreImplServletGuidLookupFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletGuidLookupFilterProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamCoreGuidlookupfilterEnabled;

            internal ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterProperties.CqDamCoreGuidlookupfilterEnabled property.
            /// </summary>
            /// <param name="value">CqDamCoreGuidlookupfilterEnabled</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterPropertiesBuilder CqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean value)
            {
                _CqDamCoreGuidlookupfilterEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletGuidLookupFilterProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterProperties</returns>
            public ComDayCqDamCoreImplServletGuidLookupFilterProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletGuidLookupFilterProperties(
                    CqDamCoreGuidlookupfilterEnabled: _CqDamCoreGuidlookupfilterEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}