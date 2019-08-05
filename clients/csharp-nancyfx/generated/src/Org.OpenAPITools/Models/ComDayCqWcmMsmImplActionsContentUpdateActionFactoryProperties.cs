using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties>
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
        /// CqWcmMsmActionIgnoredMixin
        /// </summary>
        public ConfigNodePropertyArray CqWcmMsmActionIgnoredMixin { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops, ConfigNodePropertyArray CqWcmMsmActionIgnoredMixin)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
            this.CqWcmMsmActionIgnoredMixin = CqWcmMsmActionIgnoredMixin;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops)
                .CqWcmMsmActionIgnoredMixin(CqWcmMsmActionIgnoredMixin);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;
            private ConfigNodePropertyArray _CqWcmMsmActionIgnoredMixin;

            internal ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.CqWcmMsmActionIgnoredMixin property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionIgnoredMixin</param>
            public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesBuilder CqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionIgnoredMixin = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops,
                    CqWcmMsmActionIgnoredMixin: _CqWcmMsmActionIgnoredMixin
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}