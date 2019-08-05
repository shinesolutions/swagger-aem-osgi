using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties>
    { 
        /// <summary>
        /// CqWcmMsmActionExcludednodetypes
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes { get; private set; }

        /// <summary>
        /// CqWcmMsmActionExcludedparagraphitems
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems { get; private set; }

        /// <summary>
        /// CqWcmMsmActionExcludedprops
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionExcludedprops { get; private set; }

        /// <summary>
        /// ContentcopyactionOrderStyle
        /// </summary>
        public ConfigNodePropertyDropDown ContentcopyactionOrderStyle { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops, ConfigNodePropertyDropDown ContentcopyactionOrderStyle)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
            this.ContentcopyactionOrderStyle = ContentcopyactionOrderStyle;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops)
                .ContentcopyactionOrderStyle(ContentcopyactionOrderStyle);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;
            private ConfigNodePropertyDropDown _ContentcopyactionOrderStyle;

            internal ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.ContentcopyactionOrderStyle property.
            /// </summary>
            /// <param name="value">ContentcopyactionOrderStyle</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesBuilder ContentcopyactionOrderStyle(ConfigNodePropertyDropDown value)
            {
                _ContentcopyactionOrderStyle = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops,
                    ContentcopyactionOrderStyle: _ContentcopyactionOrderStyle
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}