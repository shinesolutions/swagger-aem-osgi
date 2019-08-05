using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
    /// </summary>
    public sealed class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties:  IEquatable<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties>
    { 
        /// <summary>
        /// XmpFilterApplyWhitelist
        /// </summary>
        public ConfigNodePropertyBoolean XmpFilterApplyWhitelist { get; private set; }

        /// <summary>
        /// XmpFilterWhitelist
        /// </summary>
        public ConfigNodePropertyArray XmpFilterWhitelist { get; private set; }

        /// <summary>
        /// XmpFilterApplyBlacklist
        /// </summary>
        public ConfigNodePropertyBoolean XmpFilterApplyBlacklist { get; private set; }

        /// <summary>
        /// XmpFilterBlacklist
        /// </summary>
        public ConfigNodePropertyArray XmpFilterBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties()
        {
        }

        private ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(ConfigNodePropertyBoolean XmpFilterApplyWhitelist, ConfigNodePropertyArray XmpFilterWhitelist, ConfigNodePropertyBoolean XmpFilterApplyBlacklist, ConfigNodePropertyArray XmpFilterBlacklist)
        {
            
            this.XmpFilterApplyWhitelist = XmpFilterApplyWhitelist;
            
            this.XmpFilterWhitelist = XmpFilterWhitelist;
            
            this.XmpFilterApplyBlacklist = XmpFilterApplyBlacklist;
            
            this.XmpFilterBlacklist = XmpFilterBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder</returns>
        public static ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder Builder()
        {
            return new ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder</returns>
        public ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder With()
        {
            return Builder()
                .XmpFilterApplyWhitelist(XmpFilterApplyWhitelist)
                .XmpFilterWhitelist(XmpFilterWhitelist)
                .XmpFilterApplyBlacklist(XmpFilterApplyBlacklist)
                .XmpFilterBlacklist(XmpFilterBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties left, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties left, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
        /// </summary>
        public sealed class ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _XmpFilterApplyWhitelist;
            private ConfigNodePropertyArray _XmpFilterWhitelist;
            private ConfigNodePropertyBoolean _XmpFilterApplyBlacklist;
            private ConfigNodePropertyArray _XmpFilterBlacklist;

            internal ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.XmpFilterApplyWhitelist property.
            /// </summary>
            /// <param name="value">XmpFilterApplyWhitelist</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder XmpFilterApplyWhitelist(ConfigNodePropertyBoolean value)
            {
                _XmpFilterApplyWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.XmpFilterWhitelist property.
            /// </summary>
            /// <param name="value">XmpFilterWhitelist</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder XmpFilterWhitelist(ConfigNodePropertyArray value)
            {
                _XmpFilterWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.XmpFilterApplyBlacklist property.
            /// </summary>
            /// <param name="value">XmpFilterApplyBlacklist</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder XmpFilterApplyBlacklist(ConfigNodePropertyBoolean value)
            {
                _XmpFilterApplyBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.XmpFilterBlacklist property.
            /// </summary>
            /// <param name="value">XmpFilterBlacklist</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder XmpFilterBlacklist(ConfigNodePropertyArray value)
            {
                _XmpFilterBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
            /// </summary>
            /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties</returns>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties Build()
            {
                Validate();
                return new ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
                    XmpFilterApplyWhitelist: _XmpFilterApplyWhitelist,
                    XmpFilterWhitelist: _XmpFilterWhitelist,
                    XmpFilterApplyBlacklist: _XmpFilterApplyBlacklist,
                    XmpFilterBlacklist: _XmpFilterBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}