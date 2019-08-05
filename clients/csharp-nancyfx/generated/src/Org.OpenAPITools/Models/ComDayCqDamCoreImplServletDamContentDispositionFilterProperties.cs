using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties:  IEquatable<ComDayCqDamCoreImplServletDamContentDispositionFilterProperties>
    { 
        /// <summary>
        /// CqMimeTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray CqMimeTypeBlacklist { get; private set; }

        /// <summary>
        /// CqDamEmptyMime
        /// </summary>
        public ConfigNodePropertyBoolean CqDamEmptyMime { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties()
        {
        }

        private ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(ConfigNodePropertyArray CqMimeTypeBlacklist, ConfigNodePropertyBoolean CqDamEmptyMime)
        {
            
            this.CqMimeTypeBlacklist = CqMimeTypeBlacklist;
            
            this.CqDamEmptyMime = CqDamEmptyMime;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder With()
        {
            return Builder()
                .CqMimeTypeBlacklist(CqMimeTypeBlacklist)
                .CqDamEmptyMime(CqDamEmptyMime);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletDamContentDispositionFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties left, ComDayCqDamCoreImplServletDamContentDispositionFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties left, ComDayCqDamCoreImplServletDamContentDispositionFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqMimeTypeBlacklist;
            private ConfigNodePropertyBoolean _CqDamEmptyMime;

            internal ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.CqMimeTypeBlacklist property.
            /// </summary>
            /// <param name="value">CqMimeTypeBlacklist</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder CqMimeTypeBlacklist(ConfigNodePropertyArray value)
            {
                _CqMimeTypeBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.CqDamEmptyMime property.
            /// </summary>
            /// <param name="value">CqDamEmptyMime</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder CqDamEmptyMime(ConfigNodePropertyBoolean value)
            {
                _CqDamEmptyMime = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterProperties</returns>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(
                    CqMimeTypeBlacklist: _CqMimeTypeBlacklist,
                    CqDamEmptyMime: _CqDamEmptyMime
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}