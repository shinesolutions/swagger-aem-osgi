using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties>
    { 
        /// <summary>
        /// GuessTotal
        /// </summary>
        public ConfigNodePropertyString GuessTotal { get; private set; }

        /// <summary>
        /// TagTitleSearch
        /// </summary>
        public ConfigNodePropertyBoolean TagTitleSearch { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(ConfigNodePropertyString GuessTotal, ConfigNodePropertyBoolean TagTitleSearch)
        {
            
            this.GuessTotal = GuessTotal;
            
            this.TagTitleSearch = TagTitleSearch;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder With()
        {
            return Builder()
                .GuessTotal(GuessTotal)
                .TagTitleSearch(TagTitleSearch);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties left, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties left, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _GuessTotal;
            private ConfigNodePropertyBoolean _TagTitleSearch;

            internal ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.GuessTotal property.
            /// </summary>
            /// <param name="value">GuessTotal</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder GuessTotal(ConfigNodePropertyString value)
            {
                _GuessTotal = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.TagTitleSearch property.
            /// </summary>
            /// <param name="value">TagTitleSearch</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder TagTitleSearch(ConfigNodePropertyBoolean value)
            {
                _TagTitleSearch = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</returns>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(
                    GuessTotal: _GuessTotal,
                    TagTitleSearch: _TagTitleSearch
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}