using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties:  IEquatable<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties>
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
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties()
        {
        }

        private ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray CqWcmMsmActionExcludedprops)
        {
            
            this.CqWcmMsmActionExcludednodetypes = CqWcmMsmActionExcludednodetypes;
            
            this.CqWcmMsmActionExcludedparagraphitems = CqWcmMsmActionExcludedparagraphitems;
            
            this.CqWcmMsmActionExcludedprops = CqWcmMsmActionExcludedprops;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqWcmMsmActionExcludednodetypes(CqWcmMsmActionExcludednodetypes)
                .CqWcmMsmActionExcludedparagraphitems(CqWcmMsmActionExcludedparagraphitems)
                .CqWcmMsmActionExcludedprops(CqWcmMsmActionExcludedprops);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties left, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmMsmActionExcludednodetypes;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedparagraphitems;
            private ConfigNodePropertyArray _CqWcmMsmActionExcludedprops;

            internal ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.CqWcmMsmActionExcludednodetypes property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludednodetypes</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder CqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludednodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.CqWcmMsmActionExcludedparagraphitems property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedparagraphitems</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder CqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedparagraphitems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.CqWcmMsmActionExcludedprops property.
            /// </summary>
            /// <param name="value">CqWcmMsmActionExcludedprops</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder CqWcmMsmActionExcludedprops(ConfigNodePropertyArray value)
            {
                _CqWcmMsmActionExcludedprops = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties</returns>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(
                    CqWcmMsmActionExcludednodetypes: _CqWcmMsmActionExcludednodetypes,
                    CqWcmMsmActionExcludedparagraphitems: _CqWcmMsmActionExcludedparagraphitems,
                    CqWcmMsmActionExcludedprops: _CqWcmMsmActionExcludedprops
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}